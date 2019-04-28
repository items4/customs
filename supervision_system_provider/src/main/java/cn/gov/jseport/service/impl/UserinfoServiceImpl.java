package cn.gov.jseport.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.gov.jseport.entity.Userinfo;
import cn.gov.jseport.mapper.UserinfoMapper;
import cn.gov.jseport.service.IUserinfoService;
@Service
public class UserinfoServiceImpl implements IUserinfoService {
	@Resource
	private UserinfoMapper userinfoMapper;
	@Override
	public List<Userinfo> findAll() {
		return userinfoMapper.selectByExample(null);
	}
	@Override
	public Userinfo login(Userinfo info) {
		// TODO Auto-generated method stub
		return userinfoMapper.login(info);
	}
	

}
