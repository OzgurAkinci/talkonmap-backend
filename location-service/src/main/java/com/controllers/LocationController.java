package com.controllers;

import com.entities.Location;
import com.services.LocationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/location")
@Slf4j
public class LocationController {

    @Autowired
    private LocationService locationService;


    @PostMapping("/save")
    public Location save(@RequestBody Location location) {
        return locationService.save(location);
    }

    @GetMapping("/{id}")
    public Location getById(@PathVariable long id) {
        return locationService.getById(id);
    }

}
