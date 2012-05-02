package org.springframework.security.oauth.examples.sparklr.impl;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth.examples.sparklr.UserInfo;
import org.springframework.security.oauth.examples.sparklr.UserInfoService;

public class UserInfoServiceImpl implements UserInfoService {

  public UserInfo getCurrentUserInfo() {
    Authentication auth = SecurityContextHolder.getContext().getAuthentication();
    String name = auth.getName(); //get logged in username

    UserInfo userInfo = new UserInfo();
    userInfo.setUserId(name);
    return userInfo;
	}

}
