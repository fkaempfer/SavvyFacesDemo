package org.savvyfaces.savyfacesdemo;

import java.util.Arrays;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

/**
 *
 * @author frederick
 */
@ApplicationScoped
@ManagedBean
public class DemoBean {

    public List<String> getList() {
        return Arrays.asList("123", "23123123", "awedwqeqwe", "asesae", "asdd");
    }

    public List<String> autocomplete(String string) {
        return Arrays.asList(string + "0", string + "1", string + "2", string + "3", string + "4", string + "5");
    }

    public void addMessages() {
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage("myForm:textField", new FacesMessage(FacesMessage.SEVERITY_INFO, "Info message", "info Message"));
        //context.addMessage("myForm:textField", Messages.successMessage(new FacesMessage(FacesMessage.SEVERITY_INFO, "Success message", "success Message")));
        context.addMessage("myForm:textField", new FacesMessage(FacesMessage.SEVERITY_WARN, "Warn message", "Warn Message"));
        context.addMessage("myForm:moie", new FacesMessage(FacesMessage.SEVERITY_ERROR, "error message", "error Message"));
        context.addMessage("myForm:textField", new FacesMessage(FacesMessage.SEVERITY_FATAL, "fatal message", "fatal Message"));
    }
}
