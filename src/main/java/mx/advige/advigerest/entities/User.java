package mx.advige.advigerest.entities;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(columnDefinition = "varchar(255)")
	private String username;
	
	@Column(columnDefinition = "varchar(255)")
	private String email;
	
	@Column(columnDefinition = "varchar(255)")
	private String password;
	
	@Column(columnDefinition = "varchar(255)")
	private String name;
	
	@Column(columnDefinition = "varchar(255)")
	private String lastname;
	
	@Column(columnDefinition = "integer default 1")
	private Long kind;
	
	@Column(columnDefinition = "integer default 1")
	private Long status;
	
	@Column(columnDefinition = "timestamp default current_timestamp")
	private Date create_at;
	
	
	@OneToMany
	private List<Consulta> consultaList;
	
	
	public User() {

	}
	
	/**
	 * Getters & Setters */
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Long getKind() {
		return kind;
	}
	public void setKind(Long kind) {
		this.kind = kind;
	}
	public Long getStatus() {
		return status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}
	public Date getCreate_at() {
		return create_at;
	}
	public void setCreate_at(Date create_at) {
		this.create_at = create_at;
	}
	
		
	
	
}
