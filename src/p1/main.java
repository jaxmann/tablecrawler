package p1;

import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class main {

	public static void main(String[] args) throws IOException {
		Document doc = Jsoup.connect("http://www.nikon.com/products/microscope-solutions/lineup/img_soft/table_of_features.htm").get();
		
		ArrayList<Element> arr = new ArrayList<Element>();
		ArrayList<TableElement> myArr = new ArrayList<TableElement>();
		ArrayList<String> description = new ArrayList<String>();
		ArrayList<String> AR = new ArrayList<String>();
		ArrayList<String> BR = new ArrayList<String>();
		ArrayList<String> D = new ArrayList<String>();


		Element table = doc.getElementsByTag("table").first();
		
		Elements rows = table.select("tr");
		
		for (Element row : rows) {
			
			for (Element th : row.getElementsByTag("th")) {
				description.add(th.html());
			}
			
			Elements tds = row.select("td");
			
			for (Element td : tds) {
				arr.add(td);
			}
			
		}	
		
		for (int i=0; i<arr.size(); i++) {
			switch (i%3) {
			case 0:
				if (arr.get(i).getElementsByTag("img").hasAttr("src")) {
					AR.add(arr.get(i).getElementsByTag("img").attr("src"));
					break;
				} else {
					AR.add(arr.get(i).html());
					break;
				}
			case 1:
				if (arr.get(i).getElementsByTag("img").hasAttr("src")) {
					BR.add(arr.get(i).getElementsByTag("img").attr("src"));
					break;
				} else {
					BR.add(arr.get(i).html());
					break;
				}
			case 2:
				if (arr.get(i).getElementsByTag("img").hasAttr("src")) {
					D.add(arr.get(i).getElementsByTag("img").attr("src"));
					break;
				} else {
					D.add(arr.get(i).html());
					break;
				}
			}
		}
		
		description.remove(0);
		description.remove(0);
		description.remove(0);
		description.remove(0);
		
		for (int i=0; i<description.size(); i++) {
			myArr.add(new TableElement(description.get(i), AR.get(i), BR.get(i), D.get(i)));
		}
		
		System.out.println(myArr.get(2));
		
		
	}
}
