package week_08.assignments;

import java.util.Scanner;

public class Question_08_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of banks : ");
        int countOfBanks = input.nextInt();
        System.out.println("Enter minimum total assets for keeping a bank safe : ");
        double limit = input.nextDouble();
        double[][] borrowers = new double[countOfBanks][countOfBanks];
        double[] totalAssetsOfBanks = new double[countOfBanks];

        for (int bank = 0; bank < totalAssetsOfBanks.length; bank++) {
            System.out.println("Enter bank " + bank + "'s balance \n" +
                    "Enter the number of banks that borrowed money from bank " + bank + "\n" +
                    "Enter borrower ID\n" +
                    "Enter Amount borrowed");
            totalAssetsOfBanks[bank] = input.nextDouble();  //bank's balance
            int countOfBanksBorrowedMoney = input.nextInt();
            for (int i = 0; i < countOfBanksBorrowedMoney; i++) {
                int bankID = input.nextInt();
                double loan = input.nextDouble();
                borrowers[bank][bankID] = loan;
                totalAssetsOfBanks[bank] += loan;
            }
        }
        boolean systemArranged = true;
        while (systemArranged) {
            int[] unsafeBankList = checkLimit(totalAssetsOfBanks, limit);
            systemArranged = isLoanSafetyChanged(unsafeBankList, borrowers, totalAssetsOfBanks);
            if (!systemArranged) {
                printUnsafeBanks(unsafeBankList);
            }
        }
    }

    public static int[] checkLimit(double[] totalAssets, double limit) {
        int countOfUnSafeBanks = 0;
        for (int bank = 0; bank < totalAssets.length; bank++) {
            if (totalAssets[bank] < limit) {
                countOfUnSafeBanks++;
            }
        }
        if (countOfUnSafeBanks > 0) {
            int[] unsafeBanks = new int[countOfUnSafeBanks];
            int index = 0;
            for (int bank = 0; bank < totalAssets.length; bank++) {
                if (totalAssets[bank] < limit) {
                    unsafeBanks[index] = bank;
                    index++;
                }
            }
            return unsafeBanks;
        } else {
            int[] allBanksSafe = new int[1];
            allBanksSafe[0] = -1;
            return allBanksSafe;
        }
    }

    public static boolean isLoanSafetyChanged
            (int[] unsafeBanks, double[][] borrowers, double[] totalAssets) {
        if (unsafeBanks[0] == -1) {
            return false;
        }

        boolean sthChanged = false;
        for (int i = 0; i < unsafeBanks.length; i++) {
            for (int j = 0; j < borrowers.length; j++) {
                totalAssets[j] -= borrowers[j][unsafeBanks[i]];
                if (borrowers[j][unsafeBanks[i]] != 0) {
                    sthChanged = true;
                    borrowers[j][unsafeBanks[i]] = 0;
                }
            }
        }
        return sthChanged;
    }


    public static void printUnsafeBanks(int[] unsafeBanks) {
        System.out.println("Unsafe bank are ");
        for (int i = 0; i < unsafeBanks.length; i++) {
            System.out.print(unsafeBanks[i] + " ");
        }
    }
}

