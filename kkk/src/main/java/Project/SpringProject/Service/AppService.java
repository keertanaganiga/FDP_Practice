package Project.SpringProject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Project.SpringProject.Entity.Farmer;
import Project.SpringProject.Entity.SuperUser;
import Project.SpringProject.Repository.FarmerRepository;
import Project.SpringProject.Repository.SuperUserRepository;

@Service
public class AppService {

	@Autowired
	private SuperUserRepository superUserRepository;
	@Autowired
	private FarmerRepository farmerRepository;

	private SuperUser superUserDetailById;
	private int superUserId;

	public SuperUser saveSuperUser(SuperUser superuser) {
		return superUserRepository.save(superuser);
	}

	public Farmer saveFarmer(Farmer farmer) {
		if (superUserId == superUserDetailById.getSuperUserId()) {
			return farmerRepository.save(farmer);
		}
		return null;
	}

	public SuperUser getSuperUserByID(int id) {
		this.superUserId = id;
		this.superUserDetailById = superUserRepository.findById(id).orElse(null);
		return superUserDetailById;
	}

}
