package br.com.pid.smartbilling.control;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import org.primefaces.model.UploadedFile;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.pid.smartbilling.model.EnumUf;
import br.com.pid.smartbilling.model.Municipio;
import br.com.pid.smartbilling.repository.MunicipioDaoRepository;

@Named
@ViewScoped
public class MunicipioControl {
	
	private UploadedFile file;

	@Autowired
	private MunicipioDaoRepository municipioDao;

	public UploadedFile getFile() {
		return file;
	}

	public void setFile(UploadedFile file) {
		this.file = file;
	}

	public void getUpload() {
		if(file != null) {
			File newFile = convert(file);
			lerArquivo(newFile);
			FacesMessage message = new FacesMessage("Succesful", file.getFileName() + " is uploaded.");
			FacesContext.getCurrentInstance().addMessage(null, message);
		}
	}

	public File convert(UploadedFile file2){    
		File convFile = new File(file2.getFileName());
		try {
			convFile.createNewFile();
			FileOutputStream fos = new FileOutputStream(convFile); 
			fos.write((file2).getContents());
			fos.close(); 
		} catch (IOException e) {
			e.getMessage();
		} 
		return convFile;
	}
	
	public void lerArquivo(File file){

		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);

			String linha = "";
			while (br.ready()) {
				Municipio municipio = new Municipio();
			
				linha = br.readLine();
				linha = linha.trim();
				
				String [] array = linha.split(";");
				
				municipio.setCodigoIbge(Integer.parseInt(array[0]));
				municipio.setDescricao(array[1]);
				municipio.setUf(EnumUf.valueOf(array[2]));
				
				municipioDao.save(municipio);

			}
			
			br.close();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	


}
