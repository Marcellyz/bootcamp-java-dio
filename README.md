# Bootcamp Java DIO 👨‍⚖️👨‍💻✨
Este repositório é destinado ao estudo de Programação Orientada a Objeto, onde realizei a implementação de um pequeno sistema do bootcamp, utilizando classes, Listas, etc.

## 📍Stack utilizada

<div>
  <img align="inline_block" alt="java" src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white"/>
</div>

## 📦 Estrutura do projeto
````
bootcamp-java-dio/
├── .idea/                                
├── src/                               
|   ├── dominio/
|   |  ├── Bootcamp.java
|   |  ├── Conteudo.java
|   |  ├── Curso.java
|   |  ├── Dev.java
|   |  └── Mentoria.java
|   └── Main.java
├── .gitignore
├── .bootcamp-java-dio.iml
└── README.md
````

## diagrama de classe

```mermaid
classDiagram
class Curso{
    -int cargaHoraria 
    + getCargaHoraria() int
    + setCargaHoraria(inteiro cargaHoraria)
}
class Mentoria{
    -LocalDate data 
    + getData() LocalDate
    + setData(LocalDate data) 
    + toString() string
}
class Conteudo{
    <<Abstract>>
    -String titulo
    -String descricao
    #double XP_PADRAO = 10$ 
    +calcularXp()* double 
    +getDescricao() string
    +setDescricao(String descricao)
    +getTitulo() string
    +setTitulo(String titulo)
}
class Bootcamp{
    -String nome
    -String descricao
    -LocalDate dataInicial
    -LocalDate dataFinal
    -Set~Dev~ devsInscritos
    -Set~Conteudo~ conteudos
    +getNome() String
    +setNome(String nome) 
    +getDescricao() String
    +setDescricao(String descricao) 
    +getDataInicial() Localdate
    +getDataFinal() LocalDate 
    +getDevsInscritos() Set~Dev~
    +setDevsInscritos(Set~Dev~ devsInscritos) 
    +getConteudos() Set~Conteudo~
    +setConteudos(Set~Conteudo~ conteudo)
}
class Dev{
    -String nome
    -Set~Conteudo~ conteudosInscritos
    -Set~Conteudo~ conteudosConcluidos
    +inscrverBootcamp(Bootcamp bootcamp)
    +progredir()
    +calcularTotalXp() double
    +getNome() String
    +setNome(String nome)
    +getConteudosInscritos() Set~Conteudo~
    +setConteudosInscritos(Set~Conteudo~ conteudoInscritos)
    +getConteudosConcluidos() Set~Conteudo~
    +setConteudosConcluidos(Set~Conteudo~ conteudosConcluidos)
}

class Main

Conteudo <|-- Curso
Conteudo <|-- Mentoria
Bootcamp <-- Conteudo
Bootcamp -- Dev
Main *-- Bootcamp
Main *-- Mentoria
Main *-- Curso
Main *-- Dev
```

