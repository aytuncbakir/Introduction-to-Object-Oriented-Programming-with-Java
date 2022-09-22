package com.aytuncbakir.oop.ch11.lecture02.memberaccess.packageB;

import com.aytuncbakir.oop.ch11.lecture02.memberaccess.packageA.John;
import com.aytuncbakir.oop.ch11.lecture02.memberaccess.packageA.SonOfAdam;

public class Adam {
	
	// same class all kind of access allowed
	
		public String name;
		private int id;
		protected String illnes;
		String hobby;

		public void publicMethod() {
			privateMethod();
			protectedMethod();
			defaultMethod();
			
			System.out.println(name);
			System.out.println(id);
			System.out.println(name);
			System.out.println(illnes);
		}
		
		private void privateMethod() {
			publicMethod();
			protectedMethod();
			defaultMethod();
			
			System.out.println(name);
			System.out.println(id);
			System.out.println(name);
			System.out.println(illnes);
		}
		
		protected void protectedMethod() {
			privateMethod();
			protectedMethod();
			defaultMethod();
			System.out.println(name);
			System.out.println(id);
			System.out.println(name);
			System.out.println(illnes);
		}
		
		void defaultMethod() {
			privateMethod();
			protectedMethod();
			publicMethod();
			System.out.println(name);
			System.out.println(id);
			System.out.println(name);
			System.out.println(illnes);
		}
		
		// different package   -- only public access allowed if there is no relationship
		void sayHelloFriend() {
			John john = new John();

			/*
			 * public int name; private int id; protected String illnes; String hobby;
			 * 
			 */

			String name = john.name;
			john.publicMethod();
			
			// Adam knows his son
			SonOfAdam mySon  = new SonOfAdam();
			String illness = mySon.illnes;
			String name2 = mySon.name;
			mySon.protectedMethod();
			mySon.publicMethod();
		}

}
