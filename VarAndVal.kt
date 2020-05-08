fun main(){

    val tinggiBadan = 150 // Val object Immutable atau tidak dapat diubah
    // tinggiBadan = 120 Baris ini akan error, Val Cannot be Reassigned
    var nama = "Brian Yuko" // Var object Mutable atau dapat diubah
    nama = "Brian Yuko Putra" // Ini bisa dijalankan karena var dapat diubah
    println("Nama saya adalah $nama, memiliki tinggi badan $tinggiBadan")
}