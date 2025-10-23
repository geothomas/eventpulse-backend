package com.example.eventpulsebackend.controller;

import com.example.eventpulsebackend.model.Event;
import com.example.eventpulsebackend.service.EventService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/events")
public class EventController {
    private final EventService service;

    public EventController(EventService service) { this.service = service; }

    @GetMapping
    public List<Event> all() { return service.getAll(); }

    @PostMapping
    public Event create(@RequestBody Event e) {
        Event withId = new Event(UUID.randomUUID().toString(), e.type(), e.payload());
        return service.add(withId);
    }
}
