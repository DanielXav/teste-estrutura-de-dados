package br.com.springboot.airbnbanalyses.sort;

public class InsertionSort {

	public static void insertSort(int array[], int array2[], int array3[], int array4[], int array5[], int array6[], int array7[], String array8[],
    		String array9[], String array10[], String array11[], String array12[], String array13[], double array14[], double array15[]) {  
        int n = array.length;  
        for (int j = 1; j < n; j++) {  
            int key = array[j];  
            int key2 = array2[j];
            int key3 = array3[j];
            int key4 = array4[j];
            int key5 = array5[j];
            int key6 = array6[j];
            int key7 = array7[j];
            String key8 = array8[j];
            String key9 = array9[j];
            String key10 = array10[j];
            String key11 = array11[j];
            String key12 = array12[j];
            String key13 = array13[j];
            double key14 = array14[j];
            double key15 = array15[j];
            int i = j-1;  
            while ( (i > -1) && ( array [i] > key ) ) {  
                array [i+1] = array [i];  
                array2[i + 1] = array2[i];
                array3[i + 1] = array3[i];
                array4[i + 1] = array4[i];
                array5[i + 1] = array5[i];
                array6[i + 1] = array6[i];
                array7[i + 1] = array7[i];
                array8[i + 1] = array8[i];
                array9[i + 1] = array9[i];
                array10[i + 1] = array10[i];
                array11[i + 1] = array11[i];
                array12[i + 1] = array12[i];
                array13[i + 1] = array13[i];
                array14[i + 1] = array14[i];
                array15[i + 1] = array15[i];
                i--;  
            }  
            array[i+1] = key;  
            array2[i+1] = key2;
            array3[i+1] = key3;
            array4[i+1] = key4;
            array5[i+1] = key5;
            array6[i+1] = key6;
            array7[i+1] = key7;
            array8[i+1] = key8;
            array9[i+1] = key9;
            array10[i+1] = key10;
            array11[i+1] = key11;
            array12[i+1] = key12;
            array13[i+1] = key13;
            array14[i+1] = key14;
            array15[i+1] = key15;
        }  
    }
}
