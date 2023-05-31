/**
 * 
 */
package um.docum.rest.model;

import java.io.Serializable;
import java.time.OffsetDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author daniel
 *
 */
@Data
@Entity
@Table(name = "users")
@EqualsAndHashCode(callSuper=false)
public class User extends Auditable implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7230006596380900355L;

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId;

	private String name;
	private String email;
	private String password;
	private String rememberToken;
	private OffsetDateTime lastLogin;
	private Byte activo;

}
