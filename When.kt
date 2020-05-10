fun main() {

    // When

    //Sistem Point
    val nilai1 = 10
    val nilai2 = 50
    println("Masukan Operasi yang ingin dihitung")
    println("Tambah, Kurang, Kali, Bagi")
    val hasil: String = when (readLine()?.capitalize()) {
                        "Tambah" -> (nilai1 + nilai2).toString()
                        "Kurang" -> (nilai1 - nilai2).toString()
                        "Kali" -> (nilai1 * nilai2).toString()
                        "Bagi" -> (nilai1 / nilai2).toString()
                        else -> "Pilihan tidak ada"
                        }
    println("hasilnya adalah $hasil")
}