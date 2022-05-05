package tracker;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SampleTest {

    @ParameterizedTest
    @ValueSource(strings = { "Jim.", "табу", "-bad", "'gad", "a", "alloha-", "a-'", "a-'b"})
    void badFirsName(String input) {
        Student student = new Student(1000);
        assertFalse(student.setFirstName(input));
    }

    @ParameterizedTest
    @ValueSource(strings = { "Jim'O", "mama", "ba-d", "g'ad", "aa", "all oha", "a-b"})
    void goodLastName(String input) {
        Student student = new Student(1000);
        assertTrue(student.setLastName(input));
    }
    @ParameterizedTest
    @ValueSource(strings = { "anny.md@mail.edu", "mama1@2.3"})
    void goodEMail(String input) {
        Student student = new Student(1000);
        assertTrue(student.setEmail(input));
    }

    @ParameterizedTest
    @ValueSource(strings = { "anny.md@mail", "ma@ma1@2.3"})
    void badEMail(String input) {
        Student student = new Student(1000);
        assertFalse(student.setEmail(input));
    }

    @ParameterizedTest
    @ValueSource(strings = { "John Smith jsmith@hotmail.com", "Anny Doolittle anny.md@mail.edu",
            "Jean-Claude O'Connor jcda123@google.net", "Mary Emelianenko 125367at@zzz90.z9",
            "Al Owen u15da125@a1s2f4f7.a1c2c5s4"})
    void goodAddLine(String input) {
        ClassRoom classRoom = new ClassRoom();
        assertTrue(classRoom.add(input));
    }
}
