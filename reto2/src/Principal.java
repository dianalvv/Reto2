public class Principal{
    public static void main(String[]args){
        Entrada entrada1= new Entrada("Obra de Teatro", 450.0);
        Entrada entrada2 = new Entrada("Musical", 350.0);
        entrada1.mostrarInformacion();
        entrada2.mostrarInformacion();

        Entrada_Record entrada3 = new Entrada_Record("Pelicula",210.0);
        entrada3.mostrarInformacion();
    }
}