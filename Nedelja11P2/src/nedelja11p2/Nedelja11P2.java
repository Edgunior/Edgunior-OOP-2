
package nedelja11p2; 

import java.util.ArrayList; 
import java.util.Collections;

public class Nedelja11P2 {

    
    public static void main(String[] args) { 
        
        ArrayList<Odmor> odmori = new ArrayList<>();  
        
        odmori.add(new Odmor(true, Transport.AVION, "Paris", "450"));
        odmori.add(new Odmor(false, Transport.AUTO, "Budimpesta", "15"));
        odmori.add(new Odmor(true, Transport.AUTOBUS, "Budva", "12"));
        odmori.add(new Odmor(false, Transport.AVION, "London", "222")); 
        
        for(Odmor o : odmori){
            System.out.println(o);
        
        } 
        
        Collections.sort(odmori); 
        
        Odmor o1 = new Odmor(true, Transport.AVION, "Paris", "450"); 
        for(Odmor o: odmori){
            if(o.compareTo(o1) == 0) 
                System.out.println("True");
        
        } 
        
        System.out.println("Cena odmor" + o1 + " je " + o1.izracunajCenu(3, 1, 10));
        
    
       
        
    }
    
}
