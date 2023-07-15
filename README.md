### Como montar o ambiente

- executar o comando `docker compose up` dentro da pasta docker
- Java 17

_**problemas na migration**_

**apagar tabela do Flyway**
```
$ delete from flyway_schema_history where success = 0;
```

**apagar a tabela criada**

```
$ drop database vollmed_api;
```

```
$ create database vollmed_api;
```

