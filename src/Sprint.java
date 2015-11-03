import java.util.Date;

public class Sprint {
	String name;

	Date beginDate;
	Date endDate;

	public Sprint() {
		// TODO Auto-generated constructor stub
	}

	public Sprint(String name, Date beginDate, Date endDate) {
		this.name = name;
		this.beginDate = beginDate;
		this.endDate = endDate;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
}
