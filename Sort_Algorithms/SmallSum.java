public class SmallSum {

    public static void main(String[] args) {
        int[] a = {4,1,2,3,6,1, 7};
        System.out.println(sort(a, 0, a.length-1));
    }
    public static int sort(int[] arr, int left, int right){
        if(left==right)return 0;

        int mid = left + (right-left)/2;
        return sort(arr, left, mid) + sort(arr, mid+1, right) + merge(arr, left, right, mid);
    }

    public static int merge(int[] arr, int left, int right, int mid){
        int[] temp = new int[right-left+1];
        int l = left;
        int r = mid+1;
        int count = 0;
        int sum = 0;
        while(l<=mid&&r<=right){
            sum += arr[l]<arr[r]?arr[l]*(right-r+1):0;
            temp[count++] = arr[l]<arr[r]?arr[l++]:arr[r++];

        }

        while(l<=mid){
            temp[count++] = arr[l++];
        }

        while(r<=right){
            temp[count++] = arr[r++];
        }
        count = 0;
        while(left<=right){
            arr[left++] = temp[count++];
        }
        return sum;
    }
}
