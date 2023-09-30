package com.example.demo.controllers.admin;

import com.example.demo.request.ChiTietSanPhamRequest;
import com.example.demo.request.CuaHangRequest;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
@RequestMapping("chi-tiet-san-pham")
public class ChiTietSanPhamController {
    private ArrayList<ChiTietSanPhamRequest> ds;

    @GetMapping("create")
    public String createCuaHang(@ModelAttribute("ctsp") CuaHangRequest req){
        return "chi_tiet_san_pham/createe";
    }


    @PostMapping("store")
    public String store(@Valid @ModelAttribute("ctsp") CuaHangRequest req, BindingResult result) {
        System.out.println(req.getTen());
        return "chi_tiet_san_pham/createe";

    }


    public ChiTietSanPhamController(){
        this.ds = new ArrayList<>();
        ds.add(new ChiTietSanPhamRequest("CTSP1","Quan vải","Quần","Đỏ","Nike",1,"sdf",1,12343.7,11111.0));
        ds.add(new ChiTietSanPhamRequest("CTSP2","Áo","Áo","Trắn","Nike",1,"sdf",1,12343.7,11111.0));
        ds.add(new ChiTietSanPhamRequest("CTSP3","Quần jean ","Quần","Xanh","Adidas",4,"sdf",1,12343.7,11111.0));
        ds.add(new ChiTietSanPhamRequest("CTSP4","Giày thể thao","Giày","Trắng","Nike",3,"sdf",1,12343.7,11111.0));
        ds.add(new ChiTietSanPhamRequest("CTSP5","Giày  chạy","Giày","Đen","Adidas",2,"sdf",1,12343.7,11111.0));


    }

    @GetMapping("index")
    public String index(Model model){
        model.addAttribute("data", this.ds);
        return "chi_tiet_san_pham/index";
    }

    @GetMapping("delete/{ma}")
    public String delete(@PathVariable("ma") String maCTSP){
        for(int i = 0; i < this.ds.size(); i++){
            ChiTietSanPhamRequest ctsp = this.ds.get(i);
            if(ctsp.getMa().equals(maCTSP)){
                this.ds.remove(i);
                break;

            }
        }
        return "redirect:/chi-tiet-san-pham/index";
    }

    @GetMapping("edit/{ma}")
    public String edit( @PathVariable("ma") String maCTSP, Model model){
        for(int i = 0; i < this.ds.size(); i++){
            ChiTietSanPhamRequest ctsp = this.ds.get(i);
            if(ctsp.getMa().equals(maCTSP)){
                System.out.println("hihi");
                model.addAttribute("ctsp", ctsp);
            }
        }

        return "chi_tiet_san_pham/edit";
    }

    @PostMapping("update/{ma}")
    public String update(@PathVariable("ma") String maCTSP, ChiTietSanPhamRequest req){
        for(int i = 0; i < this.ds.size(); i++) {
            ChiTietSanPhamRequest ctsp = this.ds.get(i);
            if (ctsp.getMa().equals(maCTSP)) {
                this.ds.set(i, req);
            }
        }

        return "redirect:/chi-tiet-san-pham/index";
    }
}
