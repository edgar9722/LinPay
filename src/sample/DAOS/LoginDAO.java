package sample.DAOS;

import sample.Complements.Mssql;

import java.sql.*;

public class LoginDAO {

    public static void loginV(){
        String query = "{  call loginUser(?,?) }";
        try(   Connection con = Mssql.getConnection();
               CallableStatement pstmt = con.prepareCall(query)
                ){
            pstmt.registerOutParameter(3,Types.VARCHAR);
            pstmt.setString(1, "JuanL");
            pstmt.setString(2, "1234567890");
           // pstmt.execute();
            ResultSet rs = pstmt.executeQuery();
            System.out.println(rs.getString(3));
            //String val = pstmt.getString(1);
           // ResultSet rs = pstmt.executeQuery();


            //while (rs.next()) {

               // System.out.println(rs.getString());
            //}
        } catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
    }



}
