package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.FlipkartPayment;

@Repository
public interface FlipkartRepository extends JpaRepository<FlipkartPayment, Integer> {

	public FlipkartPayment findByUserNameAndPassword(String userName, String password);

}
