package junit;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.*;

public class FirstJUnitTest {
    @BeforeAll
    static void beforeAll() {
        System.out.println("Этот метод выполняется перед всеми ТЕСТАМИ!");
    }
    @BeforeEach
    void before() {
        System.out.println("Этот метод запускается перед каждым тестом");
    }
    @AfterEach
    void after() {
        System.out.println("Этот метод запускается после каждого теста");
    }
    @Test
    void textTest() {
        System.out.println("        Это первый тест!");
    }

    @Test
    void videoTest() {
        System.out.println("        Это второй тест!");
    }
}
