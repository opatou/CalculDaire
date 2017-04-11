package com.capgemini.formation.formes.calculs;

import static org.junit.Assert.*;

import org.junit.Test;

import com.capgemini.formation.formes.CalculateurDeSurface;
import com.capgemini.formation.formes.Carre;
import com.capgemini.formation.formes.Cercle;
import com.capgemini.formation.formes.Rectangle;

public  class CalculateurDeSurfaceTest {
	private double precision = 0.00001;
	private CalculateurDeSurface calculateurSurface = new CalculateurDeSurface();
	
	
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
	
	
}
