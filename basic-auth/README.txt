#Authorization Code
GET http://localhost:8080/oauth/authorize?grant_type=authorization_code&response_type=code&client_id=mule&redirect_uri=http://localhost*

#Access Token
POST http://localhost:8080/oauth/token?code=4AISnB&redirect_uri=http://localhost*&grant_type=authorization_code&client_id=mule&client_secret=mulesecret