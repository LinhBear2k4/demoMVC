package com.example.demomvc.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name = "HoaDon")
public class Bill {
    @Id
    @Column(name = "MaHDBan", nullable = false, length = 10)
    private String MaHDBan;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "MaNV", referencedColumnName = "MaNV")
    @JsonIgnoreProperties(value = {"applications", "hibernateLazyInitializer"})
    private User user;

    @Column(name = "NgayBan")
    private LocalDate NgayBan;

    @Column(name = "MaKH")
    private String MaKH;

    @Column(name = "Diem")
    private Integer Diem;

    @Column(name = "HocLuc")
    private String HocLuc;
}
