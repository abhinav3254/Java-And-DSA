package Java.dynamicarray;

public class DynamicArray {
    int[] arr;
    int SIZE;
    int COUNT;

    public DynamicArray(){
        SIZE = 1;
        this.arr = new int[SIZE];
        this.COUNT = 0;
    }

    void addData(int data){
        if(arr.length==COUNT){
            growSize();
        }
        arr[COUNT] = data;
        COUNT++;

    }

    private void growSize() {
        int[] temp = new int[SIZE*2];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
        SIZE = SIZE*2;
    }

    public void printData(){
        System.out.print("[");
        for (int i = 0; i < COUNT; i++) {
            System.out.print(arr[i]+", ");
        }
        System.out.print("]");
    }

}
