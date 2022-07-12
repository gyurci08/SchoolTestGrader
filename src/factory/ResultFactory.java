package factory;

import modell.Result;

public class ResultFactory {
    public static Result newResult(String type, int percent, boolean isJavito){
        return new Result(type, percent, isJavito);
    }
}
