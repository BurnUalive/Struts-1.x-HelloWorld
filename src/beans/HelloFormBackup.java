package beans;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.*;
import javax.servlet.http.*;

import org.apache.struts.action.ActionMapping;

import org.apache.struts.action.Action;

import org.apache.struts.action.ActionForm;

import org.apache.struts.action.ActionForward;
public class HelloFormBackup extends ActionForm {
	private String name;
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	@Override
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest req){
		ActionErrors ae = new ActionErrors();
		if(name.equals("")){
			ae.add("name",new ActionMessage("msg"));
		}
		return ae;
	}
}
