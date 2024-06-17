class ThreadDemo extends Thread{
public void run(){
System.out.println("inside run method");
}
public static void main(String[]args){
ThreadDemo t1 = new ThreadDemo();
ThreadDemo t2 = new ThreadDemo();
ThreadDemo t3 = new ThreadDemo();


System.out.println("t1 thread running:"+t1.getPriority());
System.out.println("t1 thread running:"+t2.getPriority());
System.out.println("t1 thread running:"+t3.getPriority());
System.out.println();


t1.setPriority(1);
t2.setPriority(2);
t3.setPriority(3);

System.out.println("t1 thread running:"+t1.getPriority());
System.out.println("t1 thread running:"+t2.getPriority());
System.out.println("t1 thread running:"+t3.getPriority());

System.out.println("current executing thread:"+Thread.currentThread().getName());
System.out.println("main thread priority:"+Thread.currentThread().getPriority());

Thread.currentThread().setPriority(10); 
System.out.println("main thread priority:"+Thread.currentThread().getPriority());

}
}