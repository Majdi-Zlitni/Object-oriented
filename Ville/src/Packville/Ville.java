package Packville;
//Class
public class Ville {
	private String nomVille;
	private String nomPays;
	private int nbreHabitants;
	
	//Constructeur paramétré
	public Ville(String nomVille, String nomPays, int nbreHabitants){
		this.nomVille=nomVille;
		this.nomPays=nomPays;
		this.nbreHabitants=nbreHabitants;
	}
	
	
	//Getters and Setters

	public String getNomVille() {
		return nomVille;
	}

	public void setNomVille(String nomVille) {
		this.nomVille = nomVille;
	}

	public String getNomPays() {
		return nomPays;
	}

	public void setNomPays(String nomPays) {
		this.nomPays = nomPays;
	}

	public int getNbreHabitants() {
		return nbreHabitants;
	}

	public void setNbreHabitants(int nbreHabitants) {
		this.nbreHabitants = nbreHabitants;
	}
	
	//Autre methode de cette class
	
	public String desc() {
		return"\t "+this.nomVille+" est une ville de "+this.nomPays+", elle comporte "+this.nbreHabitants;
		
	}

}
