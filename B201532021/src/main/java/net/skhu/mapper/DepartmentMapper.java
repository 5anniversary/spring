package net.skhu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import net.skhu.dto.Department;

@Mapper
@CacheNamespace(flushInterval=10000)
public interface DepartmentMapper {
    
	@Select("SELECT * FROM department")
	List<Department> findAll();
	
	@Select("SELECT * FROM department WHERE id = #{id}")
    Department findOne(int id);

}
