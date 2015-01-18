import org.apache.thrift.TException;

//import mytest1.Iface;


public class Handler implements mytest1.Iface {

	@Override
	public int add(int num1, int num2) throws TException {
		// TODO Auto-generated method stub
		return num1+num2;
	}

}
