package com.example.myPage.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.sql.Timestamp;
import jakarta.persistence.*;
import org.hibernate.annotations.UpdateTimestamp;


//@Entity
//@Table(name = "cart")
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//public class Cart {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "cart_id")
//    private Long cartId;
//
//
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "user_id", referencedColumnName = "user_id",nullable = false)
//    private User userId;
//
//    @Temporal(TemporalType.TIMESTAMP)
//    @Column(name = "created_at",nullable = false)
//    private Date createdAt;
//
//    @Temporal(TemporalType.TIMESTAMP)
//    @Column(name = "updated_at",nullable = false)
//    private Date updatedAt;
//}
