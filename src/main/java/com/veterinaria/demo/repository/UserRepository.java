package com.veterinaria.demo.repository;

import com.veterinaria.demo.enums.UserProfile;
import com.veterinaria.demo.model.entity.User;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @EntityGraph(attributePaths = "authorities")
    Optional<User> findUserByEmail(String email);

    List<User> findByNameIgnoreCase(String name);

    List<User> findByProfile(UserProfile profile);
}
