public class _p90_Temperaturas {
    public static void main(String[] args) {
        double[] n = {2.34, 44.56, 7.89, 0.5, 2.5, 4.67, 40.3, 22.35, 56.22};
        System.out.println(n[0]);
        System.out.println(n[2]);
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }
        for (int i = 0; i < n.length; i++) {
            if(n[i]>10){
                n[i]=0;
            }
            System.out.println(n[i]);
        }
    }
}
