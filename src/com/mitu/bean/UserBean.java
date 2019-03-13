/**
 * 
 */
package com.mitu.bean;

/**
 * 	用户Bean
 * @author zhangchengjia
 *
 */
public class UserBean {
	private String name;
	private String password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserBean [name=" + name + ", password=" + password + "]";
	}
	public UserBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserBean(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	
}
