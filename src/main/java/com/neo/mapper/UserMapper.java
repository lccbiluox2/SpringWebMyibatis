package com.neo.mapper;


import java.util.List;

import com.neo.entity.UserEntity;
import org.springframework.stereotype.Repository;

/**
 * Created by lcc on 2018/9/13.
 */
@Repository
public interface UserMapper {

    List<UserEntity> getAll();

    UserEntity getOne(Long id);

    void insert(UserEntity user);

    void update(UserEntity user);

    void delete(Long id);

}
