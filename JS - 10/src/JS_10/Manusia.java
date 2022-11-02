/*
 * 
 * @Created by: 21343011 - Nur Chintia Ningsih
 */
package JS_10;

import java.util.Scanner;

public class Manusia {
	String nama, tempat_lahir, tgl_lahir;
	String berat_badan;
	String tinggi_badan;
	
	public void inputdata() {
		try (Scanner input = new Scanner (System.in)) {
			System.out.println("Masukan nama lengkap\t: ");
			nama = input.nextLine ();
			System.out.println("Masukan tempat lahir\t: ");
			tempat_lahir = input.nextLine ();
			System.out.println("Masukan tanggal lahir\t: ");
			tgl_lahir = input.nextLine ();
			System.out.println("Masukan Berat Badan\t: ");
			berat_badan = input.nextLine ();
			System.out.println("Masukan Tinggi Badan\t: ");
			tinggi_badan = input.nextLine ();
			}
		}
		public void identitas() {
		System.out.println("Nama saya \t: " + nama);
		System.out.println("Tempat lahir \t: " + tempat_lahir);
		System.out.println("Tanggal lahir \t: " + tgl_lahir);
		System.out.println("Berat Badan \t: " + berat_badan+"kg");
		System.out.println("Tanggal lahir \t: " + tinggi_badan+"cm");
		}
		
		public static void main(String[] args) {
			Manusia A = new Manusia();
			A.inputdata();
			A.identitas();
		

	}

}
