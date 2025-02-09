## Docker Image create

`PostgreSQL
 userName: postgres
 password: root
 DB : AuthDB
 `

```bash
docker run -d --name postgresql -p 5432:5432 -e POSTGRES_USER=postgres -e POSTGRES_PASSWORD=root -e POSTGRES_DB=AuthDB postgres:latest
```

     MongoDB
     userName: admin
     password: root
     DB : UserProfileDB

```bash
docker run -d --name mongodb -p 27017:27017 -e MONGO_INITDB_DATABASE=UserProfileDB -e MONGO_INITDB_ROOT_PASSWORD=root -e MONGO_INITDB_ROOT_USERNAME=admin mongo:latest
```

     mongod:
     db.createUser({user : "admin", pwd : "root", roles : ["readWrite","dbAdmin"]})