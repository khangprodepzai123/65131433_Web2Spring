package thigk2.NguyenQuocGiaKhang.De1_65131433.model;
import jakarta.persistence.*;
import java.util.List;
@Entity
@Table(name = "the_loai_tin")
public class TheLoaiTin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ten_the_loai", nullable = false, length = 100)
    private String tenTheLoai;

    @OneToMany(mappedBy = "theLoaiTin", cascade = CascadeType.ALL)
    private List<Tin> danhSachTin;

    public TheLoaiTin() {}

    public TheLoaiTin(String tenTheLoai) {
        this.tenTheLoai = tenTheLoai;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getTenTheLoai() { return tenTheLoai; }
    public void setTenTheLoai(String tenTheLoai) { this.tenTheLoai = tenTheLoai; }

    public List<Tin> getDanhSachTin() { return danhSachTin; }
    public void setDanhSachTin(List<Tin> danhSachTin) { this.danhSachTin = danhSachTin; }
}