package com.web.binding;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
@Data
public class User {				//This class I am bind to one form
	@NotEmpty(message="Uname is Mandatory")
	@Size(min=3,max=8,message="Uname should be between 3 and 8 characters")

	private String uname;		//This variables are binded to form fields
	@NotEmpty(message="pwd is Mandatory")
	private String pwd;
	@NotEmpty(message="email is Mandatory")
	@Email(message="Enter valid email id")
	private String email;
	@NotEmpty(message="Phoneno is Mandatory")
	@Size(min=10,message="Phno should be atleast 10 digits")
	private String phno;
	@NotNull(message="Age is required")	//Integer is null
	@Min(value=21,message="Age should be minimum 21 years")
	@Max(value=60,message="Age should not cross 60 years")
	private Integer age;

}
