package leet.array;

import java.util.Scanner;

public class four {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read size of first array
        System.out.println("Enter size of the first array:");
        int m = scanner.nextInt();
        int[] nums1 = new int[m];
        System.out.println("Enter the elements of the first array (sorted):");
        for (int i = 0; i < m; i++) {
            nums1[i] = scanner.nextInt();
        }

        // Read size of second array
        System.out.println("Enter size of the second array:");
        int n = scanner.nextInt();
        int[] nums2 = new int[n];
        System.out.println("Enter the elements of the second array (sorted):");
        for (int i = 0; i < n; i++) {
            nums2[i] = scanner.nextInt();
        }

        double median = findMedianSortedArrays(nums1, nums2);
        System.out.println("Median of the two sorted arrays: " + median);
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int i = 0, j = 0, m1 = 0, m2 = 0;

        // Find median
        for (int count = 0; count <= (n + m) / 2; count++) {
            m2 = m1;
            if (i != n && j != m) {
                if (nums1[i] > nums2[j]) {
                    m1 = nums2[j++];
                } else {
                    m1 = nums1[i++];
                }
            } else if (i < n) {
                m1 = nums1[i++];
            } else {
                m1 = nums2[j++];
            }
        }

        // Check if the sum of n and m is odd
        if ((n + m) % 2 == 1) {
            return (double) m1;
        } else {
            double ans = (double) m1 + (double) m2;
            return ans / 2.0;
        }
    }


}
