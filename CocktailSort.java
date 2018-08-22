package sort;
/**
 *
 * @author  LiJing 
 * @date    2017年9月6日 上午8:32:32
 * @Version 1.0
 *
 */
public class CocktailSort {
	public static void main(String[] args) {
		int[] arr={7,6,5,4,3,2,1,0};
		int left = 0;
		int right = arr.length ;
		while(right>left){
			for(int j=left;j<right-1;j++){
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
			     }
			}
			right--;
			for(int j=right;j>left;j--){
				if(arr[j]<arr[j-1]){
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
			     }
			}
			left++;
		}
		for(int p:arr){
			System.out.println(p+"   ");
		}
	}

}
