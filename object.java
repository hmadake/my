public class object {
    int a;
   public void get(int o){
        a=o;
    }
     public void ou(){
        System.out.println("a is"+a);
    }
      public static void main(String args[]) {
        object o1=new object();
        o1.get(10);
        o1.ou();
      }
   
    }
