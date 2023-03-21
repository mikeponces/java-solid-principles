package com.pluralsight.solid.isp.bad;

public interface LoginService {
	void signIn();

	void signOut();

	void updateRememberMeCookie();

	void getSessionExpiration(int seconds);

	void validateToken(Jwt token);

	User getUserDetails();
}
