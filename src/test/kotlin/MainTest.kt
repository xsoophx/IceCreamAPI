import kotlin.test.assertEquals
import org.junit.jupiter.api.Test

class MainTest {

    // 1.
    @Test
    fun `should calculate less than value Euro`() {
        assertEquals(
            expected = listOf(IceCream(type = "Erdbeere", price = 1.49, numberSold = 150)),
            actual = lessThan(1.5)
        )
    }

    // 2.
    @Test
    fun `should sort descending`() {
        assertEquals(
            expected = iceCreams.map { it.numberSold }.sortedDescending().distinct(),
            actual = sortDescendingNumberSold().map { it.numberSold }.distinct()
        )
    }

    // 3.
    @Test
    fun `should get average price`() {
        assertEquals(expected = 2.5566666666666666, actual = averagePrice())
    }

    // 4.
    @Test
    fun `should find ice cream by type`() {
        assertEquals(expected = IceCream("Vanille", 1.99, 100), actual = findIceCream("Vanille"))
    }

    // 5.
    @Test
    fun `should find sold units which are more than hundred sold`() {
        val expected = listOf(
            IceCream(type = "Schokolade", price = 2.99, numberSold = 200),
            IceCream(type = "Erdbeere", price = 1.49, numberSold = 150),
            IceCream(type = "Mango", price = 2.49, numberSold = 120),
            IceCream(type = "Pfirsich", price = 2.49, numberSold = 110),
            IceCream(type = "Heidelbeere", price = 2.79, numberSold = 200),
            IceCream(type = "Passionsfrucht", price = 2.79, numberSold = 120),
            IceCream(type = "Kirsche", price = 2.49, numberSold = 110),
            IceCream(type = "Melone", price = 2.69, numberSold = 130),
            IceCream(type = "Caramel", price = 2.89, numberSold = 140),
            IceCream(type = "Mokka", price = 2.99, numberSold = 150),
            IceCream(type = "Apfel", price = 2.39, numberSold = 115),
            IceCream(type = "Birne", price = 2.49, numberSold = 125),
            IceCream(type = "Pistazie", price = 2.79, numberSold = 140),
            IceCream(type = "Walnuss", price = 2.89, numberSold = 155),
            IceCream(type = "Haselnuss", price = 2.99, numberSold = 180),
            IceCream(type = "Ananas", price = 2.49, numberSold = 120),
            IceCream(type = "Joghurt", price = 2.39, numberSold = 130),
            IceCream(type = "Rum-Rosine", price = 2.79, numberSold = 110),
            IceCream(type = "Kaffee", price = 2.99, numberSold = 170)
        ).sortedBy { it.type }
        val actual = moreThanHundred().sortedBy { it.type }
        expected.zip(actual).forEach { (e, a) -> assertEquals(e, a) }

    }

    // 6.
    @Test
    fun `should get lowest price`() {
        assertEquals(expected = 1.49, actual = lowestPrice())
    }

    // 7.
    @Test
    fun `should get total revenue`() {
        assertEquals(expected = 9448.699999999999, actual = totalRevenue())
    }

    // 8.
    @Test
    fun `should increase price by 10percent`() {
        val higherPrices = increasePrice()
        iceCreams.forEach { prev ->
            val iceCream = higherPrices.firstOrNull { curr -> prev.type == curr.type }
            assertEquals(expected = prev.price * 1.1, actual = iceCream?.price)
        }
    }

    // 9.
    @Test
    fun `should change name of ice cream`() {
        assertEquals(expected = IceCream("Beere", 1.99, 100), actual = changeName("Vanille", "Beere"))
    }

    // 10.
    @Test
    fun `should sort icecreams for price`() {
        assertEquals(
            expected = iceCreams.map { it.price }.sorted().distinct(),
            actual = sortPrice().map { it.price }.distinct()
        )
    }

    // 11.
    @Test
    fun `should find all less than hundred`() {
        assertEquals(
            expected = listOf(
                IceCream(type = "Kokosnuss", price = 2.99, numberSold = 90),
                IceCream(type = "Blaubeere", price = 2.29, numberSold = 75),
                IceCream(type = "Zitrone", price = 1.99, numberSold = 85),
                IceCream(type = "Banane", price = 2.29, numberSold = 80),
                IceCream(type = "Himbeere", price = 2.29, numberSold = 95),
                IceCream(type = "Schwarze Johannisbeere", price = 2.29, numberSold = 80),
                IceCream(type = "Maracuja", price = 2.79, numberSold = 90),
                IceCream(type = "Pflaume", price = 2.49, numberSold = 90),
                IceCream(type = "Grapefruit", price = 2.29, numberSold = 70)
            ), actual = lessThanHundred()
        )
    }

    // 12.
    @Test
    fun `should find all higher than average`() {
        val average = iceCreams.map { it.price }.average()
        val lowerThanAverage = iceCreams.filter { it.price <= average }
        assertEquals(expected = iceCreams - lowerThanAverage.toSet(), actual = higherThanAverage())
    }

    // 13.
    @Test
    fun `should filter less than average and more than hundred`() {
        assertEquals(
            expected = listOf(
                IceCream(type = "Erdbeere", price = 1.49, numberSold = 150),
                IceCream(type = "Mango", price = 2.49, numberSold = 120),
                IceCream(type = "Pfirsich", price = 2.49, numberSold = 110),
                IceCream(type = "Kirsche", price = 2.49, numberSold = 110),
                IceCream(type = "Apfel", price = 2.39, numberSold = 115),
                IceCream(type = "Birne", price = 2.49, numberSold = 125),
                IceCream(type = "Ananas", price = 2.49, numberSold = 120),
                IceCream(type = "Joghurt", price = 2.39, numberSold = 130)
            ), actual = lessThanAverageAndMoreThanHundred()
        )
    }

    // 14.
    @Test
    fun `should count icecreams`() {
        assertEquals(expected = 30, actual = countIceCream())
    }

    // 15.
    @Test
    fun `should count highest price`() {
        assertEquals(expected = 2.99, actual = highestPrice())
    }


    companion object {
        private val iceCreams = listOf(
            IceCream("Vanille", 1.99, 100),
            IceCream("Schokolade", 2.99, 200),
            IceCream("Erdbeere", 1.49, 150),
            IceCream("Mango", 2.49, 120),
            IceCream("Kokosnuss", 2.99, 90),
            IceCream("Blaubeere", 2.29, 75),
            IceCream("Zitrone", 1.99, 85),
            IceCream("Pfirsich", 2.49, 110),
            IceCream("Banane", 2.29, 80),
            IceCream("Heidelbeere", 2.79, 200),
            IceCream("Himbeere", 2.29, 95),
            IceCream("Passionsfrucht", 2.79, 120),
            IceCream("Kirsche", 2.49, 110),
            IceCream("Melone", 2.69, 130),
            IceCream("Caramel", 2.89, 140),
            IceCream("Mokka", 2.99, 150),
            IceCream("Apfel", 2.39, 115),
            IceCream("Birne", 2.49, 125),
            IceCream("Pistazie", 2.79, 140),
            IceCream("Walnuss", 2.89, 155),
            IceCream("Haselnuss", 2.99, 180),
            IceCream("Ananas", 2.49, 120),
            IceCream("Joghurt", 2.39, 130),
            IceCream("Rum-Rosine", 2.79, 110),
            IceCream("Schwarze Johannisbeere", 2.29, 80),
            IceCream("Maracuja", 2.79, 90),
            IceCream("Kaffee", 2.99, 170),
            IceCream("Feige", 2.69, 100),
            IceCream("Pflaume", 2.49, 90),
            IceCream("Grapefruit", 2.29, 70)
        )
    }
}