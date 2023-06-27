fun main() {
    throw NotImplementedError("TODO")
}
// Hier dein Application.module Code einfügen

// 1. Schreibe eine Funktion, die alle Eissorten herausfiltert, die weniger als <value> Euro kosten.
fun lessThan(value: Double): List<IceCream> {
    throw NotImplementedError("TODO")
}

// 2. Schreibe eine Funktion, die alle Eissorten in absteigender Reihenfolge nach der Anzahl der verkauften Einheiten sortiert.
fun sortDescendingNumberSold(): List<IceCream> {
    throw NotImplementedError("TODO")
}

// 3. Schreibe eine Funktion, die den durchschnittlichen Preis aller Eissorten berechnet.
fun averagePrice(): Double {
    throw NotImplementedError("TODO")
}

// 4. Schreibe eine Funktion, die nach einer bestimmten Eissorte sucht und diese zurückgibt.
fun findIceCream(type: String): IceCream? {
    throw NotImplementedError("TODO")
}

// 5. Schreibe eine Funktion, die alle Eissorten herausfiltert, die mehr als 100 Einheiten verkauft haben.
fun moreThanHundred(): List<IceCream> {
    throw NotImplementedError("TODO")
}

// 6. Schreibe eine Funktion, die den niedrigsten Preis unter allen Eiscremes findet.
fun lowestPrice(): Double {
    throw NotImplementedError("TODO")
}

// 7. Schreibe eine Funktion, die den Gesamtumsatz berechnet (Preis multipliziert mit verkauften Einheiten für jede Eissorte).
fun totalRevenue(): Double {
    throw NotImplementedError("TODO")
}

// 8. Schreibe eine Funktion, die den Preis jeder Eissorte um 10% erhöht und diese Liste zurückgibt.
fun increasePrice(): List<IceCream> {
    throw NotImplementedError("TODO")
}

// 9. Schreibe eine Funktion, die den Namen einer bestimmten Eissorte in einen neuen Namen ändert.
fun changeName(type: String, newName: String): IceCream {
    throw NotImplementedError("TODO")
}

// 10. Erstelle eine sortierte Liste aller Eissorten basierend auf ihrem Preis (von niedrig zu hoch).
fun sortPrice(): List<IceCream> {
    throw NotImplementedError("TODO")
}

// 11. Finde alle Eissorten, die weniger als 100 Einheiten verkauft haben.
fun lessThanHundred(): List<IceCream> {
    throw NotImplementedError("TODO")
}

// 12. Finde alle Eissorten, deren Preis über dem Durchschnittspreis liegt.
fun higherThanAverage(): List<IceCream> {
    throw NotImplementedError("TODO")
}

// 13. Erstelle eine neue Liste, die alle Eissorten enthält, die sowohl einen Preis unter dem Durchschnitt haben als auch mehr als 100 Einheiten verkauft wurden.
fun lessThanAverageAndMoreThanHundred(): List<IceCream> {
    throw NotImplementedError("TODO")
}

// 14. Finde heraus, wie viele verschiedene Eissorten es gibt.
fun countIceCream(): Int {
    throw NotImplementedError("TODO")
}

// 15. Schreibe eine Funktion, die den höchsten Preis unter allen Eiscremes findet.
fun highestPrice(): Double {
    throw NotImplementedError("TODO")
}


data class IceCream(
    val type: String, val price: Double, val numberSold: Int
)
