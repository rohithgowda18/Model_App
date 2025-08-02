package com.example.volunteer.controller;

import com.example.volunteer.model.Volunteer;
import com.example.volunteer.repository.VolunteerRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/volunteers")
@CrossOrigin(origins = "*")
public class VolunteerController {
    private final VolunteerRepository repository;

    public VolunteerController(VolunteerRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Volunteer register(@RequestBody Volunteer volunteer) {
        return repository.save(volunteer);
    }

    @GetMapping
    public List<Volunteer> getAll() {
        return repository.findAll();
    }
}
