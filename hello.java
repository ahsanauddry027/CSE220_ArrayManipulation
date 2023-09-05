public class hello{
    public static void main (String[] args){
        int []newArr = {10,20,30,40,50}; // reverse this Array by in-Place method
        rightshift(newArr);
    }
    public static void rightshift (int[] newnew){
        int temp = newnew[newnew.length-1];
        for (int i=newnew.length-1;i>-1;i--){
            if (i==newnew.length-1){
                temp = newnew[i];
            }
            if (i==0){
                newnew[i] = temp;
            } else newnew[i] = newnew[i-1];

        }
        for (int value = 0;value<newnew.length;value++){
        if (value < newnew.length-1){
            System.out.print(newnew[value]+" ");    
        }else System.out.print(newnew[value]);
        }
    }
}