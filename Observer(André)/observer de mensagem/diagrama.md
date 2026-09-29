# Padrão Observer: Estoque de Produtos

## Diagrama de classes

![Diagrama de classes](diagrama-classes.png)

| Cor | Papel no padrão | Classe |
|-----|-----------------|--------|
| 🟪 Roxo | **Subject**: guarda a lista e avisa todo mundo | `StockData` |
| 🟨 Amarelo | **Observer**: contrato que todos seguem | `Observer` |
| 🟩 Verde | **Observers concretos**: cada um reage do seu jeito | `SmsObserver`, `ConsoleObserver`, `EmailObserver` |
| ⬜ Cinza | **Cliente**: monta tudo e dispara | `main` |

**Setas:**
- `StockData ◇→ Observer` (0..*): o StockData **tem** uma lista de observers.
- `Observer ◁┈ SmsObserver`: a classe **implementa** a interface.
- `main ┈> StockData`: o main **usa** o StockData.

## Fluxo de uma notificação

![Diagrama de sequência](diagrama-sequencia.png)

1. O `main` registra os 3 observers com `addObserver`.
2. O `main` chama `notifyObservers("Produto A", 10.0)`.
3. O `StockData` guarda nome e preço e percorre a lista chamando `update(...)` em cada observer.

---

<details>
<summary>Código Mermaid (para editar os diagramas)</summary>

```mermaid
classDiagram
    direction TB

    class Observer {
        <<interface>>
        +update(String name, Double preco) void
    }

    class StockData {
        <<Subject>>
        +List~Observer~ observers
        +String name
        +Double preco
        +addObserver(Observer observer) void
        +removeObserver(Observer observer) void
        +notifyObservers(String name, Double preco) void
        +notifyAllObservers() void
    }

    class SmsObserver {
        +update(String name, Double preco) void
    }
    class ConsoleObserver {
        +update(String name, Double preco) void
    }
    class EmailObserver {
        +update(String name, Double preco) void
    }

    class main {
        <<Cliente>>
        +main(String[] args)$ void
    }

    main ..> StockData : cria e registra
    StockData o--> "0..*" Observer : notifica
    Observer <|.. SmsObserver
    Observer <|.. ConsoleObserver
    Observer <|.. EmailObserver


    style StockData fill:#4F46E5,stroke:#312E81,stroke-width:3px,color:#FFFFFF
    style Observer fill:#FEF3C7,stroke:#D97706,stroke-width:3px,color:#78350F
    style SmsObserver fill:#D1FAE5,stroke:#059669,stroke-width:2px,color:#064E3B
    style ConsoleObserver fill:#D1FAE5,stroke:#059669,stroke-width:2px,color:#064E3B
    style EmailObserver fill:#D1FAE5,stroke:#059669,stroke-width:2px,color:#064E3B
    style main fill:#F1F5F9,stroke:#64748B,stroke-width:2px,color:#0F172A
```

```mermaid
sequenceDiagram
    autonumber
    participant M as main
    participant S as StockData
    participant SMS as SmsObserver
    participant C as ConsoleObserver
    participant E as EmailObserver

    M->>S: addObserver(sms / console / email)
    Note over S: observers = [SMS, Console, Email]
    M->>+S: notifyObservers("Produto A", 10.0)
    Note over S: guarda name e preco<br/>e chama notifyAllObservers()
    rect rgb(238, 242, 255)
    loop para cada observer da lista
        S->>SMS: update("Produto A", 10.0)
        S->>C: update("Produto A", 10.0)
        S->>E: update("Produto A", 10.0)
    end
    end
    S-->>-M: pronto
```

</details>
