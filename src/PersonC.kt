/**
 * Utilisation de plusieurs constructeurs: 1 constructeur par defaut et autant de constructeurs proprietaire qu'on desire
 */
class PersonC() {

    /**
     * On force l'initialisation des proprietes à null.
     * En fait kotlin est un langage null safety c-à-d verifie si une variable est nulle pendant l'ecriture du code
     */
    var nom: String? = null //? pour dire que je sais qe ca peut etre null, donc je prends ma responsabilité
    var prenom: String? = null
    var age: Int? = null
    var taille: Double? = null

    //Constructeur proprietaire qui herite du constructeur principale/par defaut avec this()
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

}