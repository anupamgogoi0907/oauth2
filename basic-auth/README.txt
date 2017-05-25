
***********************Authorization Code Flow****************
Step 1: Get the Authorization Code
GET 
http://localhost:8081/oauth/authorize?response_type=code&client_id=mule&redirect_uri=http://localhost:8080/callback

Step 2: Use the code to get the access token
POST 
http://localhost:8080/oauth/token?code=R4NUW7&redirect_uri=http://localhost:8080/callback&grant_type=authorization_code&client_id=mule&client_secret=mulesecret

Step 3: Use the access token to access resource
GET
http://localhost:8080/auth?access_token=b42477ff-1c18-49c2-8b82-0c6b4bd0f899


**********************Client Credentials Flow*****************
Step 1: Get the Access Token
POST
http://localhost:8081/oauth/token?grant_type=client_credentials&client_id=mule&client_secret=mulesecret

Step 2: Use the access token to access the resource
GET
http://localhost:8080/auth?access_token=b42477ff-1c18-49c2-8b82-0c6b4bd0f899


