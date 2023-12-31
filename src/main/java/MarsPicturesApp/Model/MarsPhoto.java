package MarsPicturesApp.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class MarsPhoto {

    private Long id;
    private Long sol;
    private MarsCamera camera;
    @JsonProperty("img_src")
    private String imgSrc;
    @JsonProperty("earth_date")
    private String earthDate;

    private MarsRover rover;


}
