package com.example.eventpulsebackend.service;

import com.example.eventpulsebackend.model.Event;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class EventService {
    private final List<Event> events = new ArrayList<>();

    public List<Event> getAll() { return events; }

    public Event add(Event e) { events.add(e); return e; }
}
