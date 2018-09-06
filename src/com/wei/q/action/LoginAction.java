package com.wei.q.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.wei.q.bean.UserBean;
import com.wei.q.domain.User;

public class LoginAction extends ActionSupport {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String execute() throws Exception {
        return super.execute();
    }

    public String login() throws Exception {
//        UserBean userBean = new UserBean();
//        User user = userBean.query(username, password);
//        if (user != null) {
//            ActionContext.getContext().getSession().put("username", user.getUserName());
//        } else {
//            if (userBean.query(username)) {
//                addActionError(getText("username_not_exit"));
//            } else {
//                addActionError(getText("password_wrong"));
//            }
//            return INPUT;
//        }
        return SUCCESS;
    }

    public String register() throws Exception {
        return SUCCESS;
    }
}
