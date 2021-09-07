package abstractClass

import abstractClass.PersonH

/**
 * abstractClass.PersonHFils1 est un classe fille  de la classe abstractClass.PersonH.
 *
 */
class PersonHFils1 (nom: String, prenom: String, age: Int, var moyenne:Double): PersonH(nom,prenom,age){

    override fun afficherInfo(){
        println("Moyenne : $moyenne  ")

    }

}