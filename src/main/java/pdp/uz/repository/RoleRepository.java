package pdp.uz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pdp.uz.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
}
