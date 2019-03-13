/**
 * 
 */
package com.mitu.service;

import java.util.List;

import com.mitu.bean.UserBean;
import com.mitu.entity.UserEntity;

/**
 * 	用户业务逻辑接口
 * @author zhangchengjia
 *
 */
public interface IUserService {
	/**
	 * 	判断用户登陆是否成功
	 * @param name 用户名
	 * @param password 密码
	 * @return 登陆用户Bean
	 */
	public UserBean login(String name,String password);
	
	/**
	 * 获取用户集合
	 * @return List<UserEntity> 用户实体的集合
	 */
	public List<UserEntity> getUserList();
}
