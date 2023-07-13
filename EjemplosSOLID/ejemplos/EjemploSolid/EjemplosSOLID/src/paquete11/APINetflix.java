/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete11;


public class APINetflix implements APIMovie{
    
    private String apiKey;
    private int nroRandom = (int) (Math.random() * 999999+100000);
    
    @Override
    public void establecerApiKey(String ak){
        apiKey = "NETFLIX"+ak+nroRandom;
    }
    
    @Override
    public String obtenerApiKey(){
        return apiKey;
    }
    
}
