package ontrack;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;

public class SubmittedTaskServiceTest {

    @Test
    public void testGetSubmittedTasksExistingStudent() {
        SubmittedTaskService service = new SubmittedTaskService();
        List<String> tasks = service.getSubmittedTasks("s224746177");

        assertEquals(99, tasks.size());
        assertTrue(tasks.contains("task2.1"));
    }

    @Test
    public void testGetSubmittedTasksUnknownStudent() {
        SubmittedTaskService service = new SubmittedTaskService();
        List<String> tasks = service.getSubmittedTasks("unknown");

        assertTrue(tasks.isEmpty());
    }
}
