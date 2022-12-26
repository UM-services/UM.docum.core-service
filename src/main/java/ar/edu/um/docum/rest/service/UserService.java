/**
 * 
 */
package ar.edu.um.docum.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.um.docum.rest.exception.UserNotFoundException;
import ar.edu.um.docum.rest.model.User;
import ar.edu.um.docum.rest.repository.IUserRepository;

/**
 * @author daniel
 *
 */
@Service
public class UserService {
	@Autowired
	private IUserRepository repository;
	
	public User findById(Integer id) {
		return repository.findById(id).orElseThrow(() -> new UserNotFoundException(id));
	}
}
