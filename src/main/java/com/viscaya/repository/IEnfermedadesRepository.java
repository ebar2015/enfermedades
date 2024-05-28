/**
 * 
 */
package com.viscaya.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.viscaya.entities.Enfermedades;

/**
 * @author joseviscaya
 *
 */
public interface IEnfermedadesRepository extends CrudRepository<Enfermedades, String> {
	
	
	@Query(value = "SELECT e.* FROM ENFERMEDADES e where COD_CIE10 like %:search% or NOMBRE_ENFERMEDAD like %:search%",nativeQuery = true)
	public List<Enfermedades> search (String search);

}
