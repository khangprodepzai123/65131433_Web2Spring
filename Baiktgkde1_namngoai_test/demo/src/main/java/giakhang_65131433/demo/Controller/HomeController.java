package giakhang_65131433.demo.Controller;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import giakhang_65131433.demo.Model.Page;
import giakhang_65131433.demo.Model.Post;

@Controller
public class HomeController {
 
    List<Page> pageList = Arrays.asList(
        new Page(1, "Introduce", "about", "Nội dung giới thiệu", 0),
        new Page(2, "Contact", "contact", "Nội dung liên hệ", 0),
        new Page(3, "Admission", "admission", "Nội dung tuyển sinh", 1)
    );

    List<Post> postList = Arrays.asList(
        new Post(1, "Bài viết 1", "Nội dung bài viết 1", 1),
        new Post(2, "Bài viết 2", "Nội dung bài viết 2", 1),
        new Post(3, "Bài viết 3", "Nội dung bài viết 3", 2)
    );

    @GetMapping("/home")
    public String dashboard(Model model) {
        model.addAttribute("pageList", pageList);
        model.addAttribute("postList", postList);
        return "dashboard";
    }
}
    

