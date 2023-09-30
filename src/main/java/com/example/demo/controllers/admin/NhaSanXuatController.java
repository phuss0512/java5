package com.example.demo.controllers.admin;

import com.example.demo.request.ChucVuRequest;
import com.example.demo.request.CuaHangRequest;
import com.example.demo.request.NhaSanXuatRequest;
import com.example.demo.request.NhanVienRequest;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
@RequestMapping("nsx")
public class NhaSanXuatController {
    private ArrayList<NhaSanXuatRequest> ds;

    @GetMapping("create")
    public String createNSX(@ModelAttribute("nsx") NhaSanXuatRequest req){
        return "nsx/create";
    }


    @PostMapping("store")
    public String store(@Valid @ModelAttribute("nsx") NhaSanXuatRequest req , BindingResult result) {
        System.out.println(req.getTen());
            return "nsx/create";

    }


    public NhaSanXuatController(){
        this.ds = new ArrayList<>();
        ds.add(new NhaSanXuatRequest("NSX1","Puma"));
        ds.add(new NhaSanXuatRequest("NSX2","Adidas"));
        ds.add(new NhaSanXuatRequest("NSX3","Nike"));
        ds.add(new NhaSanXuatRequest("NSX4","bla"));
        ds.add(new NhaSanXuatRequest("NSX5","Coolmate"));



    }

    @GetMapping("index")
    public String index(Model model){
        model.addAttribute("data", this.ds);
        return "nsx/index";
    }

    @GetMapping("delete/{ma}")
    public String delete(@PathVariable("ma") String maNSX){
        for(int i = 0; i < this.ds.size(); i++){
            NhaSanXuatRequest nsx = this.ds.get(i);
            if(nsx.getMa().equals(maNSX)){
                this.ds.remove(i);
                break;

            }
        }
        return "redirect:/nsx/index";
    }

    @GetMapping("edit/{ma}")
    public String edit( @PathVariable("ma") String maNSX, Model model){
        for(int i = 0; i < this.ds.size(); i++){
            NhaSanXuatRequest nsx = this.ds.get(i);
            if(nsx.getMa().equals(maNSX)){
                System.out.println("hihi");
                model.addAttribute("nsx", nsx);
            }
        }

        return "nsx/edit";
    }

    @PostMapping("update/{ma}")
    public String update(@PathVariable("ma") String maNSX, NhaSanXuatRequest req){
        for(int i = 0; i < this.ds.size(); i++) {
            NhaSanXuatRequest nsx = this.ds.get(i);
            if (nsx.getMa().equals(maNSX)) {
                this.ds.set(i, req);
            }
        }

        return "redirect:/nsx/index";
    }
}
