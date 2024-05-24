package com.example.myPage.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.security.Timestamp;
import java.time.LocalDateTime;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    @Id //속성을 기본키로 설정
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(name = "email") //객체 필드를 테이블의 칼럼과 매핑함
    private String userEmail;

    @Column(name = "user_password")
    private String userPassword;

    @Column(name = "user_nickname", nullable = false)
    private String userNickname;

    @Column(name = "user_phone", nullable = false)
    private String userPhone;

    @Column(name = "user_addr", nullable = false)
    private String userAddr;

    @Column(name = "user_img", nullable = false)
    private String userImg;


    @Column(name = "created_at")
    @CreationTimestamp  //INSERT 할 때 자동으로 값을 채워줌
    private LocalDateTime created_at = LocalDateTime.now();

    @Column(name = "updated_at")
    @UpdateTimestamp    //UPDATE 쿼리 발생시 해당 시간 값으로 쿼리 생성
    private LocalDateTime updated_at = LocalDateTime.now();


}

