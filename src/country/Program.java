package country;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

import country.entities.Country;
import country.entities.Idioma;

public class Program {

	public static void main(String[] args) {
		Instant dataHoraLocal = Instant.now();
		//America/Vancouver
		Idioma id1 = new Idioma("Inglês");
		Idioma id2 = new Idioma("Francês");
		
		Country c1 = new Country(
							"Canada", 
							"9.985.000 km²", 
							40.5,
							LocalDateTime.ofInstant(dataHoraLocal, ZoneId.of("America/Vancouver")));
		c1.addIdioma(id1);
		c1.addIdioma(id2);
		
		Idioma id3 = new Idioma("Alemão");
		Idioma id4 = new Idioma("Italiano");
		Idioma id5 = new Idioma("Romanche");
		// Europe/Zurich
		Country c2 = new Country(
							"Suiça", 
							"41.285 km²", 
							8.7,
							LocalDateTime.ofInstant(dataHoraLocal, ZoneId.of("Europe/Zurich")));
		c2.addIdioma(id3);
		c2.addIdioma(id2);
		c2.addIdioma(id4);
		c2.addIdioma(id5);
		// Europe/Dublin
		Idioma id6 = new Idioma("Irlandês");
		
		Country c3 = new Country(
							"Irlanda", 
							"70.273 km²", 
							5.0,
							LocalDateTime.ofInstant(dataHoraLocal, ZoneId.of("Europe/Dublin")));
		c3.addIdioma(id6);
		c3.addIdioma(id1);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
	}

}
