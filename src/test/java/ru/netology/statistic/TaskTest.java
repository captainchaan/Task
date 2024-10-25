package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void searchReturnTrueEpic() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        boolean expected = true;
        boolean actual = epic.matches("Молоко");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void searchReturnTrueMeetingTopic() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean expected = true;
        boolean actual = meeting.matches("Выкатка");
        Assertions.assertEquals(expected, actual);


    }
    @Test
    public void testAllGet() {
        Task task = new Task(5);
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        Assertions.assertEquals("Позвонить родителям", simpleTask.getTitle());
        Assertions.assertEquals(5, task.getId());
        Assertions.assertEquals(subtasks, epic.getSubtasks());
        Assertions.assertEquals("Выкатка 3й версии приложения", meeting.getTopic());
        Assertions.assertEquals("Приложение НетоБанка", meeting.getProject());
        Assertions.assertEquals("Во вторник после обеда", meeting.getStart());

    }

    @Test
    public void test() {
        Task task = new Task(3);

        Assertions.assertEquals(false, task.matches("3"));

    }
}
