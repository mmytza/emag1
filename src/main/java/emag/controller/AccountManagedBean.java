package emag.controller;

import java.io.Serializable;

import javax.faces.bean.*;

@SessionScoped
@ManagedBean(name = "accountManagedBean")
public class AccountManagedBean implements Serializable {
	
	private static final long serialVersionUID = -4249219024345720724L;

	public String myaccount() {
		return "myaccount?faces-redirect=true";
	}
	
	public String register() {
		return "register?faces-redirect=true";
	}

}
