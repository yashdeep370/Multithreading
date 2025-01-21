class Mythread extends Thread{
    public void run(){
        int i = 1;
        while(true)
        {
            System.out.println(i+"hello");
            i++;
        }
    }
}

class pgthread
{
    public static void main(String[] args) {
        
        Mythread t = new Mythread();
        t.start();
        int i = 1;
        while (true) { 
            System.out.println(i+"(world)");
            i++;
        }
    }
}