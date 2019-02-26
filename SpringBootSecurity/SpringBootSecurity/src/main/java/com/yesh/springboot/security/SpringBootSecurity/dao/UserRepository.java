package com.yesh.springboot.security.SpringBootSecurity.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.yesh.springboot.security.SpringBootSecurity.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

	User findOneByEmail(String email);

	User findOneByUserid(long id);
}
