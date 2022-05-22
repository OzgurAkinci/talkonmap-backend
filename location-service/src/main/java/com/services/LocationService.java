package com.services;

import com.entities.Location;
import com.repos.LocationRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class LocationService {

    private final LocationRepository repository;

    @Autowired
    public LocationService(LocationRepository repository) {
        this.repository = repository;
    }

    public Location save(Location location) {
        return this.repository.save(location);
    }

    public Location getById(long id) {
        return this.repository.findById(id)
                .orElse(null);
    }
}
