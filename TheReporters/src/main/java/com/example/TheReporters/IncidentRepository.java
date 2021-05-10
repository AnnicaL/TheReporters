package com.example.TheReporters;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class IncidentRepository {
    private List<Incident> incidents;

    public IncidentRepository() {
        incidents = new ArrayList<>();

    }

}
