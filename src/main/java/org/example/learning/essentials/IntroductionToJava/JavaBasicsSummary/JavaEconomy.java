package org.example.learning.essentials.IntroductionToJava.JavaBasicsSummary;

/**
 * Created by User on 15.06.2025
 */
public class JavaEconomy {


    public static void main(String[] args) {
        assets();
    }

    private static void assets() {
        String suffix = " bln USD";

        // Wyświetlanie wartości aktywów
        System.out.println("currency reserves      : " + (int) currencyReserves() + suffix);
        System.out.println("sovereign wealth funds : " + (int) sovereignWealthFunds() + suffix);
        System.out.println("assets managers        : " + (int) assetManagers() + suffix);

        int liquidBankAssets = (int) bankAssets() / 4;
        System.out.println("liquid bank assets     : " + liquidBankAssets + suffix);
        System.out.println("pension funds          : " + pensionFunds() + suffix);

        System.out.println();

        // Uwzględnianie powtarzających się danych w pension funds i sovereign wealth funds
        double result = (liquidBankAssets + currencyReserves() + sovereignWealthFunds() +
                assetManagers() + pensionFunds() - 1.73);

        int result2 = (int) result;
        System.out.println("All liquid assets = " + result2 + suffix);
    }

    private static int pensionFunds() {
        int[] pensionFunds = {
                2456, 1790, 1356, 1507, 1062, 737, 570, 498, 462, 402, 389, 251,
                348, 247, 282, 240, 183, 182, 160, 228, 134, 125, 106, 124, 112,
                80, 79, 70, 85, 56, 0
        };

        int totalPensionFunds = 0;

        // Sumowanie wartości funduszy emerytalnych
        for (int fund : pensionFunds) {
            totalPensionFunds += fund;
        }

        return totalPensionFunds / 1000;
    }

    private static double bankAssets() {
        double[] bankAssets = {
                6303.44, 5623.12, 5400.28, 4578.28, 4002.81, 3349.42, 2919.84, 2867.44,
                2816.77, 2736.95, 2217.86, 2200.83, 2027.34, 1986.36, 1982.89, 1932.47,
                1923.56, 1891.72, 1717.49, 1717.25, 1706.80, 1641.59, 1625.60, 1566.41,
                1555.30, 1450.57, 1432.59, 1428.29, 1276.63, 1262.95, 1207.18, 1193.69,
                1122.76, 1082.37, 1078.35, 1066.74, 1041.11, 990.19, 955.14, 882.30,
                872.90, 868.74, 857.25, 822.84, 815.91, 787.93, 780.05, 769.59, 726.27,
                712.49, 702.03, 683.41, 678.45, 671.13, 664.50, 663.49, 662.71, 629.99,
                581.88, 571.64, 562.58, 561.58, 560.10, 555.72, 551.94, 542.81, 535.35,
                533.48, 527.53, 520.34, 503.31, 495.55, 493.18, 464.34, 457.25, 456.47,
                447.72, 446.95, 443.37, 441.53, 435.14, 417.72, 409.88, 396.62, 394.76,
                394.46, 388.42, 384.04, 383.47, 377.29, 372.67, 368.41, 365.96, 358.79,
                352.87, 351.79, 345.81, 339.21, 338.14, 337.65
        };

        double totalAssets = 0;

        // Sumowanie aktywów banków
        for (double asset : bankAssets) {
            totalAssets += asset;
        }

        return totalAssets / 1000;
    }

    private static double currencyReserves() {
        long[] reserves = {
                3591327, 1238950, 952687, 692721, 620800, 576846, 434547, 421400,
                415700, 388571, 383721, 345338, 279631, 272693, 243610, 237866,
                230328, 223200, 216074, 210000, 189228, 159246, 149416, 138100,
                125451, 123084, 119700, 112434, 100983, 100000, 93342, 93196,
                82473, 82000, 80110, 73483, 70524, 68028, 67450, 65018, 64560,
                62438, 57269, 53710, 46420, 42527, 41344, 40507, 35395, 35310,
                34980, 34856, 34500, 32195, 32037, 31712, 31119, 27429, 24300,
                24283, 21390, 20846, 20600, 18496, 18765, 18400, 16163, 15965,
                15449, 14738, 14371, 14200, 13200, 12599, 11650, 9800, 9707,
                9109, 8711, 8697, 8623, 7995, 7650, 7390, 7022, 6847, 6700,
                6467, 6143, 5908, 5800, 5600, 5591, 5500, 5290, 5224, 5120,
                5080, 4921, 4900, 4339, 4298, 3980, 3926, 3913, 3700, 3689,
                3654, 3459, 3430, 3368, 3305, 2976, 2935, 2519, 2510, 2500,
                2390, 2210, 2100, 1900, 1700, 1500, 1300, 1000, 800, 600, 500,
                400, 300, 200, 100
        };

        long totalReserves = 0;

        // Sumowanie rezerw walutowych
        for (long reserve : reserves) {
            totalReserves += reserve;
        }

        return (double) totalReserves / 1_000_000;
    }

    private static double sovereignWealthFunds() {
        long[] aumData = {
                1738, 1332, 1090, 1057, 1029, 925, 801, 629, 526, 514, 414, 436,
                341, 317, 302, 287, 223, 196, 189, 156, 133, 123, 87, 80, 80,
                73, 67, 57, 55, 47, 43, 38, 36, 35, 33, 32, 25, 25, 22, 22, 20,
                18, 17, 16, 15, 12, 12, 11, 11, 11, 10, 9, 9, 9, 9, 7, 7, 7, 5,
                5, 5, 4, 3, 3, 2, 2, 2, 2, 2, 1, 1, 1, 0, 0, 0, 0
        };

        long totalAum = 0;
        for (long aum : aumData) {
            totalAum += aum;
        }

        return (double) totalAum / 1000;
    }

    private static double assetManagers() {
        long[] aumData = {

                10473, 9300, 5303, 4340, 3629, 3564, 2858, 2848, 2620, 2600,
                2479, 2015, 1730, 1670, 1663, 1604, 1512, 1501, 1496, 1485
        };

        // Obliczanie łącznej wartości AUM w bilionach USD
        double totalAumBillion = 0;
        for (long aum : aumData) {
            totalAumBillion += aum;
        }

        return totalAumBillion / 1000.0;

    }

}
