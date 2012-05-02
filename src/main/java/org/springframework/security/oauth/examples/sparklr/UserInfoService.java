package org.springframework.security.oauth.examples.sparklr;

public interface UserInfoService {

  /**
   * Load the photos for the current user.
   *
   * @return The photos for the current user.
   */
  UserInfo getCurrentUserInfo();

}
