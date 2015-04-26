package xmlParse;

import java.io.File;

public class MainTest {

	public static void main(String[] argv) {
		XmlTra dom4jParser = new XmlTra (new File("E://student.xml"));
//		dom4jParser.traversalDocumentByIterator();
		dom4jParser.traversalDocumentByVisitor();
	}
}
