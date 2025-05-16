## Método de Bisección en Java

Este proyecto implementa el **método numérico de bisección** para encontrar una raíz de la función `f(x) = x² - 2` dentro de un intervalo proporcionado por el usuario. El programa calcula la raíz aproximada utilizando iteraciones hasta que el **porcentaje de error relativo sea menor al 1%**.

## Descripción del Método

El **método de bisección** consiste en:

1. Evaluar la función en los extremos de un intervalo `[a, b]`.
2. Verificar si hay cambio de signo (es decir, si `f(a) * f(b) < 0`).
3. Calcular el punto medio `xr = (a + b) / 2`.
4. Determinar qué subintervalo contiene la raíz según el signo del producto `f(a) * f(b)`.
5. Repetir el proceso hasta que el **error porcentual relativo** entre `xr` y su valor anterior sea menor al 1%.

## Requisitos

- Java 8 o superior
- Editor de código (Eclipse, IntelliJ, VS Code) o terminal con `javac`

## Cómo usarlo

1. Abre una terminal o consola.
2. Compila el programa:

   ```bash
   javac Evidencia_3/Biseccion.java
