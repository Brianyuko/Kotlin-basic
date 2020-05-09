fun main(){

    // && true if all Boolean expressions are true
    // || true if either of the Boolean expression is true
    // == is equal to
    // != not equal to

    val nama = "Rio Armando"
    val habitat = "Laut"
    val kemampuan = "Terbang"

    if (habitat == "Hutan" && kemampuan == "Terbang"){
        println("$nama bukan manusia")
    } else if(habitat ==  "Hutan" || kemampuan != "Terbang"){
        println("$nama setengah manusia")
    }else{
        println("$nama manusia atau bukan ya ")
    }
}