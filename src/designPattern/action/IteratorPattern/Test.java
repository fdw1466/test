package designPattern.action.IteratorPattern;

/**
 * 迭代器模式（行为型模式）
 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) {
		NameRepository nameRepository = new NameRepository();

		for (Iterator iterator = nameRepository.getIterator(); iterator.hasNext();) {
			String name = (String) iterator.next();
			System.out.println("Name:" + name);
		}
		
	}

}
