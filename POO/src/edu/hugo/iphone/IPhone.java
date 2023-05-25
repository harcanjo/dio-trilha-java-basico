package edu.hugo.iphone;

import edu.hugo.iphone.aplicativo.AparelhoTelefonico;
import edu.hugo.iphone.aplicativo.NavegadorDeInternet;
import edu.hugo.iphone.aplicativo.ReprodutorMusical;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorDeInternet {
	
	private String modelo;
	private String cor;
	private String operadoraTelefonica;
	private boolean estaCarregado;
	private boolean estaTocandoMusica;
	private boolean estaTelefonando;
	private boolean estaNavegandoInternet;
	private boolean temMúsicaGaleria;
	private String[] musicasNaGaleria;
	private boolean ehPrePago;
	private boolean temCredido;
	private double creditoPrePago;
	private boolean temPacoteDados;
		
	public IPhone(String modelo, String cor, String operadoraTelefonica, boolean ehPrePago) {
		super();
		this.modelo = modelo;
		this.cor = cor;
		this.operadoraTelefonica = operadoraTelefonica;
		this.ehPrePago = ehPrePago;
	}

	public void tocarMusica() {
		System.out.println("Tocando Música!");
	}
	
	public void telefonar() {
		System.out.println("Telefonando!");
	}
	
	public void navegar() {
		System.out.println("Navegando!");
	}
	
	public void pausaMusica() {
		System.out.println("Música parada!");		
	}

	public void paraMusica() {
		System.out.println("Música encerrada!");
	}

	public void aumentarVolume(int volume) {
		System.out.println("Volume aumentado!");
	}

	public void verificaConexao() {
		System.out.println("Conectado a internet");		
	}

	public void atenderChamada() {
		System.out.println("Atendendo chamada");		
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getOperadoraTelefonica() {
		return operadoraTelefonica;
	}

	public void setOperadoraTelefonica(String operadoraTelefonica) {
		this.operadoraTelefonica = operadoraTelefonica;
	}

	public boolean isEstaCarregado() {
		return estaCarregado;
	}

	public void setEstaCarregado(boolean estaCarregado) {
		this.estaCarregado = estaCarregado;
	}

	public boolean isEstaTocandoMusica() {
		return estaTocandoMusica;
	}

	public void setEstaTocandoMusica(boolean estaTocandoMusica) {
		this.estaTocandoMusica = estaTocandoMusica;
	}

	public boolean isEstaTelefonando() {
		return estaTelefonando;
	}

	public void setEstaTelefonando(boolean estaTelefonando) {
		this.estaTelefonando = estaTelefonando;
	}

	public boolean isEstaNavegandoInternet() {
		return estaNavegandoInternet;
	}

	public void setEstaNavegandoInternet(boolean estaNavegandoInternet) {
		this.estaNavegandoInternet = estaNavegandoInternet;
	}

	public boolean isTemMúsicaGaleria() {
		return temMúsicaGaleria;
	}

	public void setTemMúsicaGaleria(boolean temMúsicaGaleria) {
		this.temMúsicaGaleria = temMúsicaGaleria;
	}

	public String[] getMusicasNaGaleria() {
		return musicasNaGaleria;
	}

	public void setMusicasNaGaleria(String[] musicasNaGaleria) {
		this.musicasNaGaleria = musicasNaGaleria;
	}

	public boolean isEhPrePago() {
		return ehPrePago;
	}

	public void setEhPrePago(boolean ehPrePago) {
		this.ehPrePago = ehPrePago;
	}

	public boolean isTemCredido() {
		return temCredido;
	}

	public void setTemCredido(boolean temCredido) {
		this.temCredido = temCredido;
	}

	public double getCreditoPrePago() {
		return creditoPrePago;
	}

	public void setCreditoPrePago(double creditoPrePago) {
		this.creditoPrePago = creditoPrePago;
	}

	public boolean isTemPacoteDados() {
		return temPacoteDados;
	}

	public void setTemPacoteDados(boolean temPacoteDados) {
		this.temPacoteDados = temPacoteDados;
	}
	
}
