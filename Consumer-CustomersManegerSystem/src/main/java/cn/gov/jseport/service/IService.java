package cn.gov.jseport.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import cn.gov.jseport.entity.Userinfo;

@Component
@FeignClient(value = "${user.serverUrl}")
public interface IService {
	@GetMapping("/userinfo")
	public List<Userinfo> findAll();
	@PostMapping(value = "/login",consumes = "application/json")
	public Userinfo login(@RequestBody  Userinfo info);
}
