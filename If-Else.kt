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
}