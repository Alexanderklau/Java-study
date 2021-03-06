public class Array {

//
    private  int[] data;
    private int size;

//  构造函数，传入数组容量构造array
    public Array(int capacity){
        data = new int[capacity];
        size = 0;
    }

//  无参数构造函数，默认容量10
    public Array(){
        this (10);
    }

//  获取元素个数
    public int getSize(){
        return size;
    }

//  获取数组容量
    public int getCapacity(){
        return data.length;
    }

//  判断数组是否为空
    public boolean isEmpty(){
        return size == 0;
    }

//  向最后的元素添加值
    public void  addLast(int e){
        add(size, e);
    }

//  向第一个元素添加值
    public void addFirst(int e){
        add(0, e);
    }

//  向指定位置添加元素
    public void add(int index, int e){
        if (size == data.length) {
            throw new IllegalArgumentException("Add failed");
        }
        if (index < 0 || index > size){
            throw new IllegalArgumentException("Add failed");
        }
        for(int i = size - 1 ; i >= index; i --){
            data[i + 1] = data[i];
        }
        data[index] = e;
        size ++;
    }
}
