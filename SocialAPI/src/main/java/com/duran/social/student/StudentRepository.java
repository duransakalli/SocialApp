package com.duran.social.student;

import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, String> {
	
}
