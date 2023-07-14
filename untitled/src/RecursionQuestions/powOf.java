package RecursionQuestions;

public class powOf {
    public static void main(String[] args) {

        int x=2;
        int n=5;
        System.out.println(powe(x,n));

    }

//    Cant handle negative power
    static int powe(int x,int n){
        if(n<0){
            return 0;
        }
int ans=1;
        for(int i=0;i<n;i++){
            ans=ans*x;
        }

        return ans;
    }

}
