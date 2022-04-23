package mypackage;

public class MyClass {

	public static void main(String[] args) {
		/*int[] data = new int[]{89, 78, 65, 43, 55, 67, 90, 24, 26, 28, 49, 29};
		int se = 26;
		boolean isFound = false;
		
		for(int i = 0;i<data.length;i++) {
			if (data[i]==se)
			{
				System.out.println("element found at index: "+i);
				isFound= true;
				break;
			}
		}*/
		int[] data = new int[]{23, 24, 26, 28, 29, 40, 43, 49, 55, 59, 65, 67, 78, 82, 89, 90 };
		int se = 40;
		int low, high, mid;
		boolean isFound = false;
		low = 0;
		high = data.length;
		mid = (low+high)/2;
		System.out.println("mid:"+data[mid]);
		
		while (true) {
			if (se == data[mid]) 
				{
				System.out.println("Element found at: "+mid);
				isFound=true;
				break;
			}
			else
			{
					if (se > data[mid])
				{
					low = mid;
				}
				else
				{
					high = mid;
				}
			}
			mid = (low+high)/2;
		}
		System.out.println("Element: "+se+"Index:"+mid);
	}

}
