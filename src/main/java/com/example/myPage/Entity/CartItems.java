package com.example.myPage.Entity;

//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import lombok.Data;
//
//import java.security.Timestamp;
//import java.util.Date;
//
//
//@Entity
//@Table(name = "cart_items")
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//public class CartItems {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "cart_item_id", nullable = false)
//    private Long cartItemId;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "user_id", referencedColumnName = "user_id",nullable = false)
//    private User userId;
//
//    @Column(name = "cart_id",nullable = false)
//    private Long cartId;
//
//    @Column(name = "product_id",nullable = false)
//    private Long productId;
//
//    @Column(name = "quantity",nullable = false)
//    private Integer quantity;
//
//    @Temporal(TemporalType.TIMESTAMP)
//    @Column(name = "created_at",nullable = false)
//    private Date createdAt;
//
//    @Temporal(TemporalType.TIMESTAMP)
//    @Column(name = "updated_at",nullable = false)
//    private Date updatedAt;
//}
