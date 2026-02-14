// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class mov_0_toEnd{
    public static void main(String[] args) {
        int [] arr = {1,2,0,3,0,4,0,0,7,8};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==0 && arr[j]!=0){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int nums : arr){
            System.out.println(nums +  " " );
        }
    }
}