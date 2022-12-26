/**
 * 
 */
package ar.edu.um.docum.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.edu.um.docum.rest.model.Facultad;

/**
 * @author daniel
 *
 */
@Repository
public interface IFacultadRepository extends JpaRepository<Facultad, Integer> {

}
