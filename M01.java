// 12S24046 - Indah Elsadai Nainggolan
// 12S24053 - Dea Anggreany Hutapea

import java.util.*;
import java.lang.Math;

public class m01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double performa, nilai, a, aB, b, bC, c, d, e;
        double kreditawal;
        String nilaihuruf, kredit;

        kreditawal = 0;
        a = 4.0;
        aB = 3.5;
        b = 3.0;
        bC = 2.5;
        c = 2.0;
        d = 1.0;
        e = 0.0;
        kredit = input.nextLine();
        if (kredit.equals("---")) {
            kredit = kredit;
        } else {
            kreditawal = Integer.parseDouble(kredit);
        }
        nilaihuruf = input.nextLine();
        while (!nilaihuruf.equals("---")) {
            if (nilaihuruf.equals("A")) {
                nilai = 4.0;
            } else {
                if (nilaihuruf.equals("AB")) {
                    nilai = 3.5;
                } else {
                    if (nilaihuruf.equals("B")) {
                        nilai = 3.0;
                    } else {
                        if (nilaihuruf.equals("BC")) {
                            nilai = 2.5;
                        } else {
                            if (nilaihuruf.equals("C")) {
                                nilai = 2.0;
                            } else {
                                if (nilaihuruf.equals("D")) {
                                    nilai = 1.0;
                                } else {
                                    if (nilaihuruf.equals("D")) {
                                        nilai = 0.0;
                                    } else {
                                        nilai = 0.0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            performa = kreditawal * nilai;
            System.out.println(toFixed(performa,1));
            kredit = input.nextLine();
            if (kredit.equals("---")) {
                kredit = kredit;
            } else {
                kreditawal = Integer.parseDouble(kredit);
            }
            nilaihuruf = input.nextLine();
        }
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
