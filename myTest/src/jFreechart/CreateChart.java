package jFreechart;

import java.awt.Font;
import java.io.FileOutputStream;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.category.DefaultCategoryDataset;

public class CreateChart {

	public boolean createCategoryChart(String fileUrl){
//		CategoryDataset categoryDataset = new GetDataset().getCategoryDateset();
		DefaultCategoryDataset set = new DefaultCategoryDataset();
		
		set.addValue(1, "全球", "全球");
		set.addValue(1, "军事", "军事");
		set.addValue(1, "报告", "报告");
		set.addValue(1, "4", "4");
		set.addValue(1, "5", "5");
		set.addValue(1, "6", "6");
		set.addValue(1, "7", "7");
		set.addValue(1, "8", "8");
		set.addValue(1, "9", "9");
		set.addValue(1, "10", "10");
		set.addValue(1, "11", "11");
		set.addValue(1, "12", "12");
		
		
		JFreeChart categoryChart = ChartFactory.createBarChart3D(
				"全球军事报告", 
				"军事单位", 
				"单位数量", 
				set, 
				PlotOrientation.VERTICAL, 
				false, 
				false, 
				true);
		
		Font font = new Font("宋体", Font.BOLD, 30);
		TextTitle title = new TextTitle("全球军事报告", font);
		categoryChart.setTitle(title); 
//		
		CategoryPlot plot = categoryChart.getCategoryPlot(); 
		NumberAxis numberaxis = (NumberAxis) plot.getRangeAxis();
		CategoryAxis domainAxis = plot.getDomainAxis(); 
//		
		domainAxis.setTickLabelFont(new Font("宋体", Font.BOLD, 11));
		domainAxis.setLabelFont(new Font("宋体", Font.BOLD, 20));
//		
		numberaxis.setTickLabelFont(new Font("sans-serif", Font.BOLD, 12));
		numberaxis.setLabelFont(new Font("宋体", Font.BOLD, 12));
		
//		categoryChart.getLegend().setItemFont(new Font("宋体", Font.BOLD, 20));

		FileOutputStream category_jpeg = null;
		
		try {
			category_jpeg = new FileOutputStream(fileUrl);
			ChartUtilities.writeChartAsJPEG(category_jpeg, 1, categoryChart, 1000, 700);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				category_jpeg.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return false;
	}
}
