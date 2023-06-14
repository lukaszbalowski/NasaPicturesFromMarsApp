package MarsPicturesApp.Controller;

import MarsPicturesApp.Model.NasaApiResponse;
import MarsPicturesApp.Service.NasaApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {

    @Autowired
    NasaApiService nasaApiService;

    @GetMapping("/")
    public String home(ModelMap model) {
        NasaApiResponse roverData = nasaApiService.getRoverData();
        model.put("roverData", roverData);


        return "index";
    }


}
