// Problem:- Maximum Balanced String Partitions
public class Q1 {
    public static void main(String[] args){
        String str = "LRRRRLLRLLRL";
        int count = 0;
        int balancedCount = 0;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='L'){
                count++;
            }else{
                count--;
            }
            if(count==0){
                balancedCount++;
            }
        }

        System.out.println(balancedCount);
    }
}
