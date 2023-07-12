/*
 * 
 * D - Dependency inversion principle (Principio de inversión de dependencias)
 */
package paquete11;

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
        
        
        //http://api.movie?api=123455AMAZON909090Netflix.usuario003 
        
        APINetflix api = new APINetflix();
        api.establecerApiKey("123455");

        GeneradorPelicula gp = new GeneradorPelicula();
        gp.establecerLlave(api);
        gp.establecerUrl("http://api.movie?api=");
        System.out.println(gp.obtenerUrl());

        System.out.println("---------------------------");

        APIAmazonMovie api2 = new APIAmazonMovie();
        api2.establecerApiKey("123455");

        GeneradorPelicula gp2 = new GeneradorPelicula();
        gp2.establecerLlave(api2);
        gp2.establecerUrl("http://api.movie?api=");
        System.out.println(gp2.obtenerUrl());

        /* int numero = (int) (Math.random() * 999999 + 100000);
        System.out.println(numero);
*/
    }
}
