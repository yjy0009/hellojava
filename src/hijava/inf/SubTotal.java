package hijava.inf;

public class SubTotal
{
    public int sum(int[] nums)
    {
        int reslut = 0;
        for (int num : nums)
            reslut += num;
        return reslut;
    }

    public int avg(int[] nums)
    {
        int total = sum(nums);
        return total / nums.length;
    }
}
