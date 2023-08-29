package MarsPicturesApp.Controller;

import MarsPicturesApp.Model.NasaApiResponse;
import MarsPicturesApp.Service.NasaApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;


@Controller
public class HomeController {

    @Autowired
    NasaApiService nasaApiService;

    @GetMapping("/")
    public String home(ModelMap model, @RequestParam(required = false) String marsApiRoverData,
                       @RequestParam(required = false) Integer marsSol) {
        if (StringUtils.isEmpty(marsApiRoverData)) {
            marsApiRoverData = "Curiosity";
        }
        if (marsSol == null) {
            marsSol = 1;
        }
        NasaApiResponse roverData = nasaApiService.getRoverData(marsApiRoverData, marsSol);
        model.put("roverData", roverData);
        return "index";
    }

//    @PostMapping("/")
//    public String postHome(@RequestParam String marsApiRoverData, ModelMap model ) {
//        NasaApiResponse roverData = nasaApiService.getRoverData(marsApiRoverData);
//        model.put("roverData", roverData);
//        return "index";
//    }
}
