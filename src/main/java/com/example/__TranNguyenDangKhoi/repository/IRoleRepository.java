package com.example.__TranNguyenDangKhoi.repository;

import  com.example.__TranNguyenDangKhoi.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface IRoleRepository extends JpaRepository<Role, Long>{
    Role findRoleById(Long id);
}
