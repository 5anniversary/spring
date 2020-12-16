package net.skhu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import net.skhu.entity.Engineer;

public interface EngineerRepository extends JpaRepository<Engineer, Integer>  {
	List<Engineer> findByRoleId(int id);
	List<Engineer> findByRoleIdOrderByName(int id);
	List<Engineer> findByAssignmentProjectId(int id);
}