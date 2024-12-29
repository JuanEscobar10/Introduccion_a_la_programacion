public class Persona {
    
    //Atributos
    String nombre, profesion;
    int edad;

    //Constructor
    public Persona (String nombre, String profesion, int edad){
        this. nombre = nombre;
        this. profesion = profesion;
        this. edad = edad;
    }

    //metodo para mostrar información
    public void mostrarInformacion(){
        System.out.println("Nombre es: " + nombre);
        System.out.println("Profesión es: " + profesion);
        System.out.println("edad es: " + edad);
    }
}
