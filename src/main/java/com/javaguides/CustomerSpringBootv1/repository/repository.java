package com.javaguides.CustomerSpringBootv1.repository;


import com.javaguides.CustomerSpringBootv1.entity.customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repository  extends JpaRepository<customer,Long> {





}
