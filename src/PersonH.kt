/**
 * LES CLASSE ABSTRAITES AVEC KOTLIN
 *
 * Le var n'est pas obligatoire pour toutes les variables
 *
 * Le mot clé open: permet de dire qu'un peut etre herité
 */
open class PersonH(var nom: String, var prenom: String, var age: Int) {

    var taille:Double?=null

    constructor(nom: String, prenom: String,age: Int,taille:Double):this(nom,prenom,age){
        this.taille=taille;
    }

    /**
     * Les methodes ou fonctions
     *
     * Le mot clé open specifie que la fonction peut etre redefinie
     */
   open fun afficherInfo(){
        println("Nom : $nom")
        println("Prenom : $prenom")
        println("Age : $age")
        if (taille!=null)
        println("Taille : $taille")
    }

}