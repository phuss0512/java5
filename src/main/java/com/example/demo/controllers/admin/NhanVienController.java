package com.example.demo.controllers.admin;

import com.example.demo.request.NhanVienRequest;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
@RequestMapping("nhan-vien")
public class NhanVienController {

    private ArrayList<NhanVienRequest> ds;
    public NhanVienController(){
        this.ds = new ArrayList<>();
        ds.add(new NhanVienRequest("Ph1","Vu","Ha","Thu",1,"10/10/2000","HN","084513212"));
        ds.add(new NhanVienRequest("Ph2","Vu","Nam","Van",1,"10/10/2000","HN","854120512"));


    }

    @GetMapping("create")
    public String create(@ModelAttribute("nv")NhanVienRequest req)
    {

        return "admin/nhan_vien/createe";
    }

    @PostMapping("store")
    public String store( @Valid @ModelAttribute("nv")NhanVienRequest req ,
    BindingResult result
    )  {
        System.out.println(req.getMa());
        System.out.println(req.getHo());
        System.out.println(req.getTenDem());
        System.out.println(req.getTen());
        System.out.println(req.getGioiTinh());
        System.out.println(req.getDiaChi());
        System.out.println(req.getNgaySinh());

        //        model.addAttribute("nv", req);
        return "admin/nhan_vien/createe";
    }

    @GetMapping("index")
    public String index(Model model){
        model.addAttribute("data", this.ds);
        return "admin/nhan_vien/index";
    }

    @GetMapping("delete/{ma}")
    public String delete(@PathVariable("ma") String maNV){
        System.out.println("Xoa Nhan Vien");
        for(int i = 0; i < this.ds.size(); i++){
            NhanVienRequest nv = this.ds.get(i);
            if(nv.getMa().equals(maNV)){
                this.ds.remove(i);
                break;

            }
        }
        return "redirect:/nhan-vien/index";
    }

    @GetMapping("edit/{ma}")
    public String edit( @PathVariable("ma") String maNV, Model model){
        for(int i = 0; i < this.ds.size(); i++){
            NhanVienRequest nv = this.ds.get(i);
            if(nv.getMa().equals(maNV)){

                model.addAttribute("nv", nv);
            }
        }

        return "admin/nhan_vien/edit";
    }

    @PostMapping("update/{ma}")
    public String update(@PathVariable("ma") String maNV, NhanVienRequest req){
        for(int i = 0; i < this.ds.size(); i++) {
            NhanVienRequest nv = this.ds.get(i);
            if (nv.getMa().equals(maNV)) {
                this.ds.set(i, req);
            }
        }

        return "redirect:/nhan-vien/index";
    }

}
