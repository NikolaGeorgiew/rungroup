package com.example.rungroup.services;

import com.example.rungroup.dto.EventDTO;

import java.util.List;

public interface EventService {
    void createEvent(Long clubId, EventDTO eventDTO);

    List<EventDTO> findAllEvents();
}
