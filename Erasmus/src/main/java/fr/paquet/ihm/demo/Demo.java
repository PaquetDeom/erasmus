package fr.paquet.ihm.demo;

import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.ExternalResource;
import com.vaadin.server.Resource;

import com.vaadin.ui.BrowserFrame;

import com.vaadin.ui.Panel;

import com.vaadin.ui.VerticalLayout;

import fr.paquet.framework.ui.ErasmusView;

public class Demo extends Panel implements ErasmusView {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructeur<br/>
	 */
	public Demo() {

		super();

		BrowserFrame demo = new BrowserFrame("erasmus",
				new ExternalResource("https://nathanaelpaquet-de.wixsite.com/erasmus"));
		demo.setSizeFull();

		VerticalLayout l = new VerticalLayout();
		l.addComponent(demo);
		l.setSizeFull();

		setCaption("Demo");
		setContent(l);
		setSizeFull();

	}

	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Demo";
	}

	@Override
	public String getCaption() {
		return "Demo";
	}

	@Override
	public Resource getIcon() {
		// TODO Auto-generated method stub
		return null;
	}

}
