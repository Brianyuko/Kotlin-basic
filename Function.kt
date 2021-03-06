fun main(){

    // Function pada kotlin
    // Perhitungan Rumus
    print("Masukan Angka Faktorial: ")
    val angkaFactorial = readLine()!!.toInt()
    println("Angka faktorial dari $angkaFactorial adalah ${factorial(angkaFactorial)}")
    printHasil() //VOID
    print("Masukan Rumus: ")
    when (readLine()!!.toLowerCase()) {
        "segitiga" -> {
            print("Masukan Alas: ")
            val alas = readLine()!!.toInt()
            print("Masukan Tinggi: ")
            val tinggi = readLine()!!.toInt()
            println("Hasilnya adalah = ${luasSegitiga(alas, tinggi)}")
        }
        "persegi" -> {
            print("Masukan Panjang: ")
            val panjang = readLine()!!.toInt()
            print("Masukan Lebar: ")
            val lebar = readLine()!!.toInt()
            println("Hasilnya adalah = ${luasPersegi(panjang, lebar)}")
        }
        else -> {
            println("Rumus tidak ada")
        }
    }
    println("ini nilai default ${luasSegitiga()}")
    println("Bisa diganti langsung ${luasSegitiga(tinggi = 40)}")
}
// Nama fungsi , (paramater: tipeData = nilaiDefault jika ada), :tipeData yang ingin dikembalikan
fun luasSegitiga(alas: Int = 20 , tinggi: Int = 30): Int {
    return (alas*tinggi)/2
}
fun luasPersegi(panjang: Int, lebar: Int): Int{
    return panjang*lebar
}
// Function yang tidak mengembalikan hasil apa apa
// Sebenarnya me return tipe data :Unit, tapi tidak perlu explicit ditulis
// Jadi jika ada :Unit, berarti itu cuma VOID biasa seperti di java, tidak return sesuatu
fun printHasil(){
    println("Tidak return nilai apa apa")
}
//Function Recursive
fun factorial(angka: Int): Int{
    return if (angka == 1){
        angka
    }else
        angka*factorial(angka-1) //Recursive
}