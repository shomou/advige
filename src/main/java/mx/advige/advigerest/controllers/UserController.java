package mx.advige.advigerest.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.advige.advigerest.entities.User;
import mx.advige.advigerest.services.UserService;


@RestController
@RequestMapping("/api/usuarios")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	/* Crear Usuario */
	@PostMapping(value= "/create", headers = "Accept=application/json")
	public void crearUsuario(@RequestBody User user){
		Long status = 1L;
		Long kind = 1L;
		user.setUsername(user.getEmail());
		user.setCreate_at(new Date());
		user.setStatus(status);
		user.setKind(kind);
		userService.crearUser(user);
	}
	
	
	@GetMapping(value = "listarUsuarios", headers = "Accept=application/json")
	public List<User> obtenerUsuarios(){
		return userService.listarUser();
	}
	
	
}
