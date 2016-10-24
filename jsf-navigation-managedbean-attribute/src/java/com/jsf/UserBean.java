
package com.jsf;

import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Named;

/**
 * @author Hasan
 * @version java version "1.8.0_92"
 * @os windows 10
 * @date Oct 24, 2016
 */
@Named(value = "user")
@SessionScoped
public class UserBean{

	public String nickname;

	//action listener event
	public void attrListener(ActionEvent event){

		this.nickname = (String)event.getComponent().getAttributes().get("username");

	}

	public String outcome(){
		return "result";
	}

	public String getNickname() {
		return nickname;
	}

	
}