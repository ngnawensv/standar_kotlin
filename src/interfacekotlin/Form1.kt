package abstractClass

/**
 * LES INTERFACES AVEC KOTLIN.
 * 1-Une interface est deja abstraite donc pas besoin d'utiliser le mot clé abstract
 * 2-Elle n'a pas de bloc init
 * 3-Elle peut contenir des methodes non abstraites
 * 4-Toutes les propriétés d'une interface sont abstraites
 * 5-Les attributs des interfaces n'ont pas de valeur par defaut
 * 6-On peut implementer plusieurs interfaces mais on ne peut pas  heriter  plusieurs classes abstraites
 *
 */
interface Form1 {
    /**
     * proprietes abstraites
     */
    var color: String

    /**
     * fonctions abstraites
     */
    fun dessiner()
    fun colorer()

    /**
     * fonctions non abstraite
     */
    fun test(){
        println("I am a non-abstract function inside the interface Form1 ")
    }
}