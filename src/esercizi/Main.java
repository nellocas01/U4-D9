package esercizi;

import java.util.ArrayList;
import java.util.List;

import group.Customer;
import group.Order;
import group.Product;

public class Main {

	public static void main(String[] args) {

		List<Product> prodotti = new ArrayList<>();
		prodotti.add(new Product("Storia ", "Books ", 130.99));
		prodotti.add(new Product("Geografia ", "Baby ", 200.99));
		prodotti.add(new Product("Italiano ", "Books ", 350.99));
		prodotti.add(new Product("Motori ", "Boys ", 70.99));
		prodotti.add(new Product("Chitarra ", "Baby ", 190.99));

		List<Product> book = prodotti.stream().filter(p -> p.getPrice() > 99.99 && p.getCategory().equals("Books "))
				.toList();
		System.out.println(book);

		List<Order> ordini = new ArrayList<>();
		ordini.add(new Order("Storia ", "Books ", 130.99));
		ordini.add(new Order("Geografia ", "Baby ", 200.99));
		ordini.add(new Order("Italiano ", "Books ", 350.99));
		ordini.add(new Order("Motori ", "Boys ", 70.99));
		ordini.add(new Order("Chitarra ", "Baby ", 190.99));

		List<Order> baby = ordini.stream().filter(p2 -> p2.getCategory().equals("Baby ")).toList();
		System.out.println(baby);

		List<Customer> prodotti2 = new ArrayList<>();
		prodotti2.add(new Customer("Storia ", "Books ", 130.99));
		prodotti2.add(new Customer("Geografia ", "Baby ", 200.99));
		prodotti2.add(new Customer("Italiano ", "Books ", 350.99));
		prodotti2.add(new Customer("Motori ", "Boys ", 70.99));
		prodotti2.add(new Customer("Chitarra ", "Baby ", 190.99));

		List<Customer> boy = prodotti2.stream().filter(p3 -> p3.getCategory().equals("Boys ")).toList();
		System.out.println(boy);

	}

}
