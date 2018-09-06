package com.wei.q.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Locale;

public class SetLocalAction extends ActionSupport {
    private String language;
    private String location;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String execute() throws Exception {
        if (null != language && null != location) {
            ActionContext.getContext().setLocale(new Locale(language,location));
        } else {
            ActionContext.getContext().setLocale(this.getLocale());
        }
        return SUCCESS;
    }
}
