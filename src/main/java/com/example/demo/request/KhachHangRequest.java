package com.example.demo.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class KhachHangRequest {
    @NotBlank
    private String ma;
    @NotBlank
    private String ho;
    @NotBlank
    private String ten;
    private String tenDem;
    private String ngaySinh;
    @NotBlank
    private String diaChi;
    @NotBlank
    private String sdt;
    private String thanhPho;
    private String quocGia;
    private String matKhau;
}
