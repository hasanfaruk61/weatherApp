package com.demo.WeatherApp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class WeatherResponse {

    @JsonProperty("name")
    private String cityName;

    @JsonProperty("main")
    private MainInfo mainInfo;

    @JsonProperty("weather")
    private Weather[] weather;


    @Setter
    @Getter
    public static class MainInfo {

        @JsonProperty("temp")
        private double temperature;

        @JsonProperty("humidity")
        private int humidity;

    }

    @Setter
    @Getter
    public static class Weather {

        @JsonProperty("main")
        private String main;

        @JsonProperty("description")
        private String description;

    }
}
