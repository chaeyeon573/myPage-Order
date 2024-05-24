package com.example.myPage.Repository;

import com.example.myPage.Entity.MergedOrderedItems;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MergedOrderedItemsRepository extends JpaRepository<MergedOrderedItems, Integer> {
    List<MergedOrderedItems> findByUserId(Long userId);
}

