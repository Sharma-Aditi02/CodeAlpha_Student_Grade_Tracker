import java.util.*;
public class project1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> grades=new ArrayList<>();
        System.out.println("Enter grade (-1 for exit)");
        while(true){
            System.out.print("Enter grade: ");
            int grade=sc.nextInt();
            if(grade==-1){
                break;
            }
            if(grade<0 || grade>100){
                System.out.println("Please provide valid grade ");
                continue;
            }
            else{
                grades.add(grade);
            }
        }
        if(grades.size()==0){
            System.out.println("No gardes");
        }
        else{
            double Avg=AverageOfGrades(grades);
            int High=HighestGrade(grades);
            int Low=LowestGrade(grades);
            System.out.println();
            System.out.println("================================");
            System.out.println();
            System.out.printf("Average : %10.2f\n",Avg);
            System.out.printf("Highest : %10d\n",High);
            System.out.printf("Lowest : %10d\n",Low);
            System.out.println("================================");
        }
    }
    public static double AverageOfGrades(ArrayList<Integer> grades){
        int sum=0;
        for(int num:grades){
            sum+=num;
        }
        return (double)sum/grades.size();
    }
    public static int HighestGrade(ArrayList<Integer> grades){
        int highest=grades.get(0);
        for(int num:grades){
            if(num>highest){
                highest=num;
            }
        }
        return highest;
    }
    public static int LowestGrade(ArrayList<Integer> grades){
        int lowest=grades.get(0);
        for(int num:grades){
            if(num<lowest){
                lowest=num;
            }
        }
        return lowest;



}
}