package com.aol.alkuznetsov.fluffy.best.rest;

import com.aol.alkuznetsov.fluffy.best.entity.Country;
import com.aol.alkuznetsov.fluffy.best.service.CountryService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("${vars.api.version-url}")
public class CountryController {
    @Autowired private CountryService countryService;

    @GetMapping("/countries")
    public List<Country> findAll() {
        return countryService.findAll();
    }
}
