package Tarea1;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Ejercicios {
    
    /* Declaro las variables y los objetos que voy a utilizar en todos los 
    métodos de la clase */
    static int ejercicio,n1,n2,sum,pro;
    static double num1,num2,num3,num4,suma,pr;
    static Scanner teclado = new Scanner(System.in);
    static DecimalFormat df = new DecimalFormat("###.##");

    public static void main(String[] args) {
        
        // Instancio la clase para poder llamar los métodos
        Ejercicios ejercicios = new Ejercicios();
        
        // Pido el número del ejercicio
        System.out.println("Por favor, ingresa el número del ejercicio que deseas realizar");
        ejercicio = teclado.nextInt();
        
        // Evalúo el ejercicio que corresponda
        switch(ejercicio){
            case 1 -> ejercicios.Sumar();
            case 2 -> ejercicios.CalcularPerimetro();
            case 3 -> ejercicios.OperarNumeros();
            case 4 -> ejercicios.OperarNumeros2();
            case 5 -> ejercicios.CalcularPrecio();
            default -> System.out.println("¡Solo son 5 ejercicios!");
        }
    }
    
    public void Sumar(){
        /* En este método utilizo variables tipo int, porque esa es la 
        restricción del ejercicio */
        
        System.out.println("PRIMER EJERCICIO");
        
        // Leo las variables
        System.out.println("Por favor, ingresa el primer número");
        n1 = teclado.nextInt();
        System.out.println("Por favor, ingresa el segundo número");
        n2 = teclado.nextInt();
        
        // Opero las variables
        sum = n1 + n2;
        pro = n1 * n2;
        
        // Imprimo los resultados
        System.out.println("El resultado de la suma es: "+sum);
        System.out.println("El resultado del producto es: "+pro);
    }
    
    public void CalcularPerimetro(){
        /* No hay restricción, así que utilizo variables tipo double, 
        redondeadas a dos decimales */

        System.out.println("SEGUNDO EJERCICIO");
        
        // Leo las variables
        System.out.println("Por favor, ingresa el lado del cuadrado");
        num1 = teclado.nextDouble();
        
        // Opero las variables
        pr = num1 * 4;
        
        // Imprimo los resultados
        System.out.println("El perímetro del cuadrado es: "+df.format(pr));
    }
    
    public void OperarNumeros(){
        /* No hay restricción, así que utilizo variables tipo double, 
        redondeadas a dos decimales */
        
        System.out.println("TERCER EJERCICIO");
  
        // Leo las variables
        System.out.println("Por favor, ingresa el primer número");
        num1 = teclado.nextDouble();
        System.out.println("Por favor, ingresa el segundo número");
        num2 = teclado.nextDouble();
        System.out.println("Por favor, ingresa el tercer número");
        num3 = teclado.nextDouble();
        System.out.println("Por favor, ingresa el cuarto número");
        num4 = teclado.nextDouble();
        
        // Opero las variables
        suma = num1 + num2;
        pr = num3 * num4; 
        
        // Imprimo los resultados
       System.out.println("El resultado de la suma es: "+df.format(suma));
       System.out.println("El resultado del producto es: "+df.format(pr));
    }
    
    public void OperarNumeros2(){
        /* No hay restricción, así que utilizo variables tipo double, 
        redondeadas a dos decimales */
        
        System.out.println("CUARTO EJERCICIO");
  
        // Leo las variables
        System.out.println("Por favor, ingresa el primer número");
        num1 = teclado.nextDouble();
        System.out.println("Por favor, ingresa el segundo número");
        num2 = teclado.nextDouble();
        System.out.println("Por favor, ingresa el tercer número");
        num3 = teclado.nextDouble();
        System.out.println("Por favor, ingresa el cuarto número");
        num4 = teclado.nextDouble();
        
        // Opero las variables
        suma = num1 + num2 + num3 + num4;
        pr = suma / 4; 
        
        // Imprimo los resultados
       System.out.println("El resultado de la suma es: "+df.format(suma));
       System.out.println("El resultado del promedio es: "+df.format(pr));
    }
    
        public void CalcularPrecio(){
        /* No hay restricción, así que utilizo variables tipo double, 
        redondeadas a dos decimales */
        
        System.out.println("QUINTO EJERCICIO");

        // Leo las variables
        System.out.println("Por favor, ingresa el valor del producto");
        num1 = teclado.nextDouble();
        System.out.println("Por favor, ingresa la cantidad que lleva el cliente");
        num2 = teclado.nextDouble();
        
        // Opero las variables
        pr = num1 * num2;
        
        // Imprimo los resultados
        System.out.println("El cliente debe abonar: "+df.format(pr));
    }
}

