package epicode.u5s3g4.esercizio3;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ChainOfResponsibilityRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		Ufficiale capitano = new Capitano();
		Ufficiale maggiore = new Maggiore();
		Ufficiale tenente = new Tenente();
		Ufficiale colonnello = new Colonnello();
		Ufficiale generale = new Generale();

		capitano.setSuperiore(maggiore);
		maggiore.setSuperiore(tenente);
		tenente.setSuperiore(colonnello);
		colonnello.setSuperiore(generale);

		int importoRichiesto = 5000;

		System.out.println();
		System.out.println("------------------------- Chain of Responsability Runner -------------------------");
		generale.processaRichiestaStipendio(importoRichiesto);
	}

}
