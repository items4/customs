package cn.gov.jseport;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.alibaba.druid.pool.DruidDataSource;

import cn.gov.jseport.entity.Userinfo;
import cn.gov.jseport.mapper.UserinfoMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SupervisionSystemProviderApplicationTests {
	@Resource
	private UserinfoMapper userinfoMapper;
	@Test
	public void contextLoads() {
		Userinfo userinfo = userinfoMapper.selectByPrimaryKey(1);
		System.out.println(userinfo.getUname());
	}

}
