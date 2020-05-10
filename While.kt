fun main(){
    // While

    // Program Hitung Ganjil Genap
    var angka = 1
    while (angka <= 10){
        val angkaGenap = angka%2
        if (angkaGenap ==0){
            println("$angka bilangan genap")
        }else{
            println("$angka bilangan ganjil")
        }
        angka++
    }
}