package com.adevinta.rentacarkata.repositories;

import com.adevinta.rentacarkata.models.Car;


import java.util.Optional;

public interface CarRepository {

    Optional<Car> findById(Long id);
}
