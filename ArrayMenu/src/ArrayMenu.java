//	Array Menu
// 	Michael Coppeta
//	Simulates a menu	

import java.util.*; //imports all necessary classes

public class ArrayMenu {

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		List<String> menu = new ArrayList<String>();
		String command = "";	
		do{
			String item = "";
			System.out.print("Add, remove, print, or exit menu: ");
			command = input.nextLine();
			
			if(command.trim().toLowerCase().equals("add")){
				System.out.print("\tAdd: ");
				item = input.nextLine();
				menu.add(item);
				System.out.println();
				
			} else if(command.trim().toLowerCase().equals("remove")){
				System.out.print("\tRemove: ");
				item = input.nextLine();
				int place = menu.indexOf(item);
				if (place >= 0){
					menu.remove(place);
				} else {
					System.out.println("\tItem is not in the list");
				}
				System.out.println();
				
			} else if(command.trim().toLowerCase().equals("print")){
				System.out.println(Arrays.toString(menu.toArray()));
				System.out.println();
				
			} else if(command.trim().toLowerCase().equals("exit")){
				System.out.println("Done.");
				break;
				
			} else {
				System.out.println("Invalid input.");
				System.out.println();
			}
			
		} while (!command.trim().toLowerCase().equals("exit"));
		
		input.close();
	}
}
