
package nedelja11p2; 
import java.util.regex.Pattern;


public abstract class Putovanje implements Proveri, Comparable<Putovanje>{ 
    
    private String destinacija, idPutovanja; 
    
    @Override
    public boolean proveriId(String id) {
        if(Pattern.matches("[0-9]{2,6}", id)) 
            return true; 
        else 
            return false;
    
    } 
    
    public void setIdPutovanja(String id) {
        if(proveriId(id)) 
            this.idPutovanja = id; 
        else {
            System.out.println("Default ID"); 
            this.idPutovanja = "0000";
        
        }
    
    } 
    
    public Putovanje (String destinacija, String idPutovanja){
        this.destinacija = destinacija; 
        setIdPutovanja(idPutovanja);
    
    } 
    
    @Override
    public int compareTo(Putovanje p) {
        return this.destinacija.compareTo(p.destinacija);
    
    } 
    
    @Override
    public String toString(){
        return idPutovanja + " " + destinacija;
    
    } 
    
    abstract double izracunajCenu(int brojKarata, int brojDece, int brojDana);
    
    
}
