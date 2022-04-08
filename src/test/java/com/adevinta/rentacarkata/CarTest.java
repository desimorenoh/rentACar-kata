package com.adevinta.rentacarkata;

import com.adevinta.rentacarkata.models.Car;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;


public class CarTest {
    @Test
    void carHasAnId() {
        Car car = new Car(0L, "8247CKV", "Suzuki");

        assertThat(car.getId(), equalTo(0L));

    }

    @Test
    void userHaveAPlateNumber() {

        Car car = new Car(0L, "8247CKV", "Suzuki");
        assertThat(car.getPlateNumber(), equalTo("8247CKV"));
    }

    @Test
    void userHaveABrand() {

        Car car = new Car(0L, "8247CKV", "Suzuki");
        assertThat(car.getBrand(), equalTo("Suzuki"));
    }


}
