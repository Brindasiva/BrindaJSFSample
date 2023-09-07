package com.JSF;

import jakarta.annotation.ManagedBean;
import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.annotation.FacesConfig;

@FacesConfig
public class LoginBean {
		
  private String username;
  private String password;
  
   
  public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getpassword() {
	  return password;
  }
  
  public void setpassword(final String password)
  {
	  this.password = password;
  }
}
  

