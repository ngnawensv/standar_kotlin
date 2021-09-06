/**
 * Une classe kotlin à principalement 3 parties
 */
class PersonD() {

    /**
     * Les proprietés
     */
    var nom: String? = null //? pour dire que je sais qe ca peut etre null, donc je prends ma responsabilité
    var prenom: String? = null
    var age: Int? = null
    var taille: Double? = null

    /**
     * Les constructeurs
     */
    constructor(nom: String, prenom: String, age: Int, taille: Double) : this() {
        this.nom = nom
        this.prenom = prenom
        this.age = age
        this.taille = taille
    }

    constructor(nom: String, prenom: String) : this() {
        this.nom = nom
        this.prenom = prenom
    }

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