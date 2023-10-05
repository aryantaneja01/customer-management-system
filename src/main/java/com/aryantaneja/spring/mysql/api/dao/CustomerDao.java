package com.aryantaneja.spring.mysql.api.dao;

import org.springframework.data.repository.CrudRepository;

import com.aryantaneja.spring.mysql.api.model.Customer;

public interface CustomerDao extends CrudRepository<Customer,Integer> {

}
