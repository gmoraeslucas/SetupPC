package Computador;

public class Gabinete extends Setup{
	public Gabinete() {
	}
	public Gabinete(int idNumero, String fabricante, String cor) {
		super(idNumero, fabricante, cor);
	}
	public void printGabinete() {
		super.printSetup();
	}
}
