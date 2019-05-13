package com.techprimers.db.repository;

import com.techprimers.db.model.Obstacle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ObstacleRepository extends JpaRepository<Obstacle, Integer> {
}
