class My implements Runnable{
    public void run(){
        int i =1;
        while (true) { 
            System.out.println(i+"hello");
            i++;
        }
    }
}

class pgrunnable{
    public static void main(String[] args) {
        My m = new My();
        Thread t = new Thread(m);
        t.start();
        int i= 1;
        while (true) { 
            System.out.println(i+"world");
            i++;
        }
    }
}