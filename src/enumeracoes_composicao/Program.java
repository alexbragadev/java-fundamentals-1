package enumeracoes_composicao;

import java.util.Date;

import enumeracoes_composicao.entities.Order;
import enumeracoes_composicao.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		
		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);
		
	}

}
