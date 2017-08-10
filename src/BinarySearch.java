
public class BinarySearch {

	public static void main(String[] args){
		DataSet set = new DataSet(10000);
		boolean Found = false;
		int Search=400;
		int low = 0;
		int high = set.getSize();
		int mid=0;
		System.out.println("size" + high);
		while(!Found){
			mid = low+((high-low)/2);
			set.NumberTry++;
			if(low > high){
				System.out.println("Number not found");
				break;
			}
			if(set.data[mid]==Search){
				System.out.println("number found with " + set.NumberTry+ "at position mid" + mid);
				Found = true;
				break;
			}
			if(set.data[mid] < Search){
				low = mid+1;
			}
			if(set.data[mid] > Search){
				high = mid-1;
			}
			
			
		}
		
		
		// TODO Auto-generated constructor stub
	}

}
