package com.rmit.springDo.modules.task;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class TaskService implements ITaskService{
    private final TaskRepository taskRepository;
    private final RetrieveTaskRequestMapper retrieveTaskRequestMapper;

    @Override
    public ResponseEntity<RetrieveTaskRequest> createTask(Task task) {
        RetrieveTaskRequest taskObj = retrieveTaskRequestMapper.apply(task);

        return ResponseEntity.status(HttpStatus.CREATED).body(taskObj);
    }

    @Override
    public ResponseEntity<List<RetrieveTaskRequest>> getTasks() {
        List<RetrieveTaskRequest> jsonObj = taskRepository.findAll()
                .stream()
                .map(retrieveTaskRequestMapper)
                .collect(Collectors.toList());

        return ResponseEntity.ok(jsonObj);
    }

    @Override
    public ResponseEntity<RetrieveTaskRequest> getTaskById(Long id) {
        Optional<Task> jsonObj = taskRepository.findById(id);

        if(jsonObj.isPresent()) {
            RetrieveTaskRequest decoder = retrieveTaskRequestMapper.apply(jsonObj.get());

            return ResponseEntity.ok(decoder);
        }else {
           return ResponseEntity.notFound().build();
        }
    }

    @Override
    public ResponseEntity<RetrieveTaskRequest> updateTaskById(Long id, Task task) {
        return null;
    }

    @Override
    public ResponseEntity<RetrieveTaskRequest> deleteTaskById(Long id) {
        return null;
    }

    @Override
    public RetrieveTaskRequest getTaskException(Long id) {
        RetrieveTaskRequest retrieveTaskRequest = getTaskById(id).getBody();

        if(retrieveTaskRequest == null){

        }
        return null;
    }
}
