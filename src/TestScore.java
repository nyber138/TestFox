public class TestScore
{
    private int average;
    private int[] TestScores;

    //constructor
    public TestScore(int[] testScores)
    {
        TestScores = testScores;
    }

    private int TestAverage(int[] testScores) throws IllegalArgumentException
    {
        int avg = 0;
        for(int i = 0; i < testScores.length; i++)
        {
            if(testScores[i] < 0 || testScores[i] > 100)
                throw new IllegalArgumentException();
            average += testScores[i];
        }
        return average;
    }

    public static void main(String args[])
    {
        int[] shmoo = new int[4];
        shmoo[0] = 4;
        shmoo[1] = 3;
        shmoo[2] = 10;
        shmoo[3] = 14;

        TestScore shmoogy = new TestScore(shmoo);
    }
}
