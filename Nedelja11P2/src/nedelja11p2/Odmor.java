
package nedelja11p2;

public class Odmor extends Putovanje{ 
    
    private boolean popust; 
    private Transport transport; 

    public Odmor(boolean popust, Transport transport, String destinacija, String idPutovanja) {
        super(destinacija, idPutovanja);
        this.popust = popust;
        this.transport = transport;
    }
    
    
    @Override
    public String toString() {
        return super.toString() + " " + transport;
    
    } 
    
    @Override
    double izracunajCenu(int brojKarata, int brojDece, int brojDana) {
        double cena  = brojDana * 250; 
        
        if(transport == Transport.AVION) 
            cena += 1200; 
        else if(transport == Transport.AUTOBUS) 
            cena += 200; 
        
        double krajnjaCena; 
        
        if(popust) 
            krajnjaCena = brojKarata*cena + brojDece*cena/2; 
        else 
            krajnjaCena = brojKarata*cena + brojDece*cena; 
        return krajnjaCena;
    
    }
    
}
