import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    @Test
    public void testSimpleTaskIfMatches() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean expected = true;
        boolean actual = simpleTask.matches("Позвонить");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSimpleTaskNotMatches() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean expected = true;
        boolean actual = simpleTask.matches("Написать");

        Assertions.assertFalse(actual);
    }

    @Test
    public void testEpicNotMatches() {
        Epic epic = new Epic(55, new String[]{"Испечь хлеб"});

        boolean expected = true;
        boolean actual = epic.matches("купить");

        Assertions.assertFalse(actual);
    }

    @Test
    public void testEpicYesMatches() {
        Epic epic = new Epic(1, new String[]{"Испечь хлеб"});

        boolean expected = true;
        boolean actual = epic.matches("Испечь");

        Assertions.assertTrue(actual);
    }

    @Test
    public void testMeetingNotMatches() {
        Meeting meeting = new Meeting(23, "Подарок маме", "День Рождение", "Первое Июня" );

        boolean expected = true;
        boolean actual = meeting.matches("Хлеб");

        Assertions.assertFalse(actual);
    }

    @Test
    public void testMeetingYesMatches() {
        Meeting meeting = new Meeting(23, "Подарок маме", "День Рождение", "Первое Июня" );

        boolean expected = true;
        boolean actual = meeting.matches("Подарок");

        Assertions.assertTrue(actual);
    }



}