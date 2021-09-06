fun main(){
    println("In this we present the structure of control in kotlin")
    /**
     * Nous parlerons des boucles while, do...while et for
     */

    /**
     * 1- La boucle while
     * Syntaxe: while(condition vraie){// code à executé ici}
     */
    var compteur=1
    while (compteur<=5){
        println("Itération num : $compteur")
        compteur++ //2,3,4,5,6
    }

    println("----------------------------------------------------")
    /**
     * 2- La boucle do...while
     * Syntaxe: do{ //traitement à executer} while( condition)
     */
    var compteur1=1
    do{
        println("Itération num : $compteur1")
        compteur1++
    }while (compteur1<=5)

    println("----------------------------------------------------")
    /**
     * 3- La boucle for: Elle s'ecrit de plusieurs façon en katlin
     */
    /**
     * Syntaxe 1 pour incrementation : for(i in indexInitial..indexFinal){}.
     * Syntaxe 2  pour decrementation : for(i in indexFinal downTo indexInitial){}
     * Syntaxe 3 pour incrementation avec pas different de 1 : for(i in indexInitial..indexFinal step pas){}.
     * Les accolades ne sont pas obligatoire en cas de plusieurs instructions
     *
     */
    println("=>Incrementation de 1 à 10")
    //Incrementation de 1 à 10
    for (i in 1..10 ){
        println("compteur = $i")
    }

    println("=>Decrementation de 10 à 1")
    //Decrementation de 10 à 1
    for (i1 in 10 downTo 1 ){
        println("compteur = $i1")
    }

    println("=>Incrementation de 1 à 10 avec un pas de 2")
    //Incrementation de 1 à 10 avec un pas de 2
    for (i2 in 1..10 step 2){
        println("compteur = $i2")
    }

    println("=>Decrementation de 10 à 1 avec un pas de 2")
    //Decrementation de 10 à 1
    for (i1 in 10 downTo 1  step 2){
        println("compteur = $i1")
    }

    println("----------------------------------------------------")
    /**
     * Boucle for sur les tableaux
     * Syntaxe 1 : for(i in 0..pl.lastIndex){}.
     *
     */

    println("=>Methode 1 ")
    var pl= arrayOf("Java", "Kotlin","Python","C++")
    for(i in 0..pl.lastIndex){
        println("Language : ${pl[i]}")
    }

    println("=>Methode 2 ")
    for(language in pl){
        println("Language : $language")
    }

    println("=>Methode 3: Affichade des indices ")
    for(index in pl.indices){
        println("Language : $index")
    }
    println("=>Methode 3: Affichade les langages en passant par les indices ")
    for(index in pl.indices){
        println("Language : ${pl[index]}")
    }
    println("=>Methode 4: Affichade les langages et les indices en meme temps ")
    println("=>Methode 4.1 ")
    for(index in pl.indices){
        println("Language a index $index : ${pl[index]}")
    }

    println("=>Methode 4.2")
    for((index,language) in pl.withIndex()){
        println("Language a index $index : $language")
    }
}
