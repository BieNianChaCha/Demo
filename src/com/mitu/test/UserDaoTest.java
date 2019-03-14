/**
 * 
 */
package com.mitu.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mitu.bean.UserBean;
import com.mitu.dao.IUserDao;
import com.mitu.entity.UserEntity;

/**
 * 	用户Dao单元测试用例
 * @author zhangchengjia
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)//启动JUnit框架
@ContextConfiguration(locations= {"file:WebContent/WEB-INF/applicationContext.xml"})
public class UserDaoTest extends AbstractTransactionalJUnit4SpringContextTests{
	//测试冲突
	@Autowired
	private IUserDao userDao;
	@Test	//声明JUnit测试方法
	public void getUserTest() {
		UserEntity uEntity = userDao.getUser(new UserBean("mitu","123456"));
		//断言
//		org.springframework.util.Assert.notNull(uEntity, "用户实体对象不应该为空");
		assertNotNull("用户实体对象不应该为空", uEntity);
		//断言密码
		assertEquals("密码不为123456", "123456", uEntity.getPassword());
	}
	//测试二
	public void getUserTest1() {
		UserEntity uEntity = userDao.getUser(new UserBean("mitu","123456"));
		//断言
//		org.springframework.util.Assert.notNull(uEntity, "用户实体对象不应该为空");
		assertNotNull("用户实体对象不应该为空", uEntity);
		//断言密码
		assertEquals("密码不为123456", "123456", uEntity.getPassword());
	}
	//测试三
	public void getUserTest2() {
                UserEntity uEntity = userDao.getUser(new UserBean("mitu","123456"));
                //断言
//              org.springframework.util.Assert.notNull(uEntity, "用户实体对象不应该为空");
                assertNotNull("用户实体对象不应该为空", uEntity);
                //断言密码
                assertEquals("密码不为123456", "123456", uEntity.getPassword());
        }
	public void getUserTest3() {
        UserEntity uEntity = userDao.getUser(new UserBean("mitu","123456"));
        //断言
//      org.springframework.util.Assert.notNull(uEntity, "用户实体对象不应该为空");
        assertNotNull("用户实体对象不应该为空", uEntity);
        //断言密码
        assertEquals("密码不为123456", "123456", uEntity.getPassword());
}
}
