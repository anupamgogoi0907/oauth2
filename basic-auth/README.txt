#Authorization Code
GET 
http://localhost:8080/oauth/authorize?response_type=code&client_id=mule&redirect_uri=http://localhost:8080/callback

#Access Token
POST 
http://localhost:8080/oauth/token?code=R4NUW7&redirect_uri=http://localhost:8080/callback&grant_type=authorization_code&client_id=mule&client_secret=mulesecret