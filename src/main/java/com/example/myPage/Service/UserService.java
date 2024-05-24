package com.example.myPage.Service;

import com.example.myPage.Entity.User;
import com.example.myPage.Repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUserById(Long userId) {
        Optional<User> user = userRepository.findById(userId);

        return convertToDto(user.orElse(null));
    }

    private User convertToDto(User user) {
        if (user != null) {
            return User.builder()
                    .userId(user.getUserId())
                    .userEmail(user.getUserEmail())
                    .userPhone(user.getUserPhone())
                    .userAddr(user.getUserAddr())
                    .userImg(user.getUserImg())
                    .build();
        } else {
            return null; // user가 null인 경우 null 반환
        }
    }
}

