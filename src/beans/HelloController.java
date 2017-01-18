package beans;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.*;
public class HelloController extends Action{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,HttpServletRequest  req, HttpServletResponse res) throws Exception{
		String name = req.getParameter("name");
		
		req.setAttribute("res","hello..."+name);
		return mapping.findForward("success");
	}
}
