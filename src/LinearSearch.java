
public class LinearSearch {

	
	public static void main(String[] args) {
		DataSet set = new DataSet(10000);
		boolean Found = false;
		int Search=700;
		for(int i=0;i<set.getSize();i++){
			if(set.data[i]== Search){
				System.out.println("found the lement at position:" + i);
				Found = true;
				break;
			}
			
		}
		if(Found == false){
			System.out.println("elemenet not present");
		}
		
		
		// TODO Auto-generated method stub

	}

}
