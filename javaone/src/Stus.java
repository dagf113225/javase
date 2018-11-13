
public class Stus
{
	
	
	//·ÖÊý
	int  score=100;
	
	
	public static void main(String[] args)
	{
		Stus  s1 = new Stus();
		System.out.println("1-->"+s1.score);//100
		
		Stus  s2 = new Stus();
		System.out.println("2-->"+s2.score);//100
		
		Stus  s3 =s2;
		
		s2=s1;
		s2.score=80;
		
		System.out.println("3------>"+s2.score);

		System.out.println("4------>"+s3.score);
	}

}
