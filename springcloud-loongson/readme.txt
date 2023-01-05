Euraka：
http://localhost:8081/
gateway:
http://localhost:8082/

user:
http://localhost:8084/register
注册：
curl --location --request POST 'http://localhost:8084/register?id=1&name=jack&phone=15211111111&sex=1' \
--header 'Content-Type: application/json' \
--data-raw '{
    "id":1,
    "name":"jack",
    "password":"123456",
    "phone":"15211111111",
    "sex":1
}'

登录：
curl --location --request GET 'http://localhost:8084/login?account=15211111111&password=123456'

tyre：
http://localhost:8085/dict/1