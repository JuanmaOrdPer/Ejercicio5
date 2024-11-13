class Almacen {

    val estanteria: Array<Array<Bebida?>> = Array(5) { arrayOfNulls(5) }


    fun agregarBebida(bebida: Bebida?): Boolean {
        if (bebida != null) {
            if (buscarBebida(bebida.id)) {
                println("Bebida con ID ${bebida.id} ya existe. No se puede agregar.")
                return false
            }
        }

        for (columna in estanteria.indices) {
            for (fila in estanteria[columna].indices) {
                if (estanteria[fila][columna] == null) {
                    estanteria[fila][columna] = bebida
                    println("La bebida con ID: ${bebida?.id} agregada en la columna [$columna], fila [$fila].")
                    return true
                }
            }
        }
        println("No hay espacio disponible en el almacén.")
        return false
    }

    fun buscarBebida(id: Int): Boolean {
        for (fila in estanteria) {
            for (bebida in fila) {
                if (bebida?.id == id)
                    return true
            }
        }
        return false
    }

    fun borrarBebida(id: Int) {
        for (fila in estanteria.indices) {
            for (columna in estanteria[fila].indices) {
                if (estanteria[fila][columna]?.id == id) {
                    estanteria[fila][columna] = null
                    println("Bebida con ID: $id borrada")

                }
            }
        }
        println("El ID $id no existe en la estanteria")

    }

    fun mostrarBebida() {
        for (fila in estanteria) {
            for (columna in fila) {
                columna?.let {
                    println(it)
                }
            }
        }
    }

    fun calcularPrecio(): Double {
        var total = 0.0
        if (estanteria.isEmpty()) {
            total = 0.0
            println("Almacen vacio")
        } else {
            for (fila in estanteria) {
                for (columna in fila) {
                    columna?.let {
                        total += it.calcularPrecio()

                    }
                }
            }
        }
        println(
            "--------------------------------------" +
                    "\nEl total del almacen es:"
        )
        return total
    }


    fun calcularPrecio(marca: String): Double {
        var total = 0.0
        if (estanteria.isEmpty()) {
            total = 0.0
            println("Almacen vacio")
        } else {
            for (fila in estanteria) {
                for (columna in fila) {
                    if (columna?.marca == marca)
                        total += columna.calcularPrecio()
                }
            }
            println(
                "---------------------------------"
                        + "\nEl total de la marca $marca es:"
            )
        }
        return total

    }


    fun calcularPrecio(columna: Int): Double {
        var total = 0.0
        if (estanteria.isEmpty()) {
            total = 0.0
            println("Almacen vacio")
        } else {
            if (columna !in 0..4) {
                println("Columna fuera de rango")
                total = 0.0
            } else {
                for (fila in estanteria.indices)
                    estanteria[fila][columna]?.let {
                        total += it.calcularPrecio()
                    }
            }
            println(
                "-------------------------------------+" +
                        "\nEl total de la columna $columna es:"
            )
        }
        return total
    }


}
