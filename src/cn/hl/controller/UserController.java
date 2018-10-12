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
		//�ж�ת���Ƿ�����쳣
		if(result.getErrorCount()>0) {
			for (FieldError field : result.getFieldErrors()) {
				//getField()����ȡ�����쳣���ֶε�����
				//getDefaultMessage():�쳣������
				System.out.println(field.getField()+"|"+field.getObjectName()+"|"+field.getDefaultMessage());
			
				//������������ӵ�Map��ȥ���������ݵĻ��ԣ����°󶨣�
				map.put("user", user);
				
				//��ת��ҳ��
				return "/add.jsp";
			}
		}
		System.out.println(user);
		
		return "index.jsp";
	}
}
