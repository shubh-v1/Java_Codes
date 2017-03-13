package lecjan;

public class client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		linkedlist ll=new linkedlist();
		ll.addfirst(10,null);
		ll.addfirst(20,null);
		ll.addfirst(30,null);
		ll.addfirst(40,null);
		//ll.addbet(50,1);
		ll.display();
		System.out.println();
		//System.out.println(ll.removebet(1));
		//ll.display();
		ll.reverseDR();
		System.out.println();
		ll.display();
	}

}
