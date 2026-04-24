package thigk2.NguyenQuocGiaKhang.De1_65131433.repository;

import thigk2.NguyenQuocGiaKhang.De1_65131433.model.TheLoaiTin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface TheLoaiTinRepository extends JpaRepository<TheLoaiTin, Integer> {
}
