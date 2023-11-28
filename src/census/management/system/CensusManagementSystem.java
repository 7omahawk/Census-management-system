/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package census.management.system;

/**
 *
 * @author User
 */
public class CensusManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
/*String RegID = jTextField2.getText();
          
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/censusmanagement", "root", "");
            //try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/censusmanagement", "root", "")){
            //String sql = "select * from addinformation";
            Statement st = conn.createStatement();
            //ResultSet rs = st.executeQuery("select * from addinformation where Reg Id = " + RegId+"'");
            ResultSet rs = st.executeQuery("select * from `addinformation` WHERE RegID = " + RegID+"'");

            if (!rs.first()) {
                jLabel3.setVisible(true);
            } 
            else{
                jLabel3.setVisible(false);
                jTextField2.setEditable(false);
                flag = 1;
            }
          //}
        }
        catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Connection Error");
        }
        /*String RegID = jTextField2.getText();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/censusmanagement", "root", "")) {
                Statement st = conn.createStatement();
                String sql = "DELETE FROM `addinformation` WHERE RegID=" + RegID;
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Selected Registration Number's Information Successfully Deleted");
            }
            jTextField2.setText("");
        } 
        catch (HeadlessException | ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null,"Error!!!!");
        }
        /*try{ Class.forName("com.mysql.jdbc.Driver");
            try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/censusmanagement","root","")) {
                Statement st= conn.createStatement();
                String sql="select * from `addinformation` WHERE Reg ID="+RegId;
                PreparedStatement pstmt=conn.prepareStatement(sql);
                pstmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "data deleted successfully");
            }
                jTextField1.setText("");
        }
        catch(HeadlessException | ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
       }*/
/*try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/censusmanagement", "root", "");
            Statement st = conn.createStatement();
            String sql = "select * from addinformation";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            DefaultTableModel tm = (DefaultTableModel) jTable1.getModel();
            tm.setRowCount(0);
            while (rs.next()) {
                //Object o[] = {rs.getInt("RegID"), rs.getString("Name"), rs.getString("FatherName")};
                Object o[] = {rs.getInt("RegID"), rs.getString("Name"), rs.getString("FatherName"),rs.getString("DateofBirth"), rs.getString("Age"),rs.getString("Gender"), rs.getString("BloodGroup"), rs.getString("Address"), rs.getString("ContactNumber"),rs.getString("Nationality")};
                tm.addRow(o);
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Showing Information Isn't In Corect Format");
        }*/