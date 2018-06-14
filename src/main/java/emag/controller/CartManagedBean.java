package emag.controller;

import java.io.Serializable;

import javax.faces.bean.*;

@SessionScoped
@ManagedBean(name = "cartManagedBean")
public class CartManagedBean implements Serializable{

	private static final long serialVersionUID = -3562937670925482085L;

	public String index() {
		return "cart?faces-redirect=true";
	}

}
