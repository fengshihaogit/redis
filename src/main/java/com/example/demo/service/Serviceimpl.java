package com.example.demo.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.demo.bean.Goods;
import com.example.demo.mapper.MapperDao;

@Service
public class Serviceimpl implements Serviceinter{

	@Resource
	private MapperDao mapperDao;
	
	@Override
	public List<Goods> getGoodslist() {
		// TODO Auto-generated method stub
		return mapperDao.getGoodslist();
	}
	
}
