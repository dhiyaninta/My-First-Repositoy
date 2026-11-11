import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Git1 { 
    @GetMapping("/")
    public String tampilkanHalamanUtama() {
        return "index";
    }
}
