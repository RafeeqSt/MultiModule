package calculatorTesProject;

public class calculatorMultiply {
    public static int getMultipliedNum()
    {
        int ans = calculatorSubtract.getSubrtractedNum();
        ans = ans * 2;
        System.out.println("After multiplication : " +ans);
        return ans;
    }
}
