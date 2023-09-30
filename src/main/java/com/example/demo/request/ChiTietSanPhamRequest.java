package com.example.demo.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ChiTietSanPhamRequest {

    @NotBlank
    private String ma;

    @NotBlank
    private String sanPham;

    @NotBlank
    private String dongSanPham;

    @NotBlank
    private String mauSac;

    @NotBlank
    private String nhaSanXuat;

    private Integer namBH;

    @NotBlank
    private String moTa;

    private Integer soLuongTon;

    @NotBlank
    private String giaNhap;

    @NotBlank
    private String giaBan;



}
