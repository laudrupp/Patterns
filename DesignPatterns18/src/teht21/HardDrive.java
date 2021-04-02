package teht21;

import java.util.Random;

class HardDrive {
	
	byte[] list = new byte[] { (byte)1, (byte)2, (byte)4, (byte)8, (byte)16, (byte)32, (byte)64, (byte)127 };
	
    public byte[] read(long lba, int size) {
    	return list;
    }
}
