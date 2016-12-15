import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class AccountData 
{

	public static void main(String[] args) throws IOException 
	{
		int zipp = 11111;
		Path path = Paths.get("accountInfo");
		byte[] arr = Files.readAllBytes(path);
		//System.out.println(Integer.toBinaryString(data2[0]));
		//System.out.println(Arrays.toString(data2));
		
		
		
		int accountNum = arr[0];
		accountNum<<=6;
		accountNum |= arr[1] >> 2;
		int accountType = arr[1] & 3;
		int birthYear = (arr[2] << 4) | (arr[3] & 15);
		int birthMon = (arr[3] & 15);
		int birthDay = arr[4] >>3;
		int zip = arr[4] & 7;
		zip = (zip << 8) | arr[5]; 
		zip = (zip<<6) | (arr[6]>>2);
		int age = (arr[6] & 3);
		age = (age<<5) | (arr[7] >> 3);
		int depend = (arr[7] & 7);
		int ss1 = (arr[8] << 2) | (arr[9]>>6);
		int ss2 = (arr[9] & 63) | (arr[10] >>7);
		int ss3 = (arr[10] & 127) | (arr[11]>>1);
		int gender = (arr[11] & 1);
		
		System.out.println(accountNum + ", " + accountType + ", " + birthYear + "/" + birthMon + "/" + birthDay + ", " + zipp
				+ ", " + age + ", " + depend + ", " + ss1 + "" + ss2 +"" + ss3 + ", " + gender);

		



	}

}
