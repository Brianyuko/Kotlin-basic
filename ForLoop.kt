fun main(){

    // Pengecekan angka genap
    for (i in 1..10){
        if ( i%2 != 0){ // Syarat bilangan ganjil
            continue // Jika Syarat terpenuhi, maka akan di skip
        }
        println("$i adalah angka genap")
    }
}