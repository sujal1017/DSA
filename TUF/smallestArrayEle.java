public class smallestArrayEle {
    public static void main(String[] args) {
        int arr [] = {1,5,2,4,3,6,8,6};

        int smallest = arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest = arr[i];
            }
        }

        System.out.println("Smallest Array Element is " + smallest);
    }
    
}
