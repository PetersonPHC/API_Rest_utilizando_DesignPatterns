package dio.designpatterns.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pokemon {

	@Id
	@Column(name = "nome")
	private String name;
	@Column(name = "altura")
	private int height;
	@Column(name = "peso")
	private int weight;

	@ElementCollection
	private List<Types> types;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public List<Types> getTypes() {
		return types;
	}

	public void setTypes(List<Types> types) {
		this.types = types;
	}

	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		String caracteristicas = "Pokemon: " + name +
								"\nTamanho: " + height +
								"\nPeso: " + weight +
								"\nTipos: ";

		buffer.append(caracteristicas);
		for (Types tipo : types) {
			buffer.append("\n   - " + tipo.getType().getName());
		}
		return buffer.toString();
	}

}
