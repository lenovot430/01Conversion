package cn.hl.entity;

import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

public class User {

	@NotNull
	@Length(min=6,max=10)
	private String name;
	@NotNull
	@Min(18)
	private int age;
	private boolean gender;
	@NumberFormat(pattern="#,###,###.##")
	private float salay;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date birthDay;
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String name, int age, boolean gender, float salay, Date birthDay) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.salay = salay;
		this.birthDay = birthDay;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}

	public float getSalay() {
		return salay;
	}

	public void setSalay(float salay) {
		this.salay = salay;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", gender=" + gender + ", salay=" + salay + ", birthDay="
				+ birthDay + "]";
	}
}
