package jFreechart;

public class CategoryChartTest {

	public static void main(String[] args) {
		CreateChart createChart = new CreateChart();
		boolean check = createChart.createCategoryChart("E:\\chart.jpeg");
		System.out.println(check);
	}
}
