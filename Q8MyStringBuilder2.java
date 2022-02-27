class MyStringBuilder2{
    // data
    char[] array;
    int size;
    int capacity;

    // constructor
    public MyStringBuilder2(String s) {
        array = new char[capacity];
        for (int i = 0; i < s.length(); i++) {
            array[i] = s.charAt(i);
        }
        size = s.length();
    }

    // append
    public MyStringBuilder2 append(MyStringBuilder2 s) {
        char[] array2 = new char[capacity];
        for (int i = 0; i < this.size; i++) {
            array2[i] = this.array[i];
        }
        for (int i = this.size; i < this.size + s.size; i++) {
            array2[i] = s.array[i - this.size];
        }
        array = array2;
        this.size += s.size;
        return this;
    }

    // substring
    public MyStringBuilder2 substring(int begin, int end){
        MyStringBuilder2 subArray = new MyStringBuilder2("");
        char[] sub = new char[end-begin];
        for (int i = begin; i < end && i < this.size; i++) {
            sub[i-begin] = array[i];
        }
        subArray.array = sub;
        subArray.size = sub.length;
        return subArray;
    }

    // getter
    public int getSize() {
        return size;
    }
    public int getCapacity() {
        return capacity;
    }
    public char[] getArray() {
        return array;
    }
}