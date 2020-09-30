package Project.SpringProject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Project.SpringProject.Entity.Farmer;
import Project.SpringProject.Entity.SuperUser;
import Project.SpringProject.Service.AppService;

@RestController
public class AppController {
	@Autowired
	private AppService service;
	
	@PostMapping("/createSuperUser")
	public SuperUser createSuperUser(@RequestBody SuperUser superuser) {
		return service.saveSuperUser(superuser);
	}

	@GetMapping("/getSuperUserByID/{id}")
	public SuperUser getSuperUserByID(@PathVariable int id) {
		return service.getSuperUserByID(id);
	}

	@PostMapping("/addFarmer")
	public Farmer addFarmer(@RequestBody Farmer farmer) {
		return service.saveFarmer(farmer);
	}
}
