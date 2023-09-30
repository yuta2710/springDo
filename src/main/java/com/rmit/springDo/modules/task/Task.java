package com.rmit.springDo.modules.task;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "task")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "task_sequence_id")
    @Column(nullable = false, updatable = false)
    private Long id;
    private String title;
    private String description;
    private String status;
}
