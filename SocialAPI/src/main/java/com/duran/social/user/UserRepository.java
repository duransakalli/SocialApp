package com.duran.social.user;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {

	public List<User> findByLocationId(String locationId);
}
