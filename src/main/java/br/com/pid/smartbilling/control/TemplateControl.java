package br.com.pid.smartbilling.control;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Named;

import org.primefaces.extensions.model.layout.LayoutOptions;

@Named
@ViewScoped
public class TemplateControl implements Serializable{

	private static final long serialVersionUID = 20120925L;  

	private String stateOne;  
	private String stateTwo;  
	private boolean layoutOneShown = true;  

	private LayoutOptions layoutOptionsOne;  

	@PostConstruct  
	protected void initialize() {  
		// 1. set options for first layout  
		layoutOptionsOne = new LayoutOptions();  

		// options for all panes (center and west)  
		LayoutOptions panes = new LayoutOptions();  
		panes.addOption("slidable", false);  
		panes.addOption("resizeWhileDragging", true);  
		layoutOptionsOne.setPanesOptions(panes);  
		
		// north pane  
        LayoutOptions north = new LayoutOptions();  
        north.addOption("size", 80);  
        north.addOption("spacing_open", 0);  
        layoutOptionsOne.setNorthOptions(north);

		// options for west pane  
		LayoutOptions west = new LayoutOptions();  
		west.addOption("size", 250);  
		west.addOption("minSize", 40);  
		west.addOption("maxSize", 300);  
		layoutOptionsOne.setWestOptions(west);  

	}  

	public String getStateOne() {  
		return stateOne;  
	}  

	public void setStateOne(String stateOne) {  
		this.stateOne = stateOne;  
	}  

	public String getStateTwo() {  
		return stateTwo;  
	}  

	public void setStateTwo(String stateTwo) {  
		this.stateTwo = stateTwo;  
	}  

	public void toogleLayout(ActionEvent event) {  
		layoutOneShown = !layoutOneShown;  
	}  

	public boolean isLayoutOneShown() {  
		return layoutOneShown;  
	}  

	public LayoutOptions getLayoutOptionsOne() {  
		return layoutOptionsOne;  
	}  

}  