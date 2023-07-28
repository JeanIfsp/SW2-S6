package ifsp.edu.br.sw2s6.domain.model;

public enum Gender {
	MASCULINO("Masculino"),
	FEMININO("Femino"),
	OUTRO("Outro"),
	PREFIRO_NAO_DIZER("Prefiro não dizer");
	
	private String description;
	
	private Gender(String description) {
		this.description = description;
	}
	
	private String getDescription() {
		return description;
	}

}
