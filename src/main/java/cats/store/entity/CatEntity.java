package cats.store.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="cat")
public class CatEntity {

	@Id
	private String id = UUID.randomUUID().toString();
	private String name;
	private LocalDate birthDay;
	private LocalDateTime createdAt = LocalDateTime.now();
	
	public CatEntity() {
		super();
	}
	public CatEntity(String name, LocalDate birthDay) {
		super();
		this.name = name;
		this.birthDay = birthDay;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(LocalDate birthDay) {
		this.birthDay = birthDay;
	}
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	
	
	
}
