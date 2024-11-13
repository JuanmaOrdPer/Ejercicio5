//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val almacen = Almacen()

    val agua1 = Agua(1, 0.5, 1.0, "Fuensanta", "Nava")
    val cocaCola = BebidaAzucarada(2, 0.33, 2.5, "CocaCola", 30, false)
    val fanta = BebidaAzucarada(3, 0.33, 2.5, "CocaCola", 25, true)
    val agua2 = Agua(4, 1.5, 3.0, "Cuevas", "Lena")
    val pepsi = BebidaAzucarada(5, 1.5, 5.0, "Pepsi", 40, true)
    val kas = BebidaAzucarada(6, 2.0, 3.5, "Kas", 20, false)
    val agua3= Agua (4, 1.5, 1.5, "Bezoya", "Teruel")


    almacen.calcularPrecio()
    almacen.agregarBebida(agua1)
    almacen.agregarBebida(pepsi)
    almacen.borrarBebida(5)
    almacen.borrarBebida(12)
    almacen.agregarBebida(cocaCola)
    almacen.agregarBebida(fanta)
    almacen.agregarBebida(agua2)
    almacen.agregarBebida(pepsi)
    almacen.agregarBebida(pepsi)
    almacen.agregarBebida(kas)
    almacen.agregarBebida(agua3)

    almacen.mostrarBebida()



    println(almacen.calcularPrecio())

    println(almacen.calcularPrecio(0))

    println(almacen.calcularPrecio("CocaCola"))

}


