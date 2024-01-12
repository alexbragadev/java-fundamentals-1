package country.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Country {

	private String name;
	private String territory;
	private Double population;
	private LocalDateTime dataLocal;
	private List<Idioma> idiomas = new ArrayList<>();
	
	public Country() {
	}

	public Country(String name, String territory, Double population, LocalDateTime dataLocal) {
		this.name = name;
		this.territory = territory;
		this.population = population;
		this.dataLocal = dataLocal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTerritory() {
		return territory;
	}

	public void setTerritory(String territory) {
		this.territory = territory;
	}

	public Double getPopulation() {
		return population;
	}

	public void setPopulation(Double population) {
		this.population = population;
	}

	public LocalDateTime getDataLocal() {
		return dataLocal;
	}

	public void setDataLocal(LocalDateTime dataLocal) {
		this.dataLocal = dataLocal;
	}

	public List<Idioma> getIdiomas() {
		return idiomas;
	}

	public void addIdioma(Idioma idioma) {
		idiomas.add(idioma);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("------------Informa��es da na��o------------- \n");
		sb.append("Nome: " + name + "\n");
		sb.append("Territ�rio: " + territory + "\n");
		sb.append("Popula��o: " + population + " milh�es \n");
		sb.append("Data atual local: " + dataLocal.getDayOfMonth()+ "/" + dataLocal.getMonthValue() + "/"+ dataLocal.getYear() +"\n");
		sb.append("Hora atual local: " + dataLocal.getHour() + ":" + dataLocal.getMinute() +"h"+ "\n");
		sb.append("Idiomas: \n");
		for (Idioma id: idiomas) {
			sb.append(id.getName() + " - ");
		}
		return sb.toString();
	}
}
