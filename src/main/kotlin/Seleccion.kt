open abstract class Seleccion {

    var id: Int
    var nombre: String
    var apelido: String
    var idade: Int


    constructor(id: Int, nombre: String, apelido: String, idade: Int) {
        this.id = id
        this.nombre = nombre
        this.apelido = apelido
        this.idade = idade
    }

    abstract fun concentrarse(): String

    open fun viaxar(): String = "Viaja la Seleccion"

    override fun toString(): String {
        return "Seleccion(id=$id, nombre='$nombre', apelido='$apelido', idade=$idade)"
    }

}

