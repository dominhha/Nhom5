package com.example.__TranNguyenDangKhoi.repository;

import com.example.__TranNguyenDangKhoi.model.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetail, Long> {
    void deleteByProductId(Long productId);


}

