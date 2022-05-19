public class TimeComplexity {
    public static void main(String[] args) {
        double now =System.currentTimeMillis();
        TimeComplexity d = new TimeComplexity();
        System.out.println(d.findSum(100));

        System.out.println(System.currentTimeMillis()-now);
    }
    int sum=0;
    public int findSum(int n) {
        for(int i=0;i<=n;i++){
            sum=sum+i;

        }
        return sum;

    }
}
