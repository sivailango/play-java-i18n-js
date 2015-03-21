package controllers;

import play.*;
import play.mvc.*;
import jsmessages.JsMessages;


import views.html.*;

public class Application extends Controller {
	
	final static JsMessages messages = JsMessages.create(Play.application());

    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }
    
    public static Result jsMessages() {
        return ok(messages.generate("window.Messages"));
    }

}
