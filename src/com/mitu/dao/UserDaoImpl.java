/**
 * 
 */
package com.mitu.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mitu.bean.UserBean;
import com.mitu.entity.UserEntity;
import com.mitu.mapper.UserMapper;

/**
 * 	用户Dao实现类
 * @author zhangchengjia
 *
 */
@Repository	//表示是数据持久层
public class UserDaoImpl implements IUserDao{
	@Autowired
	private UserMapper userMapper;
	@Override
	public UserEntity getUser(UserBean user) {
		UserEntity uEntity = userMapper.getUser(user);
		return uEntity;
	}
	@Override
	public List<UserEntity> getUserList() {
		return userMapper.getUserList();
	}
}
