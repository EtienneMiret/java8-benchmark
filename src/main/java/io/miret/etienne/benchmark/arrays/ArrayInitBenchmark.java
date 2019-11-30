package io.miret.etienne.benchmark.arrays;

import org.openjdk.jmh.annotations.Benchmark;

public class ArrayInitBenchmark {

  @Benchmark
  public int[] initialize_only () {
    return new int[] {
        0,
        1,
        2,
        3,
        4,
        5,
        6,
        7,
        8,
        9,
        10,
        11,
        12,
        13,
        14,
        15,
        16,
        17,
        18,
        19,
        20,
        21,
        22,
        23,
        24,
        25,
        26,
        27,
        28,
        29,
        30,
        31,
        32,
        33,
        34,
        35,
        36,
        37,
        38,
        39,
        40,
        41,
        42,
        43,
        44,
        45,
        46,
        47,
        48,
        49,
        50,
        51,
        52,
        53,
        54,
        55,
        56,
        57,
        58,
        59,
        60,
        61,
        62,
        63,
        64,
        65,
        66,
        67,
        68,
        69,
        70,
        71,
        72,
        73,
        74,
        75,
        76,
        77,
        78,
        79,
        80,
        81,
        82,
        83,
        84,
        85,
        86,
        87,
        88,
        89,
        90,
        91,
        92,
        93,
        94,
        95,
        96,
        97,
        98,
        99
    };
  }

  @Benchmark
  public int[] initialize_with_zeros () {
    return new int[100];
  }

  @Benchmark
  public int[] initialize_and_set () {
    int[] arr = new int[100];
    arr[0] = 0;
    arr[1] = 1;
    arr[2] = 2;
    arr[3] = 3;
    arr[4] = 4;
    arr[5] = 5;
    arr[6] = 6;
    arr[7] = 7;
    arr[8] = 8;
    arr[9] = 9;
    arr[10] = 10;
    arr[11] = 11;
    arr[12] = 12;
    arr[13] = 13;
    arr[14] = 14;
    arr[15] = 15;
    arr[16] = 16;
    arr[17] = 17;
    arr[18] = 18;
    arr[19] = 19;
    arr[20] = 20;
    arr[21] = 21;
    arr[22] = 22;
    arr[23] = 23;
    arr[24] = 24;
    arr[25] = 25;
    arr[26] = 26;
    arr[27] = 27;
    arr[28] = 28;
    arr[29] = 29;
    arr[30] = 30;
    arr[31] = 31;
    arr[32] = 32;
    arr[33] = 33;
    arr[34] = 34;
    arr[35] = 35;
    arr[36] = 36;
    arr[37] = 37;
    arr[38] = 38;
    arr[39] = 39;
    arr[40] = 40;
    arr[41] = 41;
    arr[42] = 42;
    arr[43] = 43;
    arr[44] = 44;
    arr[45] = 45;
    arr[46] = 46;
    arr[47] = 47;
    arr[48] = 48;
    arr[49] = 49;
    arr[50] = 50;
    arr[51] = 51;
    arr[52] = 52;
    arr[53] = 53;
    arr[54] = 54;
    arr[55] = 55;
    arr[56] = 56;
    arr[57] = 57;
    arr[58] = 58;
    arr[59] = 59;
    arr[60] = 60;
    arr[61] = 61;
    arr[62] = 62;
    arr[63] = 63;
    arr[64] = 64;
    arr[65] = 65;
    arr[66] = 66;
    arr[67] = 67;
    arr[68] = 68;
    arr[69] = 69;
    arr[70] = 70;
    arr[71] = 71;
    arr[72] = 72;
    arr[73] = 73;
    arr[74] = 74;
    arr[75] = 75;
    arr[76] = 76;
    arr[77] = 77;
    arr[78] = 78;
    arr[79] = 79;
    arr[80] = 80;
    arr[81] = 81;
    arr[82] = 82;
    arr[83] = 83;
    arr[84] = 84;
    arr[85] = 85;
    arr[86] = 86;
    arr[87] = 87;
    arr[88] = 88;
    arr[89] = 89;
    arr[90] = 90;
    arr[91] = 91;
    arr[92] = 92;
    arr[93] = 93;
    arr[94] = 94;
    arr[95] = 95;
    arr[96] = 96;
    arr[97] = 97;
    arr[98] = 98;
    arr[99] = 99;
    return arr;    
  }

}
