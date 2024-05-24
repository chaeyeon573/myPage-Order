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

    //코드 수정될 것.
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

    //원래 코드는 이와 같다.
    public User getUserNicknameById(Long userId) {
        Optional<User> user = userRepository.findById(userId);

        return convertNicknameToDto(user.orElse(null));
    }

    private User convertNicknameToDto(User user) {
        if (user != null) {
            return User.builder()
                    .userNickname(user.getUserNickname())

                    .build();
        } else {
            return null; // user가 null인 경우 null 반환
        }
    }
    public User getUserEmailById(Long userId) {
        Optional<User> user = userRepository.findById(userId);

        return convertEmailToDto(user.orElse(null));
    }

    private User convertEmailToDto(User user) {
        if (user != null) {
            return User.builder()
                    .userNickname(user.getUserEmail())

                    .build();
        } else {
            return null; // user가 null인 경우 null 반환
        }
    }
    public User getUserImageById(Long userId) {
        Optional<User> user = userRepository.findById(userId);

        return convertImageToDto(user.orElse(null));
    }

    private User convertImageToDto(User user) {
        if (user != null) {
            return User.builder()
                    .userImg(user.getUserImg())

                    .build();
        } else {
            return null; // user가 null인 경우 null 반환
        }
    }
    public User getUserPhoneNumberById(Long userId) {
        Optional<User> user = userRepository.findById(userId);

        return convertPhoneNumberToDto(user.orElse(null));
    }

    private User convertPhoneNumberToDto(User user) {
        if (user != null) {
            return User.builder()
                    .userPhone(user.getUserPhone())

                    .build();
        } else {
            return null; // user가 null인 경우 null 반환
        }
    }
}


