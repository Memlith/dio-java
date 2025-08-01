# UML do iPhone de 2007
```mermaid
---
config:
  theme: redux
---
classDiagram
    direction LR
    class iPhone {
        +PlayerMusica playerMusica
        +Telefone telefone
        +Navegador navegador
    }
    class PlayerMusica {
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
    }
    class Telefone {
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }
    class Navegador {
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }
    iPhone --> PlayerMusica
    iPhone --> Telefone
    iPhone --> Navegador
