package com.aytuncbakir.oop.ch09.lecture10;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class GarbageCollectorGC {
	
	/* Clearing unused and no longer needed objects from memory */
	
	// Memory organization  : 
	// Garbage collection
	/* GC is one of the constantly running structures inside the JVM 
	 * and it is responsible of the management of the heap. (memory management)
	 * 
	 *  --automatic memory management--
	 */
	

	
	public static void main(String[] args) {
		
		/* What does unused and no longer needed object mean? */
		
		/* 
		 If there are no references to an object, or
			if all references are out of scope the object is unreachable.
		*/
		
		 // These objects must be cleared from the heap.
		
		Kitchen kitchen = new Kitchen();
		
		Food food;
		for (int i = 1; i < 101; i++) {
			food = new Food();
			if(kitchen.foods[i-1] == null)
				kitchen.foods[i-1] = food;
			System.out.println(i);
		}
		
		kitchen.foods[45] = null;
		food = new Food();
		food.name = "Myfood";
		
		
		for (int i = 1; i < 102; i++) {
			System.out.println(i-1);
			if(kitchen.foods[i-1] == null) {
				kitchen.foods[i-1] = food;
				System.out.print(food);
				break;
			}
			
		}
		
		
		/*
		 *  if these objects should not be cleared from the heap.
		 *  memory leaks occur if these objects are not cleared from the heap.
		 *  MEMORY LEAK  - BELLEK SIZINTISI
		 *  
		 *  --- OutOfMemory  ---- java.lang.OutOfMemory
		 *  if at least one reference is point the object, it means that the object alive and reachable.
		 *  So GC does not remove it from heap than it caused to OutOfMemory exception. 
		 *  Then JVM crashes.
		 * 
		 */
		
		food = new Food();
		for (int i = 1; i < 102; i++) {
			System.out.println(i-1);
			if(kitchen.foods[i-1] == null) {
				kitchen.foods[i-1] = food;
				System.out.print(food);
				break;
			}
			
		}
		
		/* SOLUTION
		 * 
		 * To prevent memory leaks, the following can be done:
			- Avoiding creating unnecessary objects,
			- Keeping objects as short-lived as possible.
		 */
		
		/*
		 * To keep objects short-lived,
			- Not passing the object's references to methods and bags like arrays if not required,
			- The more references an object is created, the more likely it is to remain in memory.
			- When you pass a reference to a method, you don't know what was done to that reference there
		 */
		
		kitchen.keep(food);
		kitchen.count(kitchen.foods);
		
		// calling GC manually, this call warns GC but GC may not make cleaning
		System.gc();
		// Therefore, frequent use of System.gc() is not recommended.
		
		// stop the world - STW - GC stops everything while cleaning
		
		// Is it a solution to extend heap to prevent memory leak?
			// - GC will handle wider area
	
	}
	
	
}

class Kitchen{
	
	// Suppose that our heap has 100 slots 
	Food[] foods = new Food[100];
	Kitchen(){
		
	}
	
	public void keep(Food food) {
		System.out.println(food);
	}
	
	public void count(Food[] foods) {
		for(Food food : foods)
			System.out.println(food);
	}
}


class Food{
	String name;
	
	@Override
	public String toString() {
		return name;
	}
}
