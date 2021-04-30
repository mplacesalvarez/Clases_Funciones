class Xogador(id: Int, nombre: String, apelido: String, idade: Int, demarcacion: String, dorsal: Int) :
    Seleccion(id, nombre, apelido, idade) {


    override fun concentrarse(): String {
        System.out.println("Introduce el tiempo de concentración en minutos: ")
        val tempo=readLine()
        println("Concentrarse a seleccion durante $tempo" + " minutos")
        return ""
    }


    override fun viaxar(): String {
        System.out.println("Introduce el destino: ")
        val destino= readLine()
        System.out.println("Los jugadores viajan a $destino")
        return ""
    }

    fun xogarPartido(): Unit {
        println("Tiene que jugar el jugador $id $nombre $apelido")
    }

    fun entrenar(): Unit {
        println("Tiene que entrenar el jugador $id $nombre $apelido ")
    }

}
