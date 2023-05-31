/**
 * 
 */
package um.docum.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import um.docum.rest.model.User;

/**
 * @author daniel
 *
 */
@Repository
public interface IUserRepository extends JpaRepository<User, Integer>{

}
