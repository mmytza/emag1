package emag.controller;

import java.io.Serializable;

import javax.faces.bean.*;

@SessionScoped
@ManagedBean(name = "aboutUsManagedBean")
public class AboutUsManagedBean implements Serializable {
	
	private static final long serialVersionUID = -5414070262320017098L;

	public String index() {
		return "aboutus?faces-redirect=true";
	}

}
