package org.lessons.java.shop;

public class Main {

	public static void main(String[] args) {
		Prodotto prodotto = new Prodotto("Biberon", "Ottimo per bambini", 12.50, 20);
		
		System.out.println("Nome: " + prodotto.getNome() + "\n" +
				"Nome Esteso: " + prodotto.getNomeEsteso() + "\n" +
				"Descrizione: " + prodotto.getDescrizione() + "\n" +
				"Codice Prodotto: " + prodotto.getCodice() + "\n" +
				"Prezzo base: " + prodotto.getPrezzo() + " €" + "\n" +
				"Prezzo ivato: " + prodotto.getPrezzoFinito() + " €" + "\n" +
				"IVA: " + prodotto.getIva() +"%" + "\n" +
				"Codice PAD: " + Prodotto.getCodiceEsteso(prodotto));
		
		prodotto.setNome("Biberon livello 2");
		prodotto.setDescrizione("Ottimo per bambini ma meglio");
		prodotto.setPrezzo(22.0);
		prodotto.setIva(22);
		
		System.out.println("");
		System.out.println("");
		System.out.println("DOPO IL CAMBIO DELLE VARIABILI");
		System.out.println("");
		
		System.out.println("Nome: " + prodotto.getNome() + "\n" +
				"Nome Esteso: " + prodotto.getNomeEsteso() + "\n" +
				"Descrizione: " + prodotto.getDescrizione() + "\n" +
				"Codice Prodotto: " + prodotto.getCodice() + "\n" +
				"Prezzo base: " + prodotto.getPrezzo() + " €" + "\n" +
				"Prezzo ivato: " + prodotto.getPrezzoFinito() + " €" + "\n" +
				"IVA: " + prodotto.getIva() +"%" + "\n" +
				"Codice PAD: " + Prodotto.getCodiceEsteso(prodotto));

	}

}
