import java.util.HashMap;
import java.util.Date;

public class MetricDriver {

	private String psiName;
	private HashMap<String, Metric> metrics;
	private Date beginDate;
	private Date endDate;
	private static final String RC_UPLOAD_ALL_METRIC_TYPE = "RCUploadAll";
	private static final String RC_UPLOAD_FAILURE_METRIC_TYPE = "RCUploadFailure";
	private static final String RCC1_UPLOAD_ALL_METRIC_TYPE = "RCC1UploadAll";
	private static final String RCC1_UPLOAD_FAILURE_METRIC_TYPE = "RCC1UploadFailure";
	private static final String RCC2_UPLOAD_ALL_METRIC_TYPE = "RCC2UploadAll";
	private static final String RCC2_UPLOAD_FAILURE_METRIC_TYPE = "RCC2UploadFailure";
	private static final String RCC1_UPLOAD_LT2_METRIC_TYPE = "RCUploadLt2";
	private static final String RCC1_UPLOAD_LT3_METRIC_TYPE = "RCUploadLt3";
	private static final String RCC1_UPLOAD_LT5_METRIC_TYPE = "RCUploadLt5";
	private static final String RC_PAGEVIEW_LT2_METRIC_TYPE = "RCPageViewLt2";
	private static final String RC_PAGEVIEW_LT3_METRIC_TYPE = "RCPageViewLt3";
	private static final String RC_PAGEVIEW_LT5_METRIC_TYPE = "RCPageViewLt5";
	
	
	public MetricDriver() {
		// TODO Auto-generated constructor stub
	}

	public MetricDriver(String psiName) {
		this.psiName = psiName;
		this.beginDate = PsiCalendar.getSprint(this.psiName).getBeginDate();
		this.endDate = PsiCalendar.getSprint(this.psiName).getEndDate();
		metrics = new HashMap<String, Metric>();
		MetricDAO metricDao = new MetricDAO();
	}
	
	public static void main(String [] args) {
		MetricDriver metricDriver = new MetricDriver(args[0]);
		metricDriver.getMetric(RC_UPLOAD_ALL_METRIC_TYPE);
		metricDriver.getMetric(RC_UPLOAD_FAILURE_METRIC_TYPE);
		metricDriver.getMetric(RCC1_UPLOAD_ALL_METRIC_TYPE);
		metricDriver.getMetric(RCC1_UPLOAD_FAILURE_METRIC_TYPE);
		metricDriver.getMetric(RCC2_UPLOAD_ALL_METRIC_TYPE);
		metricDriver.getMetric(RCC2_UPLOAD_FAILURE_METRIC_TYPE);
		metricDriver.getMetric(RCC1_UPLOAD_LT2_METRIC_TYPE);
		metricDriver.getMetric(RCC1_UPLOAD_LT3_METRIC_TYPE);
		metricDriver.getMetric(RCC1_UPLOAD_LT5_METRIC_TYPE);
		metricDriver.getMetric(RC_PAGEVIEW_LT2_METRIC_TYPE);
		metricDriver.getMetric(RC_PAGEVIEW_LT3_METRIC_TYPE);
		metricDriver.getMetric(RC_PAGEVIEW_LT5_METRIC_TYPE);
	}
	
	private void getMetric(String metricType) {
		switch (metricType) {
		case RC_UPLOAD_ALL_METRIC_TYPE:
			this.getRCUploads();
		case RC_UPLOAD_FAILURE_METRIC_TYPE:
			this.getRCFailures();
		case RCC1_UPLOAD_ALL_METRIC_TYPE:
			this.getRCC1Uploads();
		case RCC1_UPLOAD_FAILURE_METRIC_TYPE:
			this.getRCC1Failures();
		case RCC2_UPLOAD_ALL_METRIC_TYPE:
			this.getRCC2Uploads();
		case RCC2_UPLOAD_FAILURE_METRIC_TYPE:
			this.getRCC2Failures();
		case RCC1_UPLOAD_LT2_METRIC_TYPE:
			this.getRCC1UploadsLt2();
		case RCC1_UPLOAD_LT3_METRIC_TYPE:
			this.getRCC1UploadsLt3();
		case RCC1_UPLOAD_LT5_METRIC_TYPE:
			this.getRCC1UploadsLt5();
		case RC_PAGEVIEW_LT2_METRIC_TYPE: 
			this.getRCPageViewsLt2();
		case RC_PAGEVIEW_LT3_METRIC_TYPE: 
			this.getRCPageViewsLt3();
		case RC_PAGEVIEW_LT5_METRIC_TYPE: 
			this.getRCPageViewsLt5();
		default:
			System.out.println("Metric " + metricType + " Not Found");

		}
	}

	private void getRCUploads() {
		
	}
	
	private void getRCFailures() {
		
	}
	
	private void getRCC1Uploads() {
		
	}
	
	private void getRCC1Failures() {
		
	}
	
	private void getRCC2Uploads() {
		
	}
	
	private void getRCC2Failures() {
		
	}
	
	private void getRCC1UploadsLt2() {
		
	}
	
	private void getRCC1UploadsLt3() {
		
	}
	
	private void getRCC1UploadsLt5() {
		
	}
	
	private void getRCPageViewsLt2() {
		
	}
	
	private void getRCPageViewsLt3() {
		
	}
	
	private void getRCPageViewsLt5() {
		
	}
	
	private void getRCPageViewsAll() {
		
	}
}
