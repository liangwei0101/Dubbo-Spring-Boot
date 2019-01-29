package com.liangwei.provider.mapper;

import com.liangwei.api.model.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    @Insert({"insert into user(no, name, email) values(#{no}, #{name}, #{email})"})
    void AddUser(User userInfo);

    @Delete("delete from user where no=#{no}")
    void delUserById(@Param("no") int no);

    @Update("update user set name = #{name}, email = #{email} where no = #{no}")
    void updateUserByNo(@Param("name") String name, @Param("email") String email, @Param("no") int no);

    @Select("select * from user")
    List<User> getUser();
}
