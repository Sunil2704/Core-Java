package Array;

public class EvenArray {
    public static void main(String[] args) {
        int as[]={123,456,789,963,852,741};
        for(int i=0;i<=as.length-1;i++ )
        if(as[i]%2==0)
        {
            System.out.println(as[i]);
        }
    }
}
