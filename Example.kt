fun main(){
    val hadiah = arrayOf("Gold", "Gold", "Silver",
                 "Silver", "ZONK", "Silver", "ZONK", "Gold", "Silver")
    var gold    = 0
    var silver  = 0

    //Menggunakan if else
    for (item in hadiah){
        if (item == "Gold"){
            gold+=1
        }
        if (item == "Silver"){
            silver+=1
        }
    }

    //Menggunakan when
    for (item in hadiah){
        when(item){
            "Gold" -> gold+=1
            "Silver" -> silver+=1
        }
    }
    println("Jumlah gold $gold, Jumlah Silver $silver")

    //Latihan 2
    //1. Input nama
    //2. cek bule atau bukan
    //3. tentukan asal negaranya
    val orangIndonesia = arrayOf("Juminten", "Purwoto", "Wahyudi")
    val orangUzbek = arrayOf("Miatov", "Modric", "Rudolf")
    val orangJapan = arrayOf("Saske", "Orizawa", "Hyuka")
    println("Masukan Nama")
    val nama = readLine()
    when (nama) {
        in orangIndonesia -> {
            println("$nama bukan bule dan orang indonesia")
        }
        in orangUzbek -> {
            println("$nama orang bule dan orang uzbek")
        }
        in orangJapan -> {
            println("$nama orang bule dan orang japan")
        }
        else -> {
            println("Nama $nama tidak ada")
        }
    }
}