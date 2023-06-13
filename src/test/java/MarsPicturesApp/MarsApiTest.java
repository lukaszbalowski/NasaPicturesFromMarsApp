package MarsPicturesApp;

import MarsPicturesApp.Model.NasaApiResponse;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class MarsApiTest {

    @Test
    public void smallTest() {
        RestTemplate rt = new RestTemplate();

        ResponseEntity<NasaApiResponse> response = rt.getForEntity("https://api.nasa.gov/mars-photos/api/v1/rovers/curiosity/photos?sol=2&api_key=DEMO_KEY", NasaApiResponse.class);
        System.out.println(response.getBody().toString());







    }


}
