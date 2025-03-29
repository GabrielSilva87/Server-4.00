// repository/TaskRepository.java
package com.exemplo.meuservidor.repository;

import com.exemplo.meuservidor.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}