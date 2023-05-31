/**
 * 
 */
package um.docum.rest.controller.facade;

import java.time.OffsetDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import um.docum.rest.service.facade.ChequeService;

/**
 * @author daniel
 *
 */
@RestController
@RequestMapping("/cheque")
public class ChequeController {
	@Autowired
	private ChequeService service;

	@GetMapping("/add")
	public ResponseEntity<Void> add(@RequestParam Long numeroCheque, @RequestParam Integer asuntoId,
			@RequestParam String resumenDocumental, @RequestParam String proveedor, @RequestParam String emailProveedor,
			@RequestParam Integer usuarioId, @RequestParam @DateTimeFormat(iso = ISO.DATE) OffsetDateTime fechaCheque,
			@RequestParam String concepto, @RequestParam String detalles, @RequestParam String empresa) {
		service.add(numeroCheque, asuntoId, resumenDocumental, proveedor, emailProveedor, usuarioId, fechaCheque,
				concepto, detalles, empresa);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
}
