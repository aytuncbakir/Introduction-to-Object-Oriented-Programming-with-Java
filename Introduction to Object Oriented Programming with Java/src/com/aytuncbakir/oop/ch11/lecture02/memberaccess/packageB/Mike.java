package com.aytuncbakir.oop.ch11.lecture02.memberaccess.packageB;

public class Mike {
	
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

}
