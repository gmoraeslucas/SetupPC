package Computador;

public class Teclado extends Setup{
	public Teclado() {
	}
	public Teclado(int idNumero, String fabricante, String cor) {
		super(idNumero, fabricante, cor);
	}
	public void printTeclado() {
		super.printSetup();
	}
}
