package factorymethod;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
    	
        AterioivaOtus opettaja = new Opettaja(); 
        AterioivaOtus ohjaaja = new OpintoOhjaaja();
        AterioivaOtus oppilas = new Oppilas();
        opettaja.aterioi();
        ohjaaja.aterioi();
        oppilas.aterioi();
        
        /// Toinen vaihtoehto:
        
        Collection<AterioivaOtus> c = new ArrayList();
        
        AterioivaOtus[] otukset = {new Opettaja(), new OpintoOhjaaja(), new Oppilas()};
        
        for (AterioivaOtus otus : otukset) {
        	otus.aterioi();
        }
        
        Iterator iter = c.iterator();
        
        while(iter.hasNext()) {
        	((AterioivaOtus)iter.next()).aterioi();;
        }        
    }
}
