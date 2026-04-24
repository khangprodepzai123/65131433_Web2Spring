package thigk2.NguyenQuocGiaKhang.De1_65131433.controller;

import thigk2.NguyenQuocGiaKhang.De1_65131433.model.TheLoaiTin;
import thigk2.NguyenQuocGiaKhang.De1_65131433.model.Tin;
import thigk2.NguyenQuocGiaKhang.De1_65131433.service.TheLoaiTinService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class TheLoaiTinController {

    private final TheLoaiTinService theLoaiTinService;

    public TheLoaiTinController(TheLoaiTinService theLoaiTinService) {
        this.theLoaiTinService = theLoaiTinService;
    }

    @GetMapping("/the-loai")
    public ResponseEntity<List<TheLoaiTin>> getAllTheLoai() {
        List<TheLoaiTin> list = theLoaiTinService.getAllTheLoai();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/the-loai/{id}/tin")
    public ResponseEntity<?> getTinByTheLoai(@PathVariable Integer id) {
        List<Tin> listTin = theLoaiTinService.getTinByTheLoai(id);
        if (listTin.isEmpty()) {
            return ResponseEntity.ok("khong co");
        }
        return ResponseEntity.ok(listTin);
    }
}