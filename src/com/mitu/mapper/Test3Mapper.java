package com.mitu.mapper;
public interface Test3Mapper {
 @Select("select * from user where uid=#{uid}")
 public UserEntity getUserByUid(int uid);
}
 
