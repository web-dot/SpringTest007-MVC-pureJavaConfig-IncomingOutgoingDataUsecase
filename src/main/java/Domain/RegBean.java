package Domain;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

public class RegBean implements Serializable {
	
	@NotBlank
	private String uname;
	
	@NotBlank
	@Email
	private String email;
	
	@NotBlank
	@Length(min = 5, max = 10)
	private String pass;
	
	@NotBlank
	@Length(min = 5, max = 10)
	private String rpass;
	
	
	public RegBean() {
		System.out.println("in RegBean no-arg cons");
	}
	
	
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
		System.out.println("in RegBean->setUname() " + uname);
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
		System.out.println("in RegBean->setEmail() " + email);
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
		System.out.println("in RegBean->setPass() " + pass);
	}
	public String getRpass() {
		return rpass;
	}
	public void setRpass(String rpass) {
		this.rpass = rpass;
		System.out.println("in RegBean->setRpass() " + rpass);
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((pass == null) ? 0 : pass.hashCode());
		result = prime * result + ((rpass == null) ? 0 : rpass.hashCode());
		result = prime * result + ((uname == null) ? 0 : uname.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RegBean other = (RegBean) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (pass == null) {
			if (other.pass != null)
				return false;
		} else if (!pass.equals(other.pass))
			return false;
		if (rpass == null) {
			if (other.rpass != null)
				return false;
		} else if (!rpass.equals(other.rpass))
			return false;
		if (uname == null) {
			if (other.uname != null)
				return false;
		} else if (!uname.equals(other.uname))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "RegBean [uname=" + uname + ", email=" + email + ", pass=" + pass + ", rpass=" + rpass + "]";
	}


	
} 
