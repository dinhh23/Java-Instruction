import java.util.ArrayList;
// pg. 388-391
public class SevenDwarvesCollectionApp {

	public static void main(String[] args) {
		System.out.println("Hello!!!");
		
		ArrayList<String> dwarves = new ArrayList<>();
		// add(object) add(index,object)
		dwarves.add("Doc");
		dwarves.add("Sleepy");
		dwarves.add("Grumpy");
		dwarves.add("Dopey");
		dwarves.add("Happy");
		dwarves.add(0,"Bashful");
		dwarves.add("Sneezy");
		System.out.println("7 Dwarves: "+dwarves);
		
		// get(index)
		System.out.println("Dwarf at position 3: "+dwarves.get(3));
		
		// size ()
		System.out.println("# of dwarves: "+dwarves.size());
		
		// contains(object)
		System.out.println("contains 'Happy' ? " + dwarves.contains("Happy"));
		System.out.println("contains 'happy' ? " + dwarves.contains("happy"));
		
		// indexOf(object)
		System.out.println("Index of 'Dopey' ? " + dwarves.indexOf("Dopey"));
		
		dwarves.add("Grumpy");
		System.out.println(dwarves);
		System.out.println("Index of 'Grumpy' ? " + dwarves.indexOf("Grump"));
		
		
		
		System.out.println("Bye!!!");
	}

}
