### 1. Get Authoriuzation Code ###
http://localhost:8081/api/authorize?response_type=code&client_id=mule&redirect_uri=http://localhost:8081/response&scope=READ_RESOURCE

This step will return a code in the redirect_uri.

### 2. Get Access Token ###
http://localhost:8081/api/token?code=CODE_RECEIVED_IN_SETP_1&grant_type=authorization_code&client_id=mule&client_secret=mule&redirect_uri=http://localhost:8081/response

This step will return access_token in the redirect_uri
### 3. Validate ###
http://localhost:8081/validate?access_token=ACCESS_TOKEN_RECEIVED_IN_STEP_2