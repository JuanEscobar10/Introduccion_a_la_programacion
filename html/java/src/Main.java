import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){

       

        // //Crear primer objeto objeto de la clase Persona
        // Persona unaPersona = new Persona("Carolina", "Analista de costo", 20);

        // //Llamar al primer metodo para mostrar información
        // unaPersona.mostrarInformacion();

        // Persona dosPersona = new Persona("Ana","Desarrollo de software", 20);
        // dosPersona.mostrarInformacion();

        // try {
        //     // Código que puede generar una excepción
        // } catch (TipoDeExcepcion e) {
        //     // Código para manejar la excepción
        // } finally {
        //     // Código que siempre se ejecuta (opcional)
        // }


    //     Scanner scanner = new Scanner(System.in);
        
    //     try {
    //         System.out.println("Ingresa el numerador:");
    //         int numerador = scanner.nextInt();
            
    //         System.out.println("Ingresa el denominador:");
    //         int denominador = scanner.nextInt();
            
    //         int resultado = numerador / denominador; // Puede generar una excepción si denominador es 0
            
    //         System.out.println("El resultado es: " + resultado);
    //     } catch (ArithmeticException e) {
    //         System.out.println("Error: No se puede dividir entre cero.");
    //     } catch (Exception e) {
    //         System.out.println("Ocurrió un error inesperado: " + e.getMessage());
    //     } finally {
    //         System.out.println("Cálculo finalizado.");
    //         scanner.close(); // Cerramos el scanner en el bloque finally
    //     }
    // }

            try {
            File archivo = new File("Coche.java");
            Scanner lector = new Scanner(archivo);
            
            while (lector.hasNextLine()) {
                String linea = lector.nextLine();
                System.out.println(linea);
            }
            lector.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: El archivo no se encontró.");
        } finally {
            System.out.println("Proceso completado.");
        }
    }
}





