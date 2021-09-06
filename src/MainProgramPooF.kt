fun main() {

    /**
     * Creation d'un objet de type Person ou Instantiation de la classe Person
     */
    println("===>Person 1: Utilisation constructeur sans taille")
    var p1 = PersonF("Ngnawen", "Samuel", 30)
    p1.afficherInfo()

    println("===>Person 2 Utilisation constructeur avec taille" )
    var p2 = PersonF("Mare", "Dan", 2, 110.0)
    p2.afficherInfo()
}