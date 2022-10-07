package Computador;

public class Monitor extends Setup{
	public Monitor() {
	}
	public Monitor(int idNumero, String fabricante, String cor) {
		super(idNumero, fabricante, cor);
	}
	public void printMonitor() {
		super.printSetup();
	}
}
