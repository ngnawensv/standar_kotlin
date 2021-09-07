package abstractClass

/**
 * LES CLASSE ABSTRAITES AVEC KOTLIN.
 * Une classe anstrait est une classe qu'on ne peut pas instancier.
 * 1-Elle est definie avec le mot cle "absctract" et est par defaute ouverte à l'heritage.
 * 2-On a plus besoin du mot clé "open" sur une telle classe.
 * 3-Certaines fonctions de cette classe n'ont pas de corps et sont de finient avec le mot cle "abstract". De telles doivent etre  obligatoirement
 * implementé dans la classe fille
 * 4-Elle contient des fonction non abstraites c-à-d qui ont un corps
 * 5-On peut aussi redefinir les attributs d'une classe abstraite avec le mot clé "abstract"
 *
 * Le var n'est pas obligatoire pour toutes les variables
 *
 * Le mot clé open: permet de dire qu'un peut etre herité
 */
abstract class PersonH(var nom: String, var prenom: String, var age: Int) {

    var taille:Double?=null

    constructor(nom: String, prenom: String,age: Int,taille:Double):this(nom,prenom,age){
        this.taille=taille;
    }

    /**
     * fonction abstraites c-à-d fonction crée pour etre redefinie
     */
   abstract fun afficherInfo()

}