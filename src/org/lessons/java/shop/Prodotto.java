package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
	private int codice;
	private String nome;
	private String descrizione;
	private double prezzo;
	private int iva;
	
	Prodotto(String nome, String descrizione, double prezzo, int iva) {
		this.nome = nome;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		this.iva = iva;
		
		Random random = new Random();
		codice = random.nextInt(100);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public int getIva() {
		return iva;
	}

	public void setIva(int iva) {
		this.iva = iva;
	}

	public int getCodice() {
		return codice;
	}
	
	public double getPrezzoFinito() {
		return prezzo + (prezzo * iva / 100);
	}
	
	public String getNomeEsteso() {
		return "" + codice + "-" + nome.toLowerCase();
	}
	
	public static String getCodiceEsteso(Prodotto prodotto) {
		return String.format("%08d", prodotto.codice);
	}
	
}
