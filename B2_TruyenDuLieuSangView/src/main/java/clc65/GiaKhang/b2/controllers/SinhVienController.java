package clc65.GiaKhang.b2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SinhVienController {
	
	@GetMapping("/")
	public String SinhVien(ModelMap m) {
		String name = "GiaKhang";
		String mssv = "65131433";
		String ns = "2005";
		String gtinh = "Nam";
		m.addAttribute("name", name);
		m.addAttribute("mssv", mssv);
		m.addAttribute("ns", ns);
		m.addAttribute("gt", gtinh);
		return "sinhvien";
	}
}