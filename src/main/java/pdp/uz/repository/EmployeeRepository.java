package pdp.uz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pdp.uz.entity.Employee;


import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface EmployeeRepository extends JpaRepository<Employee, UUID> {

    Optional<Employee> findByEmail(String email);

    List<Employee> findAllByCompanyIdAndEnabledTrue(Long id);

    boolean existsByEmail(String email);

    Optional<Employee> findByEmailAndEmailCode(String email, String emailCode);

    Optional<Employee> findByEmailAndEnabledTrue(String email);
}
