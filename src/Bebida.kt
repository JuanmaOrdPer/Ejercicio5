open class Bebida(val id: Int, val cantidad: Double, val precio: Double, val marca:String){

    open fun calcularPrecio():Double{
        return precio
    }

    override fun toString(): String {
        return "-----------------------\nID: $id \nCantidad: $cantidad \nPrecio: $precio \nMarca: $marca"
    }
}