package com.example.TheReporters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class TheReportersController {

    @Autowired
    private IncidentRepository incidentRepository;

    @GetMapping("/")
    public String first(Model model) {
        model.addAttribute("incident", new Incident());
        return "index";
    }

    @GetMapping("/logg")
    public String logg(Model model) {
        return "logg";
    }

    @GetMapping("/form")
    public String add(Model model) {
        model.addAttribute("incident", new Incident("", "", "", "", "", ""));
        return "form";
    }

    @GetMapping("/incidents")
    public String incidents(Model model) {
        List<Incident> incidents = (List<Incident>)incidentRepository.findAll();
        model.addAttribute("incidents", incidents);
        return "incidents";
    }

   /* @PostMapping("/save")
    public String set(Model model, @ModelAttribute Incident incident) {
        if (incident.isNew()) {
            System.out.println(incident.getName());  // for testing
            System.out.println(incident.getDescription()); //for testing
            incidentRepository.addIncident(incident);
            model.addAttribute("NumberOfIncidents", incidentRepository.getRepositorySize());
        }
    return "logg";
   }*/

  /*  @GetMapping("/addIncident")
    public String add(Model model) {
        model.addAttribute("incident", new Incident());
        return "incidentForm";
    }*/

    @PostMapping("/saveIncident")
    public String set(@ModelAttribute Incident incident) {
        incidentRepository.save(incident);
        return "redirect:/incidents";
    }
// DOES NOT WORK , DISPLAY THE DATA BUT SAVE AS NEW INCIDENT
    @GetMapping("/edit/{id}")
    public String edit(Model model, @PathVariable Long id) {
        Incident incident = incidentRepository.findById(id).get();

        model.addAttribute(incident);
        return "form";
    }

    @PostMapping("/edit/{id}")
    public String set2(@ModelAttribute Incident incident) {
        incidentRepository.save(incident);

        return "redirect:/incidents";
    }




}
