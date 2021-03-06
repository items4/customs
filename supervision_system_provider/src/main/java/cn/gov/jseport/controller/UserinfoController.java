package cn.gov.jseport.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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
	@RequestMapping("/login")
	public Userinfo login(@RequestBody Userinfo info) {
		
		 info = userinfoServiceImpl.login(info);
		
		 System.out.println("UserinfoController.login()");
		return info;
	}
}
