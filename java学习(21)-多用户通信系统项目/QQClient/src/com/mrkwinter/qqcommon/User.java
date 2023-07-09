package com.mrkwinter.qqcommon;

import java.io.Serializable;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private String userId;
    private String passWd;

    public User(String userId, String passWd) {
        this.userId = userId;
        this.passWd = passWd;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassWd() {
        return passWd;
    }

    public void setPassWd(String passWd) {
        this.passWd = passWd;
    }
}
