import org.junit.Assert.assertEquals
import org.junit.Test

class MainKtTest {

    @Test
    fun visa_Mir_amount_more_35() {
        // arrange
        val amount = 100_000U
        val expected = 750U
        // act
        val actual = amount*75u/100u/100u;
        // assert
        assertEquals(expected, actual)
    }
    @Test
    fun visa_Mir_amount_less_35() {
        // arrange
        val amount = 4_600U
        val expected = 34U

        // act
        val actual = amount*75u/100u/100u
        // assert
        assertEquals(expected, actual)
    }


    @Test
    fun vk_Pay() {
        // arrange
        val amount = 100_00U
        val expected = 0U

        // act
        val actual = amount * 0U
        // assert
        assertEquals(expected, actual)
    }

    @Test
    fun maetro_Master_amount_more_75_000() {
        // arrange
        val amount = 100_00U
        val expected = 80U
        // ect
        val actual = amount * 6u/10u/100u + 20u
        // assert
        assertEquals(actual, expected)
    }
    @Test
    fun maetro_Master_amount_less_75_000() {
        // arrange
        val amount = 75_000_00U
        val expected = 4_520U
        // ect
        val actual = amount * 6U/100u/100u+20u
        // assert
        assertEquals(actual, expected)
    }
}