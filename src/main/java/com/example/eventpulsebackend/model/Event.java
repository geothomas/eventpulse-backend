package com.example.eventpulsebackend.model;

// Java 17 record = immutable data holder
public record Event(String id, String type, String payload) {}

