package com.perse.App.models.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.perse.App.models.entities.Users;

public interface UsersRepository extends PagingAndSortingRepository<Users, Integer>{

}
