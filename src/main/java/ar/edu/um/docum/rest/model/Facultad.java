/**
 * 
 */
package ar.edu.um.docum.rest.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * @author daniel
 *
 */
@Data
@Entity
@Table
public class Facultad implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4773840701558476242L;
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer facultadId;
	
	@Column(name = "facultad")
	private String nombre;

}
