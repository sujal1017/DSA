public class printName{
    public void name(int n){
        if(n>5){
            return;
        }
        System.out.println("Sujal");
        name(n+1);
    }
    public static void main(String[] args) {
        printName obj = new printName();
        obj.name(1);
    }
}