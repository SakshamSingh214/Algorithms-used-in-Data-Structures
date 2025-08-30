import java.util.Arrays;
public class MergeSort{
    public static void Merge(int[]arr1,int lb,int ub,int mid){
        int i=lb;
        int j=mid+1;
        int k=lb;
        int[]b=new int[arr1.length];
        while(i<=mid && j<=ub){
            if(arr1[i]<arr1[j]){
                b[k]=arr1[i];
                i++;
            }
            else{
                b[k]=arr1[j];
                j++;
            }
        k++;
        }
        if(i>mid){
            while(j<=ub){
                b[k]=arr1[j];
                j++;
                k++;
            }
        }
        else{
            while(i<=mid){
                b[k]=arr1[i];
                i++;
                k++;
            }
        }
        for(int a=lb;a<=ub;a++){
            arr1[a]=b[a];
        }
    }
    public static void MS(int[] arr1,int lb,int ub){
        if(lb<ub){
            int mid=(lb+ub)/2;
             MS(arr1,lb,mid);
             MS(arr1,mid+1,ub);
             Merge(arr1,lb,ub,mid);
        }
    }
    public static void main(String[] args){
        int[] array1 = {1, 2, 3, 4, 5};
        System.out.println("Before sort: " + Arrays.toString(array1));
        
        MS(array1, 0, array1.length - 1);
        
        System.out.println("After sort: " + Arrays.toString(array1));
    }
}