package com.example.rungroup.services;

import com.example.rungroup.dto.EventDTO;

public interface EventService {
    void createEvent(Long clubId, EventDTO eventDTO);
}
