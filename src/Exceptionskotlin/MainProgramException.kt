package Exceptionskotlin

import java.lang.Exception

/**
 * 1-On peut avoir plusieurs blocs catch
 */
fun main(){

    val a=10
    val b=0
     try {
         //Code pouvant déclancher une exception
         val c=a/b
         println(" resultat = $c")
     } catch (e:Exception) {
         //Code à executer en cas d'exception
         println(" Une exception a été levée")
     }
}