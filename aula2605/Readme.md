```mermaid
classDiagram
    direction LR
    
    class Retangulo{
        - altura : int
        - largura : int
        + Retangulo(int a, int l)
        + getArea() int
    }
```
```mermaid
classDiagram
    Carro "1" o-- "1" Motor
    Carro "1" o-- "3..4" Roda
    class Carro {
        - marca: String
        - propulsor : Motor
        + Carro()
        + acelerar(v: int) void
    }
    class Motor {
        - hp: int
        - giroAtual: int
        - cilindros: int
        + Motor()
        + acelerar(v: int) void
    }
    class Roda {
        - diametro: double
        - material: String
        - calibragem: double
        + Roda()
    }
```

```mermaid
classDiagram
    Aviao *-- Motor
    class Aviao {
        - tripulantes : int
        - passageiros : int
        - peso : double
        - combustivel : double
        - motores : ArrayList~Motor~
        + ligaAviao() void
        + Aviao()
    }
    
    class Motor {
        - tipo: String
        - consumoCombustivel : int
        - taLigado : boolean
        + ligaDesligaMotor() void
        + Motor()
    }
```
