package MarsPicturesApp.Model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class NasaApiResponse {

    List<MarsPhoto> photos = new ArrayList<>();

}
