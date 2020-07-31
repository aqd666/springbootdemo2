package com.jiyun.dao;

import com.jiyun.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.Mapping;

import java.util.List;

@Mapper
@Component
public interface UserMapper {

    public List<User> findList();


}
