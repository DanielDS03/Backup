package org.springframework.samples.iTeaching.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.samples.iTeaching.model.Authorities;



public interface AuthoritiesRepository extends  CrudRepository<Authorities, String>{
	
}
