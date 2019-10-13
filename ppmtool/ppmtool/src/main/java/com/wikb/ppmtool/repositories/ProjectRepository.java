package com.wikb.ppmtool.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.wikb.ppmtool.domain.Project;



@Repository
public interface ProjectRepository extends  CrudRepository<Project, Long> {
//Long id type
	
	
	@Override
	Iterable<Project> findAllById(Iterable<Long> iterable);
	
	
}
