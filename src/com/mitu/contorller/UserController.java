/**
 * 
 */
package com.mitu.contorller;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.Priority;
import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mitu.bean.UserBean;
import com.mitu.entity.UserEntity;
import com.mitu.service.IUserService;

/**
 * 	用户页面控制器类
 * @author zhangchengjia
 *
 */
@Controller
public class UserController {
	@Autowired
	private IUserService userService;
	//获取日志记录器
	private static Logger logger = Logger.getLogger(UserController.class);

	@RequestMapping("login")
	public String userLogin(UserBean user,ModelMap map) {
		logger.log(Priority.DEBUG, user);
		UserBean uBean = userService.login(user.getName(), user.getPassword());
		if(uBean!=null) {
			/*
			 * logger.log(Priority.DEBUG, userService.getUserList()); map.put("userList",
			 * userService.getUserList()); List<UserEntity> list =
			 * userService.getUserList(); for (UserEntity userEntity : list) {
			 * System.out.println(userEntity.getName()); }
			 */
			return "LoginSuccess";
		}
		return "Login";
	}
	@RequestMapping("showList")
	@ResponseBody
	public List<UserEntity> getEntities(){
		System.out.println("showList");
		return userService.getUserList();
	}
}
