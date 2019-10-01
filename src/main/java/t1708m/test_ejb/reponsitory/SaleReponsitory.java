package t1708m.test_ejb.reponsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import t1708m.test_ejb.entity.Sale;

public interface SaleReponsitory extends JpaRepository<Sale, Integer> {
}
