

class largest_ele_array {
    public static void main(String[] args) {
        int []arr = {1,4,2,6,7,12,11,15,4,7,15};
        
        int largest = arr[0];
        int slargest = -1;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                slargest=largest;
                largest=arr[i];
            }
            if(arr[i]>slargest && arr[i]!=largest){
                slargest=arr[i];
            }
        }
        
        
        System.out.println("Largest : " + largest);
        System.out.println("SLargest : " + slargest);
        
    }
}