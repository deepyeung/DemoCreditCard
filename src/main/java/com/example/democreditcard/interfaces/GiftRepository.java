package com.example.democreditcard.interfaces;

import com.example.democreditcard.models.Gift;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GiftRepository extends JpaRepository<Gift,Long> {
}
