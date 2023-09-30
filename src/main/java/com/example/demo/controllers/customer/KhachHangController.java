package com.example.demo.controllers.customer;

import com.example.demo.request.CuaHangRequest;
import com.example.demo.request.KhachHangRequest;
import com.example.demo.request.NhanVienRequest;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;


@Controller
@RequestMapping("khach-hang")
public class KhachHangController {
    @GetMapping("create")
    public String createKhachHang(@ModelAttribute("kh") KhachHangRequest req){
        return "khach_hang/create";
    }


    @PostMapping("store")
    public String store(@Valid @ModelAttribute("kh")KhachHangRequest req, BindingResult result) {
        System.out.println(req.getMa());
        System.out.println(req.getTen());
        System.out.println(req.getTenDem());
        System.out.println(req.getHo());
        System.out.println(req.getSdt());
        System.out.println(req.getDiaChi());
        System.out.println(req.getNgaySinh());
        System.out.println(req.getQuocGia());
        System.out.println(req.getThanhPho());
        System.out.println(req.getMatKhau());


        return "khach_hang/create";

    }

    private ArrayList<KhachHangRequest> ds;
    public KhachHangController(){
        this.ds = new ArrayList<>();
        ds.add(new KhachHangRequest("KH1","Nguyen","Nam","Van","10/10/2000","HaNoi","0123456789","HN","VN","123456"));
        ds.add(new KhachHangRequest("KH2","Hoang","Minh","Kien","03/03/2002","HaNoi","0456123852","HN","VN","123456"));
        ds.add(new KhachHangRequest("KH3","Vu","Ha","Thu","19/04/2001","HaNoi","0856321452","HN","VN","123456"));
        ds.add(new KhachHangRequest("KH4","Tran","Van","Thien","09/09/1999","HaNoi","0896541235","HN","VN","123456"));
        ds.add(new KhachHangRequest("KH5","Nguyen","Minh","Thi","28/10/1998","HaNoi","0987412365","HN","VN","123456"));


    }

    @GetMapping("index")
    public String index(Model model){
        model.addAttribute("data", this.ds);
        return "khach_hang/index";
    }


    @GetMapping("delete/{ma}")
    public String delete(@PathVariable("ma") String maKH){
        for(int i = 0; i < this.ds.size(); i++){
            KhachHangRequest kh = this.ds.get(i);
            if(kh.getMa().equals(maKH)){
                this.ds.remove(i);
                break;

            }
        }
        return "redirect:/khach-hang/index";
    }

    @GetMapping("edit/{ma}")
    public String edit( @PathVariable("ma") String maKH, Model model){
        for(int i = 0; i < this.ds.size(); i++){
            KhachHangRequest kh = this.ds.get(i);
            if(kh.getMa().equals(maKH)){
                System.out.println("hihi");
                model.addAttribute("kh", kh);
            }
        }

        return "khach_hang/edit";
    }

    @PostMapping("update/{ma}")
    public String update(@PathVariable("ma") String maKH, KhachHangRequest req){
        for(int i = 0; i < this.ds.size(); i++) {
            KhachHangRequest kh = this.ds.get(i);
            if (kh.getMa().equals(maKH)) {
                this.ds.set(i, req);
            }
        }

        return "redirect:/khach-hang/index";
    }
}
