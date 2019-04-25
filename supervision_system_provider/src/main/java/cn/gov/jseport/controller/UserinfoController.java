package cn.gov.jseport.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.gov.jseport.entity.Userinfo;
import cn.gov.jseport.service.IUserinfoService;

@RestController
public class UserinfoController {
	@Resource
	IUserinfoService userinfoServiceImpl;
	@GetMapping("/userinfo")
	public List<Userinfo> findAll() {
		List<Userinfo> findAll = userinfoServiceImpl.findAll();
		System.out.println(findAll+"-====================");
		return findAll;
	}
}
