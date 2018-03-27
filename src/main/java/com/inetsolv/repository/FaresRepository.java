package com.inetsolv.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inetsolv.entity.Fare;


public interface FaresRepository extends JpaRepository<Fare,Long> {
	Fare getFareByFlightNumberAndFlightDate(String flightNumber, String flightDate);
}
