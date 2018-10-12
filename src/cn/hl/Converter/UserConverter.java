package cn.hl.Converter;

import org.springframework.core.convert.converter.Converter;

import cn.hl.entity.User;

/**
 * 自定义类型转换器
 * 	将字符串类型转为User类型
 * @author Gjl
 *
 */
public class UserConverter implements Converter<String,User>{

	/**
	 * 将String转为User类型的对象并进行返回
	 */
	@Override
	public User convert(String user) {
		User u=new User();
		
		//按照指定的分隔符对字符串进行分割
		String[]arr=user.split("-");
		
		//将对应的数组内容赋值给指定的对象
		u.setName(arr[0]);
		u.setAge(Integer.parseInt(arr[1]));
		u.setGender(Boolean.parseBoolean(arr[2]));
		u.setSalay(Float.parseFloat(arr[3]));
		
		
		System.out.println("this is Convertet user"+u);
		
		return u;
	}


}
