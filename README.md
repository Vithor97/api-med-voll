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

