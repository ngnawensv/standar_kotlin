/**
 * PersonGFils1 est un classe fille  de la classe PersonG. Elle herite donc de la classe PersonG
 *
 * Il faut utiliser le mot clé open sur la classe parent pour le rendre heritable
 *
 */
class PersonGFils1 (nom: String, prenom: String, age: Int, var moyenne:Double):PersonG(nom,prenom,age){

    /**
     * Les methodes ou fonctions
     *
     * Afin d'ajouter l'affichage de la moyenne, on peut definir une nouvelle fonction et faire appel à la fonction du parent
     */
     fun afficherInfoPersonGFils1(){
        println("Je suis la fonction crée")
        super.afficherInfo()
        println("Moyenne : $moyenne  ")

    }

    /**
     * A lieu d'ecrire une nouvelle fonction, on peut juste redefire la fonction du parent avec le mot clé overide.
     * Mais avant cela, il faut preciser que la fonction du coté peut etre redefinie avec le mot clé open
     *
     */
    override fun afficherInfo(){
        println("Je suis la fonction redefinie")
        super.afficherInfo()
        println("Moyenne : $moyenne  ")

    }

}