package org.ijiangtao.tech.alogging.alogger;

import java.util.Map;

public class ActionLogMaterialBuilder {

	public void build(ActionLogMaterial actionLogMaterial, Object... params) {
		for (int i = 0; i < params.length; i++) {
			putIfContainsKey(i, params,  actionLogMaterial.getIdentificationMaterial());
			putIfContainsKey(i, params, actionLogMaterial.getInformationMaterial());
			putIfContainsKey(i, params, actionLogMaterial.getOriginalMaterial());
			putIfContainsKey(i, params, actionLogMaterial.getRevisedMaterial());
		}
	}

	private void putIfContainsKey(Integer i, Object[] params, Map<Integer, Object> materialMap) {
		if (materialMap.containsKey(i)) {
			materialMap.put(i, params[i]);
		}
	}

}
