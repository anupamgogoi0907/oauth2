### 1. Get Authorization Code ###

http://localhost:8081/api/authorize?response_type=code&client_id=reader&redirect_uri=http://localhost:8081/response&scope=READ_RESOURCE
http://localhost:8081/api/authorize?response_type=code&client_id=reader&redirect_uri=http://localhost:8081/response&scope=READ_RESOURCE

http://authorization-code.cloudhub.io/api/authorize?response_type=code&client_id=writer&redirect_uri=http://authorization-code.cloudhub.io/&scope=WRITE_RESOURCE


This step will return a code in the redirect_uri.

### 2. Get Access Token ###

http://localhost:8081/api/token?code=CODE_RECEIVED_IN_SETP_1&grant_type=authorization_code&client_id=reader&client_secret=reader&redirect_uri=http://localhost:8081/response
http://localhost:8081/api/token?code=CODE_RECEIVED_IN_SETP_1&grant_type=authorization_code&client_id=writer&client_secret=writer&redirect_uri=http://localhost:8081/response

http://authorization-code.cloudhub.io/api/token?code=CODE_RECEIVED_IN_SETP_1&grant_type=authorization_code&client_id=writer&client_secret=writer&redirect_uri=http://authorization-code.cloudhub.io

This step will return access_token in the redirect_uri
### 3. Validate ###
http://localhost:8081/validate?access_token=ACCESS_TOKEN_RECEIVED_IN_STEP_2

http://authorization-code.cloudhub.io/validate?access_token=ACCESS_TOKEN_RECEIVED_IN_STEP_2