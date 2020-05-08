fun main(){

    // Tipe Data Array
    // Sifat dari array adalah mutable atau bisa diubah

    val angka = arrayOf<Int>(1,2,3,4,5) // <Kumpulan tipe data>
    val absen = arrayOf("Angga", "Arysi", "Aje")
    println(absen[0]) // Akan mengagambil index 0 yaitu Angga
    println(absen.get(0)) // Akan mengambil index 0 juga, tetapi menggunkan get
    absen[0] = "Rijal" // Mengganti index 0 dengan value string Rijal
    absen.set(1, "Dimas") // Menngganti index 0 dengan value string Rijal tetapi menggunakan set
    println(absen[0])
    println(absen.toList()) // Data akan terupdate sesuai dengan aray yang diganti
    println(angka.toList())

    // Beberapa Method Array
    println("Last dari array absen ${absen.last()}") // Last in Array
    println("First dari array absen ${absen.first()}") // First in Array
    println("Rata rata dari array angka ${angka.average()}") // Average in Array
    println("Nilai maximal dari array angka ${angka.max()}") // Value max in Array
    println("Nilai minimal dari array angka ${angka.min()}") // Value min in Array
    println("Isi array ada ${absen.count()}") // Count content in Array
}