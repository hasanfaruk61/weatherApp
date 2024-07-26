package com.demo.WeatherApp.controller;

import com.demo.WeatherApp.model.WeatherResponse;
import com.demo.WeatherApp.service.WeatherService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/weather")
public class WeatherController {

    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping
    public WeatherResponse getWeather(@RequestParam String city) {
        return weatherService.getWeatherByCity(city);
    }
}
