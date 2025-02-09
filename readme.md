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

```bash
docker run --name microservice-redis -p 6379:6379 -d redis:latest
```

```bash
docker run --name redis-gui -d -p 8001:8001 redislabs/redisinsight:1.14.0
```

        local için geçerli
```bash
docker build -t configserver:v01 .
```

        docker hub için geçerli
```bash
docker build -t erenaksu1/microservicesconfigserver:v01 .
```

```bash
docker build -t erenaksu1/microservicesauth:v01 .
```

```bash
docker build -t erenaksu1/microservicesuser:v01 .
```

```bash
docker image push erenaksu1/microservicesauth:v01
```

```bash
docker image push erenaksu1/microservicesuser:v01
```

```bash
docker image push erenaksu1/microservicesconfigserver:v01
```
