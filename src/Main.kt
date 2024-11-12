//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val almacen = Almacen()

    val agua1 = Agua(1, 0.5, 1.0, "Fuensanta", "Nava")
    val cocaCola = BebidaAzucarada(2, 0.33, 2.5, "CocaCola", 30, false)
    val fanta = BebidaAzucarada(3, 0.33, 2.5, "CocaCola", 25, true)
    val agua2 = Agua(4, 1.5, 3.0, "Cuevas", "Lena")
    val pepsi = BebidaAzucarada(5, 1.5, 5.0, "Pepsi", 40, true)

    almacen.agregarBebidad(agua1)
    almacen.agregarBebidad(pepsi)
    almacen.borrarBebida(5)
    almacen.agregarBebidad(cocaCola)
    almacen.agregarBebidad(fanta)
    almacen.agregarBebidad(agua2)
    almacen.agregarBebidad(pepsi)

    almacen.mostrarBebida()



    println(almacen.calcularPrecio())

    println(almacen.calcularPrecio(0))

    println(almacen.calcularPrecio("CocaCola"))

}


