class Agua(id: Int, cantidad: Double, precio: Double, marca:String ,val origen: String): Bebida(id, cantidad, precio, marca) {

    override fun toString(): String {
        return super.toString() + "\nOrigen: $origen"
    }
}