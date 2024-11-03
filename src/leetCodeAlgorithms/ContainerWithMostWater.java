package leetCodeAlgorithms;

//You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the
//ith line are (i, 0) and (i, height[i]).Find two lines that together with the x-axis form a container, such that the
//container contains the most water. Return the maximum amount of water a container can store. Notice that you may not
// slant the container.
// link: https://leetcode.com/problems/container-with-most-water/?envType=problem-list-v2&envId=array

public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        int volume = 0;
        int end = height.length - 1;
        int begin = 0;
        while (begin < end){
            int heightVolume;
            if (height[begin] < height[end]) {
                heightVolume = height[begin];
            }
            else heightVolume = height[end];
            int newVolume = heightVolume * (end-begin);
            if (newVolume > volume) volume = newVolume;

            if (height[begin] < height[end]) begin++;
            else end--;
        }

        return volume;
    }
}