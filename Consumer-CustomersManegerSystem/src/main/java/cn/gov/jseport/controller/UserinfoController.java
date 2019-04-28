package cn.gov.jseport.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import cn.gov.jseport.entity.Tree;
import cn.gov.jseport.entity.Userinfo;
import cn.gov.jseport.service.IService;

@RestController
public class UserinfoController {
	@Resource
	private IService iService;

	@GetMapping("/userinfo")
	public List<Userinfo> findAll() {
		return iService.findAll();
	}

	@RequestMapping("/login")
	public ModelAndView login(Userinfo info,HttpSession session) throws Exception {

	Userinfo userinfo = iService.login(info);
		System.out.println(info+"%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		
		ModelAndView mv = new ModelAndView();
		if (userinfo != null) {
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$----------");
			mv.setViewName("admin/index");
			return mv;
		} else {
			System.out.println("+%+%+%+%+%+%==");
			mv.setViewName("login");
			return mv;
		}

	}
}
