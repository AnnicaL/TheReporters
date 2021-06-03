package com.example.TheReporters;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public interface IncidentRepository extends CrudRepository<Incident, Long> {
    List<Incident> findAll();

     }

/* @Service
public class IncidentRepository {
    private List<Incident> incidents;

    public IncidentRepository() {
        incidents = new ArrayList<>();

    }

    public void addIncident(Incident incident) {
     incidents.add(incident);

    }

    public int getRepositorySize (){
         return incidents.size();
    }
}
*/