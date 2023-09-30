package com.example.demo.controllers.admin;

import com.example.demo.request.MauSacRequest;
import com.example.demo.request.SanPhamRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
@RequestMapping("san-pham")
public class SanPhamController {
    private ArrayList<SanPhamRequest> ds;


    public SanPhamController(){
        this.ds = new ArrayList<>();
        this.ds.add(new SanPhamRequest("SP1","Áo thun"));
        this.ds.add(new SanPhamRequest("SP2","Áo khoác"));
        this.ds.add(new SanPhamRequest("SP3","Quần jean"));
        this.ds.add(new SanPhamRequest("SP4","Quần vải"));
        this.ds.add(new SanPhamRequest("SP5","Áo sơ mi"));




    }

    @GetMapping("index")
    public String index(Model model){
        model.addAttribute("data",this.ds);
        return "san_pham/index";
    }

    @GetMapping("create")
    public String create(@ModelAttribute("sp") SanPhamRequest req){
        return "san_pham/create";
    }

    @PostMapping("store")
    public String store(@ModelAttribute("sp") SanPhamRequest req){
        return "san_pham/create";
    }

    @GetMapping("delete/{ma}")
    public String delete(@PathVariable("ma") String maSP){
        for(int i = 0; i < this.ds.size(); i++){
            SanPhamRequest sp = this.ds.get(i);

            if(sp.getMa().equals(maSP)){
                this.ds.remove(i);
                break;
            }
        }
        return "redirect:/san-pham/index";
    }

    @GetMapping("edit/{ma}")
    public String edit(@PathVariable("ma") String maSP, Model model){
        for(int i = 0; i < this.ds.size(); i++){
            SanPhamRequest sp = this.ds.get(i);
            if(sp.getMa().equals(maSP)){

                model.addAttribute("sp", sp);
            }
        }
        return "san_pham/edit";
    }
    @PostMapping("update/{ma}")
    public String update(@PathVariable("ma") String maSP, SanPhamRequest req){
        for(int i = 0; i < this.ds.size(); i++){
            SanPhamRequest sp = this.ds.get(i);
            if(sp.getMa().equals(maSP)){
                this.ds.set(i,req);
            }
        }
        return "redirect:/san-pham/index";
    }
}
