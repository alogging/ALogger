package org.ijiangtao.tech.alogging.alogger;

import java.util.Map;

public interface ActionLogProductBuilder<T> {

	void buildOriginalPart(T t, Map<Integer, Object> originalMaterial);

	void buildRevisedPart(T t, Map<Integer, Object> revisedMaterial);

	void buildIdentificationPart(T t, Map<Integer, Object> identificationMaterial);

	void buildInformationPart(T t, Map<Integer, Object> informationMaterial);
	
}
