package ch.ethz.systems;

public class Superclass {
	private int j;
   public Superclass() {
   }
   public void increment() {++j;}
   public int get() {
	   return j;
   }
   
   public boolean is1()
   {
	   return false;
   }
   
   public boolean is2()
   {
	   return false;
   }
   
	public int apply(int i)
   {
	   throw new RuntimeException();
   }
}
