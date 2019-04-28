package cn.gov.jseport;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.alibaba.druid.pool.DruidDataSource;

import cn.gov.jseport.controller.UserinfoController;
import cn.gov.jseport.entity.Userinfo;
import cn.gov.jseport.mapper.UserinfoMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SupervisionSystemProviderApplicationTests {
	@Resource
	private UserinfoController userinfoController;
	@Test
	public void contextLoads() {
		Userinfo info = new Userinfo();
		info.setUname("admin");
		info.setUpass("admin");
		Userinfo login = userinfoController.login(info);
	}

}
