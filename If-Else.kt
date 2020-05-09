fun main(){
    // If Else Kotlin

    val nama:String = "Andhika Juliawan"
    var matematika:Int = 80
    var pendidikan:Int = 70
    var nilai:String = ""

    //Jika syarat yang kita cek benar maka akan masuk ke block If
    //Jika syarat yang kita cek salah maka akan masuk ke block Else

    // Jika hanya 1 statement bisa tanpa menggunakan {}
    nilai = if (matematika > pendidikan) "lulus"
            else "tidak lulus"
    println(nilai)

    // Bisa digunakan di variabel
    val lulus = if (matematika > pendidikan){
                matematika+=20
                "$nama Lulus Matematika dengan nilai $matematika"
                } else { matematika -= 80
                        "$nama tidak lulus matematika"
                }
    println("hasilnya adalah $lulus")

    // Nested If Else
    val umur = 19
    val standarUmur = 19
    if (umur > standarUmur){
        println("$nama memiliki umur lebih, bisa masuk ke bioskop")
    }else if (umur == standarUmur){
        println("$nama memiliki umur pas, bisa masuk ke bioskop")
    }else{
        println("$nama belum cukup umur")
    }

    // If Untuk Check Array
    val nilaiA = intArrayOf(80,81,82,83,84,85,86,87,88,89)
    val nilaiB = intArrayOf(71,72,73,74,75,76,77,78,79)
    val nilaiSiswa = 70
    if (nilaiSiswa in nilaiA){
        println("Siswa mendapatkan nilai A")
    }else if (nilaiSiswa in nilaiB){
        println("Siswa mendapatkan nilai B")
    }else{
        println("Siswa mendapatkan nilai C")
    }
}