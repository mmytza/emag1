package emag.controller;

import java.io.Serializable;

import javax.faces.bean.*;

@SessionScoped
@ManagedBean(name = "productManagedBean")
public class ProductManagedBean implements Serializable{
	
	private static final long serialVersionUID = -3530883129712308246L;

	public String category() {
		return "category?faces-redirect=true";
	}
	
	public String specials() {
		return "specials?faces-redirect=true";
	}
	
	public String details() {
		return "details?faces-redirect=true";
	}

}
