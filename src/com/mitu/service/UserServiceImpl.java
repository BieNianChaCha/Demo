/**
 * 
 */
package com.mitu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mitu.bean.UserBean;
import com.mitu.dao.IUserDao;
import com.mitu.entity.UserEntity;

/**
 * 	用户业务逻辑实现类
 * @author zhangchengjia
 *
 */
@Transactional(rollbackFor=Exception.class)	//声明式事务管理、百度查询回滚参数
@Service
public class UserServiceImpl implements IUserService{
	@Autowired
	private IUserDao userdao;
	@Override
	public UserBean login(String name, String password) {
		UserBean userBean = new UserBean();
		userBean.setName(name);
		userBean.setPassword(password);
		UserEntity uEntity = userdao.getUser(userBean);
		if(uEntity!=null) {
			return userBean;
		}
		return null;
	}
	@Override
	public List<UserEntity> getUserList() {
		return userdao.getUserList();
	}
	
}
