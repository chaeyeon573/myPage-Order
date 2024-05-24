package com.example.myPage.Service;

//import com.example.myPage.Entity.Cart;
//import com.example.myPage.Entity.CartItems;
//import com.example.myPage.Repository.CartItemsRepository;
//import com.example.myPage.Repository.CartRepository;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Service
//public class CartItemsService {
//    private final CartItemsRepository cartItemsRepository;
//    private final CartRepository cartRepository;
//
//    public CartItemsService(CartItemsRepository cartItemsRepository, CartRepository cartRepository) {
//        this.cartItemsRepository = cartItemsRepository;
//        this.cartRepository = cartRepository;
//    }
//
//    public List<CartItems> getCartItemsByUserId(Long userId) {
//        List<Cart> carts = cartRepository.findByUserId(userId);
//        List<CartItems> cartItems = new ArrayList<>();
//        for (Cart cart : carts) {
//            cartItems.addAll(cartItemsRepository.findByCartId(cart.getCartId()));
//        }
//        return cartItems;
//    }
//}
