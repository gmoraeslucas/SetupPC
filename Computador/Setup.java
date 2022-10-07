package Computador;
abstract class Setup {
	protected int idNumero;
	protected String fabricante, cor;
	public Setup() {
	}
	public Setup(int idNumero, String fabricante, String cor) {
		this.idNumero = idNumero;
		this.fabricante = fabricante;
		this.cor = cor;
	}
	public void printSetup() {
		System.out.println(idNumero);
		System.out.println(fabricante);
		System.out.println(cor);
		System.out.println();
	}
}
