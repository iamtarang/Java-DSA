import java.util.Arrays;

class MaxFreq {
    public static void main(String[] args) {
                Arrays.sort(nums);

                int l = 0, r = 0, res = 0;
                long total = 0;

                while(r < nums.length){
                    total += nums[r];

                    while((long)nums[r] * (r-l+1) > total + k){
                        total -= nums[l];
                        l++;
                    }

                    res = Math.max(res, r - l + 1);
                    r++;
                }
                return res;
            }
        }
        System.out.println(res);
    } 
}