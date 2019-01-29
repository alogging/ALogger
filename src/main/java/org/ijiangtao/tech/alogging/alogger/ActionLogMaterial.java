package org.ijiangtao.tech.alogging.alogger;

import java.util.Map;

public class ActionLogMaterial {

	private Map<Integer, Object> identificationMaterial;
	
	private Map<Integer, Object> originalMaterial;
	
	private Map<Integer, Object> revisedMaterial;
	
	private Map<Integer, Object> informationMaterial;

	public Map<Integer, Object> getIdentificationMaterial() {
		return identificationMaterial;
	}

	public void setIdentificationMaterial(Map<Integer, Object> identificationMaterial) {
		this.identificationMaterial = identificationMaterial;
	}

	public Map<Integer, Object> getOriginalMaterial() {
		return originalMaterial;
	}

	public void setOriginalMaterial(Map<Integer, Object> originalMaterial) {
		this.originalMaterial = originalMaterial;
	}

	public Map<Integer, Object> getRevisedMaterial() {
		return revisedMaterial;
	}

	public void setRevisedMaterial(Map<Integer, Object> revisedMaterial) {
		this.revisedMaterial = revisedMaterial;
	}

	public Map<Integer, Object> getInformationMaterial() {
		return informationMaterial;
	}

	public void setInformationMaterial(Map<Integer, Object> informationMaterial) {
		this.informationMaterial = informationMaterial;
	}

}
