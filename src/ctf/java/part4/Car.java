package ctf.java.part4;

abstract class Car {
	public int mile=0;
	public int oil=0;
	public abstract void move();
	public abstract void stop();
	
	public void fillOil(int fill) {
		oil += fill;
	}
}
