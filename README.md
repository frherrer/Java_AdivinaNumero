# Juego: Adivina el Número

## Ejercicio individual

### Objetivos

- Practicar el uso de **ArrayList** en Java.  
- Practicar estructuras de control: **ciclos** y **condicionales**.  
- Elaborar una clase de aplicación que instancie y utilice otra clase para evaluar funcionalidad.  
- Aprender a utilizar la clase **Math** para generación de números aleatorios.

---

### Requerimientos

1. Crea un paquete llamado `clases`.  
2. Dentro del paquete `clases`, crea un archivo `AdivinaNumero.java` que defina la clase `AdivinaNumero`.  
3. La clase `AdivinaNumero` debe contener únicamente un método estático llamado `compararNumeros()`.  
4. El método `compararNumeros()` recibe dos parámetros enteros:  
   - El primer parámetro es el número ingresado por el usuario.  
   - El segundo parámetro es un número aleatorio entre 1 y 100 generado en la clase `Aplicacion.java`.  
5. El método debe comparar ambos números y devolver un mensaje:  
   - Si son iguales: `"Has conseguido adivinar el número"`.  
   - Si el primero es menor que el segundo: `"Intenta con un número más grande."`.  
   - Si el primero es mayor que el segundo: `"Intenta con un número más pequeño."`.  

---

### Clase `Aplicacion.java`

Usa como base el siguiente código:

```java
public class Aplicacion {
    public static void main(String[] args) {
        System.out.print("Por favor ingresa el número: ");
        String linea = System.console().readLine();
        int num = Integer.parseInt(linea);
    }
}
```
Este código utiliza `System.console().readLine()` para permitir al usuario ingresar un número a través de la terminal.

---

### Instrucciones para la aplicación interactiva

- Crea un menú que solicite al usuario ingresar un número entre 1 y 100 para adivinar.

- Una vez ingresado, envía el número al método estático junto con un número aleatorio generado usando la clase Math.

- Despliega el mensaje retornado por el método.

- Si el usuario no adivinó el número, sigue pidiendo números.

- El número aleatorio solo debe generarse una vez al inicio, no en cada intento.

- Guarda todos los intentos del usuario en un ArrayList hasta que adivine el número.

- Cuando el usuario acierte, muestra el mensaje de éxito, la cantidad de intentos que le tomó y todos los números que ingresó (excepto el número acertado).

- Finalmente, finaliza la ejecución.


