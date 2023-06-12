package MarsPicturesApp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(ModelMap model) {
        model.put("message", "Welcome to Mars Pictures App!");
        model.put("address", "123 Fakestreet, Mars");
        return "index";
    }






}