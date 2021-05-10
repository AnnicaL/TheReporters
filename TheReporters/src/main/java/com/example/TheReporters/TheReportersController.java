package com.example.TheReporters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TheReportersController {

    @Autowired
    private IncidentRepository incidentRepository;

    @GetMapping("/")
    public String add(Model model) {
        model.addAttribute("incident", new Incident());
        return "form";
    }

    @PostMapping("/save")
    public String set(@ModelAttribute Incident incident) {
        if (incident.isNew()) {
            System.out.println(incident.getName());  // for testing
            System.out.println(incident.getDescription()); //for testing
            incidentRepository.addIncident(incident);
            //model.addAttribute("incident", incident);
        }
     /*  else {
            // bookRepository.editBook(book);
            // restTemplate.put("http://localhost:8080/book/" + book.getId(), book, Book.class);
        }
*/
        return "form";
    }

}
