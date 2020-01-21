package dev.anyjava.kotlin

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.time.ZonedDateTime
import java.time.temporal.ChronoUnit
import kotlin.test.Test

class CoroutinesStudyTest {

    @Test fun testCoroutines() {

        log("main() started.")
        launchInGlobalScope()
        log("launchInGlobalScope() executed")
        Thread.sleep(5000L)
        log("main() terminated")
    }

}

fun now() = ZonedDateTime.now().toLocalDateTime().truncatedTo(ChronoUnit.MILLIS)
fun log(msg: String) = println("${now()}: ${Thread.currentThread()} : ${msg}")

fun launchInGlobalScope() {
    GlobalScope.launch { log("coroutine started.") }
}

