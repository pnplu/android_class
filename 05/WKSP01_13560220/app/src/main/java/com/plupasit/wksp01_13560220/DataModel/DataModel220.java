ppackage com.plupasit.wksp01_13560220.DataModel;

/**
 * Created by PnPlu on 9/19/2016 AD.
 */
public class DataModel220 {
    private String foods;
    private int qualtitys;
    private double calories;

    public DataModel220(String foods, int qualtitys, double calories)
    {
        this.foods = foods;
        this.qualtitys = qualtitys;
        this.calories = calories;
    }
    public String getFood(){return foods;}
    public void setFood(String foods){this.foods = foods;}
    public int getQualtitys(){return qualtitys;}
    public void gsetQualtitys(int qualtitys){this.qualtitys = qualtitys;}
    public double getCalories(){return calories;}
    public void setCalories(double calories){this.calories = calories;}
}
