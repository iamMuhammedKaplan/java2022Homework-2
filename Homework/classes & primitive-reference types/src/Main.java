
public class Main {

	public static void main(String[] args) {
		//reference type
		CustomerManager customerManager = new CustomerManager();
		/*		|									|
		 * 		|									|
		 * 		v									v
		 */
		// stack CM #101 ------------------------> Heap
		//takes reference number here ----> object exists & works here 
		//CustomerManager customerManager;
		CustomerManager customerManager2 = new CustomerManager();
		// stack CM2 #102 -----------------------> Heap
		
		
		customerManager = customerManager2;
		//#101 becomes #102
		//#101 açýkta kaldýðýnda java garbage collector ile siler.
		//Garbage collector, java'nýn bellek yöneticisidir.
		//"new" bellekte pahalýdýr, dikkatli kullanýlmalýdýr.
		
		customerManager.add();
		customerManager.remove();
		customerManager.update();
		
		// <----------------------------------->
		
		int sayi1 = 10;
		int sayi2 = 20;
		sayi2 = sayi1;
		sayi1 = 30;
		System.out.println(sayi2);
		//primitive types take value on stack part,
		//but reference types take value on heap part.
		
		//arrays count as reference type.
		int[] sayilar1 = new int[] {1, 2, 3};
		int[] sayilar2 = new int[] {4, 5, 6};
		sayilar2 = sayilar1;
		sayilar1[0] = 10;
		System.out.println(sayilar2[0]);
	}

}
