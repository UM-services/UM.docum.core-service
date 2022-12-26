/**
 * 
 */
package ar.edu.um.docum.rest.service.facade;

import java.time.OffsetDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.um.docum.rest.model.User;
import ar.edu.um.docum.rest.service.UserService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

/**
 * @author daniel
 *
 */
@Service
public class ChequeService {
	@PersistenceContext
	private EntityManager entityManager;
	
	@Autowired
	private UserService userService;

	@Transactional
	public void add(Long numeroCheque, Integer asuntoId, String resumenDocumental, String proveedor, String emailProveedor, Integer usuarioId, OffsetDateTime fechaCheque, String concepto, String detalles, String empresa) {
		User user = userService.findById(usuarioId);
		entityManager.createNativeQuery("CALL sp_cheque_insertar(" + 
							numeroCheque + ", " +
							asuntoId + ", " + 
							"\"" + resumenDocumental + "\", " + 
							"'{" +
							"\"proveedor\":\"" + proveedor + "\", " + 
							"\"email_proveedor\":\"" + emailProveedor + "\", " + 
							"\"usuario_generador\":\"" + user.getName() + "\", " + 
							"\"email_usuario_generador\":\"" + user.getEmail() + "\", " + 
							"\"numero\":\"" + numeroCheque + "\", " + 
							"\"fecha\":\"" + fechaCheque + "\", " + 
							"\"concepto\":\"" + concepto + "\", " + 
							"\"detalles\":\"" + detalles + "\", " + 
							"\"empresa\":\"" + empresa + "\""
							+ "}', " + 
							usuarioId +
							");").executeUpdate();
	}
}
