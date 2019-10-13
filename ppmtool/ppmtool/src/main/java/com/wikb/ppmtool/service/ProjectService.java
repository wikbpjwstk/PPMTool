package com.wikb.ppmtool.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wikb.ppmtool.domain.Project;
import com.wikb.ppmtool.repositories.ProjectRepository;

@Service
public class ProjectService {

	
	@Autowired
	private ProjectRepository projectRepository;
	
		
	public Project saveOrUpdateProject(Project project) {
	
		return 	projectRepository.save(project);
	}
	
//	public Project  findProjectByIdentifier(String ptojectId) {
//		
//		
//		return projectRepository.findProjectByIdentifier(ptojectId);
//	};
//	
//	
//	public Project saveOrUpdateProject(Project project) {
//		
//		//Logic
//		
//		try {
//			
//			project.setProjectIdentifier(project.getProjectIdentifier().toUpperCase());
//			return 	projectRepository.save(project);
//		} catch (Exception ex) {
//			throw new ProjectIdException("Project ID "+ project.getProjectIdentifier().toUpperCase() +" already exists");
//		}
//		
//	
//		
//	}
	
}
