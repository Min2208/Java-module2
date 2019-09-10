public class CountString {
    public static void main(String[] args) {

        char a='a';
        String name="vuongdaicaaaaa";
        int count=0;
        for (int i=0;i<name.length();i++){
            char result=name.charAt(i);
            if (a==result){
                count++;
            }
        }
        System.out.println("Result: " + count);
    }
}
