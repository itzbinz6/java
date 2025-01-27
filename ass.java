import java.util.Arrays;
import java.util.Scanner;

public class ass{
    public static void singleloopflag1(int times){   
        for(int j=0;j<times;j++){
           System.out.println("****====****");
       }
   }
   public static void nestedloopofflag1(int width, int height){
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if(j<width/3){
                    System.out.print("*");
                }else if (j<2*width/3) {
                    System.out.print("=");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
   }
   public static void singleloopflag2(int times){
        for (int i = 0; i < times/2; i++) {
            System.out.println("*******=========");
        }
        for (int i = 0; i < times/2; i++) {
            System.out.println("================");
        }
   }
   public static void nestedloopofflag2(int width, int height){
        for (int i = 0; i < height/2; i++) {
            for (int j = 0; j < width; j++) {
                if(j<width/2){
                    System.out.print("*");
                }else if(j<2*width/3){
                    System.out.print("=");
                }else{
                    System.out.print("=");
                }
            }   
            System.out.println();
        }
        for (int j = 0; j < height/2; j++) {
            System.out.println("===============");
        }
   }
   public static void standarddeviation(Double[] numbers){
        
        double total_num=0;
        double part_1=0;
        for(Double number:numbers){
            total_num=total_num+number;
        }
        double mean=total_num/numbers.length; 
        for(Double number:numbers){
            part_1+=Math.pow(number-mean,2);
        }
        double n=numbers.length;
        /*For sorting */
        Arrays.sort(numbers);
        /*Caculating the median */
        double median;
        if(n % 2==0){
            median=(numbers[(int) (n/2-1)]+numbers[(int) (n/2)])/2.0;
        }else{
            median=numbers[(int) (n/2)];
        }
        double part_2=part_1/numbers.length;
        double part_3=Math.sqrt(part_2);
        System.out.printf("The sd is %.2f ",part_3);
        System.out.print("\n");
        System.out.println("The median is "+median);
   }
   public static void firstarray(int[] num){
        Scanner input= new Scanner(System.in);
        System.out.println("You can only input "+num.length+" numbers");
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter your values for NO."+(i+1)+": ");
            num[i]=input.nextInt();
            // System.out.print("\n");
            System.out.println(num[i]);
        }
        System.out.println("The elements you entered are:");
        for (int i = 0; i <=9; i=i+1) {
            if(i<9){
                System.out.print(num[i]+", ");
            }else{
                System.out.print(num[i]+". ");
            }
        }
   }   
   public static void secondarray(int[][] array_1){
        Scanner scanner =new Scanner(System.in);
            for(int i=0; i<2;i++){
                for(int j=0; j<10; j++){
                    System.out.println("Enter your value for row = "+ (i+1) +" col = " + (j+1));
                    array_1[i][j]=scanner.nextInt();
                }
            }
            System.out.println("The elements you entered are:");
                    for(int i=0;i<=1;i=i+1){//i=i+1 means increament
                        for(int j=0;j<=9;j++){
                            System.out.print(array_1[i][j]+", ");
                        }
                        System.out.print("\n");
                    }
    }
    public static void main(String[] args) {
        int[][]array_1 = new int[10][10];
        int[]num=new int[10];
        Double[] numbers={2.0,5.0,5.0,9.0,4.0,7.0,0.0,9.0,6.0,11.0,12.0};
        System.out.println("This Assignment was done by Ajayi Abisola Enoch\nReg No: 2302025\nMatric No: 23CD010103");
        System.out.println();
        System.out.println("Question No1a.");
        singleloopflag1(4);
        System.out.println();
        System.out.println("Question No1b.");
        nestedloopofflag1(12, 4);
        System.out.println();
        System.out.println("Question No2a.");
        singleloopflag2(7);
        System.out.println();
        System.out.println("Question No2b.");
        nestedloopofflag2(15, 6);
        System.out.println();
        System.out.println("Question No3.");
        standarddeviation(numbers);
        System.out.println();
        System.out.println("Question No4.");
        firstarray(num);
        System.out.println();
        System.out.println("Question No5.");
        secondarray(array_1);
        System.out.println();
        System.out.print("\n");
        
    }
}