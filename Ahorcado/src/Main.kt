import com.sun.tools.javac.Main

fun main(args: Array<String>){
    val palabra = "Ahorcado"
    var misterio= arrayOf('_','_','_','_','_','_','_','_')
    val letras : MutableList<Char> = mutableListOf()
    var intentos = 0
    var letraIn = ' '
    var pos = 0
    var win = false
    var encontrado = false

    do {
        for (i in misterio)
            print(i)

        println()
        println("Intento número: $intentos")
        print("Introduce letra: ")
        letraIn = readLine()!!.get(0)

        if(letras.indexOf(letraIn)!=-1) {
            println("Letra ya introducida, pruebe otra vez")
            println()
        }else {
            letras.add(letraIn)
            intentos++
            println()
            pos = 0
            for (letraSol in palabra) {
                if (letraIn.equals(letraSol.toLowerCase())) {
                    misterio.set(pos, letraSol)
                    encontrado = true
                }
                pos++
            }
            if (encontrado)
                println("Encontraste la letra $letraIn")
            else
                println("La letra $letraIn no está")
            encontrado = false

            if (misterio.indexOf('_') == -1)
                win = true
            println()
            println()
        }
    }while(win == false)

    println("¡Enhorabuena adivinaste la palabra: $palabra!")

}