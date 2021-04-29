package factorymethod;

public class OpintoOhjaaja extends AterioivaOtus {
	
	public Juoma createJuoma(){
        return new Vichy();
    };

}
