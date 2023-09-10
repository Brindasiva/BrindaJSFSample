package com.JSF;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

import jakarta.faces.annotation.*;
import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.annotation.FacesConfig;
import jakarta.faces.event.NamedEvent;
import jakarta.inject.Named;

@Named("loginBean")
@SessionScoped
public class LoginBean implements Serializable{
		
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
  

