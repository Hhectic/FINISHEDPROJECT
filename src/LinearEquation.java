public class LinearEquation {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public LinearEquation(int x1, int y1, int x2, int y2){
        if (x1 != x2) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }
    }

    public double distance(){
        double x = x2 - x1;
        double y = y2 - y1;
        double dis = (Math.pow((Math.pow(x,2)+Math.pow(y,2)),0.5));
        double holy = roundedToHundredth(dis);
        return holy;
    }

    public double yIntercept(){
        double yint = y2 - slope()*x2;
        return yint;
    }

    public double slope(){
        double slop = Math.round(((double)(y2 - y1)/(x2-x1))*100.00);
        double HA = slop/100;
        return HA;
    }

    public String equation(){
        int x = x2-x1;
        int y = y2-y1;

        if (y%x == 0){
            int slope1 = y/x;
            return "y = " + slope1 + "x" + " - " + Math.abs(yIntercept());
        } else {
            if(x<0){
                x = Math.abs(x);
                y = -y;
            }
            String slope = y + "/" + x;

            if (yIntercept() < 0) {
                return "y = " + slope + "x" + " - " + Math.abs(yIntercept());
            } else {
                return "y = " + slope + "x" + " + " + Math.abs(yIntercept());
            }
        }
    }
    public double roundedToHundredth(double toRound){
        double hund = Math.round((toRound * 100.00))/100.00;
        return hund;
    }

    public String lineInfo(){
        return "The two points are : " + "(" + x1 + "," + y1 + ")" + " and (" + x2 + "," + y2 + ")" + "\n" + "The equation of the line between these two points is: " + equation() + "\n" + "The slope of this line is: " + slope() + "\n" + "The y intercept of this line is: " + yIntercept() + "\n" + "The distance between the two points is: " + distance();
    }

    public String aya(int ok){
        double y = slope()*ok+yIntercept();
        double ah = ok;
        return "The point on the line is (" + ah + "," + y + ")";
    }










}