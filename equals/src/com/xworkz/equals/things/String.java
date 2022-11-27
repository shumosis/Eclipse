package com.xworkz.equals.things;

public class String {

		public static void main(String[] args) {
			
			String name = null;
			System.out.println(name);
			String concated = name.concat("shumosis"); 
			System.out.println(concated);
			System.out.println("=======");
			
			int ref = concated.charAt(25);
			System.out.println(ref);
			System.out.println("========");
			
			int ref1=concated.codePointAt(2); 
			System.out.println(ref1);
			System.out.println("=========");
			
			boolean ref2=name.contains(name); 
			System.out.println(ref2);
			System.out.println("=========");
			
			int ref3=name.codePointBefore(2); 
			System.out.println(ref3);
			System.out.println("==========");
			
			int ref4=concated.codePointCount(3, 13); 
			System.out.println(ref4);
			System.out.println("==========");
			
			int ref5=name.compareTo(concated); 
			System.out.println(ref5);
			System.out.println("==========");
			
			int ref6=name.compareToIgnoreCase(name); 
			System.out.println(ref6);
			System.out.println("==========");
			
			boolean ref7=name.contentEquals(concated) ;
			System.out.println(ref7);
			System.out.println("=========");
			
			boolean ref8=concated.contentEquals(name) ; 
			System.out.println(ref8);
			System.out.println("=======");
			
			byte[] ref9=concated.getBytes() ; 
			System.out.println(ref9);
			System.out.println("======");
			
			byte[] shubham=concated.getBytes() ; 
			System.out.println(shubham);
			System.out.println("=======");
			
			byte[] Akshay=concated.getBytes(); 
			System.out.println(Akshay);
			System.out.println("========");
			

			int vaibhav=concated.hashCode(); 
			System.out.println(vaibhav);
			System.out.println("=========");
			
			int nadeem=name.indexOf(1); 
			System.out.println(nadeem);
			System.out.println("=========");
			
			int manu=name.indexOf(concated); 
			System.out.println(manu);
			System.out.println("==========");
			
			int kaki=name.indexOf(vaibhav, manu); 
			System.out.println(kaki);
			System.out.println("===========");
			
			String mama=name.intern(); 
			System.out.println(mama);
			System.out.println("============");
			
			boolean raja=name.isEmpty() ;
			System.out.println(raja);
			System.out.println("=========");
			
			int rani=name.length(); 
			System.out.println(rani);
			System.out.println("===========");
			
			boolean dada=concated.matches(concated) ; 
			System.out.println(dada);
			System.out.println("===========");
			
			String dadi=concated.replace("love","hate"); 
			System.out.println(dadi);
			System.out.println("===========");
			
			String[] papa=name.split("shumosis"); 
			System.out.println(papa);
			System.out.println("===========");
			
			String shri=concated.toUpperCase();
			System.out.println(shri);
			System.out.println("=========");
			
			String shami=concated.trim(); 
			System.out.println(shami);
			System.out.println("==========");
			
			String dk=concated.toLowerCase(); 
			System.out.println(dk);
	

}

		private int codePointCount(int i, int j) {
			
			return 0;
		}

		private int compareTo(String concated) {
		
			return 0;
		}

		private int compareToIgnoreCase(String name) {
		
			return 0;
		}

		private boolean contentEquals(String name) {
			
			return false;
		}

		private byte[] getBytes() {
			
			return null;
		}

		private int indexOf(int i) {
			
			return 0;
		}

		private int indexOf(String concated) {
			
			return 0;
		}

		private int indexOf(int c, int e) {
			
			return 0;
		}

		private String intern() {
			
			return null;
		}

		private boolean isEmpty() {
			
			return false;
		}

		private int length() {
			
			return 0;
		}

		private boolean matches(String concated) {
			
			return false;
		}

		private String replace(java.lang.String string, java.lang.String string2) {
			
			return null;
		}

		private String[] split(java.lang.String string) {
			
			return null;
		}

		private String toUpperCase() {
			
			return null;
		}

		private String trim() {
			
			return null;
		}

		private String toLowerCase() {
			
			return null;
		}

		private int charAt(int i) {
			
			return 0;
		}

		private int codePointBefore(int i) {
			
			return 0;
		}

		private String concat(java.lang.String string) {
		
			return null;
		}

		private int codePointAt(int i) {
			
			return 0;
		}

		private boolean contains(String name) {
			
			return false;
		}
}
