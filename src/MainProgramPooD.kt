fun main() {

    /**
     * Creation d'un objet de type Person ou Instantiation de la classe Person
     */
    println("===>Person 1")
    var p1=PersonD("Ngnawen","Samuel",30,180.0)
    p1.afficherInfo()

    println("===>Person 2")
    var p2=PersonD("Mare","Dan",2,110.0)
    p2.afficherInfo()

    var p3=PersonD()
    p3.nom="cornelia"
    //println("Nom : ${p3.nom!!.capitalize()}") //!! pour dire que je sais que le nom peut etre nul, mais quand le premier caractere en Majuscule
    p3.afficherInfo()
}