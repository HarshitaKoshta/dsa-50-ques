

class PeakInMountainArr{
    public static void main(String[] args) {
        int[] a = {1,3,5,7,6,3,2};
        int st=1,ed=a.length-2;
        while(st<=ed){
            int mid = (st+ed)/2;
            if(a[mid]>a[mid-1]&&a[mid]>a[mid+1]){
                System.out.println("peak element is:"+mid+" value:"+a[mid]);
                break;
            }else if(a[mid]>a[mid-1]){
                st = mid+1;
            }else 
            ed=mid-1;
        }
    }
}