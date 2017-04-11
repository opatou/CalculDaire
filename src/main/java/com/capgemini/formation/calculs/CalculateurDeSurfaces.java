package com.capgemini.formation.calculs;

import com.capgemini.formation.formes.Carre;
import com.capgemini.formation.formes.Cercle;
import com.capgemini.formation.formes.Rectangle;


public class CalculateurDeSurfaces {

	//tableau plus que forme seule
	public double calculeAire(Object ... objets) {
		double surface =0;
		
		
		for (Object objet : objets){
			if (objet instanceof Carre){
				surface += ((Carre)objet).getLargeur()*((Carre)objet).getLargeur();
			}else if(objet instanceof Rectangle){
				surface += ((Rectangle)objet).getLargeur() * ((Rectangle)objet).getLongueur();
			}
			else if (objet instanceof Cercle){
				surface += ((Cercle)objet).getRayon()*((Cercle)objet).getRayon()*Math.PI;
			}
		}
		return surface;
	}

	
	
	
}
