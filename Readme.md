```
$ ConfigServer: localhost: 9292
$ ApiGateway: localhost:8080
$ DiscoveryService: localhost:8761
$ LocationService: localhost:9001

```
```
$ http://localhost:8080/api/location/1
```

```
$ docker run -d --name keycloak -p 8888:8080 -e KEYCLOAK_USER=keycloak -e KEYCLOAK_PASSWORD=keycloak jboss/keycloak
Keycloak -> http://localhost:8888/
```

