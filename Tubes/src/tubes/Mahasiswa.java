/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes;

/**
 *
 * @author Fitrah Bima Nusantara
 */
class Mahasiswa extends Orang {
    private TugasAkhir tugasAkhir;
	
	public void createTA(String judul){
        tugasAkhir = new TugasAkhir(judul);
    }
	public void revisiTA(String judul){
		tugasAkhir.setJudul(judul);
	}
}
