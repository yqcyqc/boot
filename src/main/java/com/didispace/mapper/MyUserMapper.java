package com.didispace.mapper;

import com.didispace.domain.MyUser;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.repository.query.Param;

/**
 * Created by zhudonghong123 on 2017/12/14.
 */
@Mapper
public interface MyUserMapper {

    @Select("SELECT * FROM USER WHERE NAME = #{name}")
    MyUser findByName(@Param("name") String name);

    @Insert("INSERT INTO USER(NAME, AGE) VALUES(#{name}, #{age})")
    int insert(@Param("name") String name, @Param("age") Integer age);

}
