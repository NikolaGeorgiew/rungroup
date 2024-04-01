package com.example.rungroup.services;

import com.example.rungroup.dto.EventDTO;

import java.util.List;

public interface EventService {
    void createEvent(Long clubId, EventDTO eventDTO);

    List<EventDTO> findAllEvents();

    EventDTO findByEventId(Long eventId);

    void updateEvent(EventDTO eventDTO);

    void deleteEvent(Long eventId);
}
