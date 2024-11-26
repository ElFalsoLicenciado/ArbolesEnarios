import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nN-ary Tree Menu");
            System.out.println("1. Insert a value");
            System.out.println("2. Search for a value");
            System.out.println("3. Delete a value");
            System.out.println("4. Print tree structure");
            System.out.println("0. Exit");
            System.out.print("Enter your choice (0-4): ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter the string value to insert: ");
                    String insertValue = scanner.nextLine();
                    tree.insert(insertValue);
                    System.out.println("Inserted '" + insertValue + "' into the N-ary tree.");
                    break;
                case "2":
                    System.out.print("Enter the string value to search for: ");
                    String searchValue = scanner.nextLine();
                    boolean found = tree.search(searchValue);
                    if (found) {
                        System.out.println("'" + searchValue + "' exists in the tree.");
                    } else {
                        System.out.println("'" + searchValue + "' does not exist in the tree.");
                    }
                    break;
                case "3":
                    System.out.print("Enter the string value to delete: ");
                    String deleteValue = scanner.nextLine();
                    boolean deleted = tree.delete(deleteValue);
                    if (deleted) {
                        System.out.println("'" + deleteValue + "' deleted successfully.");
                    } else {
                        System.out.println("'" + deleteValue + "' could not be deleted or does not exist.");
                    }
                    break;
                case "4":
                    System.out.println("Tree structure:");
                    tree.printTree();
                    break;
                case "0":
                    System.out.println("Exiting the program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 0 and 4.");
            }
        }
    }
}
