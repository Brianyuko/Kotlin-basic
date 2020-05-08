fun main(){
    // Pemberian nama pada variabel
    val namaMahasiswa = "Rizal Zuhdi" // contoh lowerCamelCase
    val nilai1 = 100 // contoh diakhiri dengan angka
    val alamat_rumah = "Earth" // contoh menggunakan underscore
    // val nama mahasiswa = "Rijal zuhdi"
    // line diatas akan error karena penamaan variabel tidak boleh ada spasi
    // val 1nilai = 100
    // line diatas juga akan error karena penamaan variabel tidak boleh dimulai dengan angka
    // penggunaan angka dalam nama variabel bisa ditaruh di bagian tengah maupun akhir
    val nilai1matematika = 100
    println("nama mahasiswa $namaMahasiswa")
    println("alamat rumah di $alamat_rumah")
    println("nilai ujian = $nilai1")
    println("nilai matematika = $nilai1matematika")
}