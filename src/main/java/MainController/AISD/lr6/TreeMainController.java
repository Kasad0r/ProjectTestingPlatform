package MainController.AISD.lr6;

import java.util.Arrays;
import java.util.Scanner;

public class TreeMainController {
    public static void main(String[] args) {
        menu();
    }

static void menu(){
        ITree<String> tree = new BTree<>();
        boolean validate = true;

        while (validate) {
            System.out.println("1.add\n2.contains\n3.size\n4.validate\n5.printTree\n6.exit");
            switch (new Scanner(System.in).nextInt()) {
                case 1:
                    tree.add(new Scanner(System.in).nextLine());
                    break;
                case 2:
                    System.out.println(tree.contains(new Scanner(System.in).nextLine()));
                    break;
                case 3:
                    System.out.println("Size " + tree.size());
                    break;
                case 4:
                    System.out.println(tree.validate());
                    break;
                case 5:
                    System.out.println(tree.toString());
                    break;
                case 6:
                    validate = false;
                    break;
                default:
                    System.out.println("Wrong statement");
            }
        }


    }
}
