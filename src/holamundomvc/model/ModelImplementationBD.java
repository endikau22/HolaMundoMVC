/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundomvc.model;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class ModelImplementationBD implements Model {
    private static final Logger LOGGER = Logger.getLogger("holamundomvc.ModelImplementationBD");

    private Connection con;
    private Statement stmt;
    private  ResultSet rs;
    private ResourceBundle rb = ResourceBundle.getBundle("almacen.ficheroSaludo");
    

    //Método que nos conecta con la BD
    public void openConnection()  {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Properties connectionProps = new Properties();
            connectionProps.put("user", rb.getString("DBUser"));
            connectionProps.put("password", rb.getString("DBPass"));
            con =  DriverManager.getConnection(rb.getString("Conn"), connectionProps);

        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("ERROR para conectar con la BD");
        }

    }

    //Método que nos desconecta con la BD
    public void closeConnection() throws SQLException {
        con.close();
    }

    @Override
    public String getGreeting() {
    String mensaje=null;
            try {
                openConnection();
                stmt = (Statement) con.createStatement();
                String query = "SELECT * FROM saludo";
               rs = stmt.executeQuery(query);
                if(rs.next()){
                    mensaje= rs.getString(1);
                   rs.close();
                   this.closeConnection();
                }
            } catch (SQLException ex) {
                 LOGGER.severe(ex.getMessage());
            }
          //  LOGGER.info(mensaje);
            return mensaje;
           
            }
    

}
