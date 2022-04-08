package com.adevinta.rentacarkata.service;

import com.adevinta.rentacarkata.models.Car;
import com.adevinta.rentacarkata.models.RentItem;
import com.adevinta.rentacarkata.models.User;
import com.adevinta.rentacarkata.repositories.CarRepository;
import com.adevinta.rentacarkata.repositories.RentItemRepository;
import com.adevinta.rentacarkata.repositories.UserRepository;

public class RentingService {

    private final RentItemRepository rentItemRepository;
    private final UserRepository userRepository;
    private final CarRepository carRepository;

    public RentingService(RentItemRepository rentItemRepository, UserRepository userRepository, CarRepository carRepository) {
        this.rentItemRepository = rentItemRepository;
        this.userRepository = userRepository;
        this.carRepository = carRepository;
    }

    public RentItem rentACar(Long userID, Long CarID) {

        return new RentItem(2L, "today", new User(1L, "Carlos"), new Car());
    }

}
