package cn.gov.jseport.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.gov.jseport.entity.Userinfo;
import cn.gov.jseport.service.IService;

@RestController
public class UserinfoController {
	@Resource
	private IService iService;
	@GetMapping("/userinfo")
	public List<Userinfo> findAll(){
		return iService.findAll();
	}
}
