package com.capgemini.formation.formes;

public class CalculateurDeSurface {

	public double calculeAire(Object forme) {
		double surface =0;
		if (forme instanceof Carre){
			surface = ((Carre)forme).getLargeur()*((Carre)forme).getLargeur();
		}else if(forme instanceof Rectangle){
			surface = ((Rectangle)forme).getLargeur() * ((Rectangle)forme).getLongueur();
		}
		else if (forme instanceof Cercle){
			surface = ((Cercle)forme).getRayon()*((Cercle)forme).getRayon()*Math.PI;
		}
		return surface;
	}

	
	
	
}
