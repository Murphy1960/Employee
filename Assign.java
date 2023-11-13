public class Assign {
    public static void main(String[] args) {
       /* int[] age = new int[5];
        int sum=0,num=age.length,maximum=age[0],minimum=age[0];


        age[0]=22;
        age[1]=18;
        age[2]=20;
        age[3]=13;
        age[4]=56;
        for(int j=0;j<=4;j++){
            System.out.println("Ages are: "+age[j]);
            sum+=age[j];
            if(age[j]>maximum){
                maximum=age[j];
            }
            if(age[j]<minimum){
                minimum=age[j];
            }
        }
        System.out.println("Sum is :"+sum);
        float avg=(float)sum/num;
        System.out.println("Avearge age is : "+avg);
        //maximum age
        System.out.println("maximum age is : "+maximum);
        //minimum age
        System.out.println("minimum age is : "+minimum);

        */
        //Multidimensional array
        int marks[][] = new int[3][3];
        marks[0][0]=90;
        marks[0][1]=78;
        marks[0][2]=60;
        marks[1][0]=56;
        marks[1][1]=88;
        marks[1][2]=97;
        marks[2][0]=69;
        marks[2][1]=55;
        marks[2][2]=93;

        for(int i=0;i<marks.length;i++){
            System.out.println("Student "+i);
            for(int j=0;j<marks.length;j++){
                System.out.println("\t"+marks[i][j]);
            }
            System.out.println();
        }


    }
}
