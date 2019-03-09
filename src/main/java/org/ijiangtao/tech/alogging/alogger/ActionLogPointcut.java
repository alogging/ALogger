package net.ijiangtao.tech.alogging.alogger;

/**
   *  在需要保存日志的地方，将保存日志的原始数据传入此方法即可
 * 
 * @author ijiangtao
 */
public class ActionLogPointcut {

	private ActionLogMaterialBuilder actionLogMaterialBuilder;
	
	private ActionLogMaterial actionLogMaterial;
	
	//私有无参构造器
	@SuppressWarnings("unused")
	private ActionLogPointcut() {
	}

	public ActionLogPointcut(ActionLogMaterialBuilder actionLogMaterialBuilder, ActionLogMaterial actionLogMaterial) {
		super();
		this.actionLogMaterialBuilder = actionLogMaterialBuilder;
		this.actionLogMaterial = actionLogMaterial;
	}

	public ActionLogMaterial advice(Object... params) {
		actionLogMaterialBuilder.build(actionLogMaterial, params);
		return actionLogMaterial;
	}

}
