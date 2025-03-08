package com.xworkz.spring_country.service;

import com.xworkz.spring_country.dto.CountryDto;

public interface CountryService {
    boolean ValidateAndSave(CountryDto countryDto);
}
