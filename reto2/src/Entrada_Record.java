public record Entrada_Record(String NombreEvento, double precio) {
    public void mostrarInformacion(){
        System.out.println("Evento: "+NombreEvento+" | "+"Precio: "+precio);
    }
}

