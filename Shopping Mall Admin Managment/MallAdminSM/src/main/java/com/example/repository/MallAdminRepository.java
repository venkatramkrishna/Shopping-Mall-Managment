package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.MallAdmin;


@Repository
public interface MallAdminRepository extends JpaRepository<MallAdmin, Long> {

}
