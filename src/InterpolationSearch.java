
public class InterpolationSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataSet set = new DataSet(10000);
		boolean Found = false;
		int Search=400;
		int low = 0;
		int high = set.getSize();
		int mid=0;
		while(!Found){
			if(low > high){
				System.out.println("Number not found");
				break;
			}
			mid = low+((high-low)/(set.data[high]-set.data[low]))*(Search-set.data[low]);
			set.NumberTry++;
			
			if(set.data[mid]==Search){
				System.out.println("number found with " + set.NumberTry+ "at position mid" + mid);
				Found = true;
			}
			if(set.data[mid] < Search){
				low = mid+1;
			}
			if(set.data[mid] > Search){
				high = mid-1;
			}
			
			
		}
		


	}

}
