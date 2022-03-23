package org.springframework.samples.iTeaching.model.businessrulesexceptions;

import lombok.Getter;

@Getter
public class ImpossibleDiseaseException extends Exception {
	
	private String disease;
	private String petType;
	
	public ImpossibleDiseaseException(String disease, String petType) {
		super("According to our vademencum a "+petType+" cannot develop "+disease);
		this.disease=disease;
		this.petType=petType;
	}
}