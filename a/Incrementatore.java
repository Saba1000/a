package a;

public class Incrementatore implements Runnable {
	private Contatore cont;
	private int n;
	private int t;
	
	public void getN(int n) {
		this.n = n;
	}
	
	public void getT(int t) {
		this.t = t;
	}
	
	public Incrementatore(Contatore cont) {
		this.cont = cont;
	}
	
	public void run() {
		if(n<t) {
			for(int i=0; i<t; i++) {
				cont.incrementa();
			}
		} else {
			if(n%t == 0) {
				for(int i=0; i<n/t; i++) {
					cont.incrementa();
				}
			} else {
				int s = 0;
				while(n%t != 0) {
					n--;
					s++;
				}
				for(int i=0; i<n/t; i++) {
					cont.incrementa();
				}
				for(int i=0; i<s; i++) {
					cont.incrementa();
				}
			}
		}
		
	}
}
