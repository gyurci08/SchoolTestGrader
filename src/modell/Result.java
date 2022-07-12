package modell;

public class Result {
    private String type;
    private int percent;
    private boolean isJavito;

    public boolean isJavito() {
        return isJavito;
    }

    public String getType() {
        return type;
    }

    public double getPercent() {
        return percent;
    }



    public Result(String type,int percent, boolean isJavito){this.type=type;
this.percent=percent; this.isJavito=isJavito;
    }
}
