package Computador;

public class Mouse extends Setup{
	public Mouse() {
	}
	public Mouse(int idNumero, String fabricante, String cor) {
		super(idNumero, fabricante, cor);
	}
	public void printMouse() {
		super.printSetup();
	}
}
