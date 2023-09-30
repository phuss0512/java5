package com.example.demo.controllers.admin;

import com.example.demo.request.DongSanPhamRequest;
import com.example.demo.request.MauSacRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
@RequestMapping("dong-san-pham")
public class DongSanPhamController {
    DongSanPhamRequest dsp ;
    private ArrayList<DongSanPhamRequest> ds;


    public DongSanPhamController(){
        this.ds = new ArrayList<>();
        this.ds.add(new DongSanPhamRequest("DSP1","Giày"));
        this.ds.add(new DongSanPhamRequest("DSP2","Quần"));
        this.ds.add(new DongSanPhamRequest("DSP3","Áo"));
        this.ds.add(new DongSanPhamRequest("DSP4","Mũ"));
        this.ds.add(new DongSanPhamRequest("DSP5","Ví"));


    }

    @GetMapping("index")
    public String index(Model model){
        model.addAttribute("data",this.ds);
        return "dong_san_pham/index";
    }

    @GetMapping("create")
    public String create(@ModelAttribute("dsp") DongSanPhamRequest req){
        return "dong_san_pham/create";
    }

    @PostMapping("store")
    public String store(@ModelAttribute("dsp") DongSanPhamRequest req){
        return "dong_san_pham/create";
    }

    @GetMapping("delete/{ma}")
    public String delete(@PathVariable("ma") String maDSP){
        for(int i = 0; i < this.ds.size(); i++){
            DongSanPhamRequest dsp = this.ds.get(i);

            if(dsp.getMa().equals(maDSP)){
                this.ds.remove(i);
                break;
            }
        }
        return "redirect:/dong-san-pham/index";
    }

    @GetMapping("edit/{ma}")
    public String edit(@PathVariable("ma") String maDSP, Model model){
        for(int i = 0; i < this.ds.size(); i++){
            DongSanPhamRequest dsp = this.ds.get(i);
            if(dsp.getMa().equals(maDSP)){

                model.addAttribute("dsp", dsp);
            }
        }
        return "dong_san_pham/edit";
    }
    @PostMapping("update/{ma}")
    public String update(@PathVariable("ma") String maDSP, DongSanPhamRequest req){
        for(int i = 0; i < this.ds.size(); i++){
            DongSanPhamRequest dsp = this.ds.get(i);
            if(dsp.getMa().equals(maDSP)){
                this.ds.set(i,req);
            }
        }
        return "redirect:/dong-san-pham/index";
    }
}
