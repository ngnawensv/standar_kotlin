package abstractClass

/**
 *  La classe Cercle1 implemente l'interface Form1: On fait juste :Nom_interface
 */
class Cercle1():Form1 {

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