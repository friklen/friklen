package ru.netology.stats;

public class StatsService {
    int sum(int[] purchases) {
        int result = 0;
        for (int purchase : purchases) {
            result += purchase;
        }
        return result;
    }
}
 int average(int[] purchases) {
        return sum(purchases) / purchases.length;
    }


   int monthWithMax(int[] purchases) {
        int max = purchases[0];
        for (int purchase : purchases) {
            if (purchase > max) {
                max = purchase;
            }
        }
        int mountNumber = 0;
        int mounthWithMax = 0;
        for (int purchase : purchases) {
            mountNumber++;
            if (purchase == max) {
                mounthWithMax = mountNumber;
            }
        }
        return mounthWithMax;
    }


    int monthWithMin(int[] purchases) {
        int min = purchases[0];
        for (int purchase : purchases) {
            if (purchase < min) {
                min = purchase;
            }
        }
        int mountNumber = 0;
        int mounthWithMin = 0;
        for (int purchase : purchases) {
            mountNumber++;
            if (purchase == min) {
                mounthWithMin = mountNumber;
            }
        }
        return mounthWithMin;
    }


    int moreThanAverage(int[] purchases) {
        int average = average(purchases);
        int count = 0;
        for (int purchase : purchases) {
            if (purchase > average) {
                count++;
            }
        }
        return count;
    }


    int lessThanAverage(int[] purchases) {
        int average = average(purchases);
        int count = 0;
        for (int purchase : purchases) {
            if (purchase < average) {
                count++;
            }
        }
        return count;
    }
}