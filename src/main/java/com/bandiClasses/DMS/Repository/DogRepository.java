package com.bandiClasses.DMS.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bandiClasses.DMS.Models.Dog;


/**
 * 
 * @author Poojitha Mudupu
 */
public interface DogRepository extends CrudRepository<Dog,Integer> {

	
	
	List<Dog> findByName(String name);
	
	
	
}
