package ontrack;

import java.util.*;

public class SubmittedTaskService {
    private Map<String, List<String>> submittedTasks;

    public SubmittedTaskService() {
        submittedTasks = new HashMap<>();
        submittedTasks.put("s224746177", Arrays.asList("task1.1", "task2.1", "task3.1"));
        submittedTasks.put("s123456789", Arrays.asList("task1.1"));
    }

    public List<String> getSubmittedTasks(String studentId) {
        return submittedTasks.getOrDefault(studentId, new ArrayList<>());
    }
}
