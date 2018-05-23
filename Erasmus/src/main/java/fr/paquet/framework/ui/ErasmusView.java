package fr.paquet.framework.ui;

import com.vaadin.navigator.View;
import com.vaadin.server.Resource;

public interface ErasmusView extends View {
	
	public String getCaption();
	public String getName();
	public Resource getIcon();

}
