S  ==> CalculateurDeSurface.calculeAire() 
		Est-ce que la methode, la classe est SRP?
   ==> on d�place le code de calcul des aires dans carre rectangle et cercle
O  ==> Ajouter calcul surface d'un triangle
   ==> je dois ajouter un IF et donc modifier le code de calcul d'aire ==> BAD
       plut�t �tre ouvert � l'extension en permettant l'ajout d'une fonctionnalit� sans modifier ce code
   ==> apparition de la classe m�re Forme
L  ==> Je ne peux pas calculer des formes quelconques. FormeQuelconque ne serait donc pas une forme.
       throw illegalCalculDAireException
I  ==> pour r�soudre ==> forme devient une interface (ou classe abstraite) mais change de nom : aireCalculable
D  ==> impossible dans l'exemple