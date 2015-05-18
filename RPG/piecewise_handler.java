public abstract class piecewise_handler
{
    public static int getY(int x, int map)
    {
        int y;
        switch (map)
        {
            case 0:
            {
                y = x < 500 ? 1200 : (x < 1000 ? 300 : 400);
                break;
            }
            default:
            y=0;
            break;
        }
        return y;
    }
}
