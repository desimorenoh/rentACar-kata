package com.adevinta.rentacarkata.repositories;

import com.adevinta.rentacarkata.models.User;


import java.util.Optional;

public interface UserRepository {

    Optional<User> findById(Long id);
}
