package com.christo.led_table;

class Utilities
{
    private final static String TAG = Utilities.class.getSimpleName();


    static String byteArrayToHex(byte[] a)
    {
        StringBuilder sb = new StringBuilder(a.length * 2);
        for (byte b : a)
            sb.append(String.format("0x%02X, ", b));
        return sb.toString();
    }

    static int fromByteArray(byte[] bytes)
    {
        if (bytes.length == 1)
            return bytes[0] & 0xFF;

        if (bytes.length == 2)
            return (bytes[1] & 0xFF) << 8 | bytes[0] & 0xFF;

        if (bytes.length == 4)
            return bytes[0] << 24 | (bytes[1] & 0xFF) << 16 | (bytes[2] & 0xFF) << 8 | (bytes[3] & 0xFF);

        return 0;
    }

    static String byteArrayToString(byte[] bytes)
    {
        String string = "";

        for (byte mByte : bytes)
        {
            if (mByte == 0x00)
                return string;
            string += String.format("%c", mByte);
        }

        return string;
    }

}
