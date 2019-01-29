package org.ijiangtao.tech.alogging.alogger;

/**
 * 
    *   在切面通知后调用此方法，构造最终需要保存的产品对象
 * 
 * @author ijiangtao
 *
 * @param <T>
 */
public class ActionLogDirector<T> {

	private T t;
	
	private ActionLogProductBuilder<T> builder;
	
	private ActionLogActor<T> actor;

	// 私有无惨构造器
	@SuppressWarnings("unused")
	private ActionLogDirector() {
	}

	public ActionLogDirector(T t, ActionLogProductBuilder<T> builder, ActionLogActor<T> actor) {
		super();
		this.t = t;
		this.builder = builder;
		this.actor = actor;
	}



	public void construct(ActionLogMaterial meActionLogMaterial) {

		builder.buildIdentificationPart(t, meActionLogMaterial.getIdentificationMaterial());

		builder.buildInformationPart(t, meActionLogMaterial.getInformationMaterial());

		builder.buildOriginalPart(t, meActionLogMaterial.getOriginalMaterial());

		builder.buildRevisedPart(t, meActionLogMaterial.getRevisedMaterial());

		actor.act(t);
		
	}

}
