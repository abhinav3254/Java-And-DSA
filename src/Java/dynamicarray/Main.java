package Java.dynamicarray;

public class Main {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.addData(2);
        dynamicArray.addData(4);
        dynamicArray.addData(6);
        dynamicArray.addData(8);
        dynamicArray.addData(10);
        dynamicArray.printData();
        System.out.println();

        System.out.println(dynamicArray.SIZE+" "+dynamicArray.COUNT);
    }
}
