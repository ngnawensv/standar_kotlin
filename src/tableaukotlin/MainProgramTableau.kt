package tableaukotlin

/**
 * LES TABLEAUX EN KOTLIN
 *
 * 1- Presqu'identique aux tableaux en java
 *
 * 2-Possibilite de declarer un tableau mixte c-à-d avec elements de types differents
 *
 */

fun main(){
    /**
     * Syntaxe generale de declaration et d'initialisation d'un tableau
     *
     * var nomTableau:Array<TypeElementTableau>=Array(tailleTableau){ValeurInitToutLeTableau}
     * ou
     * var nomTableau=Array(tailleTableau){ValeurInitToutLeTableau}
     */

    var nomTableau=Array(5){0}

    /**
     * Declaration d'un tableau avec remplissage directement
     */
    var tab= arrayOf(10,20,30,40,50,60,70,80,90,100)


    /**
     * Declaration d'un tableau mixte avec remplissage directement
     */
    var tab1= arrayOf(10,"toto",30,40.4,50,60,70,80,90,100)


    //Remplissage du tableau
    for (i in 0..4){
        nomTableau[i]=4-i
    }

    //Affichage du tableau
    println("==>Affichage 1")
    for(i in 0..4){
        println(nomTableau[i])
    }

    //Affichage du tableau
    println("==>Affichage 2")
    for(elt in nomTableau){
        println(elt)
    }

    //Affichage du tableau
    println("==>Affichage 3")
    for(i in 0..nomTableau.size-1){
        println(nomTableau[i])
    }

    //Affichage du tableau
    println("==>Affichage 4")
    for(i in 0..nomTableau.lastIndex){
        println(nomTableau[i])
    }

    //Affichage du tableau
    println("==>Affichage customised: index et valeur")
    for(i in 0..nomTableau.lastIndex){
        println(" $i = ${nomTableau[i]}")
    }

    //Affichage du tableau
    println("==>Affichage customised: index et valeur")
    for((i,elt) in tab1.withIndex()){
        println(" $i = $elt")
    }


}