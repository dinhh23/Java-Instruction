
public class HTMLConvertorApp {

	public static void main(String[] args) {
		System.out.println("HTML Converter");
		System.out.println();
		
		System.out.println("Input");
		String html = "<h1>Grocery List</h1>\n" +
				 "<ul>\n" +
				 " <li>Eggs</li>\n" +
				 " <li>Milk</li>\n" +
				 " <li>Butter</li>\n" +
				 "</ul>";
		System.out.println(html);
		System.out.println();
		
		System.out.println("Output");
		html = html.trim();
		String gl = html.substring(4,16);
		String eggs = html.substring(32,35);
		String milk = html.substring(47,51);
		String butter = html.substring(62,68);
		
		System.out.println(gl);
		System.out.println("*"+eggs);
		System.out.println("*"+milk);
		System.out.println("*"+butter);
	}

}
