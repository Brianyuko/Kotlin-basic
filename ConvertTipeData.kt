fun main(){

    // Convert tipe data
    // Convert bisa dilakukan dengan cara variable .toTipeData yang ingin diubah dan diakhiri ()

    val nama: String = "KHARIS"
    val umur: Int = 20
    val tinggiBadan: Int = 160
    val beratBadan: Int = 50

    println("Nama ${nama.toLowerCase()}") // Mengubah menjadi lowerCase
    println("Umur ${umur.toFloat()}") // Convert data int to float
    println("Penjumlahan berat badan dan tinggi badan = " + (tinggiBadan+beratBadan))
    print(tinggiBadan.toString()+beratBadan.toString()) // Convert int To String
}