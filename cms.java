import java.util.*;
	
class cms {
	
	public static class info {
		String name;
		String num;
		
		void update_info(String name, String num) {
			this.name = name;
			this.num = num;		
		}		
		
	}
		
	public static void main (String[] args) {
		ArrayList<info>cms = new ArrayList<info>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Choose any options (1-6):\n 1) Add New Contacts\n 2) Search For Contact\n 3) Update Existing Contacts\n 4) Delete Contacts\n 5) Print All Contacts\n 6) Exit");
		int opt = sc.nextInt();
		
		String name;
		String num;
		
		int size = 0;		
		boolean bool = true;
		while (bool) {
			switch (opt) {
			case 1:
				System.out.println("Enter the no.of contacts: ");
				int limit = sc.nextInt();
				for (int i = 0; i < limit; i++) {
					cms.add(new info());
					System.out.println("Enter the name of contact: ");
					name = sc.nextLine();
					sc.nextLine();
					System.out.println("Enter the contact number: ");
					num = sc.nextLine();
					cms.get(i).update_info(name, num);
					size++;
				}
				break;
			case 2:
				System.out.println("Enter the contact to search for: ");
				name = sc.nextLine();
				for (int i = 0; i < size; i++) {
					if (equalsIgnoreCase(name, cms.get(i).name)) {
						System.out.println("Contact Found: " + cms.get(i).num);
					}
					else {
						System.out.println("Contact Not Found");
					}
				}
			break;
			case 3:	
				System.out.println("Enter the contact to update: ");
				name = sc.nextLine();
				System.out.println("Enter updated details:\n 1) Name:");
				String name_new = sc.nextLine();
				System.out.println("2) Number: ");
				num = sc.nextLine();
				for (int i = 0; i < size; i++) {
					if (equalsIgnoreCase(name, cms.get(i).name)) {
						System.out.println("Contact Before Changes:\n 1) Name: " + cms.get(i).name + "\n 2) Number: " + cms.get(i).num);
						cms.get(i).update_info(name, num);
						System.out.println("Contact After Changes:\n 1) Name: " + cms.get(i).name + "\n 2) Number: " + cms.get(i).num);}
					else {
						System.out.println("Contact Not Found");
					}
				}			
			break;
			case 4:
				System.out.println("Enter the contact to delete: ");
				name = sc.nextLine();
				for (int i = 0; i < size; i++) {
					if (equalsIgnoreCase(name, cms.get(i).name)) {
						cms.remove(i);
						System.out.println("Contact Deleted Successfully");
					}
					else {
						System.out.println("Contact Not Found");
					}
				}
			break;
			case 5:
				for (int i = 0; i < size; i++) {
					System.out.println("Name: " + cms.get(i).name + "\nNumber: " + cms.get(i).num + "\n");
				}
			break;
			case 6:
			bool = false;
			break;
			}
		}
	}
}
