public class JavaBuzz {

    public static void main(String[] args){
        for(int i = 1; i <= 100; i++){
            System.out.println(javaBuzz(i));
        }
    }

    public static String javaBuzz(int num){
        if(num % 3 == 0 && num % 5 == 0) {
            return "JavaBuzz";
        } else if(num % 3 == 0){
            return "Java";
        } else if(num % 5 ==0){
            return "Buzz";
        }
        return Integer.toString(num);
    }
}
