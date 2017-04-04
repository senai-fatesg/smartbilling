package br.com.pid.smartbilling.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.pid.smartbilling.model.EnumUf;
import br.com.pid.smartbilling.model.Municipio;
import br.com.pid.smartbilling.repository.MunicipioDaoRepository;

public class CargaMunicipio {
	
	@Autowired
	private static MunicipioDaoRepository municipioDao;
	
	public static void main(String[] args) {
		try {
			lerArquivo();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	public static void lerArquivo() throws ParseException{

		File file = new File("/home/weverson/Downloads/municipio.csv");
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);

			String linha = "";
			List<Municipio> Municipios = new ArrayList<>();
			while (br.ready()) {
				Municipio municipio = new Municipio();
			
				linha = br.readLine();
				linha = linha.trim();
				
				String [] array = linha.split(";");
				
				municipio.setCodigoIbge(Integer.parseInt(array[0]));
				municipio.setDescricao(array[1]);
				municipio.setUf(EnumUf.valueOf(array[2]));
				
				municipioDao.save(municipio);
				
				Municipios.add(municipio);

			}
			
			br.close();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}


	}

}
