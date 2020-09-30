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
@Table(name = "SuperUser_Table")

public class SuperUser {
	@Id
	@GeneratedValue
	private Integer superUserId;
	private String superUserName;
	private Integer superUserPassword;
	private Integer superUserContact;

	public Integer getSuperUserId() {
		return superUserId;
	}

	public void setSuperUserId(Integer superUserId) {
		this.superUserId = superUserId;
	}

	public String getSuperUserName() {
		return superUserName;
	}

	public void setSuperUserName(String superUserName) {
		this.superUserName = superUserName;
	}

	public Integer getSuperUserPassword() {
		return superUserPassword;
	}

	public void setSuperUserPassword(Integer superUserPassword) {
		this.superUserPassword = superUserPassword;
	}

	public Integer getSuperUserContact() {
		return superUserContact;
	}

	public void setSuperUserContact(Integer superUserContact) {
		this.superUserContact = superUserContact;
	}

}
