/*
 * 
 * D - Dependency inversion principle (Principio de inversión de dependencias)
 */
package paquete11;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        /*
        Usar el txt llamado usuarios.txt; por cada línea del archivo
        crer un API en función de su servicio; además el API ahora genera
        información estática (no cambia el API), se debe buscar la forma que el 
        API sea dinámico totalmente (usar alguna librería propia de JAVA, tipo 
        Random); la url final debe contener el tipo de servicio y el user
        Por cada objeto de tipo GeneradoPelicula presentar la información 
        a través de un toString
         */
        
        ArrayList<GeneradorPelicula> gens = new ArrayList<>();
        ArrayList<Usuario> users;
        String nombreArc = "usuarios.txt";

        LecturaArc lectura = new LecturaArc(nombreArc);
        lectura.establecerLista();
        users = lectura.obtenerLista();
        lectura.cerrarArchivo();

        for (Usuario user : users) {
            if (user.getTipo().equals("Netflix")) {
                APINetflix apiNetflix = new APINetflix();
                apiNetflix.establecerApiKey("315555");

                GeneradorPelicula gen01 = new GeneradorPelicula();
                gen01.establecerLlave(apiNetflix);
                gen01.establecerUser(user.getUser());
                gen01.establecerUrl("https://abcde/?/");
                gens.add(gen01);
            } else if (user.getTipo().equals("Disney")) {
                APIDisney apiDysney = new APIDisney();
                apiDysney.establecerApiKey("2031000");

                GeneradorPelicula gen02 = new GeneradorPelicula();
                gen02.establecerLlave(apiDysney);
                gen02.establecerUser(user.getUser());
                gen02.establecerUrl("https://dcdc/?/");
                gens.add(gen02);
            } else if (user.getTipo().equals("Amazon")) {
                APIAmazonMovie apiAmazon = new APIAmazonMovie();
                apiAmazon.establecerApiKey("78015558");

                GeneradorPelicula gen03 = new GeneradorPelicula();
                gen03.establecerLlave(apiAmazon);
                gen03.establecerUser(user.getUser());
                gen03.establecerUrl("https://zapr/?/");
                gens.add(gen03);
            } else if (user.getTipo().equals("Starplus")) {
                APIStarPlus apiStarPlus = new APIStarPlus();
                apiStarPlus.establecerApiKey("669355");

                GeneradorPelicula gen04 = new GeneradorPelicula();
                gen04.establecerLlave(apiStarPlus);
                gen04.establecerUser(user.getUser());
                gen04.establecerUrl("https://abcde/?/");
                gens.add(gen04);
            } 
        }

        for (GeneradorPelicula gen : gens) {
            System.out.println(gen);
        }
    }
}    
