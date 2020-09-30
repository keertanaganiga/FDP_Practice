package Project.SpringProject.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import Project.SpringProject.Entity.SuperUser;

public interface SuperUserRepository extends JpaRepository<SuperUser, Integer> {
//	Optional<SuperUser> findById(Optional<SuperUser> id);
//
//	SuperUser findByName(String name);

	
}
