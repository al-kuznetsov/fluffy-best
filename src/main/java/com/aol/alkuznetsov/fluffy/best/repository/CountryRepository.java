package com.aol.alkuznetsov.fluffy.best.repository;

import com.aol.alkuznetsov.fluffy.best.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {
}
