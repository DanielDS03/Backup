/*
 * Copyright 2002-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.samples.iTeaching.repository;

import org.springframework.dao.DataAccessException;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.samples.iTeaching.model.BaseEntity;
import org.springframework.samples.iTeaching.model.Alumno;
import org.springframework.samples.iTeaching.repository.AlumnoRepository;
/**
 * Spring Data JPA OwnerRepository interface
 *
 * @author Michael Isvy
 * @since 15.1.2013
 */
public interface AlumnoRepository extends CrudRepository<Alumno, Integer> {


//	@Query("SELECT DISTINCT owner FROM Alumno alumno left join fetch owner.pets WHERE owner.lastName LIKE :lastName%")
//	public Collection<Alumno> findByLastName(@Param("lastName") String lastName);



	@Query("SELECT alumno FROM Alumno alumno WHERE alumno.id =:id")
	public Alumno findById(@Param("id") int id);

	@Query("SELECT alumno FROM Alumno alumno WHERE alumno.user.username =:username")
	Alumno findByUsername(String username);

}
