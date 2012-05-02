package org.springframework.security.oauth.examples.sparklr.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.security.oauth.examples.sparklr.UserInfo;
import org.springframework.security.oauth.examples.sparklr.UserInfoService;

@Path("/account/")
@Produces({"application/xml", "application/json"})
public class AccountService {

	private UserInfoService userInfoService;

	public UserInfoService getUserInfoService() {
		return userInfoService;
	}

	public void setUserInfoService(UserInfoService userInfoService) {
		this.userInfoService = userInfoService;
	}
	
	@Path("/verify_credentials")
	@GET
	public UserInfo validateCredentials() {
	  return userInfoService.getCurrentUserInfo();
	}

}
