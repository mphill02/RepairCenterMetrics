import java.sql.*;
import java.text.SimpleDateFormat;

public class MetricDAO {

	public MetricDAO() {
		// TODO Auto-generated constructor stub
	}

	public Metric getRCUploads() throws Exception {
		Connection conn;
	    PreparedStatement stmt = null;
	    String query = "";
	    SimpleDateFormat dateformat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

	    try {
			conn =  DriverManager.getConnection("jdbc:oracle:thin:@rdwp.mitchell.com:1521:rdwp", "mp99899", "P1tWhCd5");
		}
		catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
			throw e;
		}
		System.out.println("Got connection");
		
		query = "select count(*) as uploads from base.base_app_log " +
				"where transaction_type = ? " +
				"and process_dt >= ? " +
				"and process_dt < ? " +    
				"and mitchell_user_id in ('OA3145361','OA314996','OA3133741','OA2761829','OA318377','OA344860','OA318462','OA313036','OA321992', " +
				"'OA323948','HT353220','HT324441','HT974118','HT324855','HT337145','HT323811','HT325993','HT344825','HT336437','HT336010','HT346424', " +
				"'HT329062','HT325210','HT342606','HT324076','HT324538','HT341267','HT327646','HT328653','HT331960','HT333521','HT342434', " + 
				"'HT329721','HT339143','HT333144','358422','HT324818','HT334106','HT324517','10967','HT328059','HT366008','HT330712','HT362506', " + 
				"'2761829','1936062','M95270640','2751283','2683177','2175003','1731329','430701','1731807','266783','M95526649','M95345656', " + 
				"'3145361','2481282','1925011','2761260','2760672','2752477','13025','266703','264982','M95273670','1342831','2029002','1786996')";
		try {
	        stmt = conn.prepareStatement(query);
	        stmt.setString(1, "167900");
	        stmt.setTimestamp(2, new java.sql.Timestamp(dateformat.parse("10/28/2015 00:00:01").getTime()));
	        stmt.setTimestamp(3, new java.sql.Timestamp(dateformat.parse("10/28/2015 23:59:59").getTime()));
	        ResultSet rs = stmt.executeQuery();

	        while (rs.next()) {
	        	System.out.println("UPLOADS: " + rs.getLong("UPLOADS"));
	        }
	        rs.close();
	    } catch (SQLException e ) {
//	        JDBCTutorialUtilities.printSQLException(e);
	    } finally {

	    }
	
        if (stmt != null) { stmt.close(); }
        conn.close();
        return new Metric();
	}
}
