package com.example.myPage.Controller;

import com.example.myPage.Entity.User;
import com.example.myPage.Service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{userId}")
    public ResponseEntity<User> getUserProfile(@PathVariable Long userId) {
        User user = userService.getUserById(userId);
        return ResponseEntity.ok(user);
    }
    //위의 코드를 아래와 같이 수정함.
    @GetMapping("/photo/{userId}")
    public ResponseEntity<User> getUserImageById(@PathVariable Long userId) {
        User userNickname = userService.getUserImageById(userId);
        return ResponseEntity.ok(userNickname);
    }

    @GetMapping("/nickname/{userId}")
    public ResponseEntity<User> getUserNickname(@PathVariable Long userId) {
        User userNickname = userService.getUserNicknameById(userId);
        return ResponseEntity.ok(userNickname);
    }

    @GetMapping("/email/{userId}")
    public ResponseEntity<User> getUserEmail(@PathVariable Long userId) {
        User userEmail = userService.getUserEmailById(userId);
        return ResponseEntity.ok(userEmail);
    }
    @GetMapping("phone-number/{userId}")
    public ResponseEntity<User> getUserPhoneNumber(@PathVariable Long userId) {
        User userEmail = userService.getUserPhoneNumberById(userId);
        return ResponseEntity.ok(userEmail);
    }



}
