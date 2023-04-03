package com.nikoay.lil.adminweb.data.repository;

import com.nikoay.lil.adminweb.data.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
