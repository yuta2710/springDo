package com.rmit.springDo.modules.task;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class RetrieveTaskRequestMapper implements Function<Task, RetrieveTaskRequest> {
    @Override
    public RetrieveTaskRequest apply(Task task) {
        return new RetrieveTaskRequest(
                task.getId(),
                task.getTitle(),
                task.getDescription(),
                task.getStatus()
        );
    }
}
