package com.aol.alkuznetsov.fluffy.best.service;

import com.aol.alkuznetsov.fluffy.best.entity.Country;
import com.aol.alkuznetsov.fluffy.best.repository.CountryRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CountryServiceImpl implements CountryService {

    @Autowired private CountryRepository countryRepository;

    @Transactional
    @Override
    public List<Country> findAll() {
        return countryRepository.findAll();
    }
}
