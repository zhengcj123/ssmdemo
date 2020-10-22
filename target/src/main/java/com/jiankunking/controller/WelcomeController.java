package com.jiankunking.controller;
 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jiankunking.common.OperationLogger;
import com.jiankunking.entity.CommonResult;
 
@RestController
public class WelcomeController {
    @OperationLogger(modelName = "WelcomeController", option = "getWelcome")
    @GetMapping(value = "/getWelcome")
    public CommonResult<Integer> getWelcome(Integer num) {
        //异常拦截测试
    	System.out.println("controller方法执行！");
//        int i = 9 / 0;
    	return new CommonResult<Integer>(200,"成功",1);
    }
 
}