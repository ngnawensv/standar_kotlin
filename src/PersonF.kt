/**
 *UNE BONNE PRATIQUE AVEC PLUSIEURS CONSTRUCTEURS
 *
 * Le var n'est pas obligatoire pour toutes les variables
 */
class PersonF(var nom: String, var prenom: String, var age: Int) {

    var taille:Double?=null

    constructor(nom: String, prenom: String,age: Int,taille:Double):this(nom,prenom,age){
        this.taille=taille;
    }

    /**
     * Les methodes ou fonctions
     */
    fun afficherInfo(){
        println("Nom : $nom")
        println("Prenom : $prenom")
        println("Age : $age")
        if (taille!=null)
        println("Taille : $taille")
    }

}