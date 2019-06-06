package sample.DAOS;

import sample.Complements.Mssql;

import java.sql.*;

public class LoginDAO {
   // static Connection con = Mssql.getConn();
    static String query;
    public static void loginV() {
        Connection con = Mssql.getConn();
        query = "exec loginUser 'JuanL','1234567890'";
        try (
                CallableStatement pstmt = con.prepareCall(query)
        ) {
            //   pstmt.registerOutParameter(3,Types.VARCHAR);
            // pstmt.setString(1, "JuanL");
            //  pstmt.setString(2, "1234567890");
            pstmt.execute();
            String rs = pstmt.getString(query);
            //ResultSet rs = pstmt.executeQuery();
            // System.out.println(rs.getString(3));
            //String val = pstmt.getString(1);
            // ResultSet rs = pstmt.executeQuery();


            //while (rs.next()) {

            // System.out.println(rs.getString());
            //}
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }
        public static void prueba(){
            Connection con = Mssql.getConn();
         //   String query2 = "SELECT * FROM usuario";
            try {
                String query = "SELECT * FROM pruebas";
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(query);
                while(rs.next()) {
                    rs.getString("palabra");
                    System.out.println(rs);
                }
                rs.close();
                st.close();

            } catch (SQLException ex) {
                ex.printStackTrace();
                System.out.println("Error al recuperar información...");
            }




    }





}

