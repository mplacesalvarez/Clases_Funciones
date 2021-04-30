class Adestrador(id: Int, nombre: String, apelido: String, idade: Int, idFederacion: String) :
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
        System.out.println("Los adiestradores viajan a $destino")
        return ""
    }

    fun dirixirPartido(): Unit {
        println("Dirije el partido el adiestrador $id $nombre $apelido")
    }

    fun dirixirAdestramento(): Unit {
        println("Dirije el adiestramento el adiestrador $id $nombre $apelido")
    }



}