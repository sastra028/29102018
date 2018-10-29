package APITest.repository;

import APITest.dao.TableA1DAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApiRepositoryImpl extends JpaRepository<TableA1DAO,Integer> {
}
