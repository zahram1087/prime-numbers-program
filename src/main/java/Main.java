public class Main {
    public static void main (String[] args){
        Stack nums = new Stack();
        for(int i= 2; i<=1000; i++){
            boolean isPrime = true;
            for(int div = 2; div*div <=i; div++){ //div*div allows for faster response 
                if(i % div == 0){
                   isPrime = false;
                   break;
                }
            }
            if(isPrime){
                nums.push(2); ///why won't it recgonize data as i?
                System.out.println(i);
//                System.out.println(nums.push(i));

            }


        }

    }
}
