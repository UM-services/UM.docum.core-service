/**
 * 
 */
package um.docum.rest.exception;

/**
 * @author daniel
 *
 */
public class UserNotFoundException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4645117483687227530L;

	public UserNotFoundException(Integer id) {
		super("Cannot find User " + id);
	}

}
