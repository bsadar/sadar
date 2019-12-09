package conpara;

public class ParamCon{
	String Stdname;
	int rolno;
	
	ParamCon(String sname,int prno){
		Stdname=sname;
		rolno=prno;
	}
	void display(){
		System.out.print(Stdname+rolno);
	}

}
