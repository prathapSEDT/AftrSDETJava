package poc;

public class mult extends Thread{
    public void run(){
        for(int i=0;i<=5;i++){
            try {
                Thread.sleep(2000);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }

    public static void main(String[] args) {
        mult m=new mult();
        mult m1=new mult();
        m.start();
        m1.start();


    }
}
