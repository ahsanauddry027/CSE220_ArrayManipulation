// Removing a value from k index and making the array competent
public class App {
    public static void main (String[] args){
        int []newArr = {10,20,30,40,50,0,0,0};
        int index = 2; 
        shifting(newArr,index);
    }
    public static void shifting (int[] newnew,int new2){
        newnew[new2] = 0;
        int lastind=0;
        for (int value=0;value<newnew.length-1;value++){
          
            if (newnew[value] != 0){
                lastind ++;
            }
        }
        
        for (int value=new2;value<lastind+1;value++){
            
            newnew[value] = newnew[value+1];

        }

        for (int value : newnew){
            System.out.println(value);
        }

    }
}
