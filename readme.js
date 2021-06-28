Gọi API tìm kiếm:
		curl --location --request GET 'http://localhost:8223/api/v1/demo/findAllEmployee'
Gọi API thêm mới:
		curl --location --request POST 'http://localhost:8223/api/v1/demo/createEmployee' \
		--header 'Content-Type: application/json' \
		--data-raw '{
			"name":"Loc",
			"wage":20000000
		}'