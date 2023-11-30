package id.ac.undiksha.siak;

import id.ac.undiksha.siak.people.Mahasiswa;
import id.ac.undiksha.siak.people.Dosen;


public class Main {
	
	public static void main(String[] args) { //TODO
		
		Mahasiswa ani = new Mahasiswa();
		
		ani.setNim("12345");
		ani.setNama("Ani");
		ani.setAlamat("Singaraja");
		ani.setTanggalLahir("1 Januari 2000");
		ani.setJenisKelamin(true);
		ani.setProdi("Ilmu Komputer");
		 
		Dosen Prana = new Dosen();
		
		Prana.setNidn("45678");
		Prana.setNama("Prana");
		Prana.setAlamat("Kampung Anyar");
		Prana.setTanggalLahir("31 Desember 1980");
		Prana.setJenisKelamin(false);
		Prana.setMatakuliah("Mata Kuliah: Pemrograman Berorientasi Objek");
		
		
		
		System.out.println (ani.getNim());
		System.out.println (ani.getNama());
		System.out.println (ani.getAlamat());
		System.out.println (ani.getTanggalLahir());
		System.out.println (ani.getJenisKelamin());
		System.out.println (ani.getProdi());
		
		
		System.out.println (Prana.getNidn());
		System.out.println (Prana.getNama());
		System.out.println (Prana.getAlamat());
		System.out.println (Prana.getTanggalLahir());
		System.out.println (Prana.getJenisKelamin());
		System.out.println (Prana.getMatakuliah());
		
		
		/*ani.nim 	="12345";
		ani.nama	= "Ani";
		ani.alamat	="Singaraja";
		ani.tanggalLahir	="1 januari 2000";
		ani.jenisKelamin	= true;
		ani.prodi			="Ilmu Komputer";
		
		System.out.println(ani.nim);
		System.out.println(ani.nama);
		System.out.println(ani.alamat);
		System.out.println(ani.tanggalLahir);
		System.out.println(ani.jenisKelamin);
		System.out.println(ani.prodi);*/
	}
}
