import static org.junit.Assert.*;

import org.junit.Test;


public class TestMetricDAO {

	@Test
	public void testGetRCUploads() throws Exception {
		MetricDAO metricDAO = new MetricDAO();
		Metric metric = metricDAO.getRCUploads();
	}

}
