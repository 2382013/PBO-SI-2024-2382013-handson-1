public class KonfersiTipeDataNumber {
    public static void main(String[] args) {
        //widening
        short tipeDataShort = 10;
        int tipeDataInt =tipeDataShort;
        long tipeDataLong = tipeDataInt;

        //Narrowing
        int tipeDataInterger2 = 10;
        byte tipeDataByte = (byte) tipeDataInterger2;

        //number overflow
        int tipeDataInteger = 128;
        byte tipeDataByteConverted = (byte) tipeDataInteger
    }
}
