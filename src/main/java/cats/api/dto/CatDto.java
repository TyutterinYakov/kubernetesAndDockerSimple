package cats.api.dto;

import java.time.LocalDate;

public class CatDto {

	private String name;
	private LocalDate birthDay;
	
	public CatDto(String name, LocalDate birthDay) {
		super();
		this.name = name;
		this.birthDay = birthDay;
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
	
	
}
