/**
 * Utilisation de plusieurs constructeurs: 1 constructeur par defaut et autant de constructeurs proprietaire qu'on desire
 */
class PersonB() {

    /**
     * Class Person properties.
     * ces propriétés seront initialisée en retard avec l'utilisation du mot cle lateinit (ne marche que pour les String)
     */
    lateinit var nom:String
    lateinit var prenom:String
    var age:Int=0
    var taille:Double=0.0

    //Constructeur proprietaire qui herite du constructeur principale/par defaut avec this()
    constructor(nom:String, prenom:String, age:Int, taille:Double):this(){
        this.nom=nom
        this.prenom=prenom
        this.age=age
        this.taille=taille
    }

}