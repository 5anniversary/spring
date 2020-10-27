package net.skhu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import net.skhu.dto.Employee;

@Mapper
@CacheNamespace(flushInterval=10000)
public interface EmployeeMapper {
	
	@Select("SELECT * FROM Employee WHERE id = #{id}")
	Employee findOne(int id);
	
	@Select("SELECT * FROM Employee WHERE employeeNo = #{employeeNo}")
	Employee findByEmployeeNo(String employeeNo);

	@Select("SELECT e.*, d.title " +
			"FROM Employee e LEFT JOIN department d " +
			" ON e.departmentId = d.id ")
	List<Employee> findAll();
	
	@Insert("INSERT Employee (employeeNo, name, departmentId, salary, sex) " +
			"VALUES (#{employeeNo}, #{name}, #{departmentId}, #{salary}, #{sex}) ")
	@Options(useGeneratedKeys = true, keyProperty = "id")
	void insert(Employee employee);


}
