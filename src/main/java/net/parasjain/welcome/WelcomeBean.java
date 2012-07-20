package net.parasjain.welcome;


import javax.faces.bean.ManagedBean;

/**
 * @author parasjain
 */
@ManagedBean(name = "welcome", eager = true)
public class WelcomeBean {
    public WelcomeBean() {
        System.out.println("WelcomeBean instantiated");
    }

    public String getMessage() {
        return "I'm alive!";
    }
}
