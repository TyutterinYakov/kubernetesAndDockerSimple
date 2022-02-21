package cats.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cats.store.entity.CatEntity;

@Repository
public interface CatRepository extends JpaRepository<CatEntity, String>{

}
