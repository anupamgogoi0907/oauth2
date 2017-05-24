#Authorization Code
GET 
http://localhost:8080/oauth/authorize?grant_type=authorization_code&response_type=code&client_id=mule&redirect_uri=http://localhost:8080/callback

#Access Token
POST 
http://localhost:8080/oauth/token?code=RaPTrT&redirect_uri=http://localhost:8080/callback&grant_type=authorization_code&client_id=mule&client_secret=mulesecret