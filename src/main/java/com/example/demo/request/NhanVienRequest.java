package com.example.demo.request;

import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
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
public class NhanVienRequest {

    @NotBlank
    private String ma;
    @NotBlank
    private String ho;
    @NotBlank
    private String ten;
    private String tenDem;
    @DecimalMin("1") @DecimalMax("2")
    private Integer gioiTinh;

    private String ngaySinh;
    private String diaChi;
    private String sdt;



}
