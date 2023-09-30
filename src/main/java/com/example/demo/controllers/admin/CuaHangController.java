package com.example.demo.controllers.admin;

import com.example.demo.request.CuaHangRequest;
import com.example.demo.request.KhachHangRequest;
import com.example.demo.request.NhaSanXuatRequest;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;

@Controller
@RequestMapping("cua-hang")
public class CuaHangController {

    private ArrayList<CuaHangRequest> ds;

    @GetMapping("create")
    public String createCuaHang(@ModelAttribute("ch") CuaHangRequest req){
        return "cua_hang/create";
    }


    @PostMapping("store")
    public String store(@Valid  @ModelAttribute("ch") CuaHangRequest req, BindingResult result) {
        System.out.println(req.getTen());
        return "cua_hang/create";

    }


    public CuaHangController(){
        this.ds = new ArrayList<>();
        ds.add(new CuaHangRequest("CH1","Quan Ao 123","Cau Giay","Ha Noi","Việt Nam"));
        ds.add(new CuaHangRequest("CH2","Giay 123","Cau Giay","Ha Noi","Việt Nam"));
        ds.add(new CuaHangRequest("CH3","Quan Ao 234","Nam Tu Liem","Ha Noi","Việt Nam"));
        ds.add(new CuaHangRequest("CH4","Quan Ao 345","Bac Tu Liem","Ha Noi","Việt Nam"));
        ds.add(new CuaHangRequest("CH5","Giay dep blabal","Ha Dong","Ha Noi","Việt Nam"));


    }

    @GetMapping("index")
    public String index(Model model){
        model.addAttribute("data", this.ds);
        return "cua_hang/index";
    }

    @GetMapping("delete/{ma}")
    public String delete(@PathVariable("ma") String maCH){
        for(int i = 0; i < this.ds.size(); i++){
            CuaHangRequest ch = this.ds.get(i);
            if(ch.getMa().equals(maCH)){
                this.ds.remove(i);
                break;

            }
        }
        return "redirect:/cua-hang/index";
    }

    @GetMapping("edit/{ma}")
    public String edit( @PathVariable("ma") String maCH, Model model){
        for(int i = 0; i < this.ds.size(); i++){
            CuaHangRequest ch = this.ds.get(i);
            if(ch.getMa().equals(maCH)){
                System.out.println("hihi");
                model.addAttribute("ch", ch);
            }
        }

        return "cua_hang/edit";
    }

    @PostMapping("update/{ma}")
    public String update(@PathVariable("ma") String maCH, CuaHangRequest req){
        for(int i = 0; i < this.ds.size(); i++) {
            CuaHangRequest ch = this.ds.get(i);
            if (ch.getMa().equals(maCH)) {
                this.ds.set(i, req);
            }
        }

        return "redirect:/cua-hang/index";
    }
}
