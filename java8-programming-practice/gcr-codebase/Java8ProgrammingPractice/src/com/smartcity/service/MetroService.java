package com.smartcity.service;

import com.smartcity.model.Location;
import com.smartcity.model.Route;
import com.smartcity.model.Trip;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class MetroService implements TransportService {
    private final List<Trip> trips = new ArrayList<>();

    // constructor
    public MetroService() {
        Route r1 = new Route("M201", new Location(23.2599, 77.4126), new Location(23.1990, 77.4100), 25.0);
        trips.add(new Trip(r1, LocalTime.of(6, 30), 25.0));
        trips.add(new Trip(r1, LocalTime.of(9, 15), 28.0));
    }

    @Override
    public String getServiceType() {
        return "Metro";
    }

    @Override
    public List<Trip> getAvailableTrips() {
        return new ArrayList<>(trips);
    }
}	