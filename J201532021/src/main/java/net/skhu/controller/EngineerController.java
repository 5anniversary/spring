package net.skhu.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import net.skhu.entity.Engineer;
import net.skhu.repository.EngineerRepository;

@RestController
public class EngineerController {

	@Autowired
	EngineerRepository engineerRepository;

	@GetMapping("engineers")
	public List<Engineer> engineers() {
		return engineerRepository.findAll();
	}

	@GetMapping("exam/test1")
	public List<Engineer> engineer(@RequestParam(value = "id") int id) {
		return engineerRepository.findByRoleId(id);
	}

	@GetMapping("exam/test2")
	public List<Engineer> engineerName(@RequestParam(value = "id") int id) {
		return engineerRepository.findByRoleIdOrderByName(id);
	}
	
	@GetMapping("exam/test3")
	public List<Engineer> enginnerAssignment(@RequestParam(value = "id") int id) {
		return engineerRepository.findByAssignmentProjectId(id);
	}

}