
## Docker Image create
  `PostgreSQL
   userName: postgres
   password: root
   DB : AuthDB
   `
```bash
docker run -d --name postgresql -p 5432:5432 -e POSTGRES_USER=postgres -e POSTGRES_PASSWORD=root -e POSTGRES_DB=AuthDB postgres:latest
```
  