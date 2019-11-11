/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import model.Account;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dell
 */
public class AccountDAO {

    private DBContext DB;
    private Connection con;

    public AccountDAO() {
        DB = new DBContext();
        try {
            con = DB.connection;
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public Account getAccount(String username, String password) {
        Account a = new Account();
        String sql = "select * from [Account] \n"
                + "where username = ? and [password] = ? ";
        try {
            PreparedStatement psmt = con.prepareStatement(sql);
            psmt.setString(1, username);
            psmt.setString(2, password);
            ResultSet rs = psmt.executeQuery();
            if (rs.next()) {
                a.setId(rs.getString(1));
                a.setUsername(rs.getString(2));
                a.setPassword(rs.getString(3));
                a.setTypeofAccount(rs.getInt(4));     
                return a;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public boolean exsitedAccount(String username){    
        String sql = "select * from account where username =?";
        try{        
            PreparedStatement psmt = con.prepareStatement(sql);
            psmt.setString(1, username);
            ResultSet rs = psmt.executeQuery();
            if(rs.next())
                return true;
            } catch (SQLException e) {
                System.out.println(e);
            }
            return false;
        }
    
    //
    public void insert(Account a){
         String sql="insert into Account values(5,?,?,0);";
         try{
            PreparedStatement st=con.prepareStatement(sql);
            st.setString(1, a.getUsername());
            st.setString(2, a.getPassword());
            st.executeUpdate();
         }catch(SQLException e){
             System.out.println(e);
         }
     }
    
    //
    public void update(Account a){
        String sql = "update Account set password=?,"
                + "where username=?";
        try{
            PreparedStatement psmt = con.prepareStatement(sql);
            psmt.setString(1,a.getPassword());
            psmt.setString(3, a.getUsername());
            psmt.executeUpdate();
            } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
}
