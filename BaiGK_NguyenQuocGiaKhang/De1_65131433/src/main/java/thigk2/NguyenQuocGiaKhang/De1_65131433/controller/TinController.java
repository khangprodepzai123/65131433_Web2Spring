package thigk2.NguyenQuocGiaKhang.De1_65131433.controller;

import thigk2.NguyenQuocGiaKhang.De1_65131433.service.TheLoaiTinService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TinController {

    private final TheLoaiTinService service;

    public TinController(TheLoaiTinService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String dashboard(Model model) {
        model.addAttribute("danhSachTin", service.getAllTin());
        model.addAttribute("danhSachTheLoai", service.getAllTheLoai());
        model.addAttribute("tongSoTin", service.getAllTin().size());
        model.addAttribute("tongSoTheLoai", service.getAllTheLoai().size());
        return "index";
    }

    @GetMapping("/tin")
    public String danhSachTin(Model model) {
        model.addAttribute("danhSachTin", service.getAllTin());
        model.addAttribute("danhSachTheLoai", service.getAllTheLoai());
        model.addAttribute("tieuDeTrang", "Tất cả tin tức");
        return "tin/list";
    }

    @GetMapping("/tin/the-loai/{id}")
    public String tinTheoTheLoai(@PathVariable Integer id, Model model) {
        service.getTheLoaiById(id).ifPresent(tl -> {
            model.addAttribute("theLoaiHienTai", tl);
            model.addAttribute("tieuDeTrang", "Tin: " + tl.getTenTheLoai());
        });
        model.addAttribute("danhSachTin", service.getTinByTheLoai(id));
        model.addAttribute("danhSachTheLoai", service.getAllTheLoai());
        return "tin/list";
    }

    @GetMapping("/tin/{id}")
    public String chiTietTin(@PathVariable Integer id, Model model) {
        service.getTinById(id).ifPresent(tin -> model.addAttribute("tin", tin));
        model.addAttribute("danhSachTheLoai", service.getAllTheLoai());
        return "tin/detail";
    }
}