package emag.controller;

import java.io.Serializable;

import javax.faces.bean.*;

@SessionScoped
@ManagedBean(name = "homeManagedBean")
public class HomeManagedBean implements Serializable {
	
	private static final long serialVersionUID = -7183065600881105643L;
	
	private String title;
	
	public String index() {
		this.title = "Home";
		return "index?faces-redirect=true";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
