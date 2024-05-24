package com.example.myPage.Repository;

import com.example.myPage.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

    User findByUserId(Long userId);
}
