fun main() {
    aktuallerBetrag("Zoe")
    neuesKonto("Helga", 100.00)
    kontoLoeschen("Klaus")
    takeMoney("Stefan", 520.00)
}

// Aufgabe 1
var namenZuKonten: MutableMap<String, Double> = mutableMapOf(
    "Klaus" to 1456.89,
    "Steffi" to 967.45,
    "Maria" to 2093.45,
    "Kelly" to 5062.34,
    "Alice" to 264.86,
    "Alex" to 3245.09,
    "Michael" to 235.98,
    "Stefan" to 465.65,
    "Holy" to 1345.54,
    "Zoe" to 2567.34
)

// Aufgabe 2
fun aktuallerBetrag(name: String) {
    var guthaben = namenZuKonten[name]
    println(guthaben)

}

// Aufgabe 3 TODO: Bestehender Name darf nicht überschrieben werden
fun neuesKonto(newName: String, neuerKontostand: Double) {
    /*namenZuKonten.keys.toMutableList()
     var neuerName = namenZuKonten.keys.add(newName)
    namenZuKonten.values.toMutableList()
    var newKontostand = namenZuKonten.values.add(neuerKontostand)
    var neuerKontostand = (neuerName && newKontostand) */
    namenZuKonten[newName] = neuerKontostand
    println(namenZuKonten)

}

// Aufgabe 4
fun kontoLoeschen(name: String) {
    namenZuKonten.remove(name)
    println(namenZuKonten)

}


// Aufgabe 5
fun takeMoney(name: String, money: Double) {
    var guthaben = namenZuKonten[name]
    var restGeld = guthaben?.minus(money)
    //println(restGeld)
    println(namenZuKonten)
    if (money > 500.00) {
        println("Sorry! Der Betrag den sie abheben wollen ist zu hoch. \n Sie können nur bis 500 € abheben.")
    } else if (money > guthaben!!) {
        println("Sorry! Ihr Kontostand ist nicht ausreichend gedeckt.")
    } else {
        println(restGeld)
    }
}

