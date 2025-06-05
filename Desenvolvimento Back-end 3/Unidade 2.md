
# Spring MVC

- Framework popular para desenvolvimento de aplicações web em Java.
- Baseado no padrão MVC (Model-View-Controller)
- Utilizado principalmente para criar aplicações web e RESTful.

## Padrão MVC

- Model
	- Dados e regras de negócio (entidades, services)
- View
	- Apresentação de dados (HTML, JSON, XML)
- Controller
	- Processa requisições e coordena Model e View

## Componentes do Spring MVC

- DispatcherServlet
- Controller
- Model
- View
- ViewResolver
- HandlerMapping

## Boas práticas no Spring MVC

- Organizar classes em pacotes: controller, service, repository, model.
- Usar anotações como @RestController, @RequestMapping, @GetMapping
- Para capturar parâmetros na URL ou do corpo da requisição: @PathVarieble, @RequestParam, @RequestBory
- Validar entradas com @Valid, @NotNull, @Size.
- Centralizar tratamento de erros com @ControllerAdvice e @Exception Handler.
- Integrar com Spring Data para persistências de dados (JPA, JDBC, MongoDB).

## Vantagens:

- Flexibilidade
- Integração com todo o ecossistema Spring
- Produtividade
- Testabilidade
- Escalabilidade

# API RESTful

- Interface de comunicação entre aplicações.
- Baseada em princípios REST (Representacional State Transfer).
- API REST

## Princípios REST

- Cliente-servidor
- Stateless
- Armazenamento em cache
- Interface Uniforme
- Sistemas em camadas
- Código sob demanda

# Método HTTP e Recursos

- GET: Recupera informações
- POST: Cria novos recursos
- PUT: atualiza recursos existentes
- DELETE: exclusão de recursos

# Spring Data JPA

- Facilita a implementação de repositórios
- Reduz código boilerplate para operações CRUD
- Interfaces prontas: Repository, CrudRepository, JpaRepository
- Integração com Spring Boot

# Validações e Tratamento de Erros

- @Valid
- @Validated
- ResponseEntityExceptionHandler
- @ ControllerAdvice

