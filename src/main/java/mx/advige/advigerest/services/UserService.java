package mx.advige.advigerest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.advige.advigerest.entities.User;
import mx.advige.advigerest.repositories.IUserRepository;

@Service
public class UserService {
	
	private IUserRepository userRepo;
	
	@Autowired
	public UserService(IUserRepository userRepo) {
		this.userRepo = userRepo;
	}
	
//	crear User
	public void crearUser(User user) {
		
		userRepo.save(user);
	}
	
//	actualizar user
	public void actualizarUser(User user) {
		userRepo.save(user);
	}
	
//	eliminar user
	public void eliminarUser(Long id) {
		userRepo.deleteById(id);
	}
	
	/**
	 * Listar los User
	 * */
	
	public List<User> listarUser(){
		return userRepo.findAll();
	}
	

	public List<User> listarPorStatus(Long status){
		return userRepo.findByStatus(status);
	}
	
	public List<User> listarPorKind(Long kind){
		return userRepo.findByStatus(kind);
	}
	
	public Optional<User> listarPorID(Long id){
		return userRepo.findById(id);
	}
	
	
}
