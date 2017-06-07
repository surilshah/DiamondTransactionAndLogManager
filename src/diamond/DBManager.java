package diamond;

import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DBManager {
    
    private Connection con;
    private Statement st;
    private ResultSet rs;
    
    public DBManager(){
        try{
            Class.forName("org.sqlite.JDBC");
            con=DriverManager.getConnection("jdbc:sqlite:diamond");
            st=con.createStatement();
            
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
    public void close(){
        if(rs!=null){
            try{
                rs.close();
            }catch(SQLException e){
                
            }
        }
        if(st!=null){
            try{
                st.close();
            }catch(SQLException e){
                
            }
        }        
        if(con!=null){
            try{
                con.close();
            }catch(SQLException e){
                
            }
        }
    }
    
    public Vector<Vector<String>> getData(String query){
        Vector<Vector<String>> s=new Vector<Vector<String>>();
        int i=0;
        try{
            rs=st.executeQuery(query);
            while(rs.next()){
                s.add(new Vector<String>());
                for(int j=0;j<9;j++){
                    s.get(i).add(rs.getString(j+1));
                }
                i++;
            }
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        return s;
    }
    
    public Vector<Vector<String>> getDataReport(String query){
        Vector<Vector<String>> s=new Vector<Vector<String>>();
        int i=0;
        try{
            rs=st.executeQuery(query);
            while(rs.next()){
                s.add(new Vector<String>());
                for(int j=0;j<3;j++){
                    s.get(i).add(rs.getString(j+1));
                }
                i++;
            }
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        return s;
    }
    
    public void addData(String s){
        try {
            st.executeUpdate(s);
        } catch (SQLException ex) {
            Logger.getLogger(DBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean isPresent(String packno,String lotno){
        try{
            String query="select * from main";
            rs=st.executeQuery(query);
            while(rs.next()){
                String n=rs.getString("packno");
                String p=rs.getString("lotno");
                if(packno.equals(n)&&lotno.equals(p))
                    return true;
            }
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        return false;
    }
    
    public boolean login(String uname,String passwd){
        try{
            String query="select * from login";
            rs=st.executeQuery(query);
            while(rs.next()){
                String n=rs.getString("user");
                String p=rs.getString("psswd");
                if(uname.equals(n)&&passwd.equals(p))
                    return true;
            }
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        return false;
    }
    
    String value(String query){
        String n="";
        try{
            rs=st.executeQuery(query);
            while(rs.next()){
                n=rs.getString("c");
            }
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        return n;
    }
}