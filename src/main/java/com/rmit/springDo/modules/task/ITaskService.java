package com.rmit.springDo.modules.task;

import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ITaskService {
    ResponseEntity<RetrieveTaskRequest> createTask(Task task);

    ResponseEntity<List<RetrieveTaskRequest>> getTasks();
    ResponseEntity<RetrieveTaskRequest> getTaskById(Long id);
    ResponseEntity<RetrieveTaskRequest> updateTaskById(Long id, Task task);
    ResponseEntity<RetrieveTaskRequest> deleteTaskById(Long id);
    RetrieveTaskRequest getTaskException(Long id);
}
