/**
 * 
 */
package com.mitu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.mitu.bean.UserBean;
import com.mitu.entity.UserEntity;

/**
 * 	用户映射器接口
 * @author zhangchengjia
 *
 */
public interface UserMapper extends SqlMapper{
	/**
	 * 	获取用户实体
	 * @param userBean 用户名和密码
	 * @return 用户实体
	 */
	@Select("select * from user where name=#{name} and password=#{password}")
	public UserEntity getUser(UserBean userBean);
	
	/**
	 * 获取用户集合
	 * @return List<UserEntity> 用户实体的集合
	 */
	@Select("select id,name,email,phone from user")
	public List<UserEntity> getUserList();
}
