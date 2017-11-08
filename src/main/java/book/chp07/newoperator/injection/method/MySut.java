package book.chp07.newoperator.injection.method;

import book.chp07.newoperator.MyCollaborator;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class MySut {

	public void myMethod(MyCollaborator collab) {
		// some behaviour worth testing here which uses collaborator
	}
}
