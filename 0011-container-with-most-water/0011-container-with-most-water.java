class Solution {
    public int maxArea(int[] height) {
        int max = 0;

        int i = 0;
        int j = height.length - 1;
        int h = 0;
        int w = 0;
        int area;

        while(i < j) {
            h = Math.min(height[i], height[j]);
            w = j - i;
            area = w*h;
            max = Math.max(area, max);
            if(height[i] < height[j])
                i++;
            else 
                j--;
        } 

        return max;
    }
}