package com.example.myPage.Controller;

public class ResourceNotFoundException extends Exception {
    public ResourceNotFoundException(String content) {
        super(content);
    }
}
