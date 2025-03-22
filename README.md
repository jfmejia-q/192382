🔥 Desafío Salarial: El Controlador de Nómina
Contexto:

Eres parte del escuadrón de élite que mantiene en orden los datos de una empresa donde algunos empleados parecen creer que los sueldos negativos son una realidad alterna válida. Tu misión (sí, aceptada) es desarrollar un sistema robusto que no se deje engañar por errores humanos ni por cifras ilógicas.

🎯 Tu objetivo:
Crear un programa en Java que ayude a controlar la nómina de 10 empleados, validando cada paso como un auténtico vigilante de la lógica.


🧠 Requisitos de la misión:
🗣️ Pide amablemente (o no tan amablemente) el sueldo de cada empleado.

💡 Spoiler: Si el sueldo es negativo o cero... no lo aceptes. Devuélvelo al inframundo y vuelve a preguntar.

🧮 Si el sueldo está en el rango entre $100 y $300, cuenta ese sueldo como un guerrero del equilibrio.

💥 Sí, incluye el $100 y el $300. Los extremos también tienen derechos.

🚀 Si el sueldo es mayor a $300, márcalo como un sueldo VIP.

💰 Suma todos los sueldos ingresados en una variable double.

🎨 Pero al final, imprímelo bonito usando float... así la gerencia no se asusta con demasiados decimales.

🧾 Al final de la jornada, reporta:

Cuántos sueldos entraron en el rango de la justicia ($100 - $300).

Cuántos sueldos VIP superaron los $300.

El total acumulado, convertido a float como quien pone perfume antes de entregar el informe.

DOCUMENTACION PROGRAMA1:
Este programa solicita los sueldos de 10 empleados, verifica si todos los valores de sueldo son válidos (mayores a 0), y luego clasifica cada sueldo según su valor. Si el sueldo es mayor o igual a 100 pero menor a 300, se clasifica como "guerrero del equilibrio", y si el sueldo es mayor a 300, se clasifica como "sueldo VIP". Finalmente, el programa calcula y muestra el total de los sueldos ingresados.

Componentes Principales



La clase Scanner se utiliza para leer datos del usuario desde la entrada estándar (en este caso, los sueldos de los empleados).

Clase Logica:

Es la clase principal que contiene el método main donde se ejecuta el programa.

Método main:

En este método se gestiona la entrada y salida de datos, la validación de los sueldos y el cálculo total.

Variables:
double sueldo1, sueldo2, sueldo3, sueldo4, sueldo5, sueldo6, sueldo7, sueldo8, sueldo9, sueldo10: Variables que almacenan los sueldos de los 10 empleados.

float sueldototal: Variable que almacenará el total de los sueldos ingresados.

Flujo:
El programa solicita al usuario que ingrese los sueldos de los 10 empleados.

Luego verifica si todos los sueldos son válidos (mayores que 0). Si alguno es inválido, el programa termina con un mensaje de error. Si todos los sueldos son válidos, muestra un mensaje de aceptación.

A continuación, clasifica cada sueldo ingresado según su valor utilizando el método checkSalaryCategory.

Finalmente, calcula el total de los sueldos y lo muestra al usuario.



Este método toma un sueldo como parámetro y clasifica el sueldo en una de dos categorías:

Si el sueldo es mayor o igual a 100 y menor a 300, se clasifica como "guerrero del equilibrio".

Si el sueldo es mayor a 300, se clasifica como "sueldo VIP".

Este método se utiliza para evitar la repetición de código en el main y para que la clasificación de sueldos sea más clara y reutilizable.


Funcionamiento Paso a Paso
Entrada de datos: El programa pide al usuario que ingrese los sueldos de 10 empleados uno por uno. La entrada se realiza utilizando el objeto entrada de la clase Scanner:


Si todos los sueldos son válidos, se muestra el mensaje "Sueldo aceptado".

Clasificación de sueldos: Para cada sueldo ingresado, se llama al método checkSalaryCategory, que imprime un mensaje dependiendo de si el sueldo está en el rango de 100 a 300 (incluido) o es mayor a 300.

Cálculo del total de sueldos: Al final del programa, se calculan todos los sueldos y se almacena el resultado en la variable sueldototal. Luego se imprime el total.



DOCUMENTACION PROGRAMA2:
 solucion


  hay un  sistema de cálculo de comisiones y salarios para un vendedor basado en los productos vendidos. El programa toma en cuenta el valor de los productos vendidos y calcula la comisión
  dependiendo de si el valor de cada producto supera los 100,000.
 
  El vendedor recibirá una comisión del 10% si el valor de un producto es igual o mayor a 100,000, o una comisión del 5% si el valor es menor.
  
  Además, se suma un salario base fijo de 1,000,000 de unidades a su salario.

  Propósito: La clase ReMal está diseñada para calcular el salario total de un vendedor basado en las comisiones obtenidas de las ventas de productos. El programa determina las comisiones a partir del valor de los productos vendidos, aplicando un porcentaje mayor si el producto vale más de 100,000 unidades.

  Comisión: El vendedor obtiene una comisión del 10% por cada producto cuyo valor sea mayor o igual a 100,000 unidades, y una comisión del 5% si el valor del producto es menor a 100,000.

  Salario base: Además de las comisiones, el vendedor recibe un salario base fijo de 1,000,000 unidades.


 Entrada de datos, se crea un objeto Scanner para la entrada de datos desde la consola.
 Scanner s = new Scanner(System.in);

 Solicita el nombre del vendedor.
 System.out.println("Nombre vendedor:");
 String a = s.nextLine();
 Scanner: Se utiliza el objeto Scanner para capturar la entrada de datos desde la consola.

 Solicitar datos: Primero, se le pide al usuario que ingrese el nombre del vendedor.

 Solicitar los valores de los productos

 Se solicita la cantidad de productos vendidos.
 System.out.println("Cantidad de productos vendidos:");
 int p = s.nextInt();

 Se solicita el valor de cada producto vendido.
 System.out.println("Ingrese valor producto 1:");
 double x1 = s.nextDouble();
 Aquí, el programa solicita la cantidad de productos vendidos y los valores de cada uno de los productos.

 nextInt(): Lee el valor de la cantidad de productos vendidos.

 nextDouble(): Lee el valor monetario de cada producto individualmente.

 se calcula las comisiones

 Inicialización de la variable para almacenar la comisión total.
 double s1 = 0;

 Cálculo de comisiones para cada producto vendido basado en el valor.
 if (x1 >= 100000) {
    s1 = s1 + (x1 * 0.10);
} else {
    s1 = s1 + (x1 * 0.05);
}
Comisiones: Para cada producto, el programa determina si el valor del producto supera los 100,000. Si lo supera, se aplica una comisión del 10% (x1 * 0.10), de lo contrario se aplica una comisión del 5% (x1 * 0.05).

El valor de la comisión se acumula en la variable s1.

 Cálculo de total de ventas y salario

 Cálculo del total de ventas (suma de los valores de los 7 productos vendidos).
 double tt = x1 + x2 + x3 + x4 + x5 + x6 + x7;

 Cálculo del salario total que incluye el salario base de 1,000,000 más las comisiones.
 double ss = (double) (s1 + 1000000);
 Total de ventas: El programa calcula la suma de los valores de todos los productos vendidos, lo cual da como resultado el total de las ventas.

 Salario total: El salario total se calcula sumando la comisión acumulada (s1) y el salario base fijo de 1,000,000 unidades. El resultado es el salario total del vendedor.

 Salida de resultados
 Impresión de resultados.
 System.out.println("Vendedor: " + a);
 System.out.println("Total ventas: " + (int) tt);
 System.out.println("Comisiones: " + (int) s1);
 System.out.println("Salario total: " + (int) ss);
 Impresión de resultados: El programa muestra en la consola el nombre del vendedor, el total de ventas, las comisiones obtenidas y el salario total del vendedor.

 conclusion del programa:
 -El usuario ingresa su nombre y los valores de los productos vendidos.
 -El programa calcula las comisiones de cada producto según su valor.
 -Calcular el total de ventas y el salario total, sumando las comisiones y el salario base.
 -Imprimir los resultados y el nombre del vendedor, el total de ventas, las comisiones y el salario total.



