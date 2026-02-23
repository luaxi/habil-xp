# Habil XP

Uma API de gamificação de habilidades pessoais.

## Tecnologias

- Quarkus
- PostgreSQL
- Docker

## Pré-requisitos

- Docker
- Java 21
- Maven (ou o wrapper `./mvnw` incluído no projeto)

## Configuração

Crie um arquivo `.env` na raíz do projeto com as variáveis:
```env
DB_USER=user
DB_PASSWORD=123
```

## Execução do projeto

### Produção

Empacote a aplicação com o Maven Wrapper e suba os contêineres com Docker Compose:

```bash
./mvnw clean package
docker compose up
```

- API disponível em http://localhost:8080

### Desenvolvimento

Suba apenas o banco de dados via Docker e rode a aplicação com o Quarkus Dev Mode:

```bash
docker compose up db -d
./mvnw quarkus:dev
```

- API disponível em: http://localhost:8080
- Dev UI: http://localhost:8080/q/dev
- Swagger UI: http://localhost:8080/swagger-ui