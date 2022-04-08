package com.adevinta.rentacarkata;


import com.adevinta.rentacarkata.models.User;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class UserTest {

    @Test
    void userHaveAName() {

        User user = new User(0L, "Candy");
        assertThat(user.getName(), equalTo("Candy"));
    }

    @Test
    void userHaveAnId() {

        User user = new User(0L, "Candy");
        assertThat(user.getId(), equalTo(0L));

    }
}
