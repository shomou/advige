package mx.advige.advigerest.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import mx.advige.advigerest.entities.User;


public interface IUserRepository extends JpaRepository<User, Long>{
	
	
	List<User> findByStatus(Long status);
	List<User> findByKind(Long kind);
	
	
}
