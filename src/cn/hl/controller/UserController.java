package cn.hl.controller;


import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.hl.entity.User;

@Controller
public class UserController {

	@RequestMapping("add")
	public String add(@Valid User user,BindingResult result,Map<String,Object> map) {

		System.out.println("Name.length="+user.getName().length());
		//判断转换是否出现异常
		if(result.getErrorCount()>0) {
			for (FieldError field : result.getFieldErrors()) {
				//getField()：获取出现异常的字段的名称
				//getDefaultMessage():异常的描述
				System.out.println(field.getField()+"|"+field.getObjectName()+"|"+field.getDefaultMessage());
			
				//将数据重新添加到Map中去。便于数据的回显（重新绑定）
				map.put("user", user);
				
				//跳转回页面
				return "/add.jsp";
			}
		}
		System.out.println(user);
		
		return "index.jsp";
	}
}
