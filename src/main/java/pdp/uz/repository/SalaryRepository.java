package pdp.uz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pdp.uz.entity.Salary;


public interface SalaryRepository extends JpaRepository<Salary, Long> {
}
