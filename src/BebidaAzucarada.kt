class BebidaAzucarada (id: Int, cantidad: Double, precio: Double, marca: String,  val porcentaje: Int,  val promocion: Boolean):
    Bebida(id, cantidad, precio, marca)  {
        override fun calcularPrecio(): Double{
            return if (promocion) super.calcularPrecio() * 0.9
            else precio
        }

    override fun toString(): String {
        return super.toString() + "\nPorcentaje azúcar: $porcentaje \nPromocion: $promocion"
    }




}