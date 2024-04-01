package com.example.rungroup.repositories;

import com.example.rungroup.models.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}
