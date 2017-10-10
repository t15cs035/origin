import static org.junit.Assert.*;

import org.junit.Test;


public class CardTest {

	@Test
	public void testGetNumber() {
		int num = 1;
		Card card1 = new Card(Card.HEART,num);
		assertEquals(num,card1.getNumber());
		
		num = 0;
		Card cardJ = new Card(Card.DIAMOND,num);
		assertEquals(Card.JOKER,cardJ.getNumber());
	}

	@Test
	public void testToString() {
		int num = 1;
		Card card1 = new Card(Card.HEART,num);
		assertEquals("HA",card1.toString());
		
		num = 0;
		Card cardJ = new Card(Card.DIAMOND,num);
		assertEquals("JK",cardJ.toString());
	}

}
