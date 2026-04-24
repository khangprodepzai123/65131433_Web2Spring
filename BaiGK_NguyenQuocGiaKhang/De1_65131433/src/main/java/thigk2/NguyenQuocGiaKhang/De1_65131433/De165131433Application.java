package thigk2.NguyenQuocGiaKhang.De1_65131433;

import thigk2.NguyenQuocGiaKhang.De1_65131433.model.NguoiDung;
import thigk2.NguyenQuocGiaKhang.De1_65131433.model.TheLoaiTin;
import thigk2.NguyenQuocGiaKhang.De1_65131433.model.Tin;
import thigk2.NguyenQuocGiaKhang.De1_65131433.repository.NguoiDungRepository;
import thigk2.NguyenQuocGiaKhang.De1_65131433.repository.TheLoaiTinRepository;
import thigk2.NguyenQuocGiaKhang.De1_65131433.repository.TinRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class De165131433Application {

    public static void main(String[] args) {
        SpringApplication.run(De165131433Application.class, args);
    }

    @Bean
    CommandLineRunner themDuLieuMau(TinRepository tinRepo,
                                    TheLoaiTinRepository theLoaiRepo,
                                    NguoiDungRepository nguoiDungRepo) {
        return args -> {
            if (theLoaiRepo.count() > 0) {
                System.out.println("Dữ liệu đã có sẵn, bỏ qua.");
                return;
            }

            TheLoaiTin cntt   = theLoaiRepo.save(new TheLoaiTin("Công nghệ"));
            TheLoaiTin tt     = theLoaiRepo.save(new TheLoaiTin("Thể thao"));
            TheLoaiTin kinhte = theLoaiRepo.save(new TheLoaiTin("Kinh tế"));
            TheLoaiTin xahoi  = theLoaiRepo.save(new TheLoaiTin("Xã hội"));

            NguoiDung nd1 = new NguoiDung();
            nd1.setTenDangNhap("khang"); nd1.setMatKhau("123");
            nd1.setHoTen("Nguyễn Quốc Gia Khang"); nd1.setEmail("khang@gmail.com");
            nguoiDungRepo.save(nd1);

            NguoiDung nd2 = new NguoiDung();
            nd2.setTenDangNhap("admin"); nd2.setMatKhau("123");
            nd2.setHoTen("Quản trị viên"); nd2.setEmail("admin@gmail.com");
            nguoiDungRepo.save(nd2);

            themTin(tinRepo, "Spring Boot 4.0 ra mắt với nhiều cải tiến",
                "Spring Boot 4.0 mang đến hiệu suất vượt trội với Java 21 Virtual Threads.", cntt, nd1);
            themTin(tinRepo, "Java 21 LTS – Những tính năng nổi bật",
                "Java 21 là phiên bản LTS mới nhất với Virtual Threads và Pattern Matching.", cntt, nd1);
            themTin(tinRepo, "AI đang thay đổi ngành lập trình như thế nào?",
                "Các công cụ AI đang hỗ trợ lập trình viên viết code nhanh hơn.", cntt, nd2);
            themTin(tinRepo, "Việt Nam giành HCV tại SEA Games 33",
                "Đội tuyển bóng đá nam Việt Nam xuất sắc giành huy chương vàng SEA Games 33.", tt, nd2);
            themTin(tinRepo, "World Cup 2026 – Lịch thi đấu vòng bảng",
                "FIFA công bố lịch thi đấu vòng bảng World Cup 2026 tại Mỹ, Canada và Mexico.", tt, nd1);
            themTin(tinRepo, "GDP Việt Nam tăng trưởng 7.2% năm 2025",
                "GDP Việt Nam đạt mức tăng trưởng 7.2% trong năm 2025.", kinhte, nd2);
            themTin(tinRepo, "Xuất khẩu phần mềm đạt 7 tỷ USD",
                "Ngành CNTT Việt Nam xuất khẩu đạt 7 tỷ USD năm 2025.", kinhte, nd1);
            themTin(tinRepo, "Khánh Hòa phát triển du lịch biển bền vững",
                "Khánh Hòa công bố đề án phát triển du lịch biển bền vững đến 2030.", xahoi, nd2);

            System.out.println("Đã thêm " + tinRepo.count() + " tin mẫu vào DB!");
        };
    }

    private void themTin(TinRepository repo, String tieuDe, String noiDung,
                         TheLoaiTin theLoai, NguoiDung nguoiDung) {
        Tin tin = new Tin();
        tin.setTieuDe(tieuDe);
        tin.setNoiDung(noiDung);
        tin.setNgayDang(java.time.LocalDateTime.now()
            .minusDays((long)(Math.random() * 30)));
        tin.setTheLoaiTin(theLoai);
        tin.setNguoiDung(nguoiDung);
        repo.save(tin);
    }
}