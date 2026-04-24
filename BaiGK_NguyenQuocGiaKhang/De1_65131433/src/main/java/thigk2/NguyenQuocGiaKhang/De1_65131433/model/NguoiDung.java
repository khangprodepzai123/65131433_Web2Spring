package thigk2.NguyenQuocGiaKhang.De1_65131433.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "nguoi_dung")
public class NguoiDung {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ten_dang_nhap", nullable = false, unique = true, length = 50)
    private String tenDangNhap;

    @Column(name = "mat_khau", nullable = false, length = 255)
    private String matKhau;

    @Column(name = "ho_ten", length = 100)
    private String hoTen;

    @Column(name = "email", length = 100)
    private String email;

    @OneToMany(mappedBy = "nguoiDung", cascade = CascadeType.ALL)
    private List<Tin> danhSachTin;

    public NguoiDung() {}

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getTenDangNhap() { return tenDangNhap; }
    public void setTenDangNhap(String tenDangNhap) { this.tenDangNhap = tenDangNhap; }

    public String getMatKhau() { return matKhau; }
    public void setMatKhau(String matKhau) { this.matKhau = matKhau; }

    public String getHoTen() { return hoTen; }
    public void setHoTen(String hoTen) { this.hoTen = hoTen; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public List<Tin> getDanhSachTin() { return danhSachTin; }
    public void setDanhSachTin(List<Tin> danhSachTin) { this.danhSachTin = danhSachTin; }
}