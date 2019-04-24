package com.ehr.pojo;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class RegisterForm {

	@Email
	private String email;
	
	@NotBlank(message="密码不能为空")
	@Size(min=6,max=15,message="密码长度6-15位")
	private String password;
	
	@NotBlank(message="请确认密码")
	private String repassword;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRepassword() {
		return repassword;
	}

	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}
	
	
}
