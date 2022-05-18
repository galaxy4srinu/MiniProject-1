package in.ashokit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "CONTACT_DTLS")
@Data
public class Contact {

	@Id
	@GeneratedValue
	@Column(name="CONTACT_ID")
	private int cid;

	@Column(name = "CONTACT_NAME")
	private String name;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "PH_NO")
	private long phno;

	@Column(name = "ACTIVE_SW")
	private String activeSW;

}
