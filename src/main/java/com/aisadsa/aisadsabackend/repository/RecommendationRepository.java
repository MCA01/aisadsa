package com.aisadsa.aisadsabackend.repository;

import com.aisadsa.aisadsabackend.entity.Recommendation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RecommendationRepository extends JpaRepository<Recommendation, UUID> {

}
