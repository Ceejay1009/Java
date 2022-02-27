public class MyString2 {
    private char[] string;

    public MyString2() {
        this.string = new char[0];
    }

    public MyString2(String s) {
        string = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            string[i] = s.charAt(i);
        }
    }

    public String getArray(){
        String str = "";
        for(int i = 0; i < string.length; i++ ){
            str += string[i];
        }
        return str;
    }
    public MyString2 substring(int begin) {
        char[] result = new char[string.length - begin];
        for (int i = begin; i < string.length; i++) {
            result[i - begin] = string[i];
        }
        MyString2 myString = new MyString2();
        myString.string = result;
        return myString;
    }

    public MyString2 toUpperCase() {
        char[] result = new char[string.length];
        for (int i = 0; i < string.length; i++) {
            result[i] = Character.toUpperCase(string[i]);
        }
        MyString2 myString = new MyString2();
        myString.string = result;
        return myString;
    }

    public static MyString2 valueOf(boolean b) {
        if (b) {
            return new MyString2("true");
        } else {
            return new MyString2("false");
        }
    }
}
