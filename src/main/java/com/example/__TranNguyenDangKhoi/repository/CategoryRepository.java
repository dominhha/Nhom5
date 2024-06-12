package com.example.__TranNguyenDangKhoi.repository;

import com.example.__TranNguyenDangKhoi.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
