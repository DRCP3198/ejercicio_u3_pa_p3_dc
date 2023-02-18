package com.example.demo;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Item;
import com.example.demo.service.IItemService;

@SpringBootApplication
public class EjercicioU3PaP3DcApplication  implements CommandLineRunner{

	
	@Autowired
	private IItemService iItemService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(EjercicioU3PaP3DcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Item item = new Item();
		item.setCodigoBarra("111");
		item.setNombre("doritos");
		item.setPrecio(new BigDecimal(0.55));
		item.setStock(50);
		item.setTipo("snacks");
		
		
		Item item1 = new Item();
		item1.setCodigoBarra("222");
		item1.setNombre("Zucaritas");
		item1.setPrecio(new BigDecimal(0.60));
		item1.setStock(20);
		item1.setTipo("cereal");
		
		
		Item item2 = new Item();
		item2.setCodigoBarra("333");
		item2.setNombre("manjar");
		item2.setPrecio(new BigDecimal(1.55));
		item2.setStock(100);
		item2.setTipo("lacteos");
		
		
		this.iItemService.ingresarItem(item, "111");
		List<Item> i = this.iItemService.buscar("111");
		for (Item item3 : i) {
			System.out.println(i);
		}
		
		
		
		
		
		
	}

}
