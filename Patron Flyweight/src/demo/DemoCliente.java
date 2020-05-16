package demo;

public class DemoCliente {

    public static void main(String[] args) {

        Lapiz lapizVerdeDelgado1 = LapizFactory.getLapizDelgado("Verde");  //Se crea un lápiz nuevo
        lapizVerdeDelgado1.dibujar("Hello World en verde!");

        Lapiz lapizVerdeDelgado2 = LapizFactory.getLapizDelgado("Verde");  //Se comparte el lápiz
        lapizVerdeDelgado2.dibujar("Hello World en verde por otro usuario!");

        Lapiz lapizAzulGrueso1 = LapizFactory.getLapizGrueso("Azul");       //Se crea un lápiz nuevo
        lapizAzulGrueso1.dibujar("Hello World en azul!");

        Lapiz lapizAzulGrueso2 = LapizFactory.getLapizGrueso("Azul");       //Se comparte el lápiz
        lapizAzulGrueso2.dibujar("Hello World en azul por otro usuario!");

        System.out.println("Hash de objeto: " + lapizVerdeDelgado1.getClass().getName() + " " + lapizVerdeDelgado1.hashCode());
        System.out.println("Hash de objeto: " + lapizVerdeDelgado2.getClass().getName() + " " + lapizVerdeDelgado1.hashCode());

        System.out.println("Hash de objeto: " + lapizAzulGrueso1.getClass().getName() + " " + lapizAzulGrueso1.hashCode());
        System.out.println("Hash de objeto: " + lapizAzulGrueso2.getClass().getName() + " " + lapizAzulGrueso2.hashCode());
        
        //TODO Tarea: Aparte de soportar lápices, vamos a soportar compartir distintos tipos de borradores
        // de distintos tamaños (pequeño, mediano grande) y de formas diferentes (círculo, cuadrado y triangular).        
        
        Borrador borradorCuadradoPequeño1 = BorradorFactory.getBorradorPequeño("Cuadrado");  //Se crea un borrador nuevo
        borradorCuadradoPequeño1.borrar("Hello World en borrador cuadrado!");
        
        System.out.println("Hash de objeto: " + borradorCuadradoPequeño1.getClass().getName() + " " + borradorCuadradoPequeño1.hashCode());
        
        Borrador borradorCuadradoGrande2 = BorradorFactory.getBorradorGrande("Cuadrado");  //Se comparte el borrador
        borradorCuadradoGrande2.borrar("Hello World en Cuadrado por otro usuario!");
    }
}
