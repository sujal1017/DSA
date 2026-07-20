import java.util.Stack;

public class asteroidCollision735 {
    public int [] asteroid(int [] asteroids){
        int n = asteroids.length;
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<n;i++){
            if(asteroids[i]>0){
                stack.push(asteroids[i]);
            }
            else{
                while(!stack.isEmpty() && stack.peek()>0 && stack.peek() < Math.abs(asteroids[i])){
                    stack.pop();
                }
                if(!stack.isEmpty() && stack.peek() == Math.abs(asteroids[i])){
                    stack.pop();
                }
                else if(stack.isEmpty() || stack.peek()<0){
                    stack.push(asteroids[i]);
                }
            }
        }
        int [] ans = new int[stack.size()];
        for(int i=ans.length-1;i>=0;i--){
            ans[i] = stack.pop();
        }
        return ans;
    }
    public static void main(String[] args) {
        asteroidCollision735 obj = new asteroidCollision735();
        int [] asteroids = {3,5,-6,2,-1,4};
        int[] ans = obj.asteroid(asteroids);
        System.out.print("Final Asteroids: ");
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        
    }
}
