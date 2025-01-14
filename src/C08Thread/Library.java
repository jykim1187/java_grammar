package C08Thread;

public class Library {
    static int bookCount = 100;

//    synchronized 키워드를 통해서 해당 메서드에 한해 lock을 걸도록 설정
//    public synchronized static void borrow(){
    public static void borrow(){
          if(bookCount>0){try{
              Thread.sleep(300);
          } catch(InterruptedException e){
              e.printStackTrace();
          }
              bookCount = bookCount-1;
              System.out.println("대출완료");
          }else{
              System.out.println("대출불가");
          }
    }
}
