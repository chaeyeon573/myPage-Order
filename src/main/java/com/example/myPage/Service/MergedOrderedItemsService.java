package com.example.myPage.Service;

import com.example.myPage.Entity.MergedOrderedItems;
import com.example.myPage.Repository.MergedOrderedItemsRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
@Transactional
@Service
public class MergedOrderedItemsService {

    @Autowired
    private MergedOrderedItemsRepository mergedOrderedItemsRepository;

    public List<MergedOrderedItems> getMergedOrderedItemsByUserId(Long userId) {
        return mergedOrderedItemsRepository.findByUserId(userId);

    }

    @PersistenceContext
    private EntityManager entityManager;
    @Transactional
    public void saveMergedOrderedItem(MergedOrderedItems mergedOrderedItems) {
        // 데이터 예시 설정
        mergedOrderedItems.setOrderedItemId(1);
        mergedOrderedItems.setProductId(101);
        mergedOrderedItems.setQuantity(2);
        mergedOrderedItems.setDescription("Product A");
        mergedOrderedItems.setPrice(10);
        mergedOrderedItems.setStock(50);
        mergedOrderedItems.setTotalPrice(20);
        mergedOrderedItems.setCreatedAt(new Date(2023, 3, 1, 10, 0, 0));
        mergedOrderedItems.setUpdatedAt(new Date(2023, 3, 1, 10, 0, 0));

        // 엔티티 저장
        entityManager.persist(mergedOrderedItems);
    }
}
