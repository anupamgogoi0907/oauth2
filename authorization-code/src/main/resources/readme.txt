### Get Authoriuzation Code ###
http://localhost:8081/api/authorize?response_type=code&client_id=mule&redirect_uri=http://localhost:8081/response&scope=READ_RESOURCE


### Get Access Token ###
http://localhost:8081/api/token?code=BGoIYVQ_nrqwX40awOtfwRp_q5D-K0N22YkFk8NqCcZ7DyldodPJWPut2s6m-470HvSLf7VJb84AV7DskM64wQ&grant_type=authorization_code&client_id=mule&client_secret=mule&redirect_uri=http://localhost:8081/response

### Validate ###
http://localhost:8081/validate?access_token=NTUkDO2fEPaMckESAExGxRsi_9LdoJjASoFoDR4obdnLOveSNkmbuhoFP8UqFKkjAOBfCGuRsub-QnKx99U3uA