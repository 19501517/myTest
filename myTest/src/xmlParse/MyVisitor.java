package xmlParse;

import org.dom4j.Attribute;
import org.dom4j.Element;
import org.dom4j.ProcessingInstruction;
import org.dom4j.VisitorSupport;

class MyVisitor extends VisitorSupport {
	/**
	 * 对于属性节点，打印属性的名字和值
	 */
	public void visit(Attribute node) {
		System.out.println("attribute : " + node.getName() + " = "
				+ node.getValue());
	}

	/**
	 * 对于处理指令节点，打印处理指令目标和数据
	 */
	public void visit(ProcessingInstruction node) {
		System.out.println("PI : " + node.getTarget() + " " + node.getText());
	}

	/**
	 * 对于元素节点，判断是否只包含文本内容，如是，则打印标记的名字和 元素的内容。如果不是，则只打印标记的名字
	 */
	public void visit(Element node) {
		if (node.isTextOnly()) {
			if(node.getName().equals("name"))
			System.out.println("element : " + node.getName() + " = "
					+ node.getText());
		} else {
			System.out.println("--------" + node.getName() + "--------");
		}
	}
}
