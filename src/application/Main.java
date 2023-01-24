package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.util.*;


public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int qtdProduct = sc.nextInt();

        for (int i = 0; i < qtdProduct; i++) {
            System.out.println("Product #" + (i + 1) + " data");
            System.out.print("Common, used or imported (c/u/i) ? ");
            char tipoProduct = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();

            if (tipoProduct == 'i') {
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();
                list.add(new ImportedProduct(name, price, customsFee));
            } else if (tipoProduct == 'u') {
                System.out.print("Data: ");
                sc.nextLine();
                String data = sc.nextLine();
                list.add(new UsedProduct(name, price, data));
            } else {
                list.add(new Product(name,price));
            }
        }

        for (Product lista : list) {
            System.out.println(lista);
        }

        sc.close();
    }
}



