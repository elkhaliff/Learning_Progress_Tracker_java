package tracker;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TestOfCourse {
    ClassRoom classRoom;

    @BeforeAll
    void initClassRoom() {
        classRoom = new ClassRoom();
    }

    @ParameterizedTest
    @ValueSource(strings = {"John Doe johnd@email.net", "Jane Spark jspark@yahoo.com"})
    void testClassRoom(String input) {
        assertTrue(classRoom.add(input));
    }

    @ParameterizedTest
    @ValueSource(strings = { "10000 8 7 7 5", "10000 7 6 9 7", "10000 6 5 5 0", "10001 8 0 8 6", "10001 7 0 0 0",
            "10001 9 0 0 5"})
    void goodLastName(String input) {
        assertTrue(classRoom.testPoints(input));
        classRoom.addPoints(input);
    }

    @ParameterizedTest
    @ValueSource(strings = {"java", "dsa", "databases", "spring"})
    void getStat(String input) {
        classRoom.getStat(input);
    }

    @AfterAll
    void outMsg() {
        classRoom.getStats();
    }

}
