package dev.anyjava.kotlin

import org.junit.Test
import kotlin.test.assertNotNull

class SampleTest {

    @Test
    fun testAppHasAGreeting() {
        val classUnderTest = App()
        assertNotNull(classUnderTest.greeting, "app should have a greeting")
    }
}

class App {
    val greeting: String
        get() {
            return "Hello world."
        }
}
