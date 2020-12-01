package Shops;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Comparator {

	public static void main(String... strings) {

		List<Shop> allProducts = new ArrayList<Shop>();
		allProducts.add(new Shop(4.9, "Puma", 5000.0));
		allProducts.add(new Shop(4.0, "Adidas", 4500.0));
		allProducts.add(new Shop(4.2, "Lp", 6500.0));
		allProducts.add(new Shop(4.8, "Nike", 7500.0));
		allProducts.add(new Shop(3.6, "Reebok", 5000.0));
		allProducts.add(new Shop(3.3, "Fila", 2000.0));

		List<Shop> product = new ArrayList<Shop>();

		for (int i = 0; i < allProducts.size(); i++) {

			if (allProducts.get(i).getName() == "Lp") {
				product.add(allProducts.get(i));
			}

		}

		Collections.sort(product, (P1, P2) -> P2.getRating().compareTo(P1.getRating()));

		System.out.println(" For loop");
		for (int i = 0; i < product.size(); i++)
			System.out.println(product.get(i));

		System.out.println("Using For Loo");
		for (Shop L : product)
			System.out.println(L);

		System.out.println(" Stream APi");
		List<Shop> allProducts2 = new ArrayList<Shop>();
		allProducts2.add(new Shop(4.9, "Puma", 5000.0));
		allProducts2.add(new Shop(4.0, "Adidas", 4500.0));
		allProducts2.add(new Shop(4.2, "Lp", 6500.0));
		allProducts2.add(new Shop(4.8, "Nike", 7500.0));
		allProducts2.add(new Shop(3.6, "Reebok", 5000.0));
		allProducts2.add(new Shop(3.3, "Fila", 2000.0));
		List<Shop> product2 = allProducts2.stream()
				.filter(item -> item.getName().equals("Lp") || item.getName().equals("Puma"))
				.filter(item -> item.getPrice() > 60000).sorted((L1, L2) -> L2.getRating().compareTo(L1.getRating()))
				.collect(Collectors.toList());
		for (Shop laptopShop : product2) {
			System.out.println(laptopShop);
		}

		System.out.println("Using Map-Intermediate Stream");
		allProducts2.stream().map(item -> item.getName()).distinct().collect(Collectors.toList())
				.forEach(item -> System.out.println(item));

	
		
		
	}

}