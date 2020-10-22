package com.jiankunking.service.Impl;

import org.springframework.stereotype.Service;

import com.jiankunking.service.ICheckService;

@Service
public class CheckServiceImpl implements ICheckService {

	@Override
	public boolean checkParam() {
		System.out.println("进入checkParam方法");
		return false;
	}

}
