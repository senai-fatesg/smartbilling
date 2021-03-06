package br.com.pid.smartbilling.control;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import org.primefaces.model.UploadedFile;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.pid.smartbilling.model.Leitura;
import br.com.pid.smartbilling.model.Medidor;
import br.com.pid.smartbilling.repository.MedidorDaoRepository;

@Named
@ViewScoped
public class MedidorControl {
	
	private Medidor medidor = new Medidor();
	
	private Medidor medidorSelecionado;
	
	private UploadedFile file;
	
	private List<Medidor> medidores = new ArrayList<>();
	
	private List<Leitura> leituras = new ArrayList<>();
	
	@Autowired
	private MedidorDaoRepository medidorDaoRepository;
	
	@PostConstruct
	public void init(){
		medidores = medidorDaoRepository.findAll();
	}

	public void mostrarLeituras(Medidor medidor){
		this.medidorSelecionado = medidor;
		leituras = new ArrayList<>();
		leituras = this.medidorSelecionado.getLeiturasList();
	}
	
	public void getUpload() {
		if(file != null && !file.getFileName().isEmpty()) {
			File newFile = convert(file);
			lerArquivo(newFile);
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "O arquivo foi salvo com sucesso", null);
			FacesContext.getCurrentInstance().addMessage(null, message);
		}else{
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_WARN, "É necessário selecionar um arquivo", null);
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

		Medidor medidor = new Medidor();
		Leitura leitura;

		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String linha = "";
			int x = 0;
			while (br.ready()) {
				x++;
				linha += br.readLine();
				while (x >= 8 && br.ready()) {

					String linha2 =linha + br.readLine();

					leitura = new Leitura();

					leitura.setCONT_LeitDoPeriodoAtual_OU_SALV_LeitDoPeriodoAnterior(substring2(linha2, 2417-16,4));
					leitura.setZero1NumeroBlocoDeDadosMemoriaDeMassa_(substring2(linha2, 2421-16,3));
					leitura.setReservadoParaUsoFuturo_(substring2(linha2, 2424-16,5));
					leitura.setValorDo1oCanallVisivelEmSeu1oPeriodo(substring2(linha2, 2429-16,4));
					leitura.setValorDo2oCanallVisivelEmSeu1oPeriodo(substring2(linha2, 2433-16,4));
					leitura.setValorDo3oCanallVisivelEmSeu1oPeriodo(substring2(linha2, 2437-16,4));
					leitura.setValorDo1oCanallVisivelEmSeu2oPeriodo(substring2(linha2, 2441-16,4));
					leitura.setValorDo2oCanallVisivelEmSeu2oPeriodo(substring2(linha2, 2445-16,4));
					leitura.setValorDo3oCanallVisivelEmSeu2oPeriodo(substring2(linha2, 2449-16,4));
					leitura.setValorDo1oCanallVisivelEmSeu3oPeriodo(substring2(linha2, 2453-16,4));
					leitura.setValorDo2oCanallVisivelEmSeu3oPeriodo(substring2(linha2, 2457-16,4));
					leitura.setValorDo3oCanallVisivelEmSeu3oPeriodo(substring2(linha2, 2461-16,4));
					leitura.setValorDo1oCanallVisivelEmSeu4oPeriodo(substring2(linha2, 2465-16,4));
					leitura.setValorDo2oCanallVisivelEmSeu4oPeriodo(substring2(linha2, 2469-16,4));
					leitura.setValorDo3oCanallVisivelEmSeu4oPeriodo(substring2(linha2, 2473-16,4));
					leitura.setValorDo1oCanallVisivelEmSeu5oPeriodo(substring2(linha2, 2477-16,4));
					leitura.setValorDo2oCanallVisivelEmSeu5oPeriodo(substring2(linha2, 2481-16,4));
					leitura.setValorDo3oCanallVisivelEmSeu5oPeriodo(substring2(linha2, 2485-16,4));
					leitura.setValorDo1oCanallVisivelEmSeu6oPeriodo(substring2(linha2, 2489-16,4));
					leitura.setValorDo2oCanallVisivelEmSeu6oPeriodo(substring2(linha2, 2493-16,4));
					leitura.setValorDo3oCanallVisivelEmSeu6oPeriodo(substring2(linha2, 2497-16,4));
					leitura.setValorDo1oCanallVisivelEmSeu7oPeriodo(substring2(linha2, 2501-16,4));
					leitura.setValorDo2oCanallVisivelEmSeu7oPeriodo(substring2(linha2, 2505-16,4));
					leitura.setValorDo3oCanallVisivelEmSeu7oPeriodo(substring2(linha2, 2509-16,4));
					leitura.setValorDo1oCanallVisivelEmSeu8oPeriodo(substring2(linha2, 2513-16,4));
					leitura.setValorDo2oCanallVisivelEmSeu8oPeriodo(substring2(linha2, 2517-16,4));
					leitura.setValorDo3oCanallVisivelEmSeu8oPeriodo(substring2(linha2, 2521-16,4));
					leitura.setValorDo1oCanallVisivelEmSeu9oPeriodo(substring2(linha2, 2525-16,4));
					leitura.setValorDo2oCanallVisivelEmSeu9oPeriodo(substring2(linha2, 2529-16,4));
					leitura.setValorDo3oCanallVisivelEmSeu9oPeriodo(substring2(linha2, 2533-16,4));
					leitura.setValorDo1oCanallVisivelEmSeu10oPeriodo(substring2(linha2, 2537-16,4));
					leitura.setValorDo2oCanallVisivelEmSeu10oPeriodo(substring2(linha2, 2541-16,4));
					leitura.setValorDo3oCanallVisivelEmSeu10oPeriodo(substring2(linha2, 2545-16,4));
					leitura.setValorDo1oCanallVisivelEmSeu11oPeriodo(substring2(linha2, 2549-16,4));
					leitura.setValorDo2oCanallVisivelEmSeu11oPeriodo(substring2(linha2, 2553-16,4));
					leitura.setValorDo3oCanallVisivelEmSeu11oPeriodo(substring2(linha2, 2557-16,4));
					leitura.setValorDo1oCanallVisivelEmSeu12oPeriodo(substring2(linha2, 2561-16,4));
					leitura.setValorDo2oCanallVisivelEmSeu12oPeriodo(substring2(linha2, 2565-16,4));
					leitura.setValorDo3oCanallVisivelEmSeu12oPeriodo(substring2(linha2, 2569-16,4));
					leitura.setValorDo1oCanallVisivelEmSeu13oPeriodo(substring2(linha2, 2573-16,4));
					leitura.setValorDo2oCanallVisivelEmSeu13oPeriodo(substring2(linha2, 2577-16,4));
					leitura.setValorDo3oCanallVisivelEmSeu13oPeriodo(substring2(linha2, 2581-16,4));
					leitura.setValorDo1oCanallVisivelEmSeu14oPeriodo(substring2(linha2, 2585-16,4));
					leitura.setValorDo2oCanallVisivelEmSeu14oPeriodo(substring2(linha2, 2589-16,4));
					leitura.setValorDo3oCanallVisivelEmSeu14oPeriodo(substring2(linha2, 2593-16,4));
					leitura.setValorDo1oCanallVisivelEmSeu15oPeriodo(substring2(linha2, 2597-16,4));
					leitura.setValorDo2oCanallVisivelEmSeu15oPeriodo(substring2(linha2, 2601-16,4));
					leitura.setValorDo3oCanallVisivelEmSeu15oPeriodo(substring2(linha2, 2605-16,4));
					leitura.setValorDo1oCanallVisivelEmSeu16oPeriodo(substring2(linha2, 2609-16,4));
					leitura.setValorDo2oCanallVisivelEmSeu16oPeriodo(substring2(linha2, 2613-16,4));
					leitura.setValorDo3oCanallVisivelEmSeu16oPeriodo(substring2(linha2, 2617-16,4));
					leitura.setValorDo1oCanallVisivelEmSeu17oPeriodo(substring2(linha2, 2621-16,4));
					leitura.setValorDo2oCanallVisivelEmSeu17oPeriodo(substring2(linha2, 2625-16,4));
					leitura.setValorDo3oCanallVisivelEmSeu17oPeriodo(substring2(linha2, 2629-16,4));
					leitura.setValorDo1oCanallVisivelEmSeu18oPeriodo(substring2(linha2, 2633-16,4));
					leitura.setValorDo2oCanallVisivelEmSeu18oPeriodo(substring2(linha2, 2637-16,4));
					leitura.setValorDo3oCanallVisivelEmSeu18oPeriodo(substring2(linha2, 2641-16,4));
					leitura.setValorDo1oCanallVisivelEmSeu19oPeriodo(substring2(linha2, 2645-16,4));
					leitura.setValorDo2oCanallVisivelEmSeu19oPeriodo(substring2(linha2, 2649-16,4));
					leitura.setValorDo3oCanallVisivelEmSeu19oPeriodo(substring2(linha2, 2653-16,4));
					leitura.setValorDo1oCanallVisivelEmSeu20oPeriodo(substring2(linha2, 2657-16,4));
					leitura.setValorDo2oCanallVisivelEmSeu20oPeriodo(substring2(linha2, 2661-16,4));
					leitura.setValorDo3oCanallVisivelEmSeu20oPeriodo(substring2(linha2, 2665-16,4));
					leitura.setValorDo1oCanallVisivelEmSeu21oPeriodo(substring2(linha2, 2669-16,4));
					leitura.setValorDo2oCanallVisivelEmSeu21oPeriodo(substring2(linha2, 2673-16,4));
					leitura.setValorDo3oCanallVisivelEmSeu21oPeriodo(substring2(linha2, 2677-16,4));
					leitura.setValorDo1oCanallVisivelEmSeu22oPeriodo(substring2(linha2, 2681-16,4));
					leitura.setValorDo2oCanallVisivelEmSeu22oPeriodo(substring2(linha2, 2685-16,4));
					leitura.setValorDo3oCanallVisivelEmSeu22oPeriodo(substring2(linha2, 2689-16,4));
					leitura.setValorDo1oCanallVisivelEmSeu23oPeriodo(substring2(linha2, 2693-16,4));
					leitura.setValorDo2oCanallVisivelEmSeu23oPeriodo(substring2(linha2, 2697-16,4));
					leitura.setValorDo3oCanallVisivelEmSeu23oPeriodo(substring2(linha2, 2701-16,4));
					leitura.setValorDo1oCanallVisivelEmSeu24oPeriodo(substring2(linha2, 2705-16,4));
					leitura.setValorDo2oCanallVisivelEmSeu24oPeriodo(substring2(linha2, 2709-16,4));
					leitura.setValorDo3oCanallVisivelEmSeu24oPeriodo(substring2(linha2, 2713-16,4));

					medidor.addLeitura(leitura);

				}
			}
			medidor.setNumeroSerieMedidor(substring2(linha, 1,8));
			medidor.setNumeroSerieLeitor(substring2(linha, 9,6));
			medidor.setHoraAtual(substring2(linha, 15,2));
			medidor.setMinutoAtual(substring2(linha, 17,2));
			medidor.setSegundoAtual(substring2(linha, 19,2));
			medidor.setDiaAtual(substring2(linha, 21,2));
			medidor.setMesAtual(substring2(linha, 23,2));
			medidor.setAnoAtual(substring2(linha, 25,2));
			medidor.setDiaSemanaAtual(substring2(linha, 27,2));
			medidor.setHoraUltimoIntervDemanda(substring2(linha, 29,2));
			medidor.setMinutoUltimoIntervDemanda(substring2(linha, 31,2));
			medidor.setSegundoUltimoIntervDemanda(substring2(linha, 33,2));
			medidor.setDiaUltimoIntervDemanda(substring2(linha, 35,2));
			medidor.setMesUltimoIntervDemanda(substring2(linha, 37,2));
			medidor.setAnoUltimoIntervDemanda(substring2(linha, 39,2));
			medidor.setHoraUltimaReposicDemanda(substring2(linha, 41,2));
			medidor.setMinutoUltimaReposicDemanda(substring2(linha, 43,2));
			medidor.setSegundoUltimaReposicDemanda(substring2(linha, 45,2));
			medidor.setDiaUltimaReposicDemanda(substring2(linha, 47,2));
			medidor.setMesUltimaReposicDemanda(substring2(linha, 49,2));
			medidor.setAnoUltimaReposicDemaanda(substring2(linha, 51,2));
			medidor.setHoraPenultRepDemanda(substring2(linha, 53,2));
			medidor.setMinPenultRepDemanda(substring2(linha, 55,2));
			medidor.setSegPenultRepDemanda(substring2(linha, 57,2));
			medidor.setDiaPenultRepDemanda(substring2(linha, 59,2));
			medidor.setMesPenultRepDemanda(substring2(linha, 61,2));
			medidor.setAnoPenultRepDemanda(substring2(linha, 63,2));
			medidor.setNumeradorConstanteKe(substring2(linha, 65,6));
			medidor.setDenominadorConstanteKe(substring2(linha, 71,6));
			medidor.setTotalizAtualGeralUFER(substring2(linha, 77,10));
			medidor.setTotalizAnterGeralUFER(substring2(linha, 87,10));
			medidor.setDiaInicioPeriodoUmido(substring2(linha, 97,2));
			medidor.setMesInicioPeriodoUmido(substring2(linha, 99,2));
			medidor.setDiaInicioPeriodoSeco(substring2(linha, 101,2));
			medidor.setMesInicioPeriodoSeco(substring2(linha, 103,2));
			medidor.setHoraInicioHorarioPonta(substring2(linha, 105,2));
			medidor.setMinInicioHorarioPonta(substring2(linha, 107,2));
			medidor.setHoraInicioHorarioPonta1(substring2(linha, 109,2));
			medidor.setMinInicioHorarioPonta1(substring2(linha, 111,2));
			medidor.setHoraInicioHorarioPonta2(substring2(linha, 113,2));
			medidor.setMinInicioHorarioPonta2(substring2(linha, 115,2));
			medidor.setHoraInicioHorarioPonta3(substring2(linha, 117,2));
			medidor.setMinIncioHorarioPonta3(substring2(linha, 119,2));
			medidor.setHoraInicioHorarioForaPonta1(substring2(linha, 121,2));
			medidor.setMinIncioHorarioForaPonta1(substring2(linha, 123,2));
			medidor.setHoraInicioHorarioForaPonta2(substring2(linha, 125,2));
			medidor.setMinInicioHorarioForaPonta2(substring2(linha, 127,2));
			medidor.setHoraInicioHorarioForaPonta3(substring2(linha, 129,2));
			medidor.setMinInicioHorarioForaPonta3(substring2(linha, 131,2));
			medidor.setHoraInicioHorarioForaPonta4(substring2(linha, 133,2));
			medidor.setMinInicioHorarioForaPonta4(substring2(linha, 135,2));
			medidor.setHoraInicioHorarioReservado1(substring2(linha, 137,2));
			medidor.setMinInicioHorarioReservado1(substring2(linha, 139,2));
			medidor.setHoraInicioHorarioReservado2(substring2(linha, 141,2));
			medidor.setMinInicioHorarioReservado2(substring2(linha, 143,2));
			medidor.setHoraInicioHorarioReservado3(substring2(linha, 145,2));
			medidor.setMinInicioHorarioReservado3(substring2(linha, 147,2));
			medidor.setHoraInicioHorarioReservado4(substring2(linha, 149,2));
			medidor.setMinInicioHorarioReservado4(substring2(linha, 151,2));
			medidor.setNumeroPalavrasLeiturAtual(substring2(linha, 153,6));
			medidor.setNumeroPalavrasUltimaReposicaoDemanda(substring2(linha, 159,6));
			medidor.setNumeroOperacoesReposicaoDemanda(substring2(linha, 165,2));
			medidor.setIntervaloDemandaAtual(substring2(linha, 167,2));
			medidor.setIntervaloDemandaAnterior(substring2(linha, 169,2));
			medidor.setDiaMesAnoDeFeriadoNacional1(substring2(linha, 171,6));
			medidor.setDiaMesAnoDeFeriadoNacional2(substring2(linha, 177,6));
			medidor.setDiaMesAnoDeFeriadoNacional3(substring2(linha, 183,6));
			medidor.setDiaMesAnoDeFeriadoNacional4(substring2(linha, 189,6));
			medidor.setDiaMesAnoDeFeriadoNacional5(substring2(linha, 195,6));
			medidor.setDiaMesAnoDeFeriadoNacional6(substring2(linha, 201,6));
			medidor.setDiaMesAnoDeFeriadoNacional7(substring2(linha, 207,6));
			medidor.setDiaMesAnoDeFeriadoNacional8(substring2(linha, 213,6));
			medidor.setDiaMesAnoDeFeriadoNacional9(substring2(linha, 219,6));
			medidor.setDiaMesAnoDeFeriadoNacional10(substring2(linha, 225,6));
			medidor.setDiaMesAnoDeFeriadoNacional11(substring2(linha, 231,6));
			medidor.setDiaMesAnoDeFeriadoNacional12(substring2(linha, 237,6));
			medidor.setDiaMesAnoDeFeriadoNacional13(substring2(linha, 243,6));
			medidor.setDiaMesAnoDeFeriadoNacional14(substring2(linha, 249,6));
			medidor.setDiaMesAnoDeFeriadoNacional15(substring2(linha, 255,6));
			medidor.setNumeradorConstanteMultiplicacao1CanalVisivel(substring2(linha, 261,6));
			medidor.setDenominadorConstanteMultiplicacao1CanalVisivel(substring2(linha, 267,6));
			medidor.setNumeradorConstanteMultiplicacao2CanalVisivel(substring2(linha, 273,6));
			medidor.setDenominadorConstanteMultiplicacao2CanalVisivel(substring2(linha, 279,6));
			medidor.setNumeradorConstanteMultiplicacao3CanalVisivel(substring2(linha, 285,6));
			medidor.setDenominadorConstanteMultiplicacao3CanalVisivel(substring2(linha, 291,6));
			medidor.setEstadoDaBateria(substring2(linha, 297,2));
			medidor.setVersaoSoftwareRegistrador(substring2(linha, 299,4));
			medidor.setLeituraCondicaoHorarioReservado(substring2(linha, 303,2));
			medidor.setHoraDaFaltaDeEnergia(substring2(linha, 305,2));
			medidor.setMinutoDaFaltaDeEnergia(substring2(linha, 307,2));
			medidor.setSegundoDaFaltaDeEnergia(substring2(linha, 309,2));
			medidor.setDiaDaFaltaDeEnergia(substring2(linha, 311,2));
			medidor.setMesDaFaltaDeEnergia(substring2(linha, 313,2));
			medidor.setAnoDaFaltaDeEnergia(substring2(linha, 315,2));
			medidor.setHoraDoRetornoDeEnergia(substring2(linha, 317,2));
			medidor.setMinutoDoRetornoDeEnergia(substring2(linha, 319,2));
			medidor.setSegundoDoRetornoDeEnergia(substring2(linha, 321,2));
			medidor.setDiaDoRetornoDeEnergia(substring2(linha, 323,2));
			medidor.setMesDoRetornoDeEnergia(substring2(linha, 325,2));
			medidor.setAnoDoRetornoDeEnergia(substring2(linha, 327,2));
			medidor.setHoraDataFaltaHoraDataRetornoEnergia1(substring2(linha, 329,24));
			medidor.setHoraDataFaltaHoraDataRetornoEnergia2(substring2(linha, 353,24));
			medidor.setHoraDataFaltaHoraDataRetornoEnergia3(substring2(linha, 377,24));
			medidor.setHoraDataFaltaHoraDataRetornoEnergia4(substring2(linha, 401,24));
			medidor.setHoraDataFaltaHoraDataRetornoEnergia5(substring2(linha, 425,24));
			medidor.setHoraDataFaltaHoraDataRetornoEnergia6(substring2(linha, 449,24));
			medidor.setHoraDataFaltaHoraDataRetornoEnergia7(substring2(linha, 473,24));
			medidor.setHoraDataFaltaHoraDataRetornoEnergia8(substring2(linha, 497,24));
			medidor.setHoraDataFaltaHoraDataRetornoEnergia9(substring2(linha, 521,24));
			medidor.setHoraDataFaltaHoraDataRetornoEnergia10(substring2(linha, 545,24));
			medidor.setHoraDataFaltaHoraDataRetornoEnergia11(substring2(linha, 569,24));
			medidor.setHoraDataFaltaHoraDataRetornoEnergia12(substring2(linha, 593,24));
			medidor.setHoraDataFaltaHoraDataRetornoEnergia13(substring2(linha, 617,24));
			medidor.setHoraDataFaltaHoraDataRetornoEnergia14(substring2(linha, 641,24));
			medidor.setHoraDataFaltaHoraDataRetornoEnergia15(substring2(linha, 665,24));
			medidor.setTotalizadorAtualGeral1oCanalVisivel(substring2(linha, 689,10));
			medidor.setTotalizadorAtual1oCanalVisivelPontaUmida(substring2(linha, 699,10));
			medidor.setTotalizadorAtualUFEREmPonta(substring2(linha, 709,10));
			medidor.setTotalizadorAtual1oCanalVisivelForaPontaUmida(substring2(linha, 719,10));
			medidor.setTotalizadorAtualUFEREmForaPonta(substring2(linha, 729,10));
			medidor.setTotalizadorAtual1oCanalVisivelEmReservadoUmido(substring2(linha, 739,10));
			medidor.setTotalizadorAtualDeUFEREmReservado(substring2(linha, 749,10));
			medidor.setDemandaDoUltimoIntervaloAtualDo1oCanalVisivel(substring2(linha, 759,6));
			medidor.setDemandaAtualMaximaDo1oCanalVisivelEmPonta(substring2(linha, 765,6));
			medidor.setDmcrAtualEmPonta(substring2(linha, 771,6));
			medidor.setDemandaAtualMaxima1oCanalVisivelForaPonta(substring2(linha, 777,6));
			medidor.setDmcrAtualEmForaPonta(substring2(linha, 783,6));
			medidor.setDemandaAtualMaxima1oCanalVisivelReservado(substring2(linha, 789,6));
			medidor.setDmcrAtualEmReservado(substring2(linha, 795,6));
			medidor.setDemandaAtualAcumulada1oCanalVisivelEmPonta(substring2(linha, 801,6));
			medidor.setDmcrAtualAcumuladaEmPonta(substring2(linha, 807,6));
			medidor.setDemandaAtualAcumulada1oCanalVisivelEmForaPonta(substring2(linha, 813,6));
			medidor.setDmcrAtualAcumuladaEmForaPonta(substring2(linha, 819,6));
			medidor.setDemandaAtualAcumulada1oCanalVisivelEmReservado(substring2(linha, 825,6));
			medidor.setDmcrAtualAcumuladaEmReservado(substring2(linha, 831,6));
			medidor.setTotalizadorAtualGeral2oCanalVisivel(substring2(linha, 837,10));
			medidor.setTotalizadorAtual2oCanalVisivelEmPonta(substring2(linha, 847,10));
			medidor.setTotalizadorAtualReverso2oCanalVisivelEmPonta(substring2(linha, 857,10));
			medidor.setTotalizadorAtual2oCanalVisivelEmForaPonta(substring2(linha, 867,10));
			medidor.setTotalizadorAtualReverso2oCanalVisivelEmForaPonta(substring2(linha, 877,10));
			medidor.setTotalizadorAtual2oCanalVisivelEmReservado(substring2(linha, 887,10));
			medidor.setTotalizadorAtualReverso2oCanalVisivelReservado(substring2(linha, 897,10));
			medidor.setDemandaUltimoIntervaloAtual2oCanalVisivel(substring2(linha, 907,6));
			medidor.setDemandaAtualMaxima2oCanalVisivelEmPonta(substring2(linha, 913,6));
			medidor.setDemandaReversaAtualMaxima2oCanalVisivelEmPonta(substring2(linha, 919,6));
			medidor.setDemandaAtualMaxima2oCanalVisivelEmForaPonta(substring2(linha, 925,6));
			medidor.setDemandaReversaAtualMaxima2oCanalVisivelEmForaPonta(substring2(linha, 931,6));
			medidor.setDemandaAtualMaxima2oCanalVisivelEmReservado(substring2(linha, 937,6));
			medidor.setDemandaReversaAtualMaxima2oCanalVisivelEmReservado(substring2(linha, 943,6));
			medidor.setDemandaAtualAcumulada2oCanalVisivelEmPonta(substring2(linha, 949,6));
			medidor.setDemandaReversaAtualAcumulada2oCanalVisivelEmPonta(substring2(linha, 955,6));
			medidor.setDemandaAtualAcumulada2oCanalVisivelEmForaPonta(substring2(linha, 961,6));
			medidor.setDemandaReversaAtualAcumulada2oCanalVisivelEmForaPonta(substring2(linha, 967,6));
			medidor.setDemandaAtualAcumulada2oCanalVisivelEmReservado(substring2(linha, 973,6));
			medidor.setDemandaReversaAtualAcumulada2oCanalVisivelEmReservado(substring2(linha, 979,6));
			medidor.setTotalizadorAtualGeral3oCanalVisivel(substring2(linha, 985,10));
			medidor.setTotalizadorAtual3oCanalVisivelEmPonta(substring2(linha, 995,10));
			medidor.setTotalizadorAtualReverso3oCanalVisivelEmPonta(substring2(linha, 1005,10));
			medidor.setTotalizadorAtual3oCanalVisivelEmForaPonta(substring2(linha, 1015,10));
			medidor.setTotalizadorAtualReverso3oCanalVisivelEmForaPonta(substring2(linha, 1025,10));
			medidor.setTotalizadorAtual3oCanalVisivelEmReservado(substring2(linha, 1035,10));
			medidor.setTotalizadorAtualReverso3oCanalVisivelEmReservado(substring2(linha, 1045,10));
			medidor.setDemandaDoUltimoIntervaloAtual3oCanalVisivel(substring2(linha, 1055,6));
			medidor.setDemandaAtualMaxima3oCanalVisivelEmPonta(substring2(linha, 1061,6));
			medidor.setDemandaAtualReversaMaxima3oCanalVisivelEmPonta(substring2(linha, 1067,6));
			medidor.setDemandaAtualMaxima3oCanalVisivelEmForaPonta(substring2(linha, 1073,6));
			medidor.setDemandaAtualReversaMaxima3oCanalVisivelEmForaPonta(substring2(linha, 1079,6));
			medidor.setDemandaAtualMaxima3oCanalVisivelEmReservado(substring2(linha, 1085,6));
			medidor.setDemandaAtualReversaMaxima3oCanalVisivelEmReservado(substring2(linha, 1091,6));
			medidor.setDemandaAtualAcumulada3oCanalVisivelEmPonta(substring2(linha, 1097,6));
			medidor.setDemandaAtualReversaAcumulada3oCanalVisivelEmPonta(substring2(linha, 1103,6));
			medidor.setDemandaAtualAcumulada3oCanalVisivelEmForaPonta(substring2(linha, 1109,6));
			medidor.setDemandaAtualReversaAcumulada3oCanalVisivelEmForaPonta(substring2(linha, 1115,6));
			medidor.setDemandaAtualAcumulada3oCanalVisivelEmReservado(substring2(linha, 1121,6));
			medidor.setDemandaAtualReversaAcumulada3oCanalVisivelEmReservado(substring2(linha, 1127,6));
			medidor.setTotalizadorAnteriorGeral1oCanalVisivel(substring2(linha, 1133,10));
			medidor.setTotalizadorAnterior1oCanalVisivelEmPonta(substring2(linha, 1143,10));
			medidor.setTotalizadorAnteriorUFEREmPonta(substring2(linha, 1153,10));
			medidor.setTotalizadorAnterior1oCanalVisivelEmForaPonta(substring2(linha, 1163,10));
			medidor.setTotalizadorAnteriorUFEREmForaPonta(substring2(linha, 1173,10));
			medidor.setTotalizadorAnterior1oCanalVisivelEmReservado(substring2(linha, 1183,10));
			medidor.setTotalizadorAnteriorUFEREmReservado(substring2(linha, 1193,10));
			medidor.setDemandaDoUltimoIntervaloAnterior1oCanalVisivel(substring2(linha, 1203,6));
			medidor.setDemandaAnteriorMaxima1oCanalVisivelEmPonta(substring2(linha, 1209,6));
			medidor.setDmcrAnteriorEmPonta(substring2(linha, 1215,6));
			medidor.setDemandaAnteriorMaxima1oCanalVisivelEmForaPonta(substring2(linha, 1221,6));
			medidor.setDmcrAnteriorEmForaPonta(substring2(linha, 1227,6));
			medidor.setDemandaAnteriorMaxima1oCanalVisivelEmReservado(substring2(linha, 1233,6));
			medidor.setDmcrAnteriorEmReservado(substring2(linha, 1239,6));
			medidor.setDemandaAnteriorAcumulada1oCanalVisivelEmPonta(substring2(linha, 1245,6));
			medidor.setDmcrAnteriorAcumuladaEmPonta(substring2(linha, 1251,6));
			medidor.setDemandaAnteriorAcumulada1oCanalVisivelEmForaPonta(substring2(linha, 1257,6));
			medidor.setDmcrAnteriorAcumuladaEmForaPonta(substring2(linha, 1263,6));
			medidor.setDemandaAnteriorAcumulada1oCanalVisivelEmReservado(substring2(linha, 1269,6));
			medidor.setDmcrAnteriorAcumuladaEmReservado(substring2(linha, 1275,6));
			medidor.setTotalizadorAnteriorGeral2oCanalVisivel(substring2(linha, 1281,10));
			medidor.setTotalizadorAnterior2oCanalVisivelEmPonta(substring2(linha, 1291,10));
			medidor.setTotalizadorAnteriorReverso2oCanalVisivelEmPonta(substring2(linha, 1301,10));
			medidor.setTotalizadorAnterior2oCanalVisivelEmForaPonta(substring2(linha, 1311,10));
			medidor.setTotalizadorAnteriorReverso2oCanalVisivelEmForaPonta(substring2(linha, 1321,10));
			medidor.setTotalizadorAnterior2oCanalVisivelEmReservado(substring2(linha, 1331,10));
			medidor.setTotalizadorAnteriorReverso2oCanalVisivelEmReservado(substring2(linha, 1341,10));
			medidor.setDemandaDoUltimoIntervaloAnterior2oCanalVisivel(substring2(linha, 1351,6));
			medidor.setDemandaAnteriorMaxima2oCanalVisivelEmPonta(substring2(linha, 1357,6));
			medidor.setDemandaAnteriorReversaMaxima2oCanalVisivelEmPonta(substring2(linha, 1363,6));
			medidor.setDemandaAnteriorMaxima2oCanalVisivelEmForaPonta(substring2(linha, 1369,6));
			medidor.setDemandaAnteriorReversaMaxima2oCanalVisivelEmForaPonta(substring2(linha, 1375,6));
			medidor.setDemandaAnteriorMaxima2oCanalVisivelEmReservado(substring2(linha, 1381,6));
			medidor.setDemandaAnteriorReversaMaxima2oCanalVisivelEmReservado(substring2(linha, 1387,6));
			medidor.setDemandaAnteriorAcumulada2oCanalVisivelEmPonta(substring2(linha, 1393,6));
			medidor.setDemandaAnteriorReversaAcumulada2oCanalVisivelEmPonta(substring2(linha, 1399,6));
			medidor.setDemandaAnteriorAcumulada2oCanalVisivelEmForaPonta(substring2(linha, 1405,6));
			medidor.setDemandaAnteriorReversaAcumulada2oCanalVisivelEmForaPonta(substring2(linha, 1411,6));
			medidor.setDemandaAnteriorAcumulada2oCanalVisivelEmReservado(substring2(linha, 1417,6));
			medidor.setDemandaAnteriorReversaAcumulada2oCanalVisivelEmReservado(substring2(linha, 1423,6));
			medidor.setTotalizadorAnteriorGeral3oCanalVisivel(substring2(linha, 1429,10));
			medidor.setTotalizadorAnterior3oCanalVisivelEmPonta(substring2(linha, 1439,10));
			medidor.setTotalizadorAnteriorReverso3oCanalVisivelEmPonta(substring2(linha, 1449,10));
			medidor.setTotalizadorAnterior3oCanalVisivelEmForaPonta(substring2(linha, 1459,10));
			medidor.setTotalizadorAnteriorReverso3oCanalVisivelEmForaPonta(substring2(linha, 1469,10));
			medidor.setTotalizadorAnterior3oCanalVisivelEmReservado(substring2(linha, 1479,10));
			medidor.setTotalizadorAnteriorReverso3oCanalVisivelEmReservado(substring2(linha, 1489,10));
			medidor.setDemandaDoUltimoIntervaloAnteriorDo3oCanalVisivel(substring2(linha, 1499,6));
			medidor.setDemandaAnteriormaximaDo3oCanalVisivelEmPontaa(substring2(linha, 1505,6));
			medidor.setDemandaAnteriorReversamaximaDo3oCanalVisivelEmPontaa(substring2(linha, 1511,6));
			medidor.setDemandaAnteriormaximaDo3oCanalVisivelEmForaPonta(substring2(linha, 1517,6));
			medidor.setDemandaAnteriorReversamaximaDo3oCanalVisivelEmForaPonta(substring2(linha, 1523,6));
			medidor.setDemandaAnteriormaximaDo3oCanalVisivelEmReservado(substring2(linha, 1529,6));
			medidor.setDemandaAnteriorReversamaximaDo3oCanalVisivelEmReservado(substring2(linha, 1535,6));
			medidor.setDemandaAnteriorAcumuladaDo3oCanalVisivelEmPontaa(substring2(linha, 1541,6));
			medidor.setDemandaAnteriorReversaAcumuladaDo3oCanalVisivelEmPontaa(substring2(linha, 1547,6));
			medidor.setDemandaAnteriorAcumuladaDo3oCanalVisivelEmForaPonta(substring2(linha, 1553,6));
			medidor.setDemandaAnteriorReversaAcumuladaDo3oCanalVisivelEmForaPonta(substring2(linha, 1559,6));
			medidor.setDemandaAnteriorAcumuladaDo3oCanalVisivelEmReservado(substring2(linha, 1565,6));
			medidor.setDemandaAnteriorReversaAcumuladaDo3oCanalVisivelEmReservado(substring2(linha, 1571,6));
			medidor.setDATA_AlteracaoDaData(substring2(linha, 1577,4));
			medidor.setDia(substring2(linha, 1581,2));
			medidor.setMes(substring2(linha, 1583,2));
			medidor.setAno(substring2(linha, 1585,2));
			medidor.setDiaDaSemana(substring2(linha, 1587,2));
			medidor.setHORA_AlteracaoDoHorario(substring2(linha, 1589,4));
			medidor.setHora(substring2(linha, 1593,2));
			medidor.setMinuto(substring2(linha, 1595,2));
			medidor.setSegundo(substring2(linha, 1597,2));
			medidor.setINTE_AlteracaoDoIntervaloDeDemanda(substring2(linha, 1599,4));
			medidor.setMinutos(substring2(linha, 1603,2));
			medidor.setFERN_AlteracaoDosFeriadosNacionais(substring2(linha, 1605,4));
			medidor.setDiaMesAno1(substring2(linha, 1609,6));
			medidor.setDiaMesAno2(substring2(linha, 1615,6));
			medidor.setDiaMesAno3(substring2(linha, 1621,6));
			medidor.setDiaMesAno4(substring2(linha, 1627,6));
			medidor.setDiaMesAno5(substring2(linha, 1633,6));
			medidor.setDiaMesAno6(substring2(linha, 1639,6));
			medidor.setDiaMesAno7(substring2(linha, 1645,6));
			medidor.setDiaMesAno8(substring2(linha, 1651,6));
			medidor.setDiaMesAno9(substring2(linha, 1657,6));
			medidor.setDiaMesAno10(substring2(linha, 1663,6));
			medidor.setDiaMesAno11(substring2(linha, 1669,6));
			medidor.setDiaMesAno12(substring2(linha, 1675,6));
			medidor.setDiaMesAno13(substring2(linha, 1681,6));
			medidor.setDiaMesAno14(substring2(linha, 1687,6));
			medidor.setDiaMesAno15(substring2(linha, 1693,6));
			medidor.setCONS_AlteracaoDasConstantesDeMultiplicacao(substring2(linha, 1699,4));
			medidor.setNumeradorDo1oCanalVisivel(substring2(linha, 1703,6));
			medidor.setDenominadorDo1oCanalVisivel(substring2(linha, 1709,6));
			medidor.setNumeradorDo2oCanalVisivel(substring2(linha, 1715,6));
			medidor.setDenominadorDo2oCanalVisivel(substring2(linha, 1721,6));
			medidor.setNumeradorDo3oCanalVisivel(substring2(linha, 1727,6));
			medidor.setDenominadorDo3oCanalVisivel(substring2(linha, 1733,6));
			medidor.setPSAZ_AlteracaoDosPeriodosSazonais(substring2(linha, 1739,4));
			medidor.setDiaDoInicioDoPeriodoUmido1(substring2(linha, 1743,2));
			medidor.setMesDoInicioDoPeriodoUmido1(substring2(linha, 1745,2));
			medidor.setDiaDoInicioDoPeriodoSeco1(substring2(linha, 1747,2));
			medidor.setMesDoInicioDoPeriodoSeco1(substring2(linha, 1749,2));
			medidor.setDiaDoInicioDoPeriodoUmido2(substring2(linha, 1751,2));
			medidor.setMesDoInicioDoPeriodoUmido2(substring2(linha, 1753,2));
			medidor.setDiaDoInicioDoPeriodoSeco2(substring2(linha, 1755,2));
			medidor.setMesDoInicioDoPeriodoSeco2(substring2(linha, 1757,2));
			medidor.setDiaDoInicioDoPeriodoUmido3(substring2(linha, 1759,2));
			medidor.setMesDoInicioDoPeriodoUmido3(substring2(linha, 1761,2));
			medidor.setDia_DoInicioDoPeriodoSSeco1(substring2(linha, 1763,2));
			medidor.setMes_DoInicioDoPeriodoSSeco1(substring2(linha, 1765,2));
			medidor.setDia_DoInicioDoPeriodoUUmido1(substring2(linha, 1767,2));
			medidor.setMes_DoInicioDoPeriodoUUmido1(substring2(linha, 1769,2));
			medidor.setDia_DoInicioDoPeriodoSSeco2(substring2(linha, 1771,2));
			medidor.setMes_DoInicioDoPeriodoSSeco2(substring2(linha, 1773,2));
			medidor.setDia_DoInicioDoPeriodoUUmido2(substring2(linha, 1775,2));
			medidor.setMes_DoInicioDoPeriodoUUmido2(substring2(linha, 1777,2));
			medidor.setDia_DoInicioDoPeriodoSSeco3(substring2(linha, 1779,2));
			medidor.setMes_DoInicioDoPeriodoSSeco3(substring2(linha, 1781,2));
			medidor.setPDIA_AlteracaoDosSegmentosHorarios(substring2(linha, 1783,4));
			medidor.setHoraDoInicioDoHorarioDePonta1(substring2(linha, 1787,2));
			medidor.setMinutoDoInicioDoHorarioDePonta1(substring2(linha, 1789,2));
			medidor.setHoraDoInicioDoHorarioDePonta2(substring2(linha, 1791,2));
			medidor.setMinutoDoInicioDoHorarioDePonta2(substring2(linha, 1793,2));
			medidor.setHoraDoInicioDoHorarioDePonta3(substring2(linha, 1795,2));
			medidor.setMinutoDoInicioDoHorarioDePonta3(substring2(linha, 1797,2));
			medidor.setHoraDoInicioDoHorarioDePonta4(substring2(linha, 1799,2));
			medidor.setMinutoDoInicioDoHorarioDePonta4(substring2(linha, 1801,2));
			medidor.setHoraDoInicioDoHorarioDeForaPonta1(substring2(linha, 1803,2));
			medidor.setMinutoDoInicioDoHorarioDeForaPonta1(substring2(linha, 1805,2));
			medidor.setHoraDoInicioDoHorarioDeForaPonta2(substring2(linha, 1807,2));
			medidor.setMinutoDoInicioDoHorarioDeForaPonta2(substring2(linha, 1809,2));
			medidor.setHoraDoInicioDoHorarioDeForaPonta3(substring2(linha, 1811,2));
			medidor.setMinutoDoInicioDoHorarioDeForaPonta3(substring2(linha, 1813,2));
			medidor.setHoraDoInicioDoHorarioDeForaPonta4(substring2(linha, 1815,2));
			medidor.setMinutoDoInicioDoHorarioDeForaPonta4(substring2(linha, 1817,2));
			medidor.setHoraDoInicioDoHorarioReservado1(substring2(linha, 1819,2));
			medidor.setMinutoDoInicioDoHorarioReservado1(substring2(linha, 1821,2));
			medidor.setHoraDoInicioDoHorarioReservado2(substring2(linha, 1823,2));
			medidor.setMinutoDoInicioDoHorarioReservado2(substring2(linha, 1825,2));
			medidor.setHoraDoInicioDoHorarioReservado3(substring2(linha, 1827,2));
			medidor.setMinutoDoInicioDoHorarioReservado3(substring2(linha, 1829,2));
			medidor.setHoraDoInicioDoHorarioReservado4(substring2(linha, 1831,2));
			medidor.setMinutoDoInicioDoHorarioReservado4(substring2(linha, 1833,2));
			medidor.setERRO_InformacaoDeErroNoMedidor(substring2(linha, 1835,4));
			medidor.setCodigoDoErro1(substring2(linha, 1839,2));
			medidor.setCodigoDoErro2(substring2(linha, 1841,2));
			medidor.setCodigoDoErro3(substring2(linha, 1843,2));
			medidor.setCodigoDoErro4(substring2(linha, 1845,2));
			medidor.setCodigoDoErro5(substring2(linha, 1847,2));
			medidor.setCodigoDoErro6(substring2(linha, 1849,2));
			medidor.setALER_AlteracaoDaCondicaoDeErro(substring2(linha, 1851,4));
			medidor.setCodigoDoErro7(substring2(linha, 1855,2));
			medidor.setCodigoDoErro8(substring2(linha, 1857,2));
			medidor.setCodigoDoErro9(substring2(linha, 1859,2));
			medidor.setCodigoDoErro10(substring2(linha, 1861,2));
			medidor.setCodigoDoErro11(substring2(linha, 1863,2));
			medidor.setCodigoDoErro12(substring2(linha, 1865,2));
			medidor.setINIC_InicializacaoDoMedidor(substring2(linha, 1867,4));
			medidor.setNIMP_InformacaoDoComandoNaoImplementado(substring2(linha, 1871,4));
			medidor.setCodigoDoComando1(substring2(linha, 1875,2));
			medidor.setCodigoDoComando2(substring2(linha, 1877,2));
			medidor.setCodigoDoComando3(substring2(linha, 1879,2));
			medidor.setDIGI_DadosDigitadosPeloLeiturista(substring2(linha, 1881,4));
			medidor.setCodigoDaOcorrencia1(substring2(linha, 1885,6));
			medidor.setCodigoDaOcorrencia2(substring2(linha, 1891,6));
			medidor.setCodigoDaOcorrencia3(substring2(linha, 1897,6));
			medidor.setATPR_AvacaoHorarioReservadiOu_DTPR_DesativacaoDoHorarioReservado(substring2(linha, 1903,4));
			medidor.setCodigoDaAlteracaoDoMedidor(substring2(linha, 1907,2));
			medidor.setNumeroDeSerieDaLeitoraQueAlterouOMedidor(substring2(linha, 1909,6));
			medidor.setHoraDaAlteracao(substring2(linha, 1915,2));
			medidor.setMinutoDaAlteracao(substring2(linha, 1917,2));
			medidor.setSegundoDaAlteracao(substring2(linha, 1919,2));
			medidor.setDiaDaAlteracao(substring2(linha, 1921,2));
			medidor.setMesDaAlteracao(substring2(linha, 1923,2));
			medidor.setAnoDaAlteracao(substring2(linha, 1925,2));
			medidor.setCodigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao1(substring2(linha, 1927,20));
			medidor.setCodigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao2(substring2(linha, 1947,20));
			medidor.setCodigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao3(substring2(linha, 1967,20));
			medidor.setCodigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao4(substring2(linha, 1987,20));
			medidor.setCodigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao5(substring2(linha, 2007,20));
			medidor.setCodigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao6(substring2(linha, 2027,20));
			medidor.setCodigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao7(substring2(linha, 2047,20));
			medidor.setCodigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao8(substring2(linha, 2067,20));
			medidor.setCodigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao9(substring2(linha, 2087,20));
			medidor.setCodigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao10(substring2(linha, 2107,20));
			medidor.setCodigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao11(substring2(linha, 2127,20));
			medidor.setCodigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao12(substring2(linha, 2147,20));
			medidor.setCodigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao13(substring2(linha, 2167,20));
			medidor.setCodigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao14(substring2(linha, 2187,20));
			medidor.setCodigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao15(substring2(linha, 2207,20));
			medidor.setTipoDeTarifa(substring2(linha, 2227,2));
			medidor.setDiaDoFimDoHorarioDeInverno(substring2(linha, 2229,2));
			medidor.setMesDoFimDoHorarioDeInverno(substring2(linha, 2231,2));
			medidor.setDiaDoFimDoHorarioDeVerao(substring2(linha, 2233,2));
			medidor.setMesDoFimDoHorarioDeVerao(substring2(linha, 2235,2));
			medidor.setDiaDaReposicaoDeDemandaAutomatica(substring2(linha, 2237,2));
			medidor.setDiaDoInicioDoConjunto1DeSegmentosHorarios1(substring2(linha, 2239,2));
			medidor.setMesDoInicioDoConjunto1DeSegmentosHorarios1(substring2(linha, 2241,2));
			medidor.setDiaDoInicioDoConjunto2DeSegmentosHorarios1(substring2(linha, 2243,2));
			medidor.setMesDoInicioDoConjunto2DeSegmentosHorarios1(substring2(linha, 2245,2));
			medidor.setDiaDoInicioDoConjunto1DeSegmentosHorarios2(substring2(linha, 2247,2));
			medidor.setMesDoInicioDoConjunto1DeSegmentosHorarios2(substring2(linha, 2249,2));
			medidor.setDiaDoInicioDoConjunto2DeSegmentosHorarios2(substring2(linha, 2251,2));
			medidor.setMesDoInicioDoConjunto2DeSegmentosHorarios2(substring2(linha, 2253,2));
			medidor.setHoraDoInicioDoHorarioDePontaDoConjunto2_1(substring2(linha, 2255,2));
			medidor.setMinutoDoInicioDoHorarioDePontaDoConjunto2_1(substring2(linha, 2257,2));
			medidor.setHoraDoInicioDoHorarioDePontaDoConjunto2_2(substring2(linha, 2259,2));
			medidor.setMinutoDoInicioDoHorarioDePontaDoConjunto2_2(substring2(linha, 2261,2));
			medidor.setHoraDoInicioDoHorarioDePontaDoConjunto2_3(substring2(linha, 2263,2));
			medidor.setMinutoDoInicioDoHorarioDePontaDoConjunto2_3(substring2(linha, 2265,2));
			medidor.setHoraDoInicioDoHorarioDePontaDoConjunto2_4(substring2(linha, 2267,2));
			medidor.setMinutoDoInicioDoHorarioDePontaDoConjunto(substring2(linha, 2269,2));
			medidor.setHoraDoInicioDoHorarioDeForaPontaDoConjunto2_1(substring2(linha, 2271,2));
			medidor.setMinutoDoInicioDoHorarioDeForaPontaDoConjunto2_1(substring2(linha, 2273,2));
			medidor.setHoraDoInicioDoHorarioDeForaPontaDoConjunto2_2(substring2(linha, 2275,2));
			medidor.setMinutoDoInicioDoHorarioDeForaPontaDoConjunto2_2(substring2(linha, 2277,2));
			medidor.setHoraDoInicioDoHorarioDeForaPontaDoConjunto2_3(substring2(linha, 2279,2));
			medidor.setMinutoDoInicioDoHorarioDeForaPontaDoConjunto2_3(substring2(linha, 2281,2));
			medidor.setHoraDoInicioDoHorarioDeForaPontaDoConjunto2_4(substring2(linha, 2283,2));
			medidor.setMinutoDoInicioDoHorarioDeForaPontaDoConjunto2_4(substring2(linha, 2285,2));
			medidor.setHoraDoInicioDoHorarioReservadoDoConjunto2_1(substring2(linha, 2287,2));
			medidor.setMinutoDoInicioDoHorarioReservadoDoConjunto2_1(substring2(linha, 2289,2));
			medidor.setHoraDoInicioDoHorarioReservadoDoConjunto2_2(substring2(linha, 2291,2));
			medidor.setMinutoDoInicioDoHorarioReservadoDoConjunto2_2(substring2(linha, 2293,2));
			medidor.setHoraDoInicioDoHorarioReservadoDoConjunto2_3(substring2(linha, 2295,2));
			medidor.setMinutoDoInicioDoHorarioReservadoDoConjunto2_3(substring2(linha, 2297,2));
			medidor.setHoraDoInicioDoHorarioReservadoDoConjunto2_4(substring2(linha, 2299,2));
			medidor.setMinutoDoInicioDoHorarioReservadoDoConjunto2_4(substring2(linha, 2301,2));
			medidor.setFormaDeCalculoDaDemanda(substring2(linha, 2303,2));
			medidor.setModeloDoMedidor(substring2(linha, 2305,4));
			medidor.setGrandezaDo1oCanalVisivel(substring2(linha, 2309,2));
			medidor.setGrandezaDo2oCanalVisivel(substring2(linha, 2311,2));
			medidor.setGrandezaDo3oCanalVisivel(substring2(linha, 2313,2));
			medidor.setComposicaoDosCanaisParaCalculoDoFatorDePotencia(substring2(linha, 2315,2));
			medidor.setMinutosSegundosECentesimosDoIntervaloDaMemoriaDeMassa(substring2(linha, 2317,6));
			medidor.setSegmentosHorariosDosSabados(substring2(linha, 2323,2));
			medidor.setSegmentosHorariosDosDomingos(substring2(linha, 2325,2));
			medidor.setSegmentosHorariosDosFeriados(substring2(linha, 2327,2));
			medidor.setIntervaloDeConsumoReativo(substring2(linha, 2329,4));
			medidor.setIntervaloDeDemandaReativo(substring2(linha, 2333,4));
			medidor.setFatorDePotenciaDeReferenciaIndutivo(substring2(linha, 2337,2));
			medidor.setFatorDePotenciaDeReferenciaCapacitivo(substring2(linha, 2339,2));
			medidor.setHoraDeInicioDoHorarioReativoIndutivo1(substring2(linha, 2341,2));
			medidor.setMinutoDeInicioDoHorarioReativoIndutivo1(substring2(linha, 2343,2));
			medidor.setHoraDeInicioDoHorarioReativoIndutivo2(substring2(linha, 2345,2));
			medidor.setMinutoDeInicioDoHorarioReativoIndutivo2(substring2(linha, 2347,2));
			medidor.setHoraDeInicioDoHorarioReativoCapacitivo3(substring2(linha, 2349,2));
			medidor.setMinutoDeInicioDoHorarioReativoCapacitivo3(substring2(linha, 2351,2));
			medidor.setHoraDeInicioDoHorarioReativoCapacitivo4(substring2(linha, 2353,2));
			medidor.setMinutoDeInicioDoHorarioReativoCapacitivo4(substring2(linha, 2355,2));
			medidor.setHoraDeInicioDoHorarioReativoIndutivoDoConjunto2_1(substring2(linha, 2357,2));
			medidor.setMinutoDeInicioDoHorarioReativoIndutivoDoConjunto2_1(substring2(linha, 2359,2));
			medidor.setHoraDeInicioDoHorarioReativoIndutivoDoConjunto2_2(substring2(linha, 2361,2));
			medidor.setMinutoDeInicioDoHorarioReativoIndutivoDoConjunto2_2(substring2(linha, 2363,2));
			medidor.setHoraDeInicioDoHorarioReativoCapacitivoDoConjunto2_1(substring2(linha, 2365,2));
			medidor.setMinutoDeInicioDoHorarioReativoCapacitivoDoConjunto2_1(substring2(linha, 2367,2));
			medidor.setHoraDeInicioDoHorarioReativoCapacitivoDoConjunto2_2(substring2(linha, 2369,2));
			medidor.setMinutoDeInicioDoHorarioReativoCapacitivoDoConjunto2_2(substring2(linha, 2371,2));
			medidor.setSegmentosReativosAtivosDiasUteis(substring2(linha, 2373,1));
			medidor.setSegmentosReativosAtivosSabados(substring2(linha, 2374,1));
			medidor.setSegmentosReativosAtivosDomingos(substring2(linha, 2375,1));
			medidor.setSegmentosReativosAtivosFeriados(substring2(linha, 2376,1));
			medidor.setCondicaoDaSerialDoConsumidorEstendida(substring2(linha, 2377,1));
			medidor.setCodigoDaInstalacao(substring2(linha, 2378,14));
			medidor.setNaoUtilizados(substring2(linha, 2392,9));
			
			Medidor novoMedidor = medidorDaoRepository.buscarPorArquivoAdicionado(medidor.getNumeroSerieMedidor(), medidor.getDiaAtual());
			
			if (novoMedidor != null) {
				FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Arquivo", medidor.getNumeroSerieMedidor() + " já adicionado.");
				FacesContext.getCurrentInstance().addMessage(null, message);
			}else {
				medidorDaoRepository.save(medidor);
			}

			br.close();
			fr.close();

		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	public static String substring2(String linha, int posicao, int tamanho){
		return linha.substring(posicao -1, posicao - 1 + tamanho);

	}

	
	public Medidor getMedidor() {
		return medidor;
	}

	public void setMedidor(Medidor medidor) {
		this.medidor = medidor;
	}

	public List<Medidor> getMedidores() {
		return medidores;
	}

	public void setMedidores(List<Medidor> medidores) {
		this.medidores = medidores;
	}

	public Medidor getMedidorSelecionado() {
		return medidorSelecionado;
	}
	
	public UploadedFile getFile() {
		return file;
	}

	public void setFile(UploadedFile file) {
		this.file = file;
	}

	public List<Leitura> getLeituras() {
		return leituras;
	}

	public void setLeituras(List<Leitura> leituras) {
		this.leituras = leituras;
	}

	public void setMedidorSelecionado(Medidor medidorSelecionado) {
		this.medidorSelecionado = medidorSelecionado;
	}
	
}
