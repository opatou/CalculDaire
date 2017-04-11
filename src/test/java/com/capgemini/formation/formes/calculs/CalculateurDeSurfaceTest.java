package com.capgemini.formation.formes.calculs;

import static org.junit.Assert.*;

import org.junit.Test;

import com.capgemini.formation.calculs.CalculateurDeSurfaces;
import com.capgemini.formation.formes.Carre;
import com.capgemini.formation.formes.Cercle;
import com.capgemini.formation.formes.Rectangle;

public  class CalculateurDeSurfaceTest {
	private double precision = 0.00001;
	private CalculateurDeSurfaces calculateurSurface = new CalculateurDeSurfaces();
	
	
	@Test
	public void calculerLaSurfaceDUnCarre() {
		Carre carreDe2 = new Carre(2);
		
		double aire = calculateurSurface.calculeAire(carreDe2);
		
		assertEquals(2*2, aire,precision);

	}
	
	@Test
	public void calculerLaSurfaceDUnCercle() {
		Cercle cercleDe2=  new Cercle(2);
		
		double aire = calculateurSurface.calculeAire(cercleDe2);
		
		assertEquals(Math.PI*2*2, aire,precision);		
	}
	
	
	@Test
	public void calculerLaSurfaceDUnRectangle(){
		Rectangle rectangleDe2Par4 = new Rectangle(2,4);
		
		double aire = calculateurSurface.calculeAire(rectangleDe2Par4);
		
		assertEquals(2*4, aire, precision);
	}
	
	@Test
	public void calculerPlusieursSurface(){
		Object[] objets = new Object[3];
		Carre carreDe2 = new Carre(2);
		Cercle cercleDe2=  new Cercle(2);
		Rectangle rectangleDe2Par4 = new Rectangle(2,4);

		objets[0] = carreDe2;
		objets[1] = cercleDe2;
		objets[2] = rectangleDe2Par4;

		double aire = calculateurSurface.calculeAire(objets);
		assertEquals(2*2 + Math.PI*2*2 + 2*4, aire, precision);



	}
	
}
