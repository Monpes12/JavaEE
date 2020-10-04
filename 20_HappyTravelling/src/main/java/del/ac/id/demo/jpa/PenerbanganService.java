package del.ac.id.demo.jpa;
import java.util.List;

import del.ac.id.demo.jpa.Penerbangan;

public interface PenerbanganService {
	    List < Penerbangan > getAllPenerbangans();
	    void savePenerbangan(Penerbangan penerbangan);
	    Penerbangan getPenerbanganById(long id);
	    void deletePenerbanganById(long id);
}