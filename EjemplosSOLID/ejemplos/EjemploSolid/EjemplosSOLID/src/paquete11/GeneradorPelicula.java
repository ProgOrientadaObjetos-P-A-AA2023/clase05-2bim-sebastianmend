package paquete11;


public class GeneradorPelicula {
    
    private APIMovie llave;
    private String url;
    private String user;
    
    public void establecerLlave(APIMovie l){ // APINetflix, APIAmazon
        llave = l;
    }
    
    public void establecerUrl(String l){
        url = String.format("%s%s:%s", 
                l, 
                obtenerLlave().obtenerApiKey(),
                user);
    }
    
    public void establecerUser(String l){
        user = l;
    }
    
    public APIMovie obtenerLlave(){
        return llave;
    }
    
    public String obtenerUrl(){
        return url;
    }
    
    public String obtenerUser(){
        return user;
    }

    @Override
    public String toString() {
        return url+"\n";
    }
    
}
