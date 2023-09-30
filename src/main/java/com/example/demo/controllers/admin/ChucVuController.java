package com.example.demo.controllers.admin;

import com.example.demo.request.ChucVuRequest;
import com.example.demo.request.KhachHangRequest;
import com.example.demo.request.NhaSanXuatRequest;
import com.example.demo.request.NhanVienRequest;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
@RequestMapping("chuc-vu")
public class ChucVuController {

    private ArrayList<ChucVuRequest> ds;


    @GetMapping("create")
    public String createChucVu(@ModelAttribute("cv") ChucVuRequest req){
        return "chuc_vu/create";
    }


    @PostMapping("store")
    public String store(@Valid @ModelAttribute("cv") ChucVuRequest req, BindingResult result) {
        if (result.hasErrors()) {
       //     logger.info("Returning custSave.jsp page");
            return "redirect:messages/chucvu";
        }
        System.out.println( req.getMa());
        System.out.println( req.getTen());
        return "chuc_vu/create";

    }

    public ChucVuController(){
        this.ds = new ArrayList<>();
        ds.add(new ChucVuRequest("CV1","Admin"));
        ds.add(new ChucVuRequest("CV1","Nhân Viên"));



    }

    @GetMapping("index")
    public String index(Model model){
        model.addAttribute("data", this.ds);
        return "chuc_vu/index";
    }
    @GetMapping("delete/{ma}")
    public String delete(@PathVariable("ma") String maCV){
        for(int i = 0; i < this.ds.size(); i++){
            ChucVuRequest cv = this.ds.get(i);
            if(cv.getMa().equals(maCV)){
                this.ds.remove(i);
                break;

            }
        }
        return "redirect:/chuc-vu/index";
    }

    @GetMapping("edit/{ma}")
    public String edit( @PathVariable("ma") String maCV, Model model){
        for(int i = 0; i < this.ds.size(); i++){
            ChucVuRequest cv = this.ds.get(i);
            if(cv.getMa().equals(maCV)){
                System.out.println("hihi");
                model.addAttribute("cv", cv);
            }
        }

        return "chuc_vu/edit";
    }

    @PostMapping("update/{ma}")
    public String update(@PathVariable("ma") String maCV, ChucVuRequest req){
        for(int i = 0; i < this.ds.size(); i++) {
            ChucVuRequest cv = this.ds.get(i);
            if (cv.getMa().equals(maCV)) {
                this.ds.set(i, req);
            }
        }

        return "redirect:/chuc-vu/index";
    }
}
