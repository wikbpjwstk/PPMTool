package com.wikb.ppmtool.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.ProjectedPayload;
import org.springframework.stereotype.Service;

import com.wikb.ppmtool.domain.Project;
import com.wikb.ppmtool.exceptions.ProjectIdException;
import com.wikb.ppmtool.repositories.ProjectRepository;

@Service
public class ProjectService {

	@Autowired
	private ProjectRepository projectRepository;

	public Project saveOrUpdateProject(Project project) {
		try {
			project.setProjectIdentifier(project.getProjectIdentifier().toUpperCase());
			return projectRepository.save(project);
		} catch (Exception e) {
			throw new ProjectIdException(
					"Project ID '" + project.getProjectIdentifier().toUpperCase() + " already exists");
		}

	}
czcczcdsdsd
	
	
	public Project findByProjectIdentifier(String projectId) {

		Project project = projectRepository.findByProjectIdentifier(projectId.toUpperCase());
		if (project == null)
			throw new ProjectIdException("Project ID " + projectId + " do not exists.");

		return project;

	}

	public Iterable<Project> findAllProject() {
		return projectRepository.findAll();

	}
	public void deleteProjectByIdentifier(String projectId) {
		
		Project project = projectRepository.findByProjectIdentifier(projectId.toUpperCase());
		if (project==null) throw new ProjectIdException("Can not delete project with ID "+projectId.toUpperCase()+". This project "
				+ "does not exist");
		else
		projectRepository.delete(project);
		
		
	}
}