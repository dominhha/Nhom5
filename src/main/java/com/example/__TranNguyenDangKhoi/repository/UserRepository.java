package com.example.__TranNguyenDangKhoi.repository;

import com.example.__TranNguyenDangKhoi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
