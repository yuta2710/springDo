package com.rmit.springDo.modules.task;

public record RetrieveTaskRequest (
    Long id,
    String title,
    String description,
    String status
){}
