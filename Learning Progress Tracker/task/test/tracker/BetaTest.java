package tracker;

import org.junit.jupiter.api.*;

//static n -> @BeforeAll -> { Constructor -> @BeforeEach -> @Test  -> @AfterEach } -> @AfterAll

/*
(BeforeAll) method3: 25
constructor: 50
(BeforeEach) method2: 46
(Test) method6: 55
(AfterEach) method5: 55
constructor: 110
(BeforeEach) method2: 106
(Test) method7: 115
(AfterEach) method5: 115
constructor: 230
(BeforeEach) method2: 226
(Test) method8: 235
(AfterEach) method5: 235
(AfterAll) method4: 78
BetaTest > method6() PASSED
BetaTest > method7() PASSED
BetaTest > method8() PASSED
*/

public class BetaTest {
    static int number = 14;

    BetaTest() {
        number *= 2;
        System.out.print("constructor: ");
        System.out.println(number);
    }

    @BeforeAll
    static void method3() {
        number += 11;
        System.out.print("(BeforeAll) method3: ");
        System.out.println(number);
    }

    @BeforeEach
    void method2() {
        number -= 4;
        System.out.print("(BeforeEach) method2: ");
        System.out.println(number);
    }

    @AfterAll
    static void method4() {
        number /= 3;
        System.out.print("(AfterAll) method4: ");
        System.out.println(number);
    }

    @AfterEach
    void method5() {
        System.out.print("(AfterEach) method5: ");
        System.out.println(number);
    }

    @Test
    void method6() {
        number += 9;
        System.out.print("(Test) method6: ");
        System.out.println(number);
    }

    @Test
    void method7() {
        number += 9;
        System.out.print("(Test) method7: ");
        System.out.println(number);
    }

    @Test
    void method8() {
        number += 9;
        System.out.print("(Test) method8: ");
        System.out.println(number);
    }
}
