package net.skhu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import net.skhu.dto.Product;

@Mapper
@CacheNamespace(flushInterval=10000)
public interface ProductMapper {

	@Select("SELECT * FROM Product WHERE id = #{id}")
	Product findOne(int id);

	@Select("SELECT p.*, c.title as categoryTitle " +
			"FROM Product p LEFT JOIN category c " +
			" ON p.categoryId = c.id ")
	List<Product> findAll();
	
	@Update("UPDATE Product SET  " + 
			"name = #{name},  " +
			"categoryId = #{categoryId},  " +
			"price = #{price}, " +
			"quantity = #{quantity}  " +
			"WHERE id = #{id} ")
	void update(Product product);
	
}
