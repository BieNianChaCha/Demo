/**
 * 
 */
package com.mitu.entity;

/**
 * 
 * <p>说明：  []</p>
 * <p>nuge.cn Company</p>
 * <p>类： com.mitu.entity.UserEntity.java</p>
 * @author 张成佳
 * @since 2019年3月12日 上午10:17:38
 * @version 1.0.0.0
 */
public class UserEntity {
	private int id;
	private String name;
	private String password;
	private String email;
	private String phone;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", name=" + name + ", password=" + password + ", email=" + email + ", phone="
				+ phone + "]";
	}
	
}
