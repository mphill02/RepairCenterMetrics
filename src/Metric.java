

public class Metric {

	public Metric() {
		// TODO Auto-generated constructor stub
	}

	private String key;
	private String val;
	private String frmt_val;
	
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getVal() {
		return val;
	}
	public void setVal(String val) {
		this.val = val;
	}
	public String getFrmt_val() {
		return frmt_val;
	}
	public void setFrmt_val(String frmt_val) {
		this.frmt_val = frmt_val;
	}

	public String toString() {
		return "Metric:" + "key:" + key + "val:" + val + "frmt_val:" + frmt_val;
	}
}
