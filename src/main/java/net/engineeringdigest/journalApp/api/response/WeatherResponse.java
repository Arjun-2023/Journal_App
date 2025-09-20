package net.engineeringdigest.journalApp.api.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
@Getter
@Setter
public class WeatherResponse {
  @Getter
  @Setter
    private Current current;

    public class Current{


        private int temperature;

        private int weather_code;

        @JsonProperty("weather_description")
        private ArrayList<String> weather_icons;
        private ArrayList<String> weather_descriptions;

    @Getter
    @Setter
      private int feelslike;


    }

}


