package repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import domain.Validation;

public interface ValidationRepository extends JpaRepository<Validation, Long> {
	//Here you must define any jpa method

}
