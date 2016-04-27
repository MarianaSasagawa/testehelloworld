
public class Ponto2D {
	
	private int x;
	private int y;
	
	public Ponto2D(){
		this(0,0);
	}
	
	public Ponto2D(int x, int y){
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public Ponto2D criarRevertido(){
		return new Ponto2D(this.y, this.x);
	}
	
	public String toString(){
		return "X: "+this.x+" - Y: "+this.y; 
	}


}
