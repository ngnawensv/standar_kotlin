fun main() {

    /**
     * Declaration d'une variable de type personne et initialisation de Personne
     * ou
     * Creation d'un objet de type Person
     * ou
     * Instantiation de la classe Person
     */
    println("===>Person 1")
    var p1:Person=Person()
    p1.nom="Ngnawen"
    p1.prenom="Samuel"
    p1.age=30
    p1.taille=180.0

    println("Nom : ${p1.nom}")
    println("Prenom : ${p1.prenom}")
    println("Age : ${p1.age}")
    println("Taille : ${p1.taille}")

    println("===>Person 2")
    var p2:Person=Person()
    p2.nom="Mare"
    p2.prenom="Dan"
    p2.age=20
    p2.taille=110.0
    println("Nom : ${p2.nom}")
    println("Prenom : ${p2.prenom}")
    println("Age : ${p2.age}")
    println("Taille : ${p2.taille}")
}