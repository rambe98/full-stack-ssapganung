package super_ex;
/*
class SharpPencil{ //샤프펜
    private int width; //펜의 굵기
    private int amount; //남은 량
    public int getAmount(){return amount;}
    public void setAmount(int amount){this.amount = amount;}
}

class Ballpen{ //볼펜
    private int amount; //남은 량
    private String color; //볼펜의 색
    public int getAmount(){return amount;}
    public void setAmount(int amount){this.amount = amount;}
    public String getColor(){return color;}
    public void setColor(String color){this.color = color;}
}

class FountainPen{
    private int amount; //남은양
    private String color; //볼펜의 색
    public int getAmount(){return amount;}
    public void setAmount(int amount){this.amount = amount;}
    public String getColor(){return color;}
    public void setColor(String color){this.color = color;}
    public void refill(int n){setAmount(n);}
}
*/
// ------------------------ 간소화 ---------------------
class Pen{
	private int amount;
	public int getAmount(){return amount;}
	public void setAmount(int amount){this.amount = amount;}
}
class SharpPen extends Pen{
	private int width;
}
class BallPen extends Pen{
	private String color;
	public String getColor(){return color;}
    public void setColor(String color){this.color = color;}
}
class FountainPen extends BallPen{
	public void refill(int n){setAmount(n);}
}

public class PenMain {

	public static void main(String[] args) {


	}

}
