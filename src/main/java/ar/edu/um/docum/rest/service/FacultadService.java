/**
 * 
 */
package ar.edu.um.docum.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.um.docum.rest.model.Facultad;
import ar.edu.um.docum.rest.repository.IFacultadRepository;

/**
 * @author daniel
 *
 */
@Service
public class FacultadService {
	@Autowired
	private IFacultadRepository repository;

	public List<Facultad> findAll() {
		return repository.findAll();
	}
}
