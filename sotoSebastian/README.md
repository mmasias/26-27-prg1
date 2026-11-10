# 🧭 Viaje de Marco

Simulación en Java del viaje de **Marco** (acompañado de su mono **Amedio**) en busca de su madre. Cada día ambos avanzan el uno hacia el otro, condicionados por el clima y por distintos imprevistos, hasta que la distancia que los separa llega a cero.

## 📋 Descripción

- Distancia inicial entre Marco y su madre: **350 km**.
- Cada día se simulan dos turnos: el de Marco y el de su madre.
- Velocidades, horas de marcha, clima e imprevistos son **aleatorios**.
- El programa imprime un **diario del viaje** día a día y termina cuando Marco encuentra a su madre.

## 🗂️ Estructura del repositorio

```
.
├── ViajeMarco.java        # Código fuente
├── README.md              # Este archivo
└── docs/
    ├── REGLAS.md          # Reglas y probabilidades de la simulación
    └── CODIGO.md          # Explicación del código (métodos y flujo)
```

## ⚙️ Requisitos

- Java JDK 8 o superior.

## ▶️ Compilación y ejecución

```bash
javac ViajeMarco.java
java ViajeMarco
```

> Cada ejecución produce un viaje distinto, ya que se usa `java.util.Random` sin semilla fija.

## 🖥️ Ejemplo de salida

> Salida ilustrativa; los valores cambian en cada ejecución.

```
DIARIO DEL VIAJE DE MARCO
=========================

DIA 1
Ha hecho un buen dia
Amedio se ha cansado y tengo que llevarlo en brazos
Avance 9.12 horas a 11.80 Km/h recorriendo 107.62 Km
A mama le ha llovido un poco
Mama pudo avanzar 7.40 horas a 5.10 Km/h recorriendo 37.74 Km
Al final del dia 1 la distancia entre Marco y su Madre es de 204.64 Km
- - - - - - - - - - - - - - - - - - - - - - - - - - - -
...
FIN DEL VIAJE
Marco encontro a su madre en 3 dias.
```

## ✨ Extensiones incluidas

1. **Amedio** (imprevistos con el mono): se escapa o se cansa y afecta al avance de Marco.
2. **Información sobre mamá**: cuando están cerca (< 50 km), Marco puede recibir una pista y correr 25 km extra.

Consulta los detalles en [`docs/REGLAS.md`](docs/REGLAS.md).

## 📚 Documentación

- [Reglas de la simulación](docs/REGLAS.md)
- [Explicación del código](docs/CODIGO.md)
