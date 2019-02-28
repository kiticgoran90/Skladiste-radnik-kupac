package test;
import skladiste.*;

public class TestKlasa {
	
	public static void main(String[] args) {
		Skladiste sk = new Skladiste(10, 500);
		Kvadar k = new Kvadar(3, 5, 2);
		Sfera s = new Sfera(3);
		Radnik r1 = new Radnik("Goran", sk, s);
		Radnik r2 = new Radnik("Zoran", sk, k);
		Kupac k1 = new Kupac("Emilija");
		System.out.println(r1 + "\n" + r2 + "\n");
		try {
			r1.proizvedi();
			r2.proizvedi();
			System.out.println(k1 + " kupuje: " + k1.kupi(sk, k));
			r1.proizvedi();
			r2.proizvedi();
			System.out.println(k1 + " kupuje: " + k1.kupi(sk, k));
			r1.proizvedi();
			r2.proizvedi();
			System.out.println(k1 + " kupuje: " + k1.kupi(sk, k));
			System.out.println(k1 + " kupuje: " + k1.kupi(sk, s));
			System.out.println(k1 + " kupuje: " + k1.kupi(sk, k));	
		}catch(Exception g) {System.out.println(g);}
	}
}
