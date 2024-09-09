
class SearchAndInsert {

    public int searchAndInsert(int[] nums, int target) {
        if (nums.length == 0) {
            return -1;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }

        return nums.length;

    }

    public static void main(String[] args) {
        SearchAndInsert searchAndInsert = new SearchAndInsert();
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        System.out.println(searchAndInsert.searchAndInsert(nums, target));
    }
}