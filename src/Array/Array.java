package Array;

public class Array {
    int[] items;
    int count;

    public Array(int length) {
        items = new int[length];
    }

    public void Print() {
        for (int i = 0; i < count; i++) {
            System.out.print(items[i] + " ");
        }
    }

    public void Insert(int number) {
        if (count == items.length) {
            int[] newItems = new int[count * 2];
            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }
            items = newItems;
        }
        items[count] = number;
        count++;
    }

    public void Delete(int index) {
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException();
        }

        for (int i = index; i < count; i++) {
            items[i] = items[i + 1];
        }
        count--;
    }

    public int IndexOf(int number) {
        for (int i = 0; i < count; i++) {
            if (items[i] == number) {
                return i;
            }
        }
        return -1;
    }

    public void Update(int index, int value) {
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException();
        }
        items[index] = value;
    }
}
