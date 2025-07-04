public class Serach {
    public int linearSearch(int[] nums, int target){
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }

    public int binarySearch(int[] nums, int target){
        int n = nums.length;
        int low = 0;
        int high = n -1;

        while (low <= high){
            int mid = low + (high - low) / 2;
            if(nums[mid] == target) return mid;
            else if (nums[mid] < target) low = mid + 1;
            else high = mid + 1;
        }
        return -1;
    }


    public static void main(String[] args){
        int[] arr = {2, -4, 4, 0, 10};
        int[] arr2 = {2, 3, 4, 5, 10, 7 , 9, 19};
        int target = 4;
        Serach sobj = new Serach();
        System.out.println(sobj.linearSearch(arr, target));
        System.out.println(sobj.binarySearch(arr2, target));

    }
}
