package com.example.TheReporters;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public interface IncidentRepository extends CrudRepository<Incident, Long> {
    List<Incident> findAll();
}