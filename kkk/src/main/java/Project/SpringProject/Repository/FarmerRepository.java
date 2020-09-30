package Project.SpringProject.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import Project.SpringProject.Entity.Farmer;

public interface FarmerRepository extends JpaRepository<Farmer, Integer> {
//	Optional<Farmer> findByid(Optional<Farmer> id);
//
//	Farmer findByName(String name);

}
