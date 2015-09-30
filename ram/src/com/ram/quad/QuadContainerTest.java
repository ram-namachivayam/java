package com.ram.quad;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class QuadContainerTest {
	
	private QuadContainer quadContainer;
	
	private List<String> childList = new ArrayList<String>();
	
	@Before
	public void setUp() {
		quadContainer = new QuadContainer();
		childList.add("test-child1");
		childList.add("test-child2");
		childList.add("test-child3");
	}
	

	@Test
	public void test() {
		
		String data = "test-parent";
		quadContainer.add(data);
		
		assertEquals(quadContainer.getRoot().getT(), data);
		
		for (String child: childList) {
			quadContainer.add(child);
		}
		
		assertEquals(quadContainer.contains(data), Boolean.TRUE);
		
		assertEquals(quadContainer.contains(childList.get(0)), Boolean.TRUE);
		
		assertFalse(quadContainer.contains("dummy"));
	}

}
