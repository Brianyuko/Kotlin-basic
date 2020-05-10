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
}