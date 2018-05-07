package com.raj.stock.quote.repo;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.raj.stock.quote.model.User;

public interface UserRepo extends PagingAndSortingRepository<User, Long> {

	List<User> findByFirstName(@Param("name") String name);
}
