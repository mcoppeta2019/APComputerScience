//	Array Menu
// 	Michael Coppeta
//	Simulates a shopping list	

import java.util.*; //imports all necessary classes

public class ArrayMenu {

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		List<List<String>> menu = new ArrayList<List<String>>();
		String command = "";
		
		do{
			String item = "";
			String type = "";
			System.out.print("Add, remove, print, or exit menu: ");
			command = input.nextLine();
			
			if(command.trim().toLowerCase().equals("add")){
				System.out.print("\tCategory or Item?\t");
				item = input.nextLine();
				
				if(item.trim().toLowerCase().equals("category")){
					System.out.print("\t\tCategory Name: ");
					item = input.nextLine();
					List<String> cat = new ArrayList<String>();
					cat.add(item+":");
					menu.add(cat);
				} else if(item.trim().toLowerCase().equals("item")){
					System.out.print("\t\tWhat category?\t ");
					type = input.nextLine();
					
					
				} else {
					System.out.println("\tInvalid Input");
				}
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
				System.out.println("\tShopping List -> ");
				for(List<String> row: menu){
					System.out.print("\t\t" + row.get(0));
					for (int j = 1; j<row.size(); j++){
						System.out.print(row.get(j));
					}
					System.out.println();
				}
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
