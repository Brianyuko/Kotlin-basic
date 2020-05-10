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

    //Do While
    println("Masukan Nama")
    var nama = readLine()
    var nilai =""
    var total = 0
    do {
        println("Masukan Nilaimu: ")
        nilai = readLine()!!
        total = total + nilai.toInt()
    }while (nilai != "0") // Jika syarat didalam while memenuhi, maka do akan terus berjalan
    println("Total nilai $nama adalah: $total") // Jika syarat di dalam while tidak terpenuhi, do akan berhenti berjalan
}