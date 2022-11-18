import java.io.*;
import java.net.*;

public class MyClient{
	public static void main(String[] args){
	
	try{
    	Socket s=new Socket("localhost",2222);
	
	DataOutputStream dos=new DataOutputStream(s.getOutputStream());
	dos.writeUTF("Hello This is from Client");
	
	dos.flush();
	dos.close();
	s.close();
    }
	catch(Exception e){
	System.out.println(e);
    }
  }
}