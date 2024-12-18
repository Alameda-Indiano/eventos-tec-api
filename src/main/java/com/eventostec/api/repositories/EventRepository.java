package com.eventostec.api.repositories;

import com.eventostec.api.domain.Event.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EventRepository extends JpaRepository<Event, UUID> {
}
