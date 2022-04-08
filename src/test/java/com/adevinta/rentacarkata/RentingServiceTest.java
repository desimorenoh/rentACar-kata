package com.adevinta.rentacarkata;

import com.adevinta.rentacarkata.models.Car;
import com.adevinta.rentacarkata.models.RentItem;
import com.adevinta.rentacarkata.models.User;
import com.adevinta.rentacarkata.repositories.CarRepository;
import com.adevinta.rentacarkata.repositories.RentItemRepository;
import com.adevinta.rentacarkata.repositories.UserRepository;
import com.adevinta.rentacarkata.service.RentingService;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
public class RentingServiceTest {

    @Mock
    UserRepository userRepository;
    @Mock
    CarRepository carRepository;
    @Mock
    RentItemRepository rentItemRepository;

    @Test
    void rentServicesReturnsANewRentItem() {
        Car car = new Car(); car.setId(1L);
        User user = new User(); user.setId(1L);
        RentItem rentItem = new RentItem();

        RentingService rentingService = new RentingService(rentItemRepository, userRepository, carRepository);
        Mockito.when(userRepository.findById(user.getId())).thenReturn(Optional.of(user));
        Mockito.when(carRepository.findById(car.getId())).thenReturn(Optional.of(car));
        Mockito.when(rentItemRepository.save(rentItem));

        var sut = rentingService.rentACar(user.getId(), car.getId());

        assertEquals(user.getId(), sut.getUser().getId());

    }

}