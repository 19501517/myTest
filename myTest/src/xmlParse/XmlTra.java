package xmlParse;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class XmlTra {
	private File inputXml;

	public XmlTra(File inputXml) {
		this.inputXml = inputXml;
	}

	public Document getDocument() {
		SAXReader saxReader = new SAXReader();
		Document document = null;
		try {
			document = saxReader.read(inputXml);
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		return document;
	}

	public Element getRootElement() {
		return getDocument().getRootElement();
	}

	public void traversalDocumentByIterator() {
		Element root = getRootElement();
		// 枚举根节点下所有子节点
		for (Iterator ie = root.elementIterator(); ie.hasNext();) {
			System.out.println("======");
			Element element = (Element) ie.next();
			System.out.println(element.getName());

			// 枚举属性
			for (Iterator ia = element.attributeIterator(); ia.hasNext();) {
				Attribute attribute = (Attribute) ia.next();
				System.out.println(attribute.getName() + ":"
						+ attribute.getData());
			}

			// 枚举当前节点下所有子节点
			for (Iterator ieson = element.elementIterator(); ieson.hasNext();) {
				Element elementSon = (Element) ieson.next();

				for (Iterator iesonson = elementSon.elementIterator("name"); iesonson
						.hasNext();) {
					Element sonson = (Element) iesonson.next();
					System.out.println(sonson.getName() + sonson.getText());
				}
			}
		}
	}

	public void traversalDocumentByVisitor() {
		getDocument().accept(new MyVisitor());
	}
}