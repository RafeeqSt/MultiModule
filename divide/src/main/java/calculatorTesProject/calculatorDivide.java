package calculatorTesProject;

public class calculatorDivide {
    public static int getSubrtractedNum()
    {
        int ans = calculatorMultiply.getMultipliedNum();
        ans = ans/2;
        System.out.println("After divition : " +ans);
        return ans;
    }
}
