package fr.paquet.framework.ui;

import com.vaadin.data.fieldgroup.BeanFieldGroup;
import fr.paquet.framework.ErasmusItem;

public class ErasmusBeanFieldGroup extends BeanFieldGroup<ErasmusItem> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ErasmusBeanFieldGroup(Class<? extends ErasmusItem> beanType) {
		super((Class<ErasmusItem>) beanType);
		setFieldFactory(new ErasmusFieldGroupFieldFactory());
	}
}
