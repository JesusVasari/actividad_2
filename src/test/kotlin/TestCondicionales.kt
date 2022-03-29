import org.junit.jupiter.api.Test
import org.junit.jupiter.api.condition.*

internal class TestCondicionales{


    @Test
    @EnabledOnOs(OS.LINUX, OS.MAC)
    internal fun Test1(){
        println("estamos en windows")
    }

    @Test
    @EnabledOnJre(JRE.JAVA_8)
    internal fun test2() {
       println("java version 8")
    }

    @Test
    @EnabledForJreRange(min=JRE.JAVA_8, max=JRE.JAVA_15)
    internal fun test3() {
        println("estamos entre la version 8 y 15")
    }

    @Test
    @EnabledIfSystemProperty(named="Driver", matches = "C")
    internal fun Test4() {
        println("pasa por aqui")
    }

    @Test
    @EnabledIfEnvironmentVariable (named="run.import.tests", matches="true")
    internal fun Test5() {
        println("pasa por aqui")
    }
}