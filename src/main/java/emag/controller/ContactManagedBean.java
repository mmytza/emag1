package emag.controller;

import java.io.Serializable;

import javax.faces.bean.*;

@SessionScoped
@ManagedBean(name = "contactManagedBean")
public class ContactManagedBean implements Serializable {

	private static final long serialVersionUID = 8026786747272205090L;

	public String index() {
		return "contactus?faces-redirect=true";
	}

}
