package com.threads.concurrency.Repositories;


import com.threads.concurrency.Entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    // Additional query methods can be defined here if needed
}