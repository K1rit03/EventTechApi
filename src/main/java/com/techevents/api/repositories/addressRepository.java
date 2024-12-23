package com.techevents.api.repositories;

import com.techevents.api.domain.address.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface addressRepository extends JpaRepository<Address, UUID> {
}
