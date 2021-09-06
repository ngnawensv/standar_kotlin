fun main(){
    println("In this part, we will learn how to create function's with kotlin")
    /*println("Entrer num1 ")
    var num1= readLine()!!.toInt()
    println("Entrer num2 ")
    var num2= readLine()!!.toInt()*/
    var num1=10
    var num2=20
    /**
     * Appel de la procedure calculSomme()
     */
    println("==>Appl de la procedure")
    calculSomme(num1,num2)

    /**
     * Appel de la fonction  calculSomme()
     */
    println("==>Appl de la fonction")
    println("$num1+$num2 = ${calculSomme1(num1,num2)}")
    var somme1=calculSomme1(num1,num2)
    println("$num1+$num2 = $somme1")

    /**
     * Appel de la fonction calculSomme2()
     */
    println("==>Appl de la fonction calculSomme2()")
    println("$num1+$num2 = ${calculSomme2(num1,num2)}")


    /**
     * Appel de la fonction calculSomme2() avec les paramètres nommés
     * L'ordre des paramètres n'est pas respecté lors de l"appel
     */
    var nom="Ngna"
    var prenom="Sam"
    var age=30
    println("==>Appel classique de la fonction affichage ")
    affichage(nom,prenom,age)

    println("==>Appel nommé de la fonction affichage ie sans respect de l'ordre des parametres ")
    affichage(prenom=prenom,age = age,nom=nom)

}

/**
 * Definition de la fonction calculSomme()
 * Puisqu'elle ne retourne rien, ce genre de fonction est appelé procedure en algorithme
 *
 * Methode 1:Procedure
 * En lieu et place du type de retour,on peut metrre Unit equivalent du void en java.
 */
fun calculSomme(num1: Int, num2: Int) {
    val somme=num1+num2
    println("$num1+$num2 = $somme")
}

/**
 * Methode 2: fonction
 *
 */
fun calculSomme1(num1: Int, num2: Int):Int {
    val somme=num1+num2
    return somme
}

/**
 * Particularite de kotlin dans l'ecriture des fonctions
 * Cette fonction prends en parametres deux deux nombres et retourne la somme
 *
 */
fun calculSomme2(num1: Int, num2: Int)=num1+num2


fun affichage(nom:String, prenom:String, age: Int) {
    println("My lastname is ${nom.toUpperCase()} and my firstName is ${prenom.toUpperCase()} et j'ai $age ans")
}