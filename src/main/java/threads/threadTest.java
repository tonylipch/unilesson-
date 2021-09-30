package threads;


// Класс Магазин, хранящий произведенные товары
class Store{
	
   private volatile int product=0;
   
   public synchronized void get() {
      while (product<1) {
         try {
            wait();
         }
         catch (InterruptedException e) {
         }
      }
      product--;
      System.out.print("Customer bought 1 product.    ");
      System.out.println("Products in stock: " + product);
      notify();
   }



   public synchronized void put() {
       while (product>=5) {
         try {
            wait();
         }
         catch (InterruptedException e) { 
         } 
      }
      product++;
      System.out.print("Manufacturer added 1 product. ");
      System.out.println("Products in stock: " + product);
      notify();
   }
}


// класс Производитель
class Producer implements Runnable{
    Store store;
    Producer(Store store){
       this.store=store; 
    }
    public void run(){
        for (int i = 1; i < 20; i++) {
            store.put();
        }
    }
}


// Класс Потребитель
class Consumer implements Runnable{
      
     Store store;
    Consumer(Store store){
       this.store=store; 
    }
    public void run(){
        for (int i = 1; i < 20; i++) {
            store.get();
        }
    }
}





public class threadTest {
	


	 // arguments are passed using the text field below this editor
	  public static void main(String[] args)
	  {
	   Store store=new Store();
	        Producer producer = new Producer(store);
	        Consumer consumer = new Consumer(store);
	        new Thread(producer).start();
	        new Thread(consumer).start();
	  }
	
	
	

}
