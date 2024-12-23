package com.techevents.api.repositories;

import com.techevents.api.domain.event.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface eventRepository extends JpaRepository<Event, UUID> {
}