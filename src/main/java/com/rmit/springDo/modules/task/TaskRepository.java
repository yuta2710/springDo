package com.rmit.springDo.modules.task;

import com.rmit.springDo.modules.task.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> { }
