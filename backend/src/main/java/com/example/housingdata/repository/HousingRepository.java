package com.example.housingdata.repository;

import com.example.housingdata.entity.Housing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HousingRepository extends JpaRepository<Housing, Long> {
    // Custom query methods can be added here if needed
}
