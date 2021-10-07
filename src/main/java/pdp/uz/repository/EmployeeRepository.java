package pdp.uz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pdp.uz.entity.Employee;


import java.util.Optional;
import java.util.UUID;

public interface EmployeeRepository extends JpaRepository<Employee, UUID> {

    Optional<Employee> findByEmail(String email);
}
