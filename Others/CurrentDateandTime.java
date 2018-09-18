package practice;
//To get the current system date and time
import java.util.Date;
class dandt
{
	public void currentdt()
	{
		Date date = new Date();
		System.out.println(date);
	}
	
}
public class DT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dandt date = new dandt();
		date.currentdt();
	}
}
