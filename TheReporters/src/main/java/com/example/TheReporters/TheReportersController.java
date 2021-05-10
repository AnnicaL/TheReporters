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
            System.out.println(incident.getName());
            System.out.println(incident.getDescription());
            // Incident newIBook = restTemplate.postForObject("http://localhost:8080/book/", book, Book.class);
            // bookRepository.addBook(book); // todo replace with call POST /book (with book object as json in request body)
        }
        else {
            // bookRepository.editBook(book);
            // todo replace with call PUT /book/{id} (with book object as json in request body
            // restTemplate.put("http://localhost:8080/book/" + book.getId(), book, Book.class);
        }

        return "redirect:/";
    }

}
