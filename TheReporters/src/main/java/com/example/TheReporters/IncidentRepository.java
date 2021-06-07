package com.example.TheReporters;

import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface IncidentRepository extends CrudRepository<Incident, Long> {
    List<Incident> findAll();
}