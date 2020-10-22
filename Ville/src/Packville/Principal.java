package Packville;

public class Principal {

	public static void main(String[] args) {
		Ville v= new Ville("Djerba","Tunis",163726);
		System.out.println(v.getNomVille());
		System.out.println(v.getNomPays());
		System.out.println(v.getNbreHabitants());
		System.out.println(v.desc());

	}
}