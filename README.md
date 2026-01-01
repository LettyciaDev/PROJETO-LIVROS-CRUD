# 📚 Projeto Livros — CRUD

> 🛠️ Aplicação de **CRUD (Create, Read, Update e Delete)** para gerenciamento de livros — desenvolvida em **Java** com foco em boas práticas e arquitetura limpa.

Este repositório contém um projeto que implementa as operações básicas de um sistema de livros **(cadastrar, mostrar, editar e excluir)**, seguindo o padrão de projeto MVC (*Model-View-Controller*) e princípios de desenvolvimento modernos.

---

## 🚀 Visão Geral

Este projeto é uma aplicação completa para gerenciamento de livros que permite:

✔ Criar novos livros
✔ Listar livros existentes
✔ Atualizar dados de livros
✔ Excluir livros
✔ Persistir os dados em banco

---

## 🧱 Estrutura do Repositório

```
PROJETO-LIVROS-CRUD/
├── .mvn/                   ← Wrapper do Maven
├── src/
│   └── main/
│       ├── java/           ← Código-fonte Java (controllers, models, services, repos)
│       └── resources/      ← Configurações e templates
├── .gitignore
├── mvnw
├── mvnw.cmd
├── pom.xml                 ← Configurações do projeto (dependências, build)
└── README.md
```

📌 O projeto segue convenções padrão de um projeto Java com **Maven** e estrutura organizada. ([GitHub][2])

---

## 🧠 Tecnologias Utilizadas

O projeto é construído com as seguintes tecnologias:

| Tecnologia                                       | Função                         |
| ------------------------------------------------ | ------------------------------ |
| **Java**                                         | Linguagem principal            |
| **Spring Boot**                                  | Framework para web e backend   |
| **Maven**                                        | Gerenciador de dependências    |
| **JPA/Hibernate**                                | Persistência de dados em banco |
| **Banco de Dados** (ex: H2, PostgreSQL ou outro) | Armazenamento de livros        |

> 📌 *CRUD* é a sigla para **Create, Read, Update e Delete**, operações básicas de qualquer sistema de gerenciamento de dados. 

---

## 🧠 O que é CRUD?

CRUD representa as quatro operações fundamentais que um sistema deve oferecer para manipular dados:

* **C**reate → Criar novos registros
* **R**ead → Ler/listar registros
* **U**pdate → Atualizar registros existentes
* **D**elete → Excluir registros

Essas operações são essenciais em sistemas que interagem com banco de dados. 

---

## 📌 Funcionalidades

✔ Cadastrar novo livro com informações como título, autor, ISBN, páginas etc.
✔ Listar todos os livros cadastrados.
✔ Editar/Atualizar dados de um livro existente.
✔ Remover um livro da base de dados.

---

## 🛠️ Como Executar o Projeto

### 📌 Pré-requisitos

Antes de rodar o projeto, certifique-se de ter instalado:

✔ **Java JDK 8 ou superior**
✔ **Maven**
✔ IDE (ex: IntelliJ, Eclipse ou VS Code)

---

### ▶️ Rodando o Sistema

1. **Clone o repositório:**

```bash
git clone https://github.com/LettyciaDev/PROJETO-LIVROS-CRUD.git
```

2. **Abra a pasta no Your IDE favorito**

3. **Compile e rode com Maven:**

```bash
mvn spring-boot:run
```

4. **Acesse a aplicação no navegador:**

```
http://localhost:8080
```

5. Navegue pelas rotas para cadastrar, listar, atualizar e excluir livros.

---

## 🧪 Testes

Você pode adicionar testes unitários e de integração usando:

✔ **JUnit**
✔ **Mockito**

Isso ajuda a garantir a confiabilidade e qualidade do código.

---

## 🤝 Contribuições

Contribuições são muito bem-vindas 👍
Para colaborar:

1. Faça um *fork* deste repositório
2. Crie uma *branch* para sua feature (`feature/nome-da-feature`)
3. Envie um *pull request*
