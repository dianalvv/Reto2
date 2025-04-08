
public class Entrada {
    String NombreEvento;
    double precio;

    public  Entrada(String NombreEvento, double precio){
        this.NombreEvento= NombreEvento;
        this.precio = precio;

    }
    public void mostrarInformacion(){
        System.out.println("Evento: "+NombreEvento+" | "+"Precio: "+precio);
    }

}
