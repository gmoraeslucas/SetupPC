package Computador;

public class Computador{
	private int idNumero;
	private int idNumero1, idNumero2, idNumero3, idNumero4;
	private String fabricante1, fabricante2, fabricante3, fabricante4;
	private String cor1, cor2, cor3, cor4;
	public void setId(int idNumero) {
		this.idNumero = idNumero;
	}
	public int getId() {
		return this.idNumero;
	}
	public Computador() {
		
	}
	public Computador(int idNumero, Teclado t, Mouse m, Monitor mon, Gabinete g) {
		this.idNumero = idNumero;
		this.idNumero1 = t.idNumero;
		this.idNumero2 = m.idNumero;
		this.idNumero3 = mon.idNumero;
		this.idNumero4 = g.idNumero;
		this.fabricante1 = t.fabricante;
		this.fabricante2 = m.fabricante;
		this.fabricante3 = mon.fabricante;
		this.fabricante4 = g.fabricante;
		this.cor1 = t.cor;
		this.cor2 = m.cor;
		this.cor3 = mon.cor;
		this.cor4 = g.cor;
	}
	public void printPc() {
		System.out.println("Id Pc: " + idNumero + "\nId Teclado: " + idNumero1 + "\nId Mouse: " + idNumero2 + "\nId Monitor: " + idNumero3 + "\nId Gabinete: " + idNumero4);
		System.out.println("Fabricante teclado: " + fabricante1 + "\nFabricante mouse: " + fabricante2 + "\nFabricante monitor: " + fabricante3 + "\nFabricante gabinete: " + fabricante4);
		System.out.println("Cor teclado: " + cor1 + "\nCor mouse: " + cor2 + "\nCor monitor: " + cor3 + "\nCor gabinete: " + cor4);
	}
}
