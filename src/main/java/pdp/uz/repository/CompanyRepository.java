package pdp.uz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pdp.uz.entity.Company;


public interface CompanyRepository extends JpaRepository<Company, Integer> {

}
