public class Coche {
    
    //Atributos
    String marca;
    String color;
    int velocidad;

    //Constructor
    public Coche(String marca, String color, int velocidad){
        this.marca = marca;
        this.color = color;
        this.velocidad = velocidad;
    }

    //metodo para mostrar información
    public void mostrarInfo () {
        System.out.println("marca: " + marca);
        System.out.println("color: " + color);
        System.out.println("velocidad: " + velocidad + " Km/h");

    }
}
