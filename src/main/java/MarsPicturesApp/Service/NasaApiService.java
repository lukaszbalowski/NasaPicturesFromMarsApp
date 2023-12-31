package MarsPicturesApp.Service;

import MarsPicturesApp.Model.NasaApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NasaApiService {

    public NasaApiResponse getRoverData(String roverType, Integer marsSol) {

        RestTemplate rt = new RestTemplate();

        ResponseEntity<NasaApiResponse> response = rt.getForEntity("https://api.nasa.gov/mars-photos/api/v1/rovers/"+roverType+"/photos?sol="+marsSol+"&api_key="+NasaApiCredentials.API_KEY, NasaApiResponse.class);

    return response.getBody();


    }





}
