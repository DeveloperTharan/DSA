package Array;

public class Main{
    public static void main(String[] args) {
        Array array = new Array(3);
        array.Insert(10);
        array.Insert(20);
        array.Insert(30);
        array.Insert(40);
        array.Insert(50);
        array.Insert(60);
        array.Insert(70);
        array.Insert(80);
        array.Insert(90);
        array.Insert(100);

        array.Delete(6);
        System.out.println(array.IndexOf(40));
        array.Update(0, 200);
        array.Print();
    }
} 