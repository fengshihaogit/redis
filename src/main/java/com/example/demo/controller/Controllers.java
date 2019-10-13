package com.example.demo.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
/**
 * 
 * @author Joe
 *
 */
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.bean.Goods;
import com.example.demo.service.Serviceinter;

@Controller
public class Controllers {

	@Resource
	private Serviceinter serviceinter;
	
	@Autowired
	private RedisTemplate<String, Object> redisTemplate;
	@RequestMapping("list")
	public String getGoodslist(Model model) {
		
		List<Goods> goods = serviceinter.getGoodslist();
		model.addAttribute("goods", goods);
		return "list";
	}
	@RequestMapping("toadd")
	public String toadd() {
		
		return "add";
	}
	
	
	@RequestMapping("addgoods")
	public String addgoods(Goods goods) {
		
		ListOperations<String, Object> list = redisTemplate.opsForList();
		Long leftPush = list.leftPush("goods", goods);
		System.out.println(leftPush);
		return "add";
	}
	
}
