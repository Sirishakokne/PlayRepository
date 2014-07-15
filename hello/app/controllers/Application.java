package controllers;



import model.User;
import play.*;
import play.data.Form;
import play.mvc.*;

import views.html.*;
import views.html.helper.form;

public class Application extends Controller {
	
	final static Form<User> userform=form(User.class);

    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }

}
