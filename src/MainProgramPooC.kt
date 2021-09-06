fun main() {

    /**
     * Creation d'un objet de type Person ou Instantiation de la classe Person
     */
    println("===>Person 1")
    var p1:PersonC=PersonC("Ngnawen","Samuel",30,180.0)
    println("Nom : ${p1.nom}")
    println("Prenom : ${p1.prenom}")
    println("Age : ${p1.age}")
    println("Taille : ${p1.taille}")

    println("===>Person 2")
    var p2:PersonC=PersonC("Mare","Dan",2,110.0)
    println("Nom : ${p2.nom}")
    println("Prenom : ${p2.prenom}")
    println("Age : ${p2.age}")
    println("Taille : ${p2.taille}")

    var p3:PersonC=PersonC()
    p3.nom="cornelia"
    println("Nom : ${p3.nom!!.capitalize()}") //!! pour dire que je sais que le nom peut etre nul, mais quand le premier caractere en Majuscule
}