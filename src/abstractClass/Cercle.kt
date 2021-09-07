package abstractClass

/**
 *
 */
class Cercle():Form() {

    /**
     * redefinition de la propriete abstraite. On peut le faire dans le constructeur
     */
    override var color:String="Rouge"

    override fun dessiner() {
        println("Dessiner un cercle")
    }

    override fun colorer() {
        println("Colorer un cercle en $color")
    }
}