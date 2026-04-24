package thigk2.NguyenQuocGiaKhang.De1_65131433.service;

import thigk2.NguyenQuocGiaKhang.De1_65131433.model.TheLoaiTin;
import thigk2.NguyenQuocGiaKhang.De1_65131433.model.Tin;
import thigk2.NguyenQuocGiaKhang.De1_65131433.repository.TheLoaiTinRepository;
import thigk2.NguyenQuocGiaKhang.De1_65131433.repository.TinRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class TheLoaiTinService {

    private final TheLoaiTinRepository theLoaiTinRepository;
    private final TinRepository tinRepository;

    public TheLoaiTinService(TheLoaiTinRepository theLoaiTinRepository,
                             TinRepository tinRepository) {
        this.theLoaiTinRepository = theLoaiTinRepository;
        this.tinRepository = tinRepository;
    }

    public List<TheLoaiTin> getAllTheLoai() {
        return theLoaiTinRepository.findAll();
    }

    public List<Tin> getAllTin() {
        return tinRepository.findAll();
    }

    public List<Tin> getTinByTheLoai(Integer theLoaiId) {
        return tinRepository.findByTheLoaiTinId(theLoaiId);
    }

    public Optional<Tin> getTinById(Integer id) {
        return tinRepository.findById(id);
    }

    public Optional<TheLoaiTin> getTheLoaiById(Integer id) {
        return theLoaiTinRepository.findById(id);
    }
}