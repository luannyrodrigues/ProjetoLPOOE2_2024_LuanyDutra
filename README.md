# Sistema de Monitoramento de Animais Silvestres
## **Descrição do Projeto**

Este projeto consiste em um **sistema de monitoramento de animais**, desenvolvido em **Java** com as seguintes tecnologias e ferramentas:

- **Swing**: para a criação da interface gráfica (GUI).  
- **JPA**: para a persistência de dados em um banco de dados **PostgreSQL**.  
- **Maven**: como gerenciador de dependências e build.  

O sistema implementa funcionalidades **CRUD** (Create, Read, Update, Delete) completas para as entidades do domínio, incluindo:

- **Mamíferos**  
- **Aves**  
- **Répteis**  
- **Habitats**  
- **Observações**  
- **Pesquisadores**  

---

## **Objetivo do Projeto**

O desenvolvimento deste sistema faz parte da disciplina **Linguagem de Programação Orientada a Objetos** do curso de **Bacharelado em Ciência da Computação**. O principal objetivo é aplicar conceitos fundamentais de **programação orientada a objetos**, **persistência de dados** e **desenvolvimento de interfaces gráficas**, proporcionando uma aplicação funcional e integrada com um banco de dados.

## Diagrama de Classes
![diagrama](Diagrama_de_classes(1).png)

## Tecnologias Utilizadas

- Java SE 8+
- Swing - Interface gráfica
- JPA (Java Persistence API)
- Hibernate 
- Maven 
- PostgreSQL

## Como Utilizar

### 1. Clone o repositório
Faça o download do projeto para sua máquina local usando o comando:

```git clone <URL-do-repositório>```

### 2. Configuração do Banco de Dados

Crie um banco de dados PostgreSQL com o nome:

```ProjetoLPOOE1_Luanny```

### 3. Atualize o arquivo de configuração JPA

Localize o arquivo persistence.xml no caminho:

```OtherSources/src/main/resources/META-INF/persistence.xml```

Na linha referente à senha do banco, edite o valor da propriedade javax.persistence.jdbc.password:

```<property name="javax.persistence.jdbc.password" value="sua_senha_aqui"/>```

Substitua sua_senha_aqui pela senha configurada em seu banco de dados PostgreSQL.

### 4. Execute o projeto

Abra o projeto em sua IDE favorita (como NetBeans, IntelliJ ou Eclipse).
Certifique-se de que as dependências estão corretamente baixadas pelo Maven.
Execute o método main na classe MainFrame localizada em:

```com.example.views.MainFrame```
