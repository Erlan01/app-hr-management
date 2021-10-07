package pdp.uz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pdp.uz.entity.TourniquetHistory;

import java.util.UUID;

public interface TourniquetHistoryRepository extends JpaRepository<TourniquetHistory, UUID> {
}
