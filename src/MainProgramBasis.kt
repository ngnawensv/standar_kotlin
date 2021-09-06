fun main(){

    /**
     *  1-Instruction d'affichage. En kotlin l'utilisation des points virgules a la fin de chaque instruction est facultatif
     */
    println("********** 1-Instruction d'affichage *************")
    println("Hello world") // Instruction d'affichage avec retour a la ligne

    /**
     * 2- Declaration des variables
     * NB: Les types de variavles sont des classes contenant des fonctions:Byte,Short,Int, Long, Float, Double, etc.
     * Syntaxe generale : var nom_variable:type=valeur;
     */
    println("********** 2-Declaration des variables ***********")
    var nom: String="Ngnawen"
    var age:Int =30//en kotlin Int est une classe et donc qui contient des fonctions. Il est different de int en java
    var moyenne:Double=15.0// en kotlin Double est une classe et donc qui contient des fonctions. Double
    var isAdmin:Boolean=true
    var uneLettre: Char='A'
    println("$nom est agé de $age et a eu la moyenne de $moyenne donc déclaré $isAdmin et son GP est $uneLettre")

    /**
     * 3-Declaration des constantes
     *Le contenu d'une val ne peut etre modifié une fois initizlisé. Il est comme le final en java
     */
    println("********** 3-Declaration des constantes***********")
    val taille:Double=157.0
    println("Il as une taille de $taille")

    /**
     * 3-Les opérateurs arithmetiques avec kotlin
     */
    println("********** 3-Les opérateurs arithmetiques avec kotlin ***********")
    val numero1=12
    val numero2=10
    var numero3=11

    //Addition
    var add=numero1+numero2
    println("numero1+numero2 = "+add) //println("numero1+numero2 = $add")
    println("$numero1+$numero2 = $add")
    println("$numero1+$numero2 = ${numero1+numero2}")

    //Soustraction
    var sous=numero1-numero2
    println("numero1-numero2 = "+sous) //println("numero1-numero2 = $sous")
    println("$numero1-$numero2 = $sous")

    //Multiplication
    var mul=numero1*numero2
    println("numero1*numero2 = "+mul) //println("numero1*numero2 = $mul")
    println("$numero1*$numero2 = $mul")

    //Division
    var div=numero1/numero2
    println("numero1/numero2 = "+div) //println("numero1/numero2 = $div")
    println("$numero1/$numero2 = $div")

    //Modulo
    var modulo=numero1%numero2
    println("numero1%numero2 = "+modulo) //println("numero1%numero2 = $modulo")
    println("$numero1%$numero2 = $modulo")

    //Affectation :=, +=,-=,*=,/=,%=
    numero3 +=(numero1+numero2)
    println("result= $numero3")

    /**
     * 4-Les structures conditionnelles en kotlin: if,if...else, switch,
     * Le if s'utilise de la façon en kotlin qu'en java
     */
    println("********** 4-Les structures conditionnelles en kotlin: if,if...else, switch ***********")
    var a=12
    var b=10
    val max:Int

    //if
    if (a>10){
        println("Bravo admis")
    }

    //if..else
    if (a>10){
        println("Bravo admis")
    }else{
        println("Désolé refusé")
    }

    //Forme simplifiée du if..else en kotlin
    max=if(a>b) a else b
    println("max = "+max)

    //Switch soit when en kotlin
    val jour=2
    when(jour){
        1-> println("Dimanche")
        2-> println("Lundi")
        3-> println("Mardi")
        4-> println("Mercredi")
        5-> println("Jeudi")
        6-> println("Vendredi")
        7-> println("Samedi")
        else -> println("Aucun jour de la semaine")
    }

    //Forme simplifiée du when
    var nomDuJour=when(jour){
        1-> "Dimanche"
        2-> "Lundi"
        3-> "Mardi"
        4-> "Mercredi"
        5-> "Jeudi"
        6-> "Vendredi"
        7-> "Samedi"
        else -> ""
    }
    println("$nomDuJour")


    /**
     * 5-Lecture d'une chaine de caracteres dans la console
     */
    println("********** 5-Lecture d'une chaine de caracteres dans la console***********")
   // println("Entrer votre nom: ")
    //var nom1= readLine();
    //println("Votre nom est $nom1")

    /**
     * 6-Lecture d'une entiers dans la console
     */
    println("********** 6-Lecture d'une entiers dans la console ***********")
    println("Entrer votre age: ")
    //Cette instruction transforme le type String en Int. Elle est valabre pour passer de String a Double, Float, etc
    // les double-bang(!!) operator force ce que je dois lire à ne pas etre null.
    //This is unsafe nullable type (T?) conversion to a non-nullable type (T), !! will throw NullPointerException if the value is null.
    //So, use the double bang operator if you don’t want a specific variable null.
    //var age1= readLine()!!.toInt()
    //println("Votre nom est $age1")
}