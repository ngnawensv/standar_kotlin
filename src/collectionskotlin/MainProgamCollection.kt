package collectionskotlin

/**
 * LES COLLECTIONS EN KOTLIN. IL EXISTE DEUX TYPES DE COLLECTION/
 * 1-Immutable Collection=>Collection dont on ne peut pas modifier le contenu
 * 2-Mutable Collection=> Collection dont peut modifier le contenu
 * 3-Taille d'une collection variable
 * 4-Les listes fournit les méthodes telles que: add(elt), add(index,elt), size(), get(), removeAt(index), clear(), subList(intial, final)
 *
 */
fun main(){

    /**
     * Immutable Collection sont List, Map et Set mais initialisé respecttivement par listOf(), mapOf(),setOf()
     * List => listOf() ou listOf<T>(),
     * Map => mapOf(),
     * Set => setOf()
     *
     * Impossible de modifier le contenu de listNoms. Par exemple , on ne peut pas faire listNoms[1]="Titi"
     */
    var listNoms= listOf("Ngnawen", "Samuel", "Vermon")



    //Affichage. identitique aux affichages faites sur les tableaux
    for (elt in listNoms){
        println("$elt")
    }

    /**
     * Immutable liste mixte: utilise le type Any
     */
    var listNoms1= listOf<Any>("Ngnawen", "Samuel", "Vermon",12,12.0)


    /**
     * Mutable list:
     * Possible de modifier le contenu de mutableListNoms. Par exemple , on peut faire mutableListNoms[1]="Titi"
     */
    var mutableListNoms= mutableListOf("Ngnawen", "Samuel", "Vermon")
    mutableListNoms[1]="Titi"
}