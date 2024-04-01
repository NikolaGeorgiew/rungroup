package com.example.rungroup.services.impl;

import com.example.rungroup.dto.EventDTO;
import com.example.rungroup.models.Club;
import com.example.rungroup.models.Event;
import com.example.rungroup.repositories.ClubRepository;
import com.example.rungroup.repositories.EventRepository;
import com.example.rungroup.services.EventService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static com.example.rungroup.mappers.ClubMapper.mapToClub;
import static com.example.rungroup.mappers.EventMapper.mapToEvent;
import static com.example.rungroup.mappers.EventMapper.mapToEventDTO;

@Service
public class EventServiceImpl implements EventService {
    private EventRepository eventRepository;
    private ClubRepository clubRepository;

    public EventServiceImpl(EventRepository eventRepository, ClubRepository clubRepository) {
        this.eventRepository = eventRepository;
        this.clubRepository = clubRepository;
    }

    @Override
    public void createEvent(Long clubId, EventDTO eventDTO) {
        Club club = clubRepository.findById(clubId).get();
        Event event = mapToEvent(eventDTO);
        event.setClub(club);
        eventRepository.save(event);
    }

    @Override
    public List<EventDTO> findAllEvents() {
        List<Event> events = eventRepository.findAll();
        return events.stream().map(event -> mapToEventDTO(event)).collect(Collectors.toList());
    }

    @Override
    public EventDTO findByEventId(Long eventId) {
        Event event = eventRepository.findById(eventId).get();
        return mapToEventDTO(event);
    }

    @Override
    public void updateEvent(EventDTO eventDTO) {
        Event event = mapToEvent(eventDTO);
        eventRepository.save(event);
    }

    @Override
    public void deleteEvent(Long eventId) {
        eventRepository.deleteById(eventId);
    }
}
