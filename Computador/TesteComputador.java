package Computador;

public class TesteComputador {

	public static void main(String[] args) {
		Teclado t = new Teclado(101, "Hyperx", "Black");
		Mouse m = new Mouse(201, "Logitech", "Pink");
		Monitor mon = new Monitor(301, "AOC", "Black");
		Gabinete g = new Gabinete(401, "TGT", "Black");
		Computador pc = new Computador(1, t, m, mon, g);
		pc.printPc();
	}

}
