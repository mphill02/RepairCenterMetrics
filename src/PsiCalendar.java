import java.util.HashMap;
import java.util.Date;
import java.text.SimpleDateFormat;

public class PsiCalendar {

	public PsiCalendar() {
		// TODO Auto-generated constructor stub
	}

	public static final String PSI_2015_1_1 = "2015.1.1";
	public static final String PSI_2015_1_2 = "2015.1.1";
	public static final String PSI_2015_1_3 = "2015.1.1";
	public static final String PSI_2015_1_4 = "2015.1.1";
	public static final String PSI_2015_1_5 = "2015.1.1";
	public static final String PSI_2015_2_1 = "2015.1.1";
	public static final String PSI_2015_2_2 = "2015.1.1";
	public static final String PSI_2015_2_3 = "2015.1.1";
	public static final String PSI_2015_2_4 = "2015.1.1";
	public static final String PSI_2015_2_5 = "2015.1.1";
	public static final String PSI_2015_3_1 = "2015.1.1";
	public static final String PSI_2015_3_2 = "2015.1.1";
	public static final String PSI_2015_3_3 = "2015.1.1";
	public static final String PSI_2015_3_4 = "2015.1.1";
	public static final String PSI_2015_3_5 = "2015.1.1";
	public static final String PSI_2015_4_1 = "2015.1.1";
	public static final String PSI_2015_4_2 = "2015.1.1";
	public static final String PSI_2015_4_3 = "2015.1.1";
	public static final String PSI_2015_4_4 = "2015.1.1";
	public static final String PSI_2015_4_5 = "2015.1.1";
	public static final String PSI_2015_5_1 = "2015.1.1";
	public static final String PSI_2015_5_2 = "2015.1.1";
	public static final String PSI_2015_5_3 = "2015.1.1";
	public static final String PSI_2015_5_4 = "2015.1.1";
	public static final String PSI_2015_5_5 = "2015.1.1";
	public static final String PSI_2015_5_6 = "2015.1.1";
	
	public static final HashMap<String, Sprint> PSI_DATES_MAP = createMap();

	public static Sprint getSprint(String psiName) {
		return PSI_DATES_MAP.get(psiName);
	}
	
	public static HashMap<String, Sprint> createMap() {
		 SimpleDateFormat dateformat = new SimpleDateFormat("MM/dd/yyyy");
		          
		HashMap<String, Sprint> psiCalendar = new HashMap<String, Sprint>();
		try {
			psiCalendar.put(PSI_2015_1_1, new Sprint(PSI_2015_1_1, dateformat.parse("01/07/2015"), dateformat.parse("01/20/2015")));
			psiCalendar.put(PSI_2015_1_1, new Sprint(PSI_2015_1_2, dateformat.parse("01/21/2015"), dateformat.parse("02/03/2015")));
			psiCalendar.put(PSI_2015_1_1, new Sprint(PSI_2015_1_3, dateformat.parse("02/04/2015"), dateformat.parse("02/17/2015")));
			psiCalendar.put(PSI_2015_1_1, new Sprint(PSI_2015_1_4, dateformat.parse("02/18/2015"), dateformat.parse("03/03/2015")));
			psiCalendar.put(PSI_2015_1_1, new Sprint(PSI_2015_1_5, dateformat.parse("03/04/2015"), dateformat.parse("03/17/2015")));
			psiCalendar.put(PSI_2015_1_1, new Sprint(PSI_2015_2_1, dateformat.parse("03/18/2015"), dateformat.parse("03/31/2015")));
			psiCalendar.put(PSI_2015_1_1, new Sprint(PSI_2015_2_2, dateformat.parse("04/01/2015"), dateformat.parse("04/14/2015")));
			psiCalendar.put(PSI_2015_1_1, new Sprint(PSI_2015_2_3, dateformat.parse("04/15/2015"), dateformat.parse("04/28/2015")));
			psiCalendar.put(PSI_2015_1_1, new Sprint(PSI_2015_2_4, dateformat.parse("04/29/2015"), dateformat.parse("05/12/2015")));
			psiCalendar.put(PSI_2015_1_1, new Sprint(PSI_2015_2_5, dateformat.parse("05/13/2015"), dateformat.parse("05/26/2015")));
			psiCalendar.put(PSI_2015_1_1, new Sprint(PSI_2015_3_1, dateformat.parse("05/27/2015"), dateformat.parse("06/09/2015")));
			psiCalendar.put(PSI_2015_1_1, new Sprint(PSI_2015_3_2, dateformat.parse("06/10/2015"), dateformat.parse("06/23/2015")));
			psiCalendar.put(PSI_2015_1_1, new Sprint(PSI_2015_3_3, dateformat.parse("06/24/2015"), dateformat.parse("07/07/2015")));
			psiCalendar.put(PSI_2015_1_1, new Sprint(PSI_2015_3_4, dateformat.parse("07/08/2015"), dateformat.parse("07/21/2015")));
			psiCalendar.put(PSI_2015_1_1, new Sprint(PSI_2015_3_5, dateformat.parse("07/22/2015"), dateformat.parse("08/04/2015")));
			psiCalendar.put(PSI_2015_1_1, new Sprint(PSI_2015_4_1, dateformat.parse("08/05/2015"), dateformat.parse("08/18/2015")));
			psiCalendar.put(PSI_2015_1_1, new Sprint(PSI_2015_4_2, dateformat.parse("08/19/2015"), dateformat.parse("09/01/2015")));
			psiCalendar.put(PSI_2015_1_1, new Sprint(PSI_2015_4_3, dateformat.parse("09/02/2015"), dateformat.parse("09/15/2015")));
			psiCalendar.put(PSI_2015_1_1, new Sprint(PSI_2015_4_4, dateformat.parse("09/16/2015"), dateformat.parse("09/29/2015")));
			psiCalendar.put(PSI_2015_1_1, new Sprint(PSI_2015_4_5, dateformat.parse("09/30/2015"), dateformat.parse("10/13/2015")));
			psiCalendar.put(PSI_2015_1_1, new Sprint(PSI_2015_5_1, dateformat.parse("10/14/2015"), dateformat.parse("10/27/2015")));
			psiCalendar.put(PSI_2015_1_1, new Sprint(PSI_2015_5_2, dateformat.parse("10/28/2015"), dateformat.parse("11/10/2015")));
			psiCalendar.put(PSI_2015_1_1, new Sprint(PSI_2015_5_3, dateformat.parse("11/11/2015"), dateformat.parse("11/24/2015")));
			psiCalendar.put(PSI_2015_1_1, new Sprint(PSI_2015_5_4, dateformat.parse("11/25/2015"), dateformat.parse("12/08/2015")));
			psiCalendar.put(PSI_2015_1_1, new Sprint(PSI_2015_5_5, dateformat.parse("12/09/2015"), dateformat.parse("12/22/2015")));
			psiCalendar.put(PSI_2015_1_1, new Sprint(PSI_2015_5_6, dateformat.parse("12/23/2015"), dateformat.parse("01/05/2015")));
		} catch (Exception e) {
			System.out.println("Invalid date");
		}
		
		return psiCalendar;
	}
}
