package com.didispace.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


/**
 * Created by zhudonghong123 on 2017/12/13.
 */
public interface UsersRepository extends JpaRepository<Users, Long> {

    Users findByName(String name);

    Users findByNameAndAge(String name, Integer age);

    @Query("select u from Users u where u.name=:name")
    Users findUsers(@Param("name") String name);
}
