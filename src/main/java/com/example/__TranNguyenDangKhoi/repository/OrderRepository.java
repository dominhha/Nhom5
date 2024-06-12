package com.example.__TranNguyenDangKhoi.repository;

import com.example.__TranNguyenDangKhoi.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
