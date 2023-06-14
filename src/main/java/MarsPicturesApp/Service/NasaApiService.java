package MarsPicturesApp.Service;

import MarsPicturesApp.Model.NasaApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NasaApiService {

    public NasaApiResponse getRoverData() {

        RestTemplate rt = new RestTemplate();

        ResponseEntity<NasaApiResponse> response = rt.getForEntity("https://api.nasa.gov/mars-photos/api/v1/rovers/curiosity/photos?sol=2&api_key=DEMO_KEY", NasaApiResponse.class);

    return response.getBody();


    }





}
