package com.mitu.dao;

import java.util.List;

import com.mitu.bean.UserBean;
import com.mitu.entity.UserEntity;

/**
 * 	用户Dao接口
 * @author zhangchengjia
 *
 */
public interface IUserDao {
	/**
	 * 	获取用户实体
	 * @param user 用户名和密码
	 * @return 用户实体
	 */
	public UserEntity getUser(UserBean user);
	/**
	 * 获取用户集合
	 * @return List<UserEntity> 用户实体的集合
	 */
	public List<UserEntity> getUserList();
}
