package com.adevinta.rentacarkata;

import com.adevinta.rentacarkata.models.Car;
import com.adevinta.rentacarkata.models.RentItem;
import com.adevinta.rentacarkata.models.User;
import com.adevinta.rentacarkata.repositories.CarRepository;
import com.adevinta.rentacarkata.repositories.RentItemRepository;
import com.adevinta.rentacarkata.repositories.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;



public class RentItemTest {
    @Mock
    private RentItemRepository rentItemRepository;

    @Mock
    private UserRepository userRepository;

    @Mock
    private CarRepository carRepository;


    private User user;
    private Car car;


    @BeforeEach
    void setUp(){
        User user = new User();
        Car car = new Car();
    }

    @Test
    void rentItemHasAnUser() {
        RentItem rentItem = new RentItem();
        User user = new User(1L, "Desi");
        rentItem.setUser(user);

        assertThat(rentItem.getUser(), equalTo(user));

    }

    @Test
    void rentItemHasACar() {
        RentItem rentItem = new RentItem();
        Car car = new Car(1L, "8247CKV", "Suzuki");
        rentItem.setCar(car);

        assertThat(rentItem.getCar(), equalTo(car));
    }

    @Test
    void rentItemHasAnId() {
        RentItem rentItem = new RentItem();
        rentItem.setId(1L);

        assertThat(rentItem.getId(), equalTo(1L));
    }

    @Test
    void rentItemHasADate() {
        RentItem rentItem = new RentItem();
        rentItem.setDate("27/02/2022");

        assertThat(rentItem.getDate(), equalTo("27/02/2022"));
    }

}