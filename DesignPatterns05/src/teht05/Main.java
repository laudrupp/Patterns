package teht05;

import java.util.concurrent.TimeUnit;

public class Main {
	
	
	// Mikäli ymmärsin tehtävän ja Singleton-aiheen oikein niin luomalla kaksi samaa singletonia (tässä tapauksessa säikeillä),
	// pitäisi kummallakin singletonilla olla sama hashcode jos singleton toimii oikein.
	
	// Eli kahta singletonia ei todellisuudessa luoda vaan singletonin luonnin jälkeen kaikki seuraavat getInstance()
	// kutsut viittaa ensiksi luotuun ja ainoaan singletoniin.
	
	// Tässä esimerkkinä on kuvitteellisen moninpelin hahmoluokat joita voi olla pelissä vain yksi kutakin.
	// Kutakin hahmoa yritetään luoda tuplat ja sen jälkeen katsotaan onko kahden saman hahmoluokan hashcodet samat.
	
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				Necromancer n1 = Necromancer.getInstance();
				print("Necromancer1", n1);
			}
		});
		t1.start();
		TimeUnit.MILLISECONDS.sleep(500);
		
		
		Thread t3 = new Thread(new Runnable() {
			@Override
			public void run() {
				Sorceress s1 = Sorceress.getInstance();
				print("Sorceress1", s1);
			}
		});
		t3.start();
		TimeUnit.MILLISECONDS.sleep(500);
		
		
		Thread t5 = new Thread(new Runnable() {
			@Override
			public void run() {
				Paladin p1 = Paladin.getInstance();
				print("Paladin1", p1);
			}
		});
		t5.start();
		TimeUnit.MILLISECONDS.sleep(500);
		
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				Necromancer n2 = Necromancer.getInstance();
				print("Necromancer2", n2);
			}
		});
		t2.start();
		TimeUnit.MILLISECONDS.sleep(500);
		
		
		Thread t4 = new Thread(new Runnable() {
			@Override
			public void run() {
				Sorceress s2 = Sorceress.getInstance();
				print("Sorceress2", s2);
			}
		});
		t4.start();
		TimeUnit.MILLISECONDS.sleep(500);
		
		
		Thread t6 = new Thread(new Runnable() {
			@Override
			public void run() {
				Paladin p2 = Paladin.getInstance();
				print("Paladin2", p2);
			}
		});
		t6.start();
	}
	
	static void print(String name, HeroClasses object) {
		System.out.println(String.format("Object : %s, Hashcode: %d", name, object.hashCode()));
	}

}
