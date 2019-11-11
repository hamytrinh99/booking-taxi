/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Dell
 */
public class Account {
    private String id;
    private String username;
    private String password;
    private int typeofAccount;

    public Account() {
    }

    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Account(String id, String username, String password, int typeofAccount) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.typeofAccount = typeofAccount;
    }
    
    

    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public int getTypeofAccount() {
        return typeofAccount;
    }

    public void setTypeofAccount(int typeofAccount) {
        this.typeofAccount = typeofAccount;
    }
    
  

   
    
    
    
}
