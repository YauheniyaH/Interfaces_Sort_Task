package by.epam.inherit.appliance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main2 {

	public static void main(String[] args) {
	

		Toaster t1 = new Toaster("t1", 5, 35, 300);
		Toaster t2 = new Toaster("t2", 7, 80, 350);

		Book b1 = new Book("Harry Potter", "J Roaling", 100);
		Book b2 = new Book("Harry Potter 2", "J Roaling", 150);

		Iron i1 = new Iron("Iron1", 3, 34, "potable");
		Iron i2 = new Iron("Iron2", 5, 98, "with steam");
		
		Basket basket = new Basket(t1);
		
		basket.addToBasket(t2);
		basket.addToBasket(b1);
		basket.addToBasket(b2);
		basket.addToBasket(i1);
		basket.addToBasket(i2);
		

		for (int i = 0; i < basket.size() ; i++) {
			System.out.print(basket.getGood(i).myPrice()+"   ");
			
		}
		
		System.out.println();
		Collections.sort(basket.getGoods());
		
		for (int i = 0; i < basket.size() ; i++) {
			System.out.print(basket.getGood(i).myPrice()+"   ");
			
		}
		

	}

}
