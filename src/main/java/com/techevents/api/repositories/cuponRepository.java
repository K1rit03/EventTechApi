package com.techevents.api.repositories;

import com.techevents.api.domain.coupon.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface cuponRepository extends JpaRepository<Coupon, UUID> {
}
