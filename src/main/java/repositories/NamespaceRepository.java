package repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import domain.Namespace;

public interface NamespaceRepository extends JpaRepository<Namespace, Long>{

}
