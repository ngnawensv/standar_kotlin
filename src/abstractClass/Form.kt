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
 */
abstract class Form {

    /**
     * proprieté abstraite. On est pas obligé d'initialiser une propriété abstraite
     */
   abstract var color:String

    init {
        this.color="Noir"
    }

    abstract fun dessiner()
    abstract fun colorer()
}