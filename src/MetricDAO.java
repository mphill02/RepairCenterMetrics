import java.sql.*;

public class MetricDAO {

	public MetricDAO() {
		// TODO Auto-generated constructor stub
	}

	public Metric getRCUploads() throws Exception {
		Connection conn;
	    Statement stmt = null;
	    String query = "";
		try {
			conn =  DriverManager.getConnection("jdbc:oracle:thin:@rdwp.mitchell.com:1521:rdwp", "mp99899", "P1tWhCd5");
		}
		catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
			throw e;
		}
		System.out.println("Got connection");
	/*	
	    try {
	        stmt = conn.createStatement();
	        ResultSet rs = stmt.executeQuery(query);
	        while (rs.next()) {
	            String coffeeName = rs.getString("COF_NAME");
	            int supplierID = rs.getInt("SUP_ID");
	            float price = rs.getFloat("PRICE");
	            int sales = rs.getInt("SALES");
	            int total = rs.getInt("TOTAL");
	            System.out.println(coffeeName + "\t" + supplierID +
	                               "\t" + price + "\t" + sales +
	                               "\t" + total);
	        }
	        rs.close();
	    } catch (SQLException e ) {
//	        JDBCTutorialUtilities.printSQLException(e);
	    } finally {

	    }
	*/
        if (stmt != null) { stmt.close(); }
        conn.close();
        return new Metric();
	}
}
