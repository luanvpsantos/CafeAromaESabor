# ☕ Café Aroma & Sabor

<p align="center">
  Sistema de gerenciamento de estoque desenvolvido com Spring Boot, Spring Security, Thymeleaf e MySQL.
</p>

<p align="center">

![Java](https://img.shields.io/badge/Java-17-orange)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.1.6-brightgreen)
![MySQL](https://img.shields.io/badge/MySQL-8-blue)
![Maven](https://img.shields.io/badge/Maven-Build-red)
![License](https://img.shields.io/badge/License-Educational-lightgrey)

</p>

---

## 📖 Sobre o Projeto

O **Café Aroma & Sabor** é um sistema web desenvolvido para controle de estoque, permitindo o gerenciamento de produtos, usuários e movimentações de entrada e saída.

O projeto foi construído utilizando o ecossistema Spring, seguindo boas práticas de desenvolvimento e arquitetura MVC.

---

## 🚀 Funcionalidades

### 📦 Gerenciamento de Produtos

* Cadastro de produtos
* Atualização de informações
* Exclusão de produtos
* Consulta de estoque
* Controle de estoque mínimo

### 📊 Controle de Estoque

* Entrada de produtos
* Saída de produtos
* Histórico de movimentações
* Controle de quantidade disponível

### 👤 Gerenciamento de Usuários

* Cadastro de usuários
* Controle de acesso
* Gerenciamento de perfis

### 🔐 Segurança

* Login autenticado
* Criptografia de senhas
* Proteção de rotas
* Controle de permissões

---

## 🛠️ Tecnologias Utilizadas

| Tecnologia      | Descrição                     |
| --------------- | ----------------------------- |
| Java 17         | Linguagem principal           |
| Spring Boot     | Framework backend             |
| Spring MVC      | Arquitetura Web               |
| Spring Data JPA | Persistência de dados         |
| Spring Security | Autenticação e autorização    |
| Thymeleaf       | Renderização de páginas       |
| MySQL           | Banco de dados                |
| Maven           | Gerenciamento de dependências |

---

## 🏗️ Arquitetura

```text
Controller
    ↓
Service
    ↓
Repository
    ↓
MySQL Database
```

---

## 📂 Estrutura do Projeto

```text
src
├── main
│   ├── java
│   │   └── br.com.cafearomaesabor
│   │       ├── config
│   │       ├── controller
│   │       ├── model
│   │       ├── repository
│   │       └── service
│   │
│   └── resources
│       ├── static
│       ├── templates
│       └── application.properties
│
└── test
```

---

## ⚙️ Configuração

### Banco de Dados

Criar o banco:

```sql
CREATE DATABASE CafeAromaESabor;
```

### application.properties

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/CafeAromaESabor
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

## ▶️ Executando a Aplicação

### Clone o projeto

```bash
git clone https://github.com/seu-usuario/CafeAromaESabor.git
```

### Acesse a pasta

```bash
cd CafeAromaESabor
```

### Execute

Linux/macOS

```bash
./mvnw spring-boot:run
```

Windows

```cmd
mvnw.cmd spring-boot:run
```

---

## 📸 Telas do Sistema

Adicione capturas de tela na pasta:

```text
docs/images
```

Exemplo:

```markdown
![Login](docs/images/login.png)

![Dashboard](docs/images/dashboard.png)

![Produtos](docs/images/produtos.png)
```

---

## 🎯 Objetivos de Aprendizagem

Este projeto foi desenvolvido para praticar:

* Desenvolvimento Web com Spring Boot
* Arquitetura MVC
* Persistência de Dados com JPA/Hibernate
* Integração com MySQL
* Autenticação e Autorização
* Boas práticas de organização de código
* Desenvolvimento Full Stack Java

---

## 📚 Conceitos Aplicados

* CRUD Completo
* MVC
* Injeção de Dependência
* Repository Pattern
* DTOs
* Validação de Dados
* Segurança de Aplicações
* Persistência Relacional

---

## 👨‍💻 Autor

Desenvolvido por **Seu Nome**

GitHub: https://github.com/seu-usuario

LinkedIn: https://linkedin.com/in/seu-perfil

---

## 📄 Licença

Projeto desenvolvido para fins acadêmicos e educacionais.
Distribuição livre para estudos e aperfeiçoamento.
