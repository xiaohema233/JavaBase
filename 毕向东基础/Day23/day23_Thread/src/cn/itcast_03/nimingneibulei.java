package cn.itcast_03;

public class nimingneibulei {

  public static void main(String[] args) {
	  new Thread() {
		  public void run() {
			  for (int i = 0; i < 1000; i++) {
				System.out.println("aaaaaaaaa"+i);
				
			}
		  }
	  }.start();
	  
	 new Thread(new Runnable() {
				@Override
				public void run() {
					for (int i = 0; i < 1000; i++) {
						System.out.println("bbbb");
					}					
				}
			}).start();
	  

  }
}
