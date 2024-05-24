package com.example.myPage.Controller;

import com.example.myPage.Entity.MergedOrderedItems;
import com.example.myPage.Service.MergedOrderedItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users/merged-order-items")
public class MergedOrderedItemsController {

    @Autowired
    private MergedOrderedItemsService mergedOrderedItemsService;

    @GetMapping("/{userId}")
    public ResponseEntity<List<MergedOrderedItems>> getOrderedItemsByUserId(@PathVariable Long userId) {
        List<MergedOrderedItems> orderedItems = mergedOrderedItemsService.getMergedOrderedItemsByUserId(userId);
        return new ResponseEntity<>(orderedItems, HttpStatus.OK);
    }
}
