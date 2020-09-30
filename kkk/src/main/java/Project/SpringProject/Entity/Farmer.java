package Project.SpringProject.Entity;

import java.util.Optional;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Farmer_Table")

public class Farmer {
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private Integer password;

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Integer getPassword() {
		return password;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPassword(Integer password) {
		this.password = password;
	}

}
