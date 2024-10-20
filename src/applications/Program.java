package applications;

import java.util.Locale;

import javax.swing.JOptionPane;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		String name = JOptionPane.showInputDialog(null, "Enter product data: \nProduct name:");
		double price = Double.parseDouble(JOptionPane.showInputDialog(null, "Product price:"));
		int quantity = Integer.parseInt(JOptionPane.showInputDialog(null, "Product quantity:"));
		
		Product product = new Product(name, price, quantity);
		
		product.setName("Computer");
		product.setPrice(1200);
		
		JOptionPane.showMessageDialog(null, product);
		
		product.addProducts(Integer.parseInt(JOptionPane.showInputDialog(null, "Insira uma quantidade a ser adicionada ao estoque:")));
		JOptionPane.showMessageDialog(null, product);

		product.removeProducts(Integer.parseInt(JOptionPane.showInputDialog(null, "Insira uma quantidade a ser removida do estoque:")));
		JOptionPane.showMessageDialog(null, product);
		
	}
}
