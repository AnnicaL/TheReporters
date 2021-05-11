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

    // add an Incident to the repository
    public Incident addIncident(Incident incident) {

    //    Incident lastIncident = incidents.get(incidents.size() -1);
    //    incident.setId(lastIncident.getId() +1);
        incidents.add(incident);

        return incident;
    }

    public int getRepositorySize (){
         return incidents.size();
    }





}
