package cn.hl.Converter;

import org.springframework.core.convert.converter.Converter;

import cn.hl.entity.User;

/**
 * �Զ�������ת����
 * 	���ַ�������תΪUser����
 * @author Gjl
 *
 */
public class UserConverter implements Converter<String,User>{

	/**
	 * ��StringתΪUser���͵Ķ��󲢽��з���
	 */
	@Override
	public User convert(String user) {
		User u=new User();
		
		//����ָ���ķָ������ַ������зָ�
		String[]arr=user.split("-");
		
		//����Ӧ���������ݸ�ֵ��ָ���Ķ���
		u.setName(arr[0]);
		u.setAge(Integer.parseInt(arr[1]));
		u.setGender(Boolean.parseBoolean(arr[2]));
		u.setSalay(Float.parseFloat(arr[3]));
		
		
		System.out.println("this is Convertet user"+u);
		
		return u;
	}


}
