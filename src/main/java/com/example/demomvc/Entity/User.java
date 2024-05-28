package com.example.demomvc.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Entity
@Table(name = "NhanVien")
public class User {
    @Id
    @Column(name = "MaNV", nullable = false, length = 10)
    private String MaNV;

    @Column(name = "TenNV")
    private String TenNV;

    @Column(name = "GioiTinh")
    private Boolean GioiTinh;

    @Column(name = "DiaChi")
    private String DiaChi;

    @Column(name = "DienThoai")
    private String DienThoai;

    @Column(name = "NgaySinh")
    private LocalDate NgaySinh;

    @Column(name = "Matkhau")
    private String Matkhau;

    @Column(name = "VaiTro")
    private Boolean VaiTro;

}
