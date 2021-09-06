/**
 * UNE BONNE PRATIQUE
 *
 * Utiliser seulment le constructeur propriétaire. Il suffit tout simplement d'uliser le mot clé var.
 * Avec on fait directement la declaration et l'initialisation des variables (plus besoin de la partie proprietés
 * Le var n'est pas obligatoire pour toutes les variables
 */
class PersonE(var nom: String, var prenom: String, var age: Int, var taille: Double) {

    /**
     * Les methodes ou fonctions
     */
    fun afficherInfo(){
        println("Nom : $nom")
        println("Prenom : $prenom")
        println("Age : $age")
        println("Taille : $taille")
    }

}