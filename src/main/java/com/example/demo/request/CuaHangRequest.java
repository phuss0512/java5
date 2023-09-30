package com.example.demo.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CuaHangRequest {
    @NotBlank
    private String ma;
    @NotBlank
    private String ten;
    @NotBlank
    private String diaChi;
    @NotBlank
    private String thanhPho;
    @NotBlank
    private String quocGia;

}
