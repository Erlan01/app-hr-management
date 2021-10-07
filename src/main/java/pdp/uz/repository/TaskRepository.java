package pdp.uz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pdp.uz.entity.Task;


public interface TaskRepository extends JpaRepository<Task, Long> {
}
