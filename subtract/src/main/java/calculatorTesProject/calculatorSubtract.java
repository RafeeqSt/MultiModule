package calculatorTesProject;

public class calculatorSubtract {

    public static int getSubrtractedNum()
    {
        int ans = calculatorAdd.getAddedNum();
        ans = ans - 2;
        System.out.println("After subtraction : " +ans);
        return ans;
    }
}
