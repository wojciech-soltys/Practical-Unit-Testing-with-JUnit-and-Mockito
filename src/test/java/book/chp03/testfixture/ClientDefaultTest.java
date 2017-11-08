package book.chp03.testfixture;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class ClientDefaultTest {

	private Address addressA = new Address("street A");
	private Address addressB = new Address("street B");
	private Client client = new Client(addressA);

	@Test
	public void afterCreationShouldHaveNoAddress() {
		assertEquals(0, client.getAddresses().size());
	}

	@Test
	public void shouldAllowToAddAddress() {
		client.addAddress(addressA);

		assertEquals(1, client.getAddresses().size());
		assertTrue(client.getAddresses().contains(addressA));
	}

	@Test
	public void shouldAllowToAddManyAddresses() {
		client.addAddress(addressA);
		client.addAddress(addressB);

		assertEquals(2, client.getAddresses().size());
		assertTrue(client.getAddresses().contains(addressA));
		assertTrue(client.getAddresses().contains(addressB));
	}
}
