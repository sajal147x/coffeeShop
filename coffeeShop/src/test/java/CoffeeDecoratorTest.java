import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class CoffeeDecoratorTest {
	buildOrders order = new buildOrders();
	@Test
	void creamCosttest() {
		order.addCream();
		assertEquals(order.returnCost(), "4.49");
	}
	@Test
	void ExtraShotCostTest(){
		order.newCoffee();
		order.addExtraShot();
		assertEquals(order.returnCost(), "5.19");
	}
	@Test
	void sugarCostTest(){
		order.newCoffee();
		order.addSugar();
		assertEquals(order.returnCost(), "4.49");
	}
	@Test
	void TequilaCostTest(){
		order.newCoffee();
		order.addTequila();
		assertEquals(order.returnCost(), "8.190000000000001");
	}
	@Test
	void WheyCostTest(){
		order.newCoffee();
		order.addWhey();
		assertEquals(order.returnCost(), "10.89");
	}
	@Test
	void deleteOrderTest(){
		order.addSugar();
		order.addWhey();
		order.newCoffee();
		assertEquals(order.returnCost(), "3.99");
	}
	@Test
	void addCreamdisplayingTest(){
		order.newCoffee();
		order.addCream();
		assertEquals(" + cream: $.50\n", order.orderDetails);
	}
	@Test
	void addShotdisplayingTest(){
		order.newCoffee();
		order.addExtraShot();
		assertEquals(" + extra shot: $1.20\n", order.orderDetails);
	}
	@Test
	void addSugardisplayingTest() {
		order.newCoffee();
		order.addSugar();
		assertEquals(" + sugar: $.50\n", order.orderDetails);
	}
	@Test
	void addTequiladisplayingTest(){
		order.newCoffee();
		order.addTequila();
		assertEquals(" + Tequila: $4.2\n",order.orderDetails);
	}
	@Test
	void addproteindisplayingtest(){
		order.newCoffee();
		order.addWhey();
		assertEquals(" + Whey Protein: $6.9\n", order.orderDetails);
	}
}
