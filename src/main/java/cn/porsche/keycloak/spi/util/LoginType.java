package cn.porsche.keycloak.spi.util;

import cn.porsche.keycloak.spi.authenticator.BaseAuthenticator;

import cn.porsche.keycloak.spi.authenticator.password.PasswordAuthenticator;


public enum LoginType {

  PASSWORD("password", "密码登陆", PasswordAuthenticator.class);
  private String code;
  private String name;
  private Class<BaseAuthenticator> authenticatorClazz;

  LoginType(String code, String name, Class authenticatorClazz) {
    this.code = code;
    this.name = name;
    this.authenticatorClazz = authenticatorClazz;
  }

  public static boolean containsCode(String code) {
    for (LoginType loginType : LoginType.values()) {
      if (loginType.getCode().equals(code)) {
        return true;
      }
    }
    return false;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Class<BaseAuthenticator> getAuthenticatorClazz() {
    return authenticatorClazz;
  }

  public void setAuthenticatorClazz(Class<BaseAuthenticator> authenticatorClazz) {
    this.authenticatorClazz = authenticatorClazz;
  }
}
