package com.czy.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import com.czy.vo.UserForMapper;

public interface UserMapper {
	@Select("select * from user_t where name like CONCAT('%',#{name},'%')")
	public List<UserForMapper> getAllUsers(@Param("name") String name);
}
