/**
 * Utilisation d'un constructeur propriétaire
 */
class PersonA(nom:String, prenom:String, age:Int, taille:Double) {
    /**
     * Class Person properties.
     * ces propriétés ne sont plus initialisés par defaut car la tache est deleguée au bloc d'initialisation
     */
    var nom:String
    var prenom:String
    var age:Int
    var taille:Double

    //Bloc d'initialisation
    init {
        this.nom=nom
        this.prenom=prenom
        this.age=age
        this.taille=taille
    }
}