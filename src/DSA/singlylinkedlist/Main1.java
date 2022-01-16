package DSA.singlylinkedlist;

public class Main1 {
    public static void main(String[] args) {
        LLP llp = new LLP();
        llp.insertFirst(1);
        llp.insertFirst(2);
        llp.insertFirst(3);
        llp.insertFirst(4);
        llp.insertFirst(5);

        llp.printData();

//        llp.insertLast(100);
//        llp.insertLast(99);
//        llp.insertLast(98);
//        llp.insertLast(97);
//        llp.insertLast(96);
//        llp.insertLast(95);
//
//        llp.printData();

//        llp.insertAtIndex(25,5);
//        try {
//            System.out.print("Inserting Data wait a while");
//            for (int i = 1; i <4 ; i++) {
//                System.out.print(".");
//                Thread.sleep(1000);
//            }
//        } catch (Exception e){
//            System.out.println(e.getStackTrace());
//        }

        System.out.println();
        llp.printData();

//        llp.delFirst();

        llp.delLast();
    }
}
