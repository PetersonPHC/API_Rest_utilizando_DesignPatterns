package dio.designpatterns.model;

import javax.persistence.Embeddable;

@Embeddable
public class Type {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
