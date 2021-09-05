fun main(){

    /**
     *  1-Instruction d'affichage. En kotlin l'utilisation des points virgules a la fin de chaque instruction est facultatif
     */
    println("Hello world") // Instruction d'affichage avec retour a la ligne

    /**
     * 2- Declaration des variables
     * NB: Les types de variavles sont des classes contenant des fonctions:Byte,Short,Int, Long, Float, Double, etc.
     * Syntaxe generale : var nom_variable:type=valeur;
     */
    var nom: String="Ngnawen"
    var age:Int =30//en kotlin Int est une classe et donc qui contient des fonctions. Il est different de int en java
    var moyenne:Double=10.0// en kotlin Double est une classe et donc qui contient des fonctions. Double
    var isAdmin:Boolean=true
    var uneLettre: Char='A'

    /**
     * 2-Declaration des constantes
     *Le contenu d'une val ne peut etre modifié une fois initizlisé. Il est comme le final en java
     */
    val taille:Double=157.0


    /**
     * Les opérateurs arithmetiques avec kotlin
     */
    val numero1=12
    val numero2=10
    var add=numero1+numero2
}