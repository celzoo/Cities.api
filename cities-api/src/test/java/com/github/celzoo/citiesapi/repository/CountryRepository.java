package com.github.celzoo.citiesapi.repository;

import com.github.celzoo.citiesapi.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository  extends JpaRepository<Country, Long> {
}
