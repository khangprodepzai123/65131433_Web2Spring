package thigk2.NguyenQuocGiaKhang.De1_65131433.repository;

import thigk2.NguyenQuocGiaKhang.De1_65131433.model.Tin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface TinRepository extends JpaRepository<Tin, Integer> {
    List<Tin> findByTheLoaiTinId(Integer theLoaiId);

  
}