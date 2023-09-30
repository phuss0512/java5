package com.example.demo.controllers.admin;

import com.example.demo.request.MauSacRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
@RequestMapping("mau-sac")
public class MauSacController {

    MauSacRequest msq ;
    private ArrayList<MauSacRequest> ds;


    public MauSacController(){
        this.ds = new ArrayList<>();
        this.ds.add(new MauSacRequest("MS1","Đỏ"));
        this.ds.add(new MauSacRequest("MS2","Trắng"));
        this.ds.add(new MauSacRequest("MS3","Đen"));
        this.ds.add(new MauSacRequest("MS4","Vàng"));


    }

    @GetMapping("index")
    public String index(Model model){
        model.addAttribute("data",this.ds);
        return "mau_sac/index";
    }

    @GetMapping("create")
    public String create(@ModelAttribute("ms") MauSacRequest req){
        return "mau_sac/create";
    }

    @PostMapping("store")
    public String store(@ModelAttribute("ms") MauSacRequest req){
        return "mau_sac/create";
    }

    @GetMapping("delete/{ma}")
    public String delete(@PathVariable("ma") String maMS){
        for(int i = 0; i < this.ds.size(); i++){
            MauSacRequest ms = this.ds.get(i);

            if(ms.getMa().equals(maMS)){
                this.ds.remove(i);
                break;
            }
        }
        return "redirect:/mau-sac/index";
    }

    @GetMapping("edit/{ma}")
    public String edit(@PathVariable("ma") String maMS, Model model){
        for(int i = 0; i < this.ds.size(); i++){
            MauSacRequest ms = this.ds.get(i);
            if(ms.getMa().equals(maMS)){

                model.addAttribute("ms", ms);
            }
        }
        return "mau_sac/edit";
    }
    @PostMapping("update/{ma}")
    public String update(@PathVariable("ma") String maMS, MauSacRequest req){
        for(int i = 0; i < this.ds.size(); i++){
            MauSacRequest ms = this.ds.get(i);
            if(ms.getMa().equals(maMS)){
                this.ds.set(i,req);
            }
        }
        return "redirect:/mau-sac/index";
    }

}
