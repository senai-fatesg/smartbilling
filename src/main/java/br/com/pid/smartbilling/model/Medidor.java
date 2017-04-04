package br.com.pid.smartbilling.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Medidor implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;
	// 1º bloco header layout
	private String numeroSerieMedidor;
	private String numeroSerieLeitor;
	private String horaAtual;
	private String minutoAtual;
	private String segundoAtual;
	private String diaAtual;
	private String mesAtual;
	private String anoAtual;
	private String diaSemanaAtual;
	private String horaUltimoIntervDemanda;
	private String minutoUltimoIntervDemanda;
	private String segundoUltimoIntervDemanda;
	private String diaUltimoIntervDemanda;
	private String mesUltimoIntervDemanda;
	private String anoUltimoIntervDemanda;
	private String horaUltimaReposicDemanda;
	private String minutoUltimaReposicDemanda;
	private String segundoUltimaReposicDemanda;
	private String diaUltimaReposicDemanda;
	private String mesUltimaReposicDemanda;
	private String anoUltimaReposicDemaanda;
	private String horaPenultRepDemanda;
	private String minPenultRepDemanda;
	private String segPenultRepDemanda;
	private String diaPenultRepDemanda;
	private String mesPenultRepDemanda;
	private String anoPenultRepDemanda;
	private String numeradorConstanteKe;
	private String denominadorConstanteKe;
	private String totalizAtualGeralUFER;
	private String totalizAnterGeralUFER;
	private String diaInicioPeriodoUmido;
	private String mesInicioPeriodoUmido;
	private String diaInicioPeriodoSeco;
	private String mesInicioPeriodoSeco;
	private String horaInicioHorarioPonta;
	private String minInicioHorarioPonta;
	private String horaInicioHorarioPonta1;
	private String minInicioHorarioPonta1;
	private String horaInicioHorarioPonta2;
	private String minInicioHorarioPonta2;
	private String horaInicioHorarioPonta3;
	private String minIncioHorarioPonta3;
	private String horaInicioHorarioForaPonta1;
	private String minIncioHorarioForaPonta1;
	private String horaInicioHorarioForaPonta2;
	private String minInicioHorarioForaPonta2;
	private String horaInicioHorarioForaPonta3;
	//2º bloco header layout
	private String minInicioHorarioForaPonta3;
	private String horaInicioHorarioForaPonta4;
	private String minInicioHorarioForaPonta4;
	private String horaInicioHorarioReservado1;
	private String minInicioHorarioReservado1;
	private String horaInicioHorarioReservado2;
	private String minInicioHorarioReservado2;
	private String horaInicioHorarioReservado3;
	private String minInicioHorarioReservado3;
	private String horaInicioHorarioReservado4;
	private String minInicioHorarioReservado4;
	private String numeroPalavrasLeiturAtual;
	private String numeroPalavrasUltimaReposicaoDemanda;
	private String numeroOperacoesReposicaoDemanda;
	private String intervaloDemandaAtual;
	private String intervaloDemandaAnterior;
	private String diaMesAnoDeFeriadoNacional1;
	private String diaMesAnoDeFeriadoNacional2;
	private String diaMesAnoDeFeriadoNacional3;
	private String diaMesAnoDeFeriadoNacional4;
	private String diaMesAnoDeFeriadoNacional5;
	private String diaMesAnoDeFeriadoNacional6;
	private String diaMesAnoDeFeriadoNacional7;
	private String diaMesAnoDeFeriadoNacional8;
	private String diaMesAnoDeFeriadoNacional9;
	private String diaMesAnoDeFeriadoNacional10;
	private String diaMesAnoDeFeriadoNacional11;
	private String diaMesAnoDeFeriadoNacional12;
	private String diaMesAnoDeFeriadoNacional13;
	private String diaMesAnoDeFeriadoNacional14;
	private String diaMesAnoDeFeriadoNacional15;
	private String numeradorConstanteMultiplicacao1CanalVisivel;
	private String denominadorConstanteMultiplicacao1CanalVisivel;
	private String numeradorConstanteMultiplicacao2CanalVisivel;
	private String denominadorConstanteMultiplicacao2CanalVisivel;
	private String numeradorConstanteMultiplicacao3CanalVisivel;;
	private String denominadorConstanteMultiplicacao3CanalVisivel;
	private String estadoDaBateria;
	private String versaoSoftwareRegistrador;
	private String leituraCondicaoHorarioReservado;
	private String horaDaFaltaDeEnergia;
	private String minutoDaFaltaDeEnergia;
	private String segundoDaFaltaDeEnergia;
	private String diaDaFaltaDeEnergia;
	private String mesDaFaltaDeEnergia;
	private String anoDaFaltaDeEnergia;
	private String horaDoRetornoDeEnergia;
	private String minutoDoRetornoDeEnergia;
	private String segundoDoRetornoDeEnergia;
	private String diaDoRetornoDeEnergia;
	private String mesDoRetornoDeEnergia;
	private String anoDoRetornoDeEnergia;
	private String horaDataFaltaHoraDataRetornoEnergia1;
	private String horaDataFaltaHoraDataRetornoEnergia2;
	private String horaDataFaltaHoraDataRetornoEnergia3;
	private String horaDataFaltaHoraDataRetornoEnergia4;
	private String horaDataFaltaHoraDataRetornoEnergia5;
	private String horaDataFaltaHoraDataRetornoEnergia6;
	//3º bloco header layout
	private String horaDataFaltaHoraDataRetornoEnergia7;
	private String horaDataFaltaHoraDataRetornoEnergia8;
	private String horaDataFaltaHoraDataRetornoEnergia9;
	private String horaDataFaltaHoraDataRetornoEnergia10;
	private String horaDataFaltaHoraDataRetornoEnergia11;
	private String horaDataFaltaHoraDataRetornoEnergia12;
	private String horaDataFaltaHoraDataRetornoEnergia13;
	private String horaDataFaltaHoraDataRetornoEnergia14;
	private String horaDataFaltaHoraDataRetornoEnergia15;
	private String totalizadorAtualGeral1oCanalVisivel;
	private String totalizadorAtual1oCanalVisivelPontaUmida;
	private String totalizadorAtualUFEREmPonta;
	private String totalizadorAtual1oCanalVisivelForaPontaUmida;
	private String totalizadorAtualUFEREmForaPonta;
	private String totalizadorAtual1oCanalVisivelEmReservadoUmido;
	private String totalizadorAtualDeUFEREmReservado;
	private String demandaDoUltimoIntervaloAtualDo1oCanalVisivel;
	private String demandaAtualMaximaDo1oCanalVisivelEmPonta;
	private String dmcrAtualEmPonta;
	private String demandaAtualMaxima1oCanalVisivelForaPonta;
	private String dmcrAtualEmForaPonta;
	private String demandaAtualMaxima1oCanalVisivelReservado;
	private String dmcrAtualEmReservado;
	private String DemandaAtualAcumulada1oCanalVisivelEmPonta;
	private String dmcrAtualAcumuladaEmPonta;
	private String DemandaAtualAcumulada1oCanalVisivelEmForaPonta;
	private String dmcrAtualAcumuladaEmForaPonta;
	private String DemandaAtualAcumulada1oCanalVisivelEmReservado;
	private String dmcrAtualAcumuladaEmReservado;
	private String totalizadorAtualGeral2oCanalVisivel;
	private String totalizadorAtual2oCanalVisivelEmPonta;
	private String totalizadorAtualReverso2oCanalVisivelEmPonta;
	private String totalizadorAtual2oCanalVisivelEmForaPonta;
	private String totalizadorAtualReverso2oCanalVisivelEmForaPonta;
	private String totalizadorAtual2oCanalVisivelEmReservado;
	private String totalizadorAtualReverso2oCanalVisivelReservado;
	private String demandaUltimoIntervaloAtual2oCanalVisivel;
	private String demandaAtualMaxima2oCanalVisivelEmPonta;
	private String demandaReversaAtualMaxima2oCanalVisivelEmPonta;
	private String demandaAtualMaxima2oCanalVisivelEmForaPonta;
	private String demandaReversaAtualMaxima2oCanalVisivelEmForaPonta;
	private String demandaAtualMaxima2oCanalVisivelEmReservado;
	private String demandaReversaAtualMaxima2oCanalVisivelEmReservado;
	private String demandaAtualAcumulada2oCanalVisivelEmPonta;
	private String demandaReversaAtualAcumulada2oCanalVisivelEmPonta;
	private String demandaAtualAcumulada2oCanalVisivelEmForaPonta;
	private String demandaReversaAtualAcumulada2oCanalVisivelEmForaPonta;
	private String demandaAtualAcumulada2oCanalVisivelEmReservado;
	private String demandaReversaAtualAcumulada2oCanalVisivelEmReservado;
	private String totalizadorAtualGeral3oCanalVisivel;
	private String totalizadorAtual3oCanalVisivelEmPonta;
	private String totalizadorAtualReverso3oCanalVisivelEmPonta;
	private String totalizadorAtual3oCanalVisivelEmForaPonta;
	private String totalizadorAtualReverso3oCanalVisivelEmForaPonta;
	private String totalizadorAtual3oCanalVisivelEmReservado;
	private String totalizadorAtualReverso3oCanalVisivelEmReservado;
	private String demandaDoUltimoIntervaloAtual3oCanalVisivel;
	private String demandaAtualMaxima3oCanalVisivelEmPonta;
	//4º bloco header layout
	private String demandaAtualReversaMaxima3oCanalVisivelEmPonta;
	private String demandaAtualMaxima3oCanalVisivelEmForaPonta;
	private String demandaAtualReversaMaxima3oCanalVisivelEmForaPonta;
	private String demandaAtualMaxima3oCanalVisivelEmReservado;
	private String demandaAtualReversaMaxima3oCanalVisivelEmReservado;
	private String demandaAtualAcumulada3oCanalVisivelEmPonta;
	private String demandaAtualReversaAcumulada3oCanalVisivelEmPonta;
	private String demandaAtualAcumulada3oCanalVisivelEmForaPonta;
	private String demandaAtualReversaAcumulada3oCanalVisivelEmForaPonta;
	private String demandaAtualAcumulada3oCanalVisivelEmReservado;
	private String demandaAtualReversaAcumulada3oCanalVisivelEmReservado;
	private String totalizadorAnteriorGeral1oCanalVisivel;
	private String totalizadorAnterior1oCanalVisivelEmPonta;
	private String totalizadorAnteriorUFEREmPonta;
	private String totalizadorAnterior1oCanalVisivelEmForaPonta;
	private String totalizadorAnteriorUFEREmForaPonta;
	private String totalizadorAnterior1oCanalVisivelEmReservado;
	private String totalizadorAnteriorUFEREmReservado;
	private String demandaDoUltimoIntervaloAnterior1oCanalVisivel;
	private String demandaAnteriorMaxima1oCanalVisivelEmPonta;
	private String dmcrAnteriorEmPonta;
	private String demandaAnteriorMaxima1oCanalVisivelEmForaPonta;
	private String dmcrAnteriorEmForaPonta;
	private String demandaAnteriorMaxima1oCanalVisivelEmReservado;
	private String dmcrAnteriorEmReservado;
	private String demandaAnteriorAcumulada1oCanalVisivelEmPonta;
	private String dmcrAnteriorAcumuladaEmPonta;
	private String demandaAnteriorAcumulada1oCanalVisivelEmForaPonta;
	private String dmcrAnteriorAcumuladaEmForaPonta;
	private String demandaAnteriorAcumulada1oCanalVisivelEmReservado;
	private String dmcrAnteriorAcumuladaEmReservado;
	private String totalizadorAnteriorGeral2oCanalVisivel;
	private String totalizadorAnterior2oCanalVisivelEmPonta;
	private String totalizadorAnteriorReverso2oCanalVisivelEmPonta;
	private String totalizadorAnterior2oCanalVisivelEmForaPonta;
	private String totalizadorAnteriorReverso2oCanalVisivelEmForaPonta;
	private String totalizadorAnterior2oCanalVisivelEmReservado;
	private String totalizadorAnteriorReverso2oCanalVisivelEmReservado;
	private String demandaDoUltimoIntervaloAnterior2oCanalVisivel;
	private String demandaAnteriorMaxima2oCanalVisivelEmPonta;
	private String demandaAnteriorReversaMaxima2oCanalVisivelEmPonta;
	private String demandaAnteriorMaxima2oCanalVisivelEmForaPonta;
	private String demandaAnteriorReversaMaxima2oCanalVisivelEmForaPonta;
	private String demandaAnteriorMaxima2oCanalVisivelEmReservado;
	private String demandaAnteriorReversaMaxima2oCanalVisivelEmReservado;
	private String demandaAnteriorAcumulada2oCanalVisivelEmPonta;
	private String demandaAnteriorReversaAcumulada2oCanalVisivelEmPonta;
	private String demandaAnteriorAcumulada2oCanalVisivelEmForaPonta;
	private String demandaAnteriorReversaAcumulada2oCanalVisivelEmForaPonta;
	private String demandaAnteriorAcumulada2oCanalVisivelEmReservado;
	private String demandaAnteriorReversaAcumulada2oCanalVisivelEmReservado;
	private String totalizadorAnteriorGeral3oCanalVisivel;
	private String totalizadorAnterior3oCanalVisivelEmPonta;
	private String totalizadorAnteriorReverso3oCanalVisivelEmPonta;
	private String totalizadorAnterior3oCanalVisivelEmForaPonta;
	private String totalizadorAnteriorReverso3oCanalVisivelEmForaPonta;
	private String totalizadorAnterior3oCanalVisivelEmReservado;
	private String totalizadorAnteriorReverso3oCanalVisivelEmReservado;
	//5º bloco header layout
	private String demandaDoUltimoIntervaloAnteriorDo3oCanalVisivel;
	private String demandaAnteriormaximaDo3oCanalVisivelEmPontaa;
	private String demandaAnteriorReversamaximaDo3oCanalVisivelEmPontaa;
	private String demandaAnteriormaximaDo3oCanalVisivelEmForaPonta;
	private String demandaAnteriorReversamaximaDo3oCanalVisivelEmForaPonta;
	private String demandaAnteriormaximaDo3oCanalVisivelEmReservado;
	private String demandaAnteriorReversamaximaDo3oCanalVisivelEmReservado;
	private String demandaAnteriorAcumuladaDo3oCanalVisivelEmPontaa;
	private String demandaAnteriorReversaAcumuladaDo3oCanalVisivelEmPontaa;
	private String demandaAnteriorAcumuladaDo3oCanalVisivelEmForaPonta;
	private String demandaAnteriorReversaAcumuladaDo3oCanalVisivelEmForaPonta;
	private String demandaAnteriorAcumuladaDo3oCanalVisivelEmReservado;
	private String demandaAnteriorReversaAcumuladaDo3oCanalVisivelEmReservado;
	private String DATA_AlteracaoDaData;
	private String dia;
	private String mes;
	private String ano;
	private String diaDaSemana;
	private String HORA_AlteracaoDoHorario;
	private String hora;
	private String minuto;
	private String segundo;
	private String INTE_AlteracaoDoIntervaloDeDemanda;
	private String minutos;
	private String FERN_AlteracaoDosFeriadosNacionais;
	private String diaMesAno1;
	private String diaMesAno2;
	private String diaMesAno3;
	private String diaMesAno4;
	private String diaMesAno5;
	private String diaMesAno6;
	private String diaMesAno7;
	private String diaMesAno8;
	private String diaMesAno9;
	private String diaMesAno10;
	private String diaMesAno11;
	private String diaMesAno12;
	private String diaMesAno13;
	private String diaMesAno14;
	private String diaMesAno15;
	private String CONS_AlteracaoDasConstantesDeMultiplicacao;
	private String numeradorDo1oCanalVisivel;
	private String denominadorDo1oCanalVisivel;
	private String numeradorDo2oCanalVisivel;
	private String denominadorDo2oCanalVisivel;
	private String numeradorDo3oCanalVisivel;
	private String denominadorDo3oCanalVisivel;
	private String PSAZ_AlteracaoDosPeriodosSazonais;
	private String diaDoInicioDoPeriodoUmido1;
	private String mesDoInicioDoPeriodoUmido1;
	private String diaDoInicioDoPeriodoSeco1;
	private String mesDoInicioDoPeriodoSeco1;
	private String diaDoInicioDoPeriodoUmido2;
	private String mesDoInicioDoPeriodoUmido2;
	private String diaDoInicioDoPeriodoSeco2;
	private String mesDoInicioDoPeriodoSeco2;
	private String diaDoInicioDoPeriodoUmido3;
	private String mesDoInicioDoPeriodoUmido3;
	//6º bloco header layout
	private String dia_DoInicioDoPeriodoSSeco1;
	private String mes_DoInicioDoPeriodoSSeco1;
	private String dia_DoInicioDoPeriodoUUmido1;
	private String mes_DoInicioDoPeriodoUUmido1;
	private String dia_DoInicioDoPeriodoSSeco2;
	private String mes_DoInicioDoPeriodoSSeco2;
	private String dia_DoInicioDoPeriodoUUmido2;
	private String mes_DoInicioDoPeriodoUUmido2;
	private String dia_DoInicioDoPeriodoSSeco3;
	private String mes_DoInicioDoPeriodoSSeco3;
	private String PDIA_AlteracaoDosSegmentosHorarios;
	private String horaDoInicioDoHorarioDePonta1;
	private String minutoDoInicioDoHorarioDePonta1;
	private String horaDoInicioDoHorarioDePonta2;
	private String minutoDoInicioDoHorarioDePonta2;
	private String horaDoInicioDoHorarioDePonta3;
	private String minutoDoInicioDoHorarioDePonta3;
	private String horaDoInicioDoHorarioDePonta4;
	private String minutoDoInicioDoHorarioDePonta4;
	private String horaDoInicioDoHorarioDeForaPonta1;
	private String minutoDoInicioDoHorarioDeForaPonta1;
	private String horaDoInicioDoHorarioDeForaPonta2;
	private String minutoDoInicioDoHorarioDeForaPonta2;
	private String horaDoInicioDoHorarioDeForaPonta3;
	private String minutoDoInicioDoHorarioDeForaPonta3;
	private String horaDoInicioDoHorarioDeForaPonta4;
	private String minutoDoInicioDoHorarioDeForaPonta4;
	private String horaDoInicioDoHorarioReservado1;
	private String minutoDoInicioDoHorarioReservado1;
	private String horaDoInicioDoHorarioReservado2;
	private String minutoDoInicioDoHorarioReservado2;
	private String horaDoInicioDoHorarioReservado3;
	private String minutoDoInicioDoHorarioReservado3;
	private String horaDoInicioDoHorarioReservado4;
	private String minutoDoInicioDoHorarioReservado4;
	private String ERRO_InformacaoDeErroNoMedidor;
	private String codigoDoErro1;
	private String codigoDoErro2;
	private String codigoDoErro3;
	private String codigoDoErro4;
	private String codigoDoErro5;
	private String codigoDoErro6;
	private String ALER_AlteracaoDaCondicaoDeErro;
	private String codigoDoErro7;
	private String codigoDoErro8;
	private String codigoDoErro9;
	private String codigoDoErro10;
	private String codigoDoErro11;
	private String codigoDoErro12;
	private String INIC_InicializacaoDoMedidor;
	private String NIMP_InformacaoDoComandoNaoImplementado;
	private String codigoDoComando1;
	private String codigoDoComando2;
	private String codigoDoComando3;
	private String DIGI_DadosDigitadosPeloLeiturista;
	private String codigoDaOcorrencia1;
	private String codigoDaOcorrencia2;
	private String codigoDaOcorrencia3;
	//7º bloco header layout
	private String ATPR_AvacaoHorarioReservadiOu_DTPR_DesativacaoDoHorarioReservado;
	private String codigoDaAlteracaoDoMedidor;
	private String numeroDeSerieDaLeitoraQueAlterouOMedidor;
	private String horaDaAlteracao;
	private String minutoDaAlteracao;
	private String segundoDaAlteracao;
	private String diaDaAlteracao;
	private String mesDaAlteracao;
	private String anoDaAlteracao;
	private String codigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao1;
	private String codigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao2;
	private String codigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao3;
	private String codigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao4;
	private String codigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao5;
	private String codigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao6;
	private String codigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao7;
	private String codigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao8;
	private String codigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao9;
	private String codigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao10;
	private String codigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao11;
	private String codigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao12;
	private String codigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao13;
	private String codigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao14;
	private String codigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao15;
	private String tipoDeTarifa;
	private String diaDoFimDoHorarioDeInverno;
	private String mesDoFimDoHorarioDeInverno;
	private String diaDoFimDoHorarioDeVerao;
	private String mesDoFimDoHorarioDeVerao;
	private String diaDaReposicaoDeDemandaAutomatica;
	private String diaDoInicioDoConjunto1DeSegmentosHorarios1;
	private String mesDoInicioDoConjunto1DeSegmentosHorarios1;
	private String diaDoInicioDoConjunto2DeSegmentosHorarios1;
	private String mesDoInicioDoConjunto2DeSegmentosHorarios1;
	private String diaDoInicioDoConjunto1DeSegmentosHorarios2;
	private String mesDoInicioDoConjunto1DeSegmentosHorarios2;
	private String diaDoInicioDoConjunto2DeSegmentosHorarios2;
	private String mesDoInicioDoConjunto2DeSegmentosHorarios2;
	private String horaDoInicioDoHorarioDePontaDoConjunto2_1;
	private String minutoDoInicioDoHorarioDePontaDoConjunto2_1;
	private String horaDoInicioDoHorarioDePontaDoConjunto2_2;
	private String minutoDoInicioDoHorarioDePontaDoConjunto2_2;
	private String horaDoInicioDoHorarioDePontaDoConjunto2_3;
	private String minutoDoInicioDoHorarioDePontaDoConjunto2_3;
	private String horaDoInicioDoHorarioDePontaDoConjunto2_4;
	private String minutoDoInicioDoHorarioDePontaDoConjunto;
	private String horaDoInicioDoHorarioDeForaPontaDoConjunto2_1;
	private String minutoDoInicioDoHorarioDeForaPontaDoConjunto2_1;
	private String horaDoInicioDoHorarioDeForaPontaDoConjunto2_2;
	private String minutoDoInicioDoHorarioDeForaPontaDoConjunto2_2;
	private String horaDoInicioDoHorarioDeForaPontaDoConjunto2_3;
	private String minutoDoInicioDoHorarioDeForaPontaDoConjunto2_3;
	private String horaDoInicioDoHorarioDeForaPontaDoConjunto2_4;
	private String minutoDoInicioDoHorarioDeForaPontaDoConjunto2_4;
	private String horaDoInicioDoHorarioReservadoDoConjunto2_1;
	private String minutoDoInicioDoHorarioReservadoDoConjunto2_1;
	//8º bloco header layout
	private String horaDoInicioDoHorarioReservadoDoConjunto2_2;
	private String minutoDoInicioDoHorarioReservadoDoConjunto2_2;
	private String horaDoInicioDoHorarioReservadoDoConjunto2_3;
	private String minutoDoInicioDoHorarioReservadoDoConjunto2_3;
	private String horaDoInicioDoHorarioReservadoDoConjunto2_4;
	private String minutoDoInicioDoHorarioReservadoDoConjunto2_4;
	private String formaDeCalculoDaDemanda;
	private String modeloDoMedidor;
	private String grandezaDo1oCanalVisivel;
	private String grandezaDo2oCanalVisivel;
	private String grandezaDo3oCanalVisivel;
	private String composicaoDosCanaisParaCalculoDoFatorDePotencia;
	private String minutosSegundosECentesimosDoIntervaloDaMemoriaDeMassa;
	private String segmentosHorariosDosSabados;
	private String segmentosHorariosDosDomingos;
	private String segmentosHorariosDosFeriados;
	private String intervaloDeConsumoReativo;
	private String intervaloDeDemandaReativo;
	private String fatorDePotenciaDeReferenciaIndutivo;
	private String fatorDePotenciaDeReferenciaCapacitivo;
	private String horaDeInicioDoHorarioReativoIndutivo1;
	private String minutoDeInicioDoHorarioReativoIndutivo1;
	private String horaDeInicioDoHorarioReativoIndutivo2;
	private String minutoDeInicioDoHorarioReativoIndutivo2;
	private String horaDeInicioDoHorarioReativoCapacitivo3;
	private String minutoDeInicioDoHorarioReativoCapacitivo3;
	private String horaDeInicioDoHorarioReativoCapacitivo4;
	private String minutoDeInicioDoHorarioReativoCapacitivo4;
	private String horaDeInicioDoHorarioReativoIndutivoDoConjunto2_1;
	private String minutoDeInicioDoHorarioReativoIndutivoDoConjunto2_1;
	private String horaDeInicioDoHorarioReativoIndutivoDoConjunto2_2;
	private String minutoDeInicioDoHorarioReativoIndutivoDoConjunto2_2;
	private String horaDeInicioDoHorarioReativoCapacitivoDoConjunto2_1;
	private String minutoDeInicioDoHorarioReativoCapacitivoDoConjunto2_1;
	private String horaDeInicioDoHorarioReativoCapacitivoDoConjunto2_2;
	private String minutoDeInicioDoHorarioReativoCapacitivoDoConjunto2_2;
	private String segmentosReativosAtivosDiasUteis;
	private String segmentosReativosAtivosSabados;
	private String segmentosReativosAtivosDomingos;
	private String segmentosReativosAtivosFeriados;
	private String condicaoDaSerialDoConsumidorEstendida;
	private String codigoDaInstalacao;
	private String naoUtilizados;

	@ElementCollection
	private Set<Leitura> leituras = new HashSet<Leitura>();

	public List<Leitura> getLeiturasList(){
		return new ArrayList<Leitura>(this.leituras);
	}

	public void addLeitura(Leitura leitura){
		if(!this.isContemLeitura(leitura)){
			this.leituras.add(leitura);
		}
	}

	public void removerLeitura(Leitura leitura) {
		if(this.isContemLeitura(leitura)){
			this.leituras.remove(leitura);
		}
	}

	public boolean isContemLeitura(Leitura leitura){
		if(leituras != null){
			return leituras.contains(leitura);
		}else{
			return false;
		}
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNumeroSerieMedidor() {
		return numeroSerieMedidor;
	}

	public void setNumeroSerieMedidor(String numeroSerieMedidor) {
		this.numeroSerieMedidor = numeroSerieMedidor;
	}

	public String getNumeroSerieLeitor() {
		return numeroSerieLeitor;
	}

	public void setNumeroSerieLeitor(String numeroSerieLeitor) {
		this.numeroSerieLeitor = numeroSerieLeitor;
	}

	public String getHoraAtual() {
		return horaAtual;
	}

	public void setHoraAtual(String horaAtual) {
		this.horaAtual = horaAtual;
	}

	public String getMinutoAtual() {
		return minutoAtual;
	}

	public void setMinutoAtual(String minutoAtual) {
		this.minutoAtual = minutoAtual;
	}

	public String getSegundoAtual() {
		return segundoAtual;
	}

	public void setSegundoAtual(String segundoAtual) {
		this.segundoAtual = segundoAtual;
	}

	public String getDiaAtual() {
		return diaAtual;
	}

	public void setDiaAtual(String diaAtual) {
		this.diaAtual = diaAtual;
	}

	public String getMesAtual() {
		return mesAtual;
	}

	public void setMesAtual(String mesAtual) {
		this.mesAtual = mesAtual;
	}

	public String getAnoAtual() {
		return anoAtual;
	}

	public void setAnoAtual(String anoAtual) {
		this.anoAtual = anoAtual;
	}

	public String getDiaSemanaAtual() {
		return diaSemanaAtual;
	}

	public void setDiaSemanaAtual(String diaSemanaAtual) {
		this.diaSemanaAtual = diaSemanaAtual;
	}

	public String getHoraUltimoIntervDemanda() {
		return horaUltimoIntervDemanda;
	}

	public void setHoraUltimoIntervDemanda(String horaUltimoIntervDemanda) {
		this.horaUltimoIntervDemanda = horaUltimoIntervDemanda;
	}

	public String getMinutoUltimoIntervDemanda() {
		return minutoUltimoIntervDemanda;
	}

	public void setMinutoUltimoIntervDemanda(String minutoUltimoIntervDemanda) {
		this.minutoUltimoIntervDemanda = minutoUltimoIntervDemanda;
	}

	public String getSegundoUltimoIntervDemanda() {
		return segundoUltimoIntervDemanda;
	}

	public void setSegundoUltimoIntervDemanda(String segundoUltimoIntervDemanda) {
		this.segundoUltimoIntervDemanda = segundoUltimoIntervDemanda;
	}

	public String getDiaUltimoIntervDemanda() {
		return diaUltimoIntervDemanda;
	}

	public void setDiaUltimoIntervDemanda(String diaUltimoIntervDemanda) {
		this.diaUltimoIntervDemanda = diaUltimoIntervDemanda;
	}

	public String getMesUltimoIntervDemanda() {
		return mesUltimoIntervDemanda;
	}

	public void setMesUltimoIntervDemanda(String mesUltimoIntervDemanda) {
		this.mesUltimoIntervDemanda = mesUltimoIntervDemanda;
	}

	public String getAnoUltimoIntervDemanda() {
		return anoUltimoIntervDemanda;
	}

	public void setAnoUltimoIntervDemanda(String anoUltimoIntervDemanda) {
		this.anoUltimoIntervDemanda = anoUltimoIntervDemanda;
	}

	public String getHoraUltimaReposicDemanda() {
		return horaUltimaReposicDemanda;
	}

	public void setHoraUltimaReposicDemanda(String horaUltimaReposicDemanda) {
		this.horaUltimaReposicDemanda = horaUltimaReposicDemanda;
	}

	public String getMinutoUltimaReposicDemanda() {
		return minutoUltimaReposicDemanda;
	}

	public void setMinutoUltimaReposicDemanda(String minutoUltimaReposicDemanda) {
		this.minutoUltimaReposicDemanda = minutoUltimaReposicDemanda;
	}

	public String getSegundoUltimaReposicDemanda() {
		return segundoUltimaReposicDemanda;
	}

	public void setSegundoUltimaReposicDemanda(String segundoUltimaReposicDemanda) {
		this.segundoUltimaReposicDemanda = segundoUltimaReposicDemanda;
	}

	public String getDiaUltimaReposicDemanda() {
		return diaUltimaReposicDemanda;
	}

	public void setDiaUltimaReposicDemanda(String diaUltimaReposicDemanda) {
		this.diaUltimaReposicDemanda = diaUltimaReposicDemanda;
	}

	public String getMesUltimaReposicDemanda() {
		return mesUltimaReposicDemanda;
	}

	public void setMesUltimaReposicDemanda(String mesUltimaReposicDemanda) {
		this.mesUltimaReposicDemanda = mesUltimaReposicDemanda;
	}

	public String getAnoUltimaReposicDemaanda() {
		return anoUltimaReposicDemaanda;
	}

	public void setAnoUltimaReposicDemaanda(String anoUltimaReposicDemaanda) {
		this.anoUltimaReposicDemaanda = anoUltimaReposicDemaanda;
	}

	public String getHoraPenultRepDemanda() {
		return horaPenultRepDemanda;
	}

	public void setHoraPenultRepDemanda(String horaPenultRepDemanda) {
		this.horaPenultRepDemanda = horaPenultRepDemanda;
	}

	public String getMinPenultRepDemanda() {
		return minPenultRepDemanda;
	}

	public void setMinPenultRepDemanda(String minPenultRepDemanda) {
		this.minPenultRepDemanda = minPenultRepDemanda;
	}

	public String getSegPenultRepDemanda() {
		return segPenultRepDemanda;
	}

	public void setSegPenultRepDemanda(String segPenultRepDemanda) {
		this.segPenultRepDemanda = segPenultRepDemanda;
	}

	public String getDiaPenultRepDemanda() {
		return diaPenultRepDemanda;
	}

	public void setDiaPenultRepDemanda(String diaPenultRepDemanda) {
		this.diaPenultRepDemanda = diaPenultRepDemanda;
	}

	public String getMesPenultRepDemanda() {
		return mesPenultRepDemanda;
	}

	public void setMesPenultRepDemanda(String mesPenultRepDemanda) {
		this.mesPenultRepDemanda = mesPenultRepDemanda;
	}

	public String getAnoPenultRepDemanda() {
		return anoPenultRepDemanda;
	}

	public void setAnoPenultRepDemanda(String anoPenultRepDemanda) {
		this.anoPenultRepDemanda = anoPenultRepDemanda;
	}

	public String getNumeradorConstanteKe() {
		return numeradorConstanteKe;
	}

	public void setNumeradorConstanteKe(String numeradorConstanteKe) {
		this.numeradorConstanteKe = numeradorConstanteKe;
	}

	public String getDenominadorConstanteKe() {
		return denominadorConstanteKe;
	}

	public void setDenominadorConstanteKe(String denominadorConstanteKe) {
		this.denominadorConstanteKe = denominadorConstanteKe;
	}

	public String getTotalizAtualGeralUFER() {
		return totalizAtualGeralUFER;
	}

	public void setTotalizAtualGeralUFER(String totalizAtualGeralUFER) {
		this.totalizAtualGeralUFER = totalizAtualGeralUFER;
	}

	public String getTotalizAnterGeralUFER() {
		return totalizAnterGeralUFER;
	}

	public void setTotalizAnterGeralUFER(String totalizAnterGeralUFER) {
		this.totalizAnterGeralUFER = totalizAnterGeralUFER;
	}

	public String getDiaInicioPeriodoUmido() {
		return diaInicioPeriodoUmido;
	}

	public void setDiaInicioPeriodoUmido(String diaInicioPeriodoUmido) {
		this.diaInicioPeriodoUmido = diaInicioPeriodoUmido;
	}

	public String getMesInicioPeriodoUmido() {
		return mesInicioPeriodoUmido;
	}

	public void setMesInicioPeriodoUmido(String mesInicioPeriodoUmido) {
		this.mesInicioPeriodoUmido = mesInicioPeriodoUmido;
	}

	public String getDiaInicioPeriodoSeco() {
		return diaInicioPeriodoSeco;
	}

	public void setDiaInicioPeriodoSeco(String diaInicioPeriodoSeco) {
		this.diaInicioPeriodoSeco = diaInicioPeriodoSeco;
	}

	public String getMesInicioPeriodoSeco() {
		return mesInicioPeriodoSeco;
	}

	public void setMesInicioPeriodoSeco(String mesInicioPeriodoSeco) {
		this.mesInicioPeriodoSeco = mesInicioPeriodoSeco;
	}

	public String getHoraInicioHorarioPonta() {
		return horaInicioHorarioPonta;
	}

	public void setHoraInicioHorarioPonta(String horaInicioHorarioPonta) {
		this.horaInicioHorarioPonta = horaInicioHorarioPonta;
	}

	public String getMinInicioHorarioPonta() {
		return minInicioHorarioPonta;
	}

	public void setMinInicioHorarioPonta(String minInicioHorarioPonta) {
		this.minInicioHorarioPonta = minInicioHorarioPonta;
	}

	public String getHoraInicioHorarioPonta1() {
		return horaInicioHorarioPonta1;
	}

	public void setHoraInicioHorarioPonta1(String horaInicioHorarioPonta1) {
		this.horaInicioHorarioPonta1 = horaInicioHorarioPonta1;
	}

	public String getMinInicioHorarioPonta1() {
		return minInicioHorarioPonta1;
	}

	public void setMinInicioHorarioPonta1(String minInicioHorarioPonta1) {
		this.minInicioHorarioPonta1 = minInicioHorarioPonta1;
	}

	public String getHoraInicioHorarioPonta2() {
		return horaInicioHorarioPonta2;
	}

	public void setHoraInicioHorarioPonta2(String horaInicioHorarioPonta2) {
		this.horaInicioHorarioPonta2 = horaInicioHorarioPonta2;
	}

	public String getMinInicioHorarioPonta2() {
		return minInicioHorarioPonta2;
	}

	public void setMinInicioHorarioPonta2(String minInicioHorarioPonta2) {
		this.minInicioHorarioPonta2 = minInicioHorarioPonta2;
	}

	public String getHoraInicioHorarioPonta3() {
		return horaInicioHorarioPonta3;
	}

	public void setHoraInicioHorarioPonta3(String horaInicioHorarioPonta3) {
		this.horaInicioHorarioPonta3 = horaInicioHorarioPonta3;
	}

	public String getMinIncioHorarioPonta3() {
		return minIncioHorarioPonta3;
	}

	public void setMinIncioHorarioPonta3(String minIncioHorarioPonta3) {
		this.minIncioHorarioPonta3 = minIncioHorarioPonta3;
	}

	public String getHoraInicioHorarioForaPonta1() {
		return horaInicioHorarioForaPonta1;
	}

	public void setHoraInicioHorarioForaPonta1(String horaInicioHorarioForaPonta1) {
		this.horaInicioHorarioForaPonta1 = horaInicioHorarioForaPonta1;
	}

	public String getMinIncioHorarioForaPonta1() {
		return minIncioHorarioForaPonta1;
	}

	public void setMinIncioHorarioForaPonta1(String minIncioHorarioForaPonta1) {
		this.minIncioHorarioForaPonta1 = minIncioHorarioForaPonta1;
	}

	public String getHoraInicioHorarioForaPonta2() {
		return horaInicioHorarioForaPonta2;
	}

	public void setHoraInicioHorarioForaPonta2(String horaInicioHorarioForaPonta2) {
		this.horaInicioHorarioForaPonta2 = horaInicioHorarioForaPonta2;
	}

	public String getMinInicioHorarioForaPonta2() {
		return minInicioHorarioForaPonta2;
	}

	public void setMinInicioHorarioForaPonta2(String minInicioHorarioForaPonta2) {
		this.minInicioHorarioForaPonta2 = minInicioHorarioForaPonta2;
	}

	public String getHoraInicioHorarioForaPonta3() {
		return horaInicioHorarioForaPonta3;
	}

	public void setHoraInicioHorarioForaPonta3(String horaInicioHorarioForaPonta3) {
		this.horaInicioHorarioForaPonta3 = horaInicioHorarioForaPonta3;
	}

	public String getMinInicioHorarioForaPonta3() {
		return minInicioHorarioForaPonta3;
	}

	public void setMinInicioHorarioForaPonta3(String minInicioHorarioForaPonta3) {
		this.minInicioHorarioForaPonta3 = minInicioHorarioForaPonta3;
	}

	public String getHoraInicioHorarioForaPonta4() {
		return horaInicioHorarioForaPonta4;
	}

	public void setHoraInicioHorarioForaPonta4(String horaInicioHorarioForaPonta4) {
		this.horaInicioHorarioForaPonta4 = horaInicioHorarioForaPonta4;
	}

	public String getMinInicioHorarioForaPonta4() {
		return minInicioHorarioForaPonta4;
	}

	public void setMinInicioHorarioForaPonta4(String minInicioHorarioForaPonta4) {
		this.minInicioHorarioForaPonta4 = minInicioHorarioForaPonta4;
	}

	public String getHoraInicioHorarioReservado1() {
		return horaInicioHorarioReservado1;
	}

	public void setHoraInicioHorarioReservado1(String horaInicioHorarioReservado1) {
		this.horaInicioHorarioReservado1 = horaInicioHorarioReservado1;
	}

	public String getMinInicioHorarioReservado1() {
		return minInicioHorarioReservado1;
	}

	public void setMinInicioHorarioReservado1(String minInicioHorarioReservado1) {
		this.minInicioHorarioReservado1 = minInicioHorarioReservado1;
	}

	public String getHoraInicioHorarioReservado2() {
		return horaInicioHorarioReservado2;
	}

	public void setHoraInicioHorarioReservado2(String horaInicioHorarioReservado2) {
		this.horaInicioHorarioReservado2 = horaInicioHorarioReservado2;
	}

	public String getMinInicioHorarioReservado2() {
		return minInicioHorarioReservado2;
	}

	public void setMinInicioHorarioReservado2(String minInicioHorarioReservado2) {
		this.minInicioHorarioReservado2 = minInicioHorarioReservado2;
	}

	public String getHoraInicioHorarioReservado3() {
		return horaInicioHorarioReservado3;
	}

	public void setHoraInicioHorarioReservado3(String horaInicioHorarioReservado3) {
		this.horaInicioHorarioReservado3 = horaInicioHorarioReservado3;
	}

	public String getMinInicioHorarioReservado3() {
		return minInicioHorarioReservado3;
	}

	public void setMinInicioHorarioReservado3(String minInicioHorarioReservado3) {
		this.minInicioHorarioReservado3 = minInicioHorarioReservado3;
	}

	public String getHoraInicioHorarioReservado4() {
		return horaInicioHorarioReservado4;
	}

	public void setHoraInicioHorarioReservado4(String horaInicioHorarioReservado4) {
		this.horaInicioHorarioReservado4 = horaInicioHorarioReservado4;
	}

	public String getMinInicioHorarioReservado4() {
		return minInicioHorarioReservado4;
	}

	public void setMinInicioHorarioReservado4(String minInicioHorarioReservado4) {
		this.minInicioHorarioReservado4 = minInicioHorarioReservado4;
	}

	public String getNumeroPalavrasLeiturAtual() {
		return numeroPalavrasLeiturAtual;
	}

	public void setNumeroPalavrasLeiturAtual(String numeroPalavrasLeiturAtual) {
		this.numeroPalavrasLeiturAtual = numeroPalavrasLeiturAtual;
	}

	public String getNumeroPalavrasUltimaReposicaoDemanda() {
		return numeroPalavrasUltimaReposicaoDemanda;
	}

	public void setNumeroPalavrasUltimaReposicaoDemanda(String numeroPalavrasUltimaReposicaoDemanda) {
		this.numeroPalavrasUltimaReposicaoDemanda = numeroPalavrasUltimaReposicaoDemanda;
	}

	public String getNumeroOperacoesReposicaoDemanda() {
		return numeroOperacoesReposicaoDemanda;
	}

	public void setNumeroOperacoesReposicaoDemanda(String numeroOperacoesReposicaoDemanda) {
		this.numeroOperacoesReposicaoDemanda = numeroOperacoesReposicaoDemanda;
	}

	public String getIntervaloDemandaAtual() {
		return intervaloDemandaAtual;
	}

	public void setIntervaloDemandaAtual(String intervaloDemandaAtual) {
		this.intervaloDemandaAtual = intervaloDemandaAtual;
	}

	public String getIntervaloDemandaAnterior() {
		return intervaloDemandaAnterior;
	}

	public void setIntervaloDemandaAnterior(String intervaloDemandaAnterior) {
		this.intervaloDemandaAnterior = intervaloDemandaAnterior;
	}

	public String getDiaMesAnoDeFeriadoNacional1() {
		return diaMesAnoDeFeriadoNacional1;
	}

	public void setDiaMesAnoDeFeriadoNacional1(String diaMesAnoDeFeriadoNacional1) {
		this.diaMesAnoDeFeriadoNacional1 = diaMesAnoDeFeriadoNacional1;
	}

	public String getDiaMesAnoDeFeriadoNacional2() {
		return diaMesAnoDeFeriadoNacional2;
	}

	public void setDiaMesAnoDeFeriadoNacional2(String diaMesAnoDeFeriadoNacional2) {
		this.diaMesAnoDeFeriadoNacional2 = diaMesAnoDeFeriadoNacional2;
	}

	public String getDiaMesAnoDeFeriadoNacional3() {
		return diaMesAnoDeFeriadoNacional3;
	}

	public void setDiaMesAnoDeFeriadoNacional3(String diaMesAnoDeFeriadoNacional3) {
		this.diaMesAnoDeFeriadoNacional3 = diaMesAnoDeFeriadoNacional3;
	}

	public String getDiaMesAnoDeFeriadoNacional4() {
		return diaMesAnoDeFeriadoNacional4;
	}

	public void setDiaMesAnoDeFeriadoNacional4(String diaMesAnoDeFeriadoNacional4) {
		this.diaMesAnoDeFeriadoNacional4 = diaMesAnoDeFeriadoNacional4;
	}

	public String getDiaMesAnoDeFeriadoNacional5() {
		return diaMesAnoDeFeriadoNacional5;
	}

	public void setDiaMesAnoDeFeriadoNacional5(String diaMesAnoDeFeriadoNacional5) {
		this.diaMesAnoDeFeriadoNacional5 = diaMesAnoDeFeriadoNacional5;
	}

	public String getDiaMesAnoDeFeriadoNacional6() {
		return diaMesAnoDeFeriadoNacional6;
	}

	public void setDiaMesAnoDeFeriadoNacional6(String diaMesAnoDeFeriadoNacional6) {
		this.diaMesAnoDeFeriadoNacional6 = diaMesAnoDeFeriadoNacional6;
	}

	public String getDiaMesAnoDeFeriadoNacional7() {
		return diaMesAnoDeFeriadoNacional7;
	}

	public void setDiaMesAnoDeFeriadoNacional7(String diaMesAnoDeFeriadoNacional7) {
		this.diaMesAnoDeFeriadoNacional7 = diaMesAnoDeFeriadoNacional7;
	}

	public String getDiaMesAnoDeFeriadoNacional8() {
		return diaMesAnoDeFeriadoNacional8;
	}

	public void setDiaMesAnoDeFeriadoNacional8(String diaMesAnoDeFeriadoNacional8) {
		this.diaMesAnoDeFeriadoNacional8 = diaMesAnoDeFeriadoNacional8;
	}

	public String getDiaMesAnoDeFeriadoNacional9() {
		return diaMesAnoDeFeriadoNacional9;
	}

	public void setDiaMesAnoDeFeriadoNacional9(String diaMesAnoDeFeriadoNacional9) {
		this.diaMesAnoDeFeriadoNacional9 = diaMesAnoDeFeriadoNacional9;
	}

	public String getDiaMesAnoDeFeriadoNacional10() {
		return diaMesAnoDeFeriadoNacional10;
	}

	public void setDiaMesAnoDeFeriadoNacional10(String diaMesAnoDeFeriadoNacional10) {
		this.diaMesAnoDeFeriadoNacional10 = diaMesAnoDeFeriadoNacional10;
	}

	public String getDiaMesAnoDeFeriadoNacional11() {
		return diaMesAnoDeFeriadoNacional11;
	}

	public void setDiaMesAnoDeFeriadoNacional11(String diaMesAnoDeFeriadoNacional11) {
		this.diaMesAnoDeFeriadoNacional11 = diaMesAnoDeFeriadoNacional11;
	}

	public String getDiaMesAnoDeFeriadoNacional12() {
		return diaMesAnoDeFeriadoNacional12;
	}

	public void setDiaMesAnoDeFeriadoNacional12(String diaMesAnoDeFeriadoNacional12) {
		this.diaMesAnoDeFeriadoNacional12 = diaMesAnoDeFeriadoNacional12;
	}

	public String getDiaMesAnoDeFeriadoNacional13() {
		return diaMesAnoDeFeriadoNacional13;
	}

	public void setDiaMesAnoDeFeriadoNacional13(String diaMesAnoDeFeriadoNacional13) {
		this.diaMesAnoDeFeriadoNacional13 = diaMesAnoDeFeriadoNacional13;
	}

	public String getDiaMesAnoDeFeriadoNacional14() {
		return diaMesAnoDeFeriadoNacional14;
	}

	public void setDiaMesAnoDeFeriadoNacional14(String diaMesAnoDeFeriadoNacional14) {
		this.diaMesAnoDeFeriadoNacional14 = diaMesAnoDeFeriadoNacional14;
	}

	public String getDiaMesAnoDeFeriadoNacional15() {
		return diaMesAnoDeFeriadoNacional15;
	}

	public void setDiaMesAnoDeFeriadoNacional15(String diaMesAnoDeFeriadoNacional15) {
		this.diaMesAnoDeFeriadoNacional15 = diaMesAnoDeFeriadoNacional15;
	}

	public String getNumeradorConstanteMultiplicacao1CanalVisivel() {
		return numeradorConstanteMultiplicacao1CanalVisivel;
	}

	public void setNumeradorConstanteMultiplicacao1CanalVisivel(String numeradorConstanteMultiplicacao1CanalVisivel) {
		this.numeradorConstanteMultiplicacao1CanalVisivel = numeradorConstanteMultiplicacao1CanalVisivel;
	}

	public String getDenominadorConstanteMultiplicacao1CanalVisivel() {
		return denominadorConstanteMultiplicacao1CanalVisivel;
	}

	public void setDenominadorConstanteMultiplicacao1CanalVisivel(String denominadorConstanteMultiplicacao1CanalVisivel) {
		this.denominadorConstanteMultiplicacao1CanalVisivel = denominadorConstanteMultiplicacao1CanalVisivel;
	}

	public String getNumeradorConstanteMultiplicacao2CanalVisivel() {
		return numeradorConstanteMultiplicacao2CanalVisivel;
	}

	public void setNumeradorConstanteMultiplicacao2CanalVisivel(String numeradorConstanteMultiplicacao2CanalVisivel) {
		this.numeradorConstanteMultiplicacao2CanalVisivel = numeradorConstanteMultiplicacao2CanalVisivel;
	}

	public String getDenominadorConstanteMultiplicacao2CanalVisivel() {
		return denominadorConstanteMultiplicacao2CanalVisivel;
	}

	public void setDenominadorConstanteMultiplicacao2CanalVisivel(String denominadorConstanteMultiplicacao2CanalVisivel) {
		this.denominadorConstanteMultiplicacao2CanalVisivel = denominadorConstanteMultiplicacao2CanalVisivel;
	}

	public String getNumeradorConstanteMultiplicacao3CanalVisivel() {
		return numeradorConstanteMultiplicacao3CanalVisivel;
	}

	public void setNumeradorConstanteMultiplicacao3CanalVisivel(String numeradorConstanteMultiplicacao3CanalVisivel) {
		this.numeradorConstanteMultiplicacao3CanalVisivel = numeradorConstanteMultiplicacao3CanalVisivel;
	}

	public String getDenominadorConstanteMultiplicacao3CanalVisivel() {
		return denominadorConstanteMultiplicacao3CanalVisivel;
	}

	public void setDenominadorConstanteMultiplicacao3CanalVisivel(String denominadorConstanteMultiplicacao3CanalVisivel) {
		this.denominadorConstanteMultiplicacao3CanalVisivel = denominadorConstanteMultiplicacao3CanalVisivel;
	}

	public String getEstadoDaBateria() {
		return estadoDaBateria;
	}

	public void setEstadoDaBateria(String estadoDaBateria) {
		this.estadoDaBateria = estadoDaBateria;
	}

	public String getVersaoSoftwareRegistrador() {
		return versaoSoftwareRegistrador;
	}

	public void setVersaoSoftwareRegistrador(String versaoSoftwareRegistrador) {
		this.versaoSoftwareRegistrador = versaoSoftwareRegistrador;
	}

	public String getLeituraCondicaoHorarioReservado() {
		return leituraCondicaoHorarioReservado;
	}

	public void setLeituraCondicaoHorarioReservado(String leituraCondicaoHorarioReservado) {
		this.leituraCondicaoHorarioReservado = leituraCondicaoHorarioReservado;
	}

	public String getHoraDaFaltaDeEnergia() {
		return horaDaFaltaDeEnergia;
	}

	public void setHoraDaFaltaDeEnergia(String horaDaFaltaDeEnergia) {
		this.horaDaFaltaDeEnergia = horaDaFaltaDeEnergia;
	}

	public String getMinutoDaFaltaDeEnergia() {
		return minutoDaFaltaDeEnergia;
	}

	public void setMinutoDaFaltaDeEnergia(String minutoDaFaltaDeEnergia) {
		this.minutoDaFaltaDeEnergia = minutoDaFaltaDeEnergia;
	}

	public String getSegundoDaFaltaDeEnergia() {
		return segundoDaFaltaDeEnergia;
	}

	public void setSegundoDaFaltaDeEnergia(String segundoDaFaltaDeEnergia) {
		this.segundoDaFaltaDeEnergia = segundoDaFaltaDeEnergia;
	}

	public String getDiaDaFaltaDeEnergia() {
		return diaDaFaltaDeEnergia;
	}

	public void setDiaDaFaltaDeEnergia(String diaDaFaltaDeEnergia) {
		this.diaDaFaltaDeEnergia = diaDaFaltaDeEnergia;
	}

	public String getMesDaFaltaDeEnergia() {
		return mesDaFaltaDeEnergia;
	}

	public void setMesDaFaltaDeEnergia(String mesDaFaltaDeEnergia) {
		this.mesDaFaltaDeEnergia = mesDaFaltaDeEnergia;
	}

	public String getAnoDaFaltaDeEnergia() {
		return anoDaFaltaDeEnergia;
	}

	public void setAnoDaFaltaDeEnergia(String anoDaFaltaDeEnergia) {
		this.anoDaFaltaDeEnergia = anoDaFaltaDeEnergia;
	}

	public String getHoraDoRetornoDeEnergia() {
		return horaDoRetornoDeEnergia;
	}

	public void setHoraDoRetornoDeEnergia(String horaDoRetornoDeEnergia) {
		this.horaDoRetornoDeEnergia = horaDoRetornoDeEnergia;
	}

	public String getMinutoDoRetornoDeEnergia() {
		return minutoDoRetornoDeEnergia;
	}

	public void setMinutoDoRetornoDeEnergia(String minutoDoRetornoDeEnergia) {
		this.minutoDoRetornoDeEnergia = minutoDoRetornoDeEnergia;
	}

	public String getSegundoDoRetornoDeEnergia() {
		return segundoDoRetornoDeEnergia;
	}

	public void setSegundoDoRetornoDeEnergia(String segundoDoRetornoDeEnergia) {
		this.segundoDoRetornoDeEnergia = segundoDoRetornoDeEnergia;
	}

	public String getDiaDoRetornoDeEnergia() {
		return diaDoRetornoDeEnergia;
	}

	public void setDiaDoRetornoDeEnergia(String diaDoRetornoDeEnergia) {
		this.diaDoRetornoDeEnergia = diaDoRetornoDeEnergia;
	}

	public String getMesDoRetornoDeEnergia() {
		return mesDoRetornoDeEnergia;
	}

	public void setMesDoRetornoDeEnergia(String mesDoRetornoDeEnergia) {
		this.mesDoRetornoDeEnergia = mesDoRetornoDeEnergia;
	}

	public String getAnoDoRetornoDeEnergia() {
		return anoDoRetornoDeEnergia;
	}

	public void setAnoDoRetornoDeEnergia(String anoDoRetornoDeEnergia) {
		this.anoDoRetornoDeEnergia = anoDoRetornoDeEnergia;
	}

	public String getHoraDataFaltaHoraDataRetornoEnergia1() {
		return horaDataFaltaHoraDataRetornoEnergia1;
	}

	public void setHoraDataFaltaHoraDataRetornoEnergia1(String horaDataFaltaHoraDataRetornoEnergia1) {
		this.horaDataFaltaHoraDataRetornoEnergia1 = horaDataFaltaHoraDataRetornoEnergia1;
	}

	public String getHoraDataFaltaHoraDataRetornoEnergia2() {
		return horaDataFaltaHoraDataRetornoEnergia2;
	}

	public void setHoraDataFaltaHoraDataRetornoEnergia2(String horaDataFaltaHoraDataRetornoEnergia2) {
		this.horaDataFaltaHoraDataRetornoEnergia2 = horaDataFaltaHoraDataRetornoEnergia2;
	}

	public String getHoraDataFaltaHoraDataRetornoEnergia3() {
		return horaDataFaltaHoraDataRetornoEnergia3;
	}

	public void setHoraDataFaltaHoraDataRetornoEnergia3(String horaDataFaltaHoraDataRetornoEnergia3) {
		this.horaDataFaltaHoraDataRetornoEnergia3 = horaDataFaltaHoraDataRetornoEnergia3;
	}

	public String getHoraDataFaltaHoraDataRetornoEnergia4() {
		return horaDataFaltaHoraDataRetornoEnergia4;
	}

	public void setHoraDataFaltaHoraDataRetornoEnergia4(String horaDataFaltaHoraDataRetornoEnergia4) {
		this.horaDataFaltaHoraDataRetornoEnergia4 = horaDataFaltaHoraDataRetornoEnergia4;
	}

	public String getHoraDataFaltaHoraDataRetornoEnergia5() {
		return horaDataFaltaHoraDataRetornoEnergia5;
	}

	public void setHoraDataFaltaHoraDataRetornoEnergia5(String horaDataFaltaHoraDataRetornoEnergia5) {
		this.horaDataFaltaHoraDataRetornoEnergia5 = horaDataFaltaHoraDataRetornoEnergia5;
	}

	public String getHoraDataFaltaHoraDataRetornoEnergia6() {
		return horaDataFaltaHoraDataRetornoEnergia6;
	}

	public void setHoraDataFaltaHoraDataRetornoEnergia6(String horaDataFaltaHoraDataRetornoEnergia6) {
		this.horaDataFaltaHoraDataRetornoEnergia6 = horaDataFaltaHoraDataRetornoEnergia6;
	}

	public String getHoraDataFaltaHoraDataRetornoEnergia7() {
		return horaDataFaltaHoraDataRetornoEnergia7;
	}

	public void setHoraDataFaltaHoraDataRetornoEnergia7(String horaDataFaltaHoraDataRetornoEnergia7) {
		this.horaDataFaltaHoraDataRetornoEnergia7 = horaDataFaltaHoraDataRetornoEnergia7;
	}

	public String getHoraDataFaltaHoraDataRetornoEnergia8() {
		return horaDataFaltaHoraDataRetornoEnergia8;
	}

	public void setHoraDataFaltaHoraDataRetornoEnergia8(String horaDataFaltaHoraDataRetornoEnergia8) {
		this.horaDataFaltaHoraDataRetornoEnergia8 = horaDataFaltaHoraDataRetornoEnergia8;
	}

	public String getHoraDataFaltaHoraDataRetornoEnergia9() {
		return horaDataFaltaHoraDataRetornoEnergia9;
	}

	public void setHoraDataFaltaHoraDataRetornoEnergia9(String horaDataFaltaHoraDataRetornoEnergia9) {
		this.horaDataFaltaHoraDataRetornoEnergia9 = horaDataFaltaHoraDataRetornoEnergia9;
	}

	public String getHoraDataFaltaHoraDataRetornoEnergia10() {
		return horaDataFaltaHoraDataRetornoEnergia10;
	}

	public void setHoraDataFaltaHoraDataRetornoEnergia10(String horaDataFaltaHoraDataRetornoEnergia10) {
		this.horaDataFaltaHoraDataRetornoEnergia10 = horaDataFaltaHoraDataRetornoEnergia10;
	}

	public String getHoraDataFaltaHoraDataRetornoEnergia11() {
		return horaDataFaltaHoraDataRetornoEnergia11;
	}

	public void setHoraDataFaltaHoraDataRetornoEnergia11(String horaDataFaltaHoraDataRetornoEnergia11) {
		this.horaDataFaltaHoraDataRetornoEnergia11 = horaDataFaltaHoraDataRetornoEnergia11;
	}

	public String getHoraDataFaltaHoraDataRetornoEnergia12() {
		return horaDataFaltaHoraDataRetornoEnergia12;
	}

	public void setHoraDataFaltaHoraDataRetornoEnergia12(String horaDataFaltaHoraDataRetornoEnergia12) {
		this.horaDataFaltaHoraDataRetornoEnergia12 = horaDataFaltaHoraDataRetornoEnergia12;
	}

	public String getHoraDataFaltaHoraDataRetornoEnergia13() {
		return horaDataFaltaHoraDataRetornoEnergia13;
	}

	public void setHoraDataFaltaHoraDataRetornoEnergia13(String horaDataFaltaHoraDataRetornoEnergia13) {
		this.horaDataFaltaHoraDataRetornoEnergia13 = horaDataFaltaHoraDataRetornoEnergia13;
	}

	public String getHoraDataFaltaHoraDataRetornoEnergia14() {
		return horaDataFaltaHoraDataRetornoEnergia14;
	}

	public void setHoraDataFaltaHoraDataRetornoEnergia14(String horaDataFaltaHoraDataRetornoEnergia14) {
		this.horaDataFaltaHoraDataRetornoEnergia14 = horaDataFaltaHoraDataRetornoEnergia14;
	}

	public String getHoraDataFaltaHoraDataRetornoEnergia15() {
		return horaDataFaltaHoraDataRetornoEnergia15;
	}

	public void setHoraDataFaltaHoraDataRetornoEnergia15(String horaDataFaltaHoraDataRetornoEnergia15) {
		this.horaDataFaltaHoraDataRetornoEnergia15 = horaDataFaltaHoraDataRetornoEnergia15;
	}

	public String getTotalizadorAtualGeral1oCanalVisivel() {
		return totalizadorAtualGeral1oCanalVisivel;
	}

	public void setTotalizadorAtualGeral1oCanalVisivel(String totalizadorAtualGeral1oCanalVisivel) {
		this.totalizadorAtualGeral1oCanalVisivel = totalizadorAtualGeral1oCanalVisivel;
	}

	public String getTotalizadorAtual1oCanalVisivelPontaUmida() {
		return totalizadorAtual1oCanalVisivelPontaUmida;
	}

	public void setTotalizadorAtual1oCanalVisivelPontaUmida(String totalizadorAtual1oCanalVisivelPontaUmida) {
		this.totalizadorAtual1oCanalVisivelPontaUmida = totalizadorAtual1oCanalVisivelPontaUmida;
	}

	public String getTotalizadorAtualUFEREmPonta() {
		return totalizadorAtualUFEREmPonta;
	}

	public void setTotalizadorAtualUFEREmPonta(String totalizadorAtualUFEREmPonta) {
		this.totalizadorAtualUFEREmPonta = totalizadorAtualUFEREmPonta;
	}

	public String getTotalizadorAtual1oCanalVisivelForaPontaUmida() {
		return totalizadorAtual1oCanalVisivelForaPontaUmida;
	}

	public void setTotalizadorAtual1oCanalVisivelForaPontaUmida(String totalizadorAtual1oCanalVisivelForaPontaUmida) {
		this.totalizadorAtual1oCanalVisivelForaPontaUmida = totalizadorAtual1oCanalVisivelForaPontaUmida;
	}

	public String getTotalizadorAtualUFEREmForaPonta() {
		return totalizadorAtualUFEREmForaPonta;
	}

	public void setTotalizadorAtualUFEREmForaPonta(String totalizadorAtualUFEREmForaPonta) {
		this.totalizadorAtualUFEREmForaPonta = totalizadorAtualUFEREmForaPonta;
	}

	public String getTotalizadorAtual1oCanalVisivelEmReservadoUmido() {
		return totalizadorAtual1oCanalVisivelEmReservadoUmido;
	}

	public void setTotalizadorAtual1oCanalVisivelEmReservadoUmido(String totalizadorAtual1oCanalVisivelEmReservadoUmido) {
		this.totalizadorAtual1oCanalVisivelEmReservadoUmido = totalizadorAtual1oCanalVisivelEmReservadoUmido;
	}

	public String getTotalizadorAtualDeUFEREmReservado() {
		return totalizadorAtualDeUFEREmReservado;
	}

	public void setTotalizadorAtualDeUFEREmReservado(String totalizadorAtualDeUFEREmReservado) {
		this.totalizadorAtualDeUFEREmReservado = totalizadorAtualDeUFEREmReservado;
	}

	public String getDemandaDoUltimoIntervaloAtualDo1oCanalVisivel() {
		return demandaDoUltimoIntervaloAtualDo1oCanalVisivel;
	}

	public void setDemandaDoUltimoIntervaloAtualDo1oCanalVisivel(String demandaDoUltimoIntervaloAtualDo1oCanalVisivel) {
		this.demandaDoUltimoIntervaloAtualDo1oCanalVisivel = demandaDoUltimoIntervaloAtualDo1oCanalVisivel;
	}

	public String getDemandaAtualMaximaDo1oCanalVisivelEmPonta() {
		return demandaAtualMaximaDo1oCanalVisivelEmPonta;
	}

	public void setDemandaAtualMaximaDo1oCanalVisivelEmPonta(String demandaAtualMaximaDo1oCanalVisivelEmPonta) {
		this.demandaAtualMaximaDo1oCanalVisivelEmPonta = demandaAtualMaximaDo1oCanalVisivelEmPonta;
	}

	public String getDmcrAtualEmPonta() {
		return dmcrAtualEmPonta;
	}

	public void setDmcrAtualEmPonta(String dmcrAtualEmPonta) {
		this.dmcrAtualEmPonta = dmcrAtualEmPonta;
	}

	public String getDemandaAtualMaxima1oCanalVisivelForaPonta() {
		return demandaAtualMaxima1oCanalVisivelForaPonta;
	}

	public void setDemandaAtualMaxima1oCanalVisivelForaPonta(String demandaAtualMaxima1oCanalVisivelForaPonta) {
		this.demandaAtualMaxima1oCanalVisivelForaPonta = demandaAtualMaxima1oCanalVisivelForaPonta;
	}

	public String getDmcrAtualEmForaPonta() {
		return dmcrAtualEmForaPonta;
	}

	public void setDmcrAtualEmForaPonta(String dmcrAtualEmForaPonta) {
		this.dmcrAtualEmForaPonta = dmcrAtualEmForaPonta;
	}

	public String getDemandaAtualMaxima1oCanalVisivelReservado() {
		return demandaAtualMaxima1oCanalVisivelReservado;
	}

	public void setDemandaAtualMaxima1oCanalVisivelReservado(String demandaAtualMaxima1oCanalVisivelReservado) {
		this.demandaAtualMaxima1oCanalVisivelReservado = demandaAtualMaxima1oCanalVisivelReservado;
	}

	public String getDmcrAtualEmReservado() {
		return dmcrAtualEmReservado;
	}

	public void setDmcrAtualEmReservado(String dmcrAtualEmReservado) {
		this.dmcrAtualEmReservado = dmcrAtualEmReservado;
	}

	public String getDemandaAtualAcumulada1oCanalVisivelEmPonta() {
		return DemandaAtualAcumulada1oCanalVisivelEmPonta;
	}

	public void setDemandaAtualAcumulada1oCanalVisivelEmPonta(String demandaAtualAcumulada1oCanalVisivelEmPonta) {
		DemandaAtualAcumulada1oCanalVisivelEmPonta = demandaAtualAcumulada1oCanalVisivelEmPonta;
	}

	public String getDmcrAtualAcumuladaEmPonta() {
		return dmcrAtualAcumuladaEmPonta;
	}

	public void setDmcrAtualAcumuladaEmPonta(String dmcrAtualAcumuladaEmPonta) {
		this.dmcrAtualAcumuladaEmPonta = dmcrAtualAcumuladaEmPonta;
	}

	public String getDemandaAtualAcumulada1oCanalVisivelEmForaPonta() {
		return DemandaAtualAcumulada1oCanalVisivelEmForaPonta;
	}

	public void setDemandaAtualAcumulada1oCanalVisivelEmForaPonta(String demandaAtualAcumulada1oCanalVisivelEmForaPonta) {
		DemandaAtualAcumulada1oCanalVisivelEmForaPonta = demandaAtualAcumulada1oCanalVisivelEmForaPonta;
	}

	public String getDmcrAtualAcumuladaEmForaPonta() {
		return dmcrAtualAcumuladaEmForaPonta;
	}

	public void setDmcrAtualAcumuladaEmForaPonta(String dmcrAtualAcumuladaEmForaPonta) {
		this.dmcrAtualAcumuladaEmForaPonta = dmcrAtualAcumuladaEmForaPonta;
	}

	public String getDemandaAtualAcumulada1oCanalVisivelEmReservado() {
		return DemandaAtualAcumulada1oCanalVisivelEmReservado;
	}

	public void setDemandaAtualAcumulada1oCanalVisivelEmReservado(String demandaAtualAcumulada1oCanalVisivelEmReservado) {
		DemandaAtualAcumulada1oCanalVisivelEmReservado = demandaAtualAcumulada1oCanalVisivelEmReservado;
	}

	public String getDmcrAtualAcumuladaEmReservado() {
		return dmcrAtualAcumuladaEmReservado;
	}

	public void setDmcrAtualAcumuladaEmReservado(String dmcrAtualAcumuladaEmReservado) {
		this.dmcrAtualAcumuladaEmReservado = dmcrAtualAcumuladaEmReservado;
	}

	public String getTotalizadorAtualGeral2oCanalVisivel() {
		return totalizadorAtualGeral2oCanalVisivel;
	}

	public void setTotalizadorAtualGeral2oCanalVisivel(String totalizadorAtualGeral2oCanalVisivel) {
		this.totalizadorAtualGeral2oCanalVisivel = totalizadorAtualGeral2oCanalVisivel;
	}

	public String getTotalizadorAtual2oCanalVisivelEmPonta() {
		return totalizadorAtual2oCanalVisivelEmPonta;
	}

	public void setTotalizadorAtual2oCanalVisivelEmPonta(String totalizadorAtual2oCanalVisivelEmPonta) {
		this.totalizadorAtual2oCanalVisivelEmPonta = totalizadorAtual2oCanalVisivelEmPonta;
	}

	public String getTotalizadorAtualReverso2oCanalVisivelEmPonta() {
		return totalizadorAtualReverso2oCanalVisivelEmPonta;
	}

	public void setTotalizadorAtualReverso2oCanalVisivelEmPonta(String totalizadorAtualReverso2oCanalVisivelEmPonta) {
		this.totalizadorAtualReverso2oCanalVisivelEmPonta = totalizadorAtualReverso2oCanalVisivelEmPonta;
	}

	public String getTotalizadorAtual2oCanalVisivelEmForaPonta() {
		return totalizadorAtual2oCanalVisivelEmForaPonta;
	}

	public void setTotalizadorAtual2oCanalVisivelEmForaPonta(String totalizadorAtual2oCanalVisivelEmForaPonta) {
		this.totalizadorAtual2oCanalVisivelEmForaPonta = totalizadorAtual2oCanalVisivelEmForaPonta;
	}

	public String getTotalizadorAtualReverso2oCanalVisivelEmForaPonta() {
		return totalizadorAtualReverso2oCanalVisivelEmForaPonta;
	}

	public void setTotalizadorAtualReverso2oCanalVisivelEmForaPonta(
			String totalizadorAtualReverso2oCanalVisivelEmForaPonta) {
		this.totalizadorAtualReverso2oCanalVisivelEmForaPonta = totalizadorAtualReverso2oCanalVisivelEmForaPonta;
	}

	public String getTotalizadorAtual2oCanalVisivelEmReservado() {
		return totalizadorAtual2oCanalVisivelEmReservado;
	}

	public void setTotalizadorAtual2oCanalVisivelEmReservado(String totalizadorAtual2oCanalVisivelEmReservado) {
		this.totalizadorAtual2oCanalVisivelEmReservado = totalizadorAtual2oCanalVisivelEmReservado;
	}

	public String getTotalizadorAtualReverso2oCanalVisivelReservado() {
		return totalizadorAtualReverso2oCanalVisivelReservado;
	}

	public void setTotalizadorAtualReverso2oCanalVisivelReservado(String totalizadorAtualReverso2oCanalVisivelReservado) {
		this.totalizadorAtualReverso2oCanalVisivelReservado = totalizadorAtualReverso2oCanalVisivelReservado;
	}

	public String getDemandaUltimoIntervaloAtual2oCanalVisivel() {
		return demandaUltimoIntervaloAtual2oCanalVisivel;
	}

	public void setDemandaUltimoIntervaloAtual2oCanalVisivel(String demandaUltimoIntervaloAtual2oCanalVisivel) {
		this.demandaUltimoIntervaloAtual2oCanalVisivel = demandaUltimoIntervaloAtual2oCanalVisivel;
	}

	public String getDemandaAtualMaxima2oCanalVisivelEmPonta() {
		return demandaAtualMaxima2oCanalVisivelEmPonta;
	}

	public void setDemandaAtualMaxima2oCanalVisivelEmPonta(String demandaAtualMaxima2oCanalVisivelEmPonta) {
		this.demandaAtualMaxima2oCanalVisivelEmPonta = demandaAtualMaxima2oCanalVisivelEmPonta;
	}

	public String getDemandaReversaAtualMaxima2oCanalVisivelEmPonta() {
		return demandaReversaAtualMaxima2oCanalVisivelEmPonta;
	}

	public void setDemandaReversaAtualMaxima2oCanalVisivelEmPonta(String demandaReversaAtualMaxima2oCanalVisivelEmPonta) {
		this.demandaReversaAtualMaxima2oCanalVisivelEmPonta = demandaReversaAtualMaxima2oCanalVisivelEmPonta;
	}

	public String getDemandaAtualMaxima2oCanalVisivelEmForaPonta() {
		return demandaAtualMaxima2oCanalVisivelEmForaPonta;
	}

	public void setDemandaAtualMaxima2oCanalVisivelEmForaPonta(String demandaAtualMaxima2oCanalVisivelEmForaPonta) {
		this.demandaAtualMaxima2oCanalVisivelEmForaPonta = demandaAtualMaxima2oCanalVisivelEmForaPonta;
	}

	public String getDemandaReversaAtualMaxima2oCanalVisivelEmForaPonta() {
		return demandaReversaAtualMaxima2oCanalVisivelEmForaPonta;
	}

	public void setDemandaReversaAtualMaxima2oCanalVisivelEmForaPonta(
			String demandaReversaAtualMaxima2oCanalVisivelEmForaPonta) {
		this.demandaReversaAtualMaxima2oCanalVisivelEmForaPonta = demandaReversaAtualMaxima2oCanalVisivelEmForaPonta;
	}

	public String getDemandaAtualMaxima2oCanalVisivelEmReservado() {
		return demandaAtualMaxima2oCanalVisivelEmReservado;
	}

	public void setDemandaAtualMaxima2oCanalVisivelEmReservado(String demandaAtualMaxima2oCanalVisivelEmReservado) {
		this.demandaAtualMaxima2oCanalVisivelEmReservado = demandaAtualMaxima2oCanalVisivelEmReservado;
	}

	public String getDemandaReversaAtualMaxima2oCanalVisivelEmReservado() {
		return demandaReversaAtualMaxima2oCanalVisivelEmReservado;
	}

	public void setDemandaReversaAtualMaxima2oCanalVisivelEmReservado(
			String demandaReversaAtualMaxima2oCanalVisivelEmReservado) {
		this.demandaReversaAtualMaxima2oCanalVisivelEmReservado = demandaReversaAtualMaxima2oCanalVisivelEmReservado;
	}

	public String getDemandaAtualAcumulada2oCanalVisivelEmPonta() {
		return demandaAtualAcumulada2oCanalVisivelEmPonta;
	}

	public void setDemandaAtualAcumulada2oCanalVisivelEmPonta(String demandaAtualAcumulada2oCanalVisivelEmPonta) {
		this.demandaAtualAcumulada2oCanalVisivelEmPonta = demandaAtualAcumulada2oCanalVisivelEmPonta;
	}

	public String getDemandaReversaAtualAcumulada2oCanalVisivelEmPonta() {
		return demandaReversaAtualAcumulada2oCanalVisivelEmPonta;
	}

	public void setDemandaReversaAtualAcumulada2oCanalVisivelEmPonta(
			String demandaReversaAtualAcumulada2oCanalVisivelEmPonta) {
		this.demandaReversaAtualAcumulada2oCanalVisivelEmPonta = demandaReversaAtualAcumulada2oCanalVisivelEmPonta;
	}

	public String getDemandaAtualAcumulada2oCanalVisivelEmForaPonta() {
		return demandaAtualAcumulada2oCanalVisivelEmForaPonta;
	}

	public void setDemandaAtualAcumulada2oCanalVisivelEmForaPonta(String demandaAtualAcumulada2oCanalVisivelEmForaPonta) {
		this.demandaAtualAcumulada2oCanalVisivelEmForaPonta = demandaAtualAcumulada2oCanalVisivelEmForaPonta;
	}

	public String getDemandaReversaAtualAcumulada2oCanalVisivelEmForaPonta() {
		return demandaReversaAtualAcumulada2oCanalVisivelEmForaPonta;
	}

	public void setDemandaReversaAtualAcumulada2oCanalVisivelEmForaPonta(
			String demandaReversaAtualAcumulada2oCanalVisivelEmForaPonta) {
		this.demandaReversaAtualAcumulada2oCanalVisivelEmForaPonta = demandaReversaAtualAcumulada2oCanalVisivelEmForaPonta;
	}

	public String getDemandaAtualAcumulada2oCanalVisivelEmReservado() {
		return demandaAtualAcumulada2oCanalVisivelEmReservado;
	}

	public void setDemandaAtualAcumulada2oCanalVisivelEmReservado(String demandaAtualAcumulada2oCanalVisivelEmReservado) {
		this.demandaAtualAcumulada2oCanalVisivelEmReservado = demandaAtualAcumulada2oCanalVisivelEmReservado;
	}

	public String getDemandaReversaAtualAcumulada2oCanalVisivelEmReservado() {
		return demandaReversaAtualAcumulada2oCanalVisivelEmReservado;
	}

	public void setDemandaReversaAtualAcumulada2oCanalVisivelEmReservado(
			String demandaReversaAtualAcumulada2oCanalVisivelEmReservado) {
		this.demandaReversaAtualAcumulada2oCanalVisivelEmReservado = demandaReversaAtualAcumulada2oCanalVisivelEmReservado;
	}

	public String getTotalizadorAtualGeral3oCanalVisivel() {
		return totalizadorAtualGeral3oCanalVisivel;
	}

	public void setTotalizadorAtualGeral3oCanalVisivel(String totalizadorAtualGeral3oCanalVisivel) {
		this.totalizadorAtualGeral3oCanalVisivel = totalizadorAtualGeral3oCanalVisivel;
	}

	public String getTotalizadorAtual3oCanalVisivelEmPonta() {
		return totalizadorAtual3oCanalVisivelEmPonta;
	}

	public void setTotalizadorAtual3oCanalVisivelEmPonta(String totalizadorAtual3oCanalVisivelEmPonta) {
		this.totalizadorAtual3oCanalVisivelEmPonta = totalizadorAtual3oCanalVisivelEmPonta;
	}

	public String getTotalizadorAtualReverso3oCanalVisivelEmPonta() {
		return totalizadorAtualReverso3oCanalVisivelEmPonta;
	}

	public void setTotalizadorAtualReverso3oCanalVisivelEmPonta(String totalizadorAtualReverso3oCanalVisivelEmPonta) {
		this.totalizadorAtualReverso3oCanalVisivelEmPonta = totalizadorAtualReverso3oCanalVisivelEmPonta;
	}

	public String getTotalizadorAtual3oCanalVisivelEmForaPonta() {
		return totalizadorAtual3oCanalVisivelEmForaPonta;
	}

	public void setTotalizadorAtual3oCanalVisivelEmForaPonta(String totalizadorAtual3oCanalVisivelEmForaPonta) {
		this.totalizadorAtual3oCanalVisivelEmForaPonta = totalizadorAtual3oCanalVisivelEmForaPonta;
	}

	public String getTotalizadorAtualReverso3oCanalVisivelEmForaPonta() {
		return totalizadorAtualReverso3oCanalVisivelEmForaPonta;
	}

	public void setTotalizadorAtualReverso3oCanalVisivelEmForaPonta(
			String totalizadorAtualReverso3oCanalVisivelEmForaPonta) {
		this.totalizadorAtualReverso3oCanalVisivelEmForaPonta = totalizadorAtualReverso3oCanalVisivelEmForaPonta;
	}

	public String getTotalizadorAtual3oCanalVisivelEmReservado() {
		return totalizadorAtual3oCanalVisivelEmReservado;
	}

	public void setTotalizadorAtual3oCanalVisivelEmReservado(String totalizadorAtual3oCanalVisivelEmReservado) {
		this.totalizadorAtual3oCanalVisivelEmReservado = totalizadorAtual3oCanalVisivelEmReservado;
	}

	public String getTotalizadorAtualReverso3oCanalVisivelEmReservado() {
		return totalizadorAtualReverso3oCanalVisivelEmReservado;
	}

	public void setTotalizadorAtualReverso3oCanalVisivelEmReservado(
			String totalizadorAtualReverso3oCanalVisivelEmReservado) {
		this.totalizadorAtualReverso3oCanalVisivelEmReservado = totalizadorAtualReverso3oCanalVisivelEmReservado;
	}

	public String getDemandaDoUltimoIntervaloAtual3oCanalVisivel() {
		return demandaDoUltimoIntervaloAtual3oCanalVisivel;
	}

	public void setDemandaDoUltimoIntervaloAtual3oCanalVisivel(String demandaDoUltimoIntervaloAtual3oCanalVisivel) {
		this.demandaDoUltimoIntervaloAtual3oCanalVisivel = demandaDoUltimoIntervaloAtual3oCanalVisivel;
	}

	public String getDemandaAtualMaxima3oCanalVisivelEmPonta() {
		return demandaAtualMaxima3oCanalVisivelEmPonta;
	}

	public void setDemandaAtualMaxima3oCanalVisivelEmPonta(String demandaAtualMaxima3oCanalVisivelEmPonta) {
		this.demandaAtualMaxima3oCanalVisivelEmPonta = demandaAtualMaxima3oCanalVisivelEmPonta;
	}

	public String getDemandaAtualReversaMaxima3oCanalVisivelEmPonta() {
		return demandaAtualReversaMaxima3oCanalVisivelEmPonta;
	}

	public void setDemandaAtualReversaMaxima3oCanalVisivelEmPonta(String demandaAtualReversaMaxima3oCanalVisivelEmPonta) {
		this.demandaAtualReversaMaxima3oCanalVisivelEmPonta = demandaAtualReversaMaxima3oCanalVisivelEmPonta;
	}

	public String getDemandaAtualMaxima3oCanalVisivelEmForaPonta() {
		return demandaAtualMaxima3oCanalVisivelEmForaPonta;
	}

	public void setDemandaAtualMaxima3oCanalVisivelEmForaPonta(String demandaAtualMaxima3oCanalVisivelEmForaPonta) {
		this.demandaAtualMaxima3oCanalVisivelEmForaPonta = demandaAtualMaxima3oCanalVisivelEmForaPonta;
	}

	public String getDemandaAtualReversaMaxima3oCanalVisivelEmForaPonta() {
		return demandaAtualReversaMaxima3oCanalVisivelEmForaPonta;
	}

	public void setDemandaAtualReversaMaxima3oCanalVisivelEmForaPonta(
			String demandaAtualReversaMaxima3oCanalVisivelEmForaPonta) {
		this.demandaAtualReversaMaxima3oCanalVisivelEmForaPonta = demandaAtualReversaMaxima3oCanalVisivelEmForaPonta;
	}

	public String getDemandaAtualMaxima3oCanalVisivelEmReservado() {
		return demandaAtualMaxima3oCanalVisivelEmReservado;
	}

	public void setDemandaAtualMaxima3oCanalVisivelEmReservado(String demandaAtualMaxima3oCanalVisivelEmReservado) {
		this.demandaAtualMaxima3oCanalVisivelEmReservado = demandaAtualMaxima3oCanalVisivelEmReservado;
	}

	public String getDemandaAtualReversaMaxima3oCanalVisivelEmReservado() {
		return demandaAtualReversaMaxima3oCanalVisivelEmReservado;
	}

	public void setDemandaAtualReversaMaxima3oCanalVisivelEmReservado(
			String demandaAtualReversaMaxima3oCanalVisivelEmReservado) {
		this.demandaAtualReversaMaxima3oCanalVisivelEmReservado = demandaAtualReversaMaxima3oCanalVisivelEmReservado;
	}

	public String getDemandaAtualAcumulada3oCanalVisivelEmPonta() {
		return demandaAtualAcumulada3oCanalVisivelEmPonta;
	}

	public void setDemandaAtualAcumulada3oCanalVisivelEmPonta(String demandaAtualAcumulada3oCanalVisivelEmPonta) {
		this.demandaAtualAcumulada3oCanalVisivelEmPonta = demandaAtualAcumulada3oCanalVisivelEmPonta;
	}

	public String getDemandaAtualReversaAcumulada3oCanalVisivelEmPonta() {
		return demandaAtualReversaAcumulada3oCanalVisivelEmPonta;
	}

	public void setDemandaAtualReversaAcumulada3oCanalVisivelEmPonta(
			String demandaAtualReversaAcumulada3oCanalVisivelEmPonta) {
		this.demandaAtualReversaAcumulada3oCanalVisivelEmPonta = demandaAtualReversaAcumulada3oCanalVisivelEmPonta;
	}

	public String getDemandaAtualAcumulada3oCanalVisivelEmForaPonta() {
		return demandaAtualAcumulada3oCanalVisivelEmForaPonta;
	}

	public void setDemandaAtualAcumulada3oCanalVisivelEmForaPonta(String demandaAtualAcumulada3oCanalVisivelEmForaPonta) {
		this.demandaAtualAcumulada3oCanalVisivelEmForaPonta = demandaAtualAcumulada3oCanalVisivelEmForaPonta;
	}

	public String getDemandaAtualReversaAcumulada3oCanalVisivelEmForaPonta() {
		return demandaAtualReversaAcumulada3oCanalVisivelEmForaPonta;
	}

	public void setDemandaAtualReversaAcumulada3oCanalVisivelEmForaPonta(
			String demandaAtualReversaAcumulada3oCanalVisivelEmForaPonta) {
		this.demandaAtualReversaAcumulada3oCanalVisivelEmForaPonta = demandaAtualReversaAcumulada3oCanalVisivelEmForaPonta;
	}

	public String getDemandaAtualAcumulada3oCanalVisivelEmReservado() {
		return demandaAtualAcumulada3oCanalVisivelEmReservado;
	}

	public void setDemandaAtualAcumulada3oCanalVisivelEmReservado(String demandaAtualAcumulada3oCanalVisivelEmReservado) {
		this.demandaAtualAcumulada3oCanalVisivelEmReservado = demandaAtualAcumulada3oCanalVisivelEmReservado;
	}

	public String getDemandaAtualReversaAcumulada3oCanalVisivelEmReservado() {
		return demandaAtualReversaAcumulada3oCanalVisivelEmReservado;
	}

	public void setDemandaAtualReversaAcumulada3oCanalVisivelEmReservado(
			String demandaAtualReversaAcumulada3oCanalVisivelEmReservado) {
		this.demandaAtualReversaAcumulada3oCanalVisivelEmReservado = demandaAtualReversaAcumulada3oCanalVisivelEmReservado;
	}

	public String getTotalizadorAnteriorGeral1oCanalVisivel() {
		return totalizadorAnteriorGeral1oCanalVisivel;
	}

	public void setTotalizadorAnteriorGeral1oCanalVisivel(String totalizadorAnteriorGeral1oCanalVisivel) {
		this.totalizadorAnteriorGeral1oCanalVisivel = totalizadorAnteriorGeral1oCanalVisivel;
	}

	public String getTotalizadorAnterior1oCanalVisivelEmPonta() {
		return totalizadorAnterior1oCanalVisivelEmPonta;
	}

	public void setTotalizadorAnterior1oCanalVisivelEmPonta(String totalizadorAnterior1oCanalVisivelEmPonta) {
		this.totalizadorAnterior1oCanalVisivelEmPonta = totalizadorAnterior1oCanalVisivelEmPonta;
	}

	public String getTotalizadorAnteriorUFEREmPonta() {
		return totalizadorAnteriorUFEREmPonta;
	}

	public void setTotalizadorAnteriorUFEREmPonta(String totalizadorAnteriorUFEREmPonta) {
		this.totalizadorAnteriorUFEREmPonta = totalizadorAnteriorUFEREmPonta;
	}

	public String getTotalizadorAnterior1oCanalVisivelEmForaPonta() {
		return totalizadorAnterior1oCanalVisivelEmForaPonta;
	}

	public void setTotalizadorAnterior1oCanalVisivelEmForaPonta(String totalizadorAnterior1oCanalVisivelEmForaPonta) {
		this.totalizadorAnterior1oCanalVisivelEmForaPonta = totalizadorAnterior1oCanalVisivelEmForaPonta;
	}

	public String getTotalizadorAnteriorUFEREmForaPonta() {
		return totalizadorAnteriorUFEREmForaPonta;
	}

	public void setTotalizadorAnteriorUFEREmForaPonta(String totalizadorAnteriorUFEREmForaPonta) {
		this.totalizadorAnteriorUFEREmForaPonta = totalizadorAnteriorUFEREmForaPonta;
	}

	public String getTotalizadorAnterior1oCanalVisivelEmReservado() {
		return totalizadorAnterior1oCanalVisivelEmReservado;
	}

	public void setTotalizadorAnterior1oCanalVisivelEmReservado(String totalizadorAnterior1oCanalVisivelEmReservado) {
		this.totalizadorAnterior1oCanalVisivelEmReservado = totalizadorAnterior1oCanalVisivelEmReservado;
	}

	public String getTotalizadorAnteriorUFEREmReservado() {
		return totalizadorAnteriorUFEREmReservado;
	}

	public void setTotalizadorAnteriorUFEREmReservado(String totalizadorAnteriorUFEREmReservado) {
		this.totalizadorAnteriorUFEREmReservado = totalizadorAnteriorUFEREmReservado;
	}

	public String getDemandaDoUltimoIntervaloAnterior1oCanalVisivel() {
		return demandaDoUltimoIntervaloAnterior1oCanalVisivel;
	}

	public void setDemandaDoUltimoIntervaloAnterior1oCanalVisivel(String demandaDoUltimoIntervaloAnterior1oCanalVisivel) {
		this.demandaDoUltimoIntervaloAnterior1oCanalVisivel = demandaDoUltimoIntervaloAnterior1oCanalVisivel;
	}

	public String getDemandaAnteriorMaxima1oCanalVisivelEmPonta() {
		return demandaAnteriorMaxima1oCanalVisivelEmPonta;
	}

	public void setDemandaAnteriorMaxima1oCanalVisivelEmPonta(String demandaAnteriorMaxima1oCanalVisivelEmPonta) {
		this.demandaAnteriorMaxima1oCanalVisivelEmPonta = demandaAnteriorMaxima1oCanalVisivelEmPonta;
	}

	public String getDmcrAnteriorEmPonta() {
		return dmcrAnteriorEmPonta;
	}

	public void setDmcrAnteriorEmPonta(String dmcrAnteriorEmPonta) {
		this.dmcrAnteriorEmPonta = dmcrAnteriorEmPonta;
	}

	public String getDemandaAnteriorMaxima1oCanalVisivelEmForaPonta() {
		return demandaAnteriorMaxima1oCanalVisivelEmForaPonta;
	}

	public void setDemandaAnteriorMaxima1oCanalVisivelEmForaPonta(String demandaAnteriorMaxima1oCanalVisivelEmForaPonta) {
		this.demandaAnteriorMaxima1oCanalVisivelEmForaPonta = demandaAnteriorMaxima1oCanalVisivelEmForaPonta;
	}

	public String getDmcrAnteriorEmForaPonta() {
		return dmcrAnteriorEmForaPonta;
	}

	public void setDmcrAnteriorEmForaPonta(String dmcrAnteriorEmForaPonta) {
		this.dmcrAnteriorEmForaPonta = dmcrAnteriorEmForaPonta;
	}

	public String getDemandaAnteriorMaxima1oCanalVisivelEmReservado() {
		return demandaAnteriorMaxima1oCanalVisivelEmReservado;
	}

	public void setDemandaAnteriorMaxima1oCanalVisivelEmReservado(String demandaAnteriorMaxima1oCanalVisivelEmReservado) {
		this.demandaAnteriorMaxima1oCanalVisivelEmReservado = demandaAnteriorMaxima1oCanalVisivelEmReservado;
	}

	public String getDmcrAnteriorEmReservado() {
		return dmcrAnteriorEmReservado;
	}

	public void setDmcrAnteriorEmReservado(String dmcrAnteriorEmReservado) {
		this.dmcrAnteriorEmReservado = dmcrAnteriorEmReservado;
	}

	public String getDemandaAnteriorAcumulada1oCanalVisivelEmPonta() {
		return demandaAnteriorAcumulada1oCanalVisivelEmPonta;
	}

	public void setDemandaAnteriorAcumulada1oCanalVisivelEmPonta(String demandaAnteriorAcumulada1oCanalVisivelEmPonta) {
		this.demandaAnteriorAcumulada1oCanalVisivelEmPonta = demandaAnteriorAcumulada1oCanalVisivelEmPonta;
	}

	public String getDmcrAnteriorAcumuladaEmPonta() {
		return dmcrAnteriorAcumuladaEmPonta;
	}

	public void setDmcrAnteriorAcumuladaEmPonta(String dmcrAnteriorAcumuladaEmPonta) {
		this.dmcrAnteriorAcumuladaEmPonta = dmcrAnteriorAcumuladaEmPonta;
	}

	public String getDemandaAnteriorAcumulada1oCanalVisivelEmForaPonta() {
		return demandaAnteriorAcumulada1oCanalVisivelEmForaPonta;
	}

	public void setDemandaAnteriorAcumulada1oCanalVisivelEmForaPonta(
			String demandaAnteriorAcumulada1oCanalVisivelEmForaPonta) {
		this.demandaAnteriorAcumulada1oCanalVisivelEmForaPonta = demandaAnteriorAcumulada1oCanalVisivelEmForaPonta;
	}

	public String getDmcrAnteriorAcumuladaEmForaPonta() {
		return dmcrAnteriorAcumuladaEmForaPonta;
	}

	public void setDmcrAnteriorAcumuladaEmForaPonta(String dmcrAnteriorAcumuladaEmForaPonta) {
		this.dmcrAnteriorAcumuladaEmForaPonta = dmcrAnteriorAcumuladaEmForaPonta;
	}

	public String getDemandaAnteriorAcumulada1oCanalVisivelEmReservado() {
		return demandaAnteriorAcumulada1oCanalVisivelEmReservado;
	}

	public void setDemandaAnteriorAcumulada1oCanalVisivelEmReservado(
			String demandaAnteriorAcumulada1oCanalVisivelEmReservado) {
		this.demandaAnteriorAcumulada1oCanalVisivelEmReservado = demandaAnteriorAcumulada1oCanalVisivelEmReservado;
	}

	public String getDmcrAnteriorAcumuladaEmReservado() {
		return dmcrAnteriorAcumuladaEmReservado;
	}

	public void setDmcrAnteriorAcumuladaEmReservado(String dmcrAnteriorAcumuladaEmReservado) {
		this.dmcrAnteriorAcumuladaEmReservado = dmcrAnteriorAcumuladaEmReservado;
	}

	public String getTotalizadorAnteriorGeral2oCanalVisivel() {
		return totalizadorAnteriorGeral2oCanalVisivel;
	}

	public void setTotalizadorAnteriorGeral2oCanalVisivel(String totalizadorAnteriorGeral2oCanalVisivel) {
		this.totalizadorAnteriorGeral2oCanalVisivel = totalizadorAnteriorGeral2oCanalVisivel;
	}

	public String getTotalizadorAnterior2oCanalVisivelEmPonta() {
		return totalizadorAnterior2oCanalVisivelEmPonta;
	}

	public void setTotalizadorAnterior2oCanalVisivelEmPonta(String totalizadorAnterior2oCanalVisivelEmPonta) {
		this.totalizadorAnterior2oCanalVisivelEmPonta = totalizadorAnterior2oCanalVisivelEmPonta;
	}

	public String getTotalizadorAnteriorReverso2oCanalVisivelEmPonta() {
		return totalizadorAnteriorReverso2oCanalVisivelEmPonta;
	}

	public void setTotalizadorAnteriorReverso2oCanalVisivelEmPonta(String totalizadorAnteriorReverso2oCanalVisivelEmPonta) {
		this.totalizadorAnteriorReverso2oCanalVisivelEmPonta = totalizadorAnteriorReverso2oCanalVisivelEmPonta;
	}

	public String getTotalizadorAnterior2oCanalVisivelEmForaPonta() {
		return totalizadorAnterior2oCanalVisivelEmForaPonta;
	}

	public void setTotalizadorAnterior2oCanalVisivelEmForaPonta(String totalizadorAnterior2oCanalVisivelEmForaPonta) {
		this.totalizadorAnterior2oCanalVisivelEmForaPonta = totalizadorAnterior2oCanalVisivelEmForaPonta;
	}

	public String getTotalizadorAnteriorReverso2oCanalVisivelEmForaPonta() {
		return totalizadorAnteriorReverso2oCanalVisivelEmForaPonta;
	}

	public void setTotalizadorAnteriorReverso2oCanalVisivelEmForaPonta(
			String totalizadorAnteriorReverso2oCanalVisivelEmForaPonta) {
		this.totalizadorAnteriorReverso2oCanalVisivelEmForaPonta = totalizadorAnteriorReverso2oCanalVisivelEmForaPonta;
	}

	public String getTotalizadorAnterior2oCanalVisivelEmReservado() {
		return totalizadorAnterior2oCanalVisivelEmReservado;
	}

	public void setTotalizadorAnterior2oCanalVisivelEmReservado(String totalizadorAnterior2oCanalVisivelEmReservado) {
		this.totalizadorAnterior2oCanalVisivelEmReservado = totalizadorAnterior2oCanalVisivelEmReservado;
	}

	public String getTotalizadorAnteriorReverso2oCanalVisivelEmReservado() {
		return totalizadorAnteriorReverso2oCanalVisivelEmReservado;
	}

	public void setTotalizadorAnteriorReverso2oCanalVisivelEmReservado(
			String totalizadorAnteriorReverso2oCanalVisivelEmReservado) {
		this.totalizadorAnteriorReverso2oCanalVisivelEmReservado = totalizadorAnteriorReverso2oCanalVisivelEmReservado;
	}

	public String getDemandaDoUltimoIntervaloAnterior2oCanalVisivel() {
		return demandaDoUltimoIntervaloAnterior2oCanalVisivel;
	}

	public void setDemandaDoUltimoIntervaloAnterior2oCanalVisivel(String demandaDoUltimoIntervaloAnterior2oCanalVisivel) {
		this.demandaDoUltimoIntervaloAnterior2oCanalVisivel = demandaDoUltimoIntervaloAnterior2oCanalVisivel;
	}

	public String getDemandaAnteriorMaxima2oCanalVisivelEmPonta() {
		return demandaAnteriorMaxima2oCanalVisivelEmPonta;
	}

	public void setDemandaAnteriorMaxima2oCanalVisivelEmPonta(String demandaAnteriorMaxima2oCanalVisivelEmPonta) {
		this.demandaAnteriorMaxima2oCanalVisivelEmPonta = demandaAnteriorMaxima2oCanalVisivelEmPonta;
	}

	public String getDemandaAnteriorReversaMaxima2oCanalVisivelEmPonta() {
		return demandaAnteriorReversaMaxima2oCanalVisivelEmPonta;
	}

	public void setDemandaAnteriorReversaMaxima2oCanalVisivelEmPonta(
			String demandaAnteriorReversaMaxima2oCanalVisivelEmPonta) {
		this.demandaAnteriorReversaMaxima2oCanalVisivelEmPonta = demandaAnteriorReversaMaxima2oCanalVisivelEmPonta;
	}

	public String getDemandaAnteriorMaxima2oCanalVisivelEmForaPonta() {
		return demandaAnteriorMaxima2oCanalVisivelEmForaPonta;
	}

	public void setDemandaAnteriorMaxima2oCanalVisivelEmForaPonta(String demandaAnteriorMaxima2oCanalVisivelEmForaPonta) {
		this.demandaAnteriorMaxima2oCanalVisivelEmForaPonta = demandaAnteriorMaxima2oCanalVisivelEmForaPonta;
	}

	public String getDemandaAnteriorReversaMaxima2oCanalVisivelEmForaPonta() {
		return demandaAnteriorReversaMaxima2oCanalVisivelEmForaPonta;
	}

	public void setDemandaAnteriorReversaMaxima2oCanalVisivelEmForaPonta(
			String demandaAnteriorReversaMaxima2oCanalVisivelEmForaPonta) {
		this.demandaAnteriorReversaMaxima2oCanalVisivelEmForaPonta = demandaAnteriorReversaMaxima2oCanalVisivelEmForaPonta;
	}

	public String getDemandaAnteriorMaxima2oCanalVisivelEmReservado() {
		return demandaAnteriorMaxima2oCanalVisivelEmReservado;
	}

	public void setDemandaAnteriorMaxima2oCanalVisivelEmReservado(String demandaAnteriorMaxima2oCanalVisivelEmReservado) {
		this.demandaAnteriorMaxima2oCanalVisivelEmReservado = demandaAnteriorMaxima2oCanalVisivelEmReservado;
	}

	public String getDemandaAnteriorReversaMaxima2oCanalVisivelEmReservado() {
		return demandaAnteriorReversaMaxima2oCanalVisivelEmReservado;
	}

	public void setDemandaAnteriorReversaMaxima2oCanalVisivelEmReservado(
			String demandaAnteriorReversaMaxima2oCanalVisivelEmReservado) {
		this.demandaAnteriorReversaMaxima2oCanalVisivelEmReservado = demandaAnteriorReversaMaxima2oCanalVisivelEmReservado;
	}

	public String getDemandaAnteriorAcumulada2oCanalVisivelEmPonta() {
		return demandaAnteriorAcumulada2oCanalVisivelEmPonta;
	}

	public void setDemandaAnteriorAcumulada2oCanalVisivelEmPonta(String demandaAnteriorAcumulada2oCanalVisivelEmPonta) {
		this.demandaAnteriorAcumulada2oCanalVisivelEmPonta = demandaAnteriorAcumulada2oCanalVisivelEmPonta;
	}

	public String getDemandaAnteriorReversaAcumulada2oCanalVisivelEmPonta() {
		return demandaAnteriorReversaAcumulada2oCanalVisivelEmPonta;
	}

	public void setDemandaAnteriorReversaAcumulada2oCanalVisivelEmPonta(
			String demandaAnteriorReversaAcumulada2oCanalVisivelEmPonta) {
		this.demandaAnteriorReversaAcumulada2oCanalVisivelEmPonta = demandaAnteriorReversaAcumulada2oCanalVisivelEmPonta;
	}

	public String getDemandaAnteriorAcumulada2oCanalVisivelEmForaPonta() {
		return demandaAnteriorAcumulada2oCanalVisivelEmForaPonta;
	}

	public void setDemandaAnteriorAcumulada2oCanalVisivelEmForaPonta(
			String demandaAnteriorAcumulada2oCanalVisivelEmForaPonta) {
		this.demandaAnteriorAcumulada2oCanalVisivelEmForaPonta = demandaAnteriorAcumulada2oCanalVisivelEmForaPonta;
	}

	public String getDemandaAnteriorReversaAcumulada2oCanalVisivelEmForaPonta() {
		return demandaAnteriorReversaAcumulada2oCanalVisivelEmForaPonta;
	}

	public void setDemandaAnteriorReversaAcumulada2oCanalVisivelEmForaPonta(
			String demandaAnteriorReversaAcumulada2oCanalVisivelEmForaPonta) {
		this.demandaAnteriorReversaAcumulada2oCanalVisivelEmForaPonta = demandaAnteriorReversaAcumulada2oCanalVisivelEmForaPonta;
	}

	public String getDemandaAnteriorAcumulada2oCanalVisivelEmReservado() {
		return demandaAnteriorAcumulada2oCanalVisivelEmReservado;
	}

	public void setDemandaAnteriorAcumulada2oCanalVisivelEmReservado(
			String demandaAnteriorAcumulada2oCanalVisivelEmReservado) {
		this.demandaAnteriorAcumulada2oCanalVisivelEmReservado = demandaAnteriorAcumulada2oCanalVisivelEmReservado;
	}

	public String getDemandaAnteriorReversaAcumulada2oCanalVisivelEmReservado() {
		return demandaAnteriorReversaAcumulada2oCanalVisivelEmReservado;
	}

	public void setDemandaAnteriorReversaAcumulada2oCanalVisivelEmReservado(
			String demandaAnteriorReversaAcumulada2oCanalVisivelEmReservado) {
		this.demandaAnteriorReversaAcumulada2oCanalVisivelEmReservado = demandaAnteriorReversaAcumulada2oCanalVisivelEmReservado;
	}

	public String getTotalizadorAnteriorGeral3oCanalVisivel() {
		return totalizadorAnteriorGeral3oCanalVisivel;
	}

	public void setTotalizadorAnteriorGeral3oCanalVisivel(String totalizadorAnteriorGeral3oCanalVisivel) {
		this.totalizadorAnteriorGeral3oCanalVisivel = totalizadorAnteriorGeral3oCanalVisivel;
	}

	public String getTotalizadorAnterior3oCanalVisivelEmPonta() {
		return totalizadorAnterior3oCanalVisivelEmPonta;
	}

	public void setTotalizadorAnterior3oCanalVisivelEmPonta(String totalizadorAnterior3oCanalVisivelEmPonta) {
		this.totalizadorAnterior3oCanalVisivelEmPonta = totalizadorAnterior3oCanalVisivelEmPonta;
	}

	public String getTotalizadorAnteriorReverso3oCanalVisivelEmPonta() {
		return totalizadorAnteriorReverso3oCanalVisivelEmPonta;
	}

	public void setTotalizadorAnteriorReverso3oCanalVisivelEmPonta(String totalizadorAnteriorReverso3oCanalVisivelEmPonta) {
		this.totalizadorAnteriorReverso3oCanalVisivelEmPonta = totalizadorAnteriorReverso3oCanalVisivelEmPonta;
	}

	public String getTotalizadorAnterior3oCanalVisivelEmForaPonta() {
		return totalizadorAnterior3oCanalVisivelEmForaPonta;
	}

	public void setTotalizadorAnterior3oCanalVisivelEmForaPonta(String totalizadorAnterior3oCanalVisivelEmForaPonta) {
		this.totalizadorAnterior3oCanalVisivelEmForaPonta = totalizadorAnterior3oCanalVisivelEmForaPonta;
	}

	public String getTotalizadorAnteriorReverso3oCanalVisivelEmForaPonta() {
		return totalizadorAnteriorReverso3oCanalVisivelEmForaPonta;
	}

	public void setTotalizadorAnteriorReverso3oCanalVisivelEmForaPonta(
			String totalizadorAnteriorReverso3oCanalVisivelEmForaPonta) {
		this.totalizadorAnteriorReverso3oCanalVisivelEmForaPonta = totalizadorAnteriorReverso3oCanalVisivelEmForaPonta;
	}

	public String getTotalizadorAnterior3oCanalVisivelEmReservado() {
		return totalizadorAnterior3oCanalVisivelEmReservado;
	}

	public void setTotalizadorAnterior3oCanalVisivelEmReservado(String totalizadorAnterior3oCanalVisivelEmReservado) {
		this.totalizadorAnterior3oCanalVisivelEmReservado = totalizadorAnterior3oCanalVisivelEmReservado;
	}

	public String getTotalizadorAnteriorReverso3oCanalVisivelEmReservado() {
		return totalizadorAnteriorReverso3oCanalVisivelEmReservado;
	}

	public void setTotalizadorAnteriorReverso3oCanalVisivelEmReservado(
			String totalizadorAnteriorReverso3oCanalVisivelEmReservado) {
		this.totalizadorAnteriorReverso3oCanalVisivelEmReservado = totalizadorAnteriorReverso3oCanalVisivelEmReservado;
	}

	public String getDemandaDoUltimoIntervaloAnteriorDo3oCanalVisivel() {
		return demandaDoUltimoIntervaloAnteriorDo3oCanalVisivel;
	}

	public void setDemandaDoUltimoIntervaloAnteriorDo3oCanalVisivel(
			String demandaDoUltimoIntervaloAnteriorDo3oCanalVisivel) {
		this.demandaDoUltimoIntervaloAnteriorDo3oCanalVisivel = demandaDoUltimoIntervaloAnteriorDo3oCanalVisivel;
	}

	public String getDemandaAnteriormaximaDo3oCanalVisivelEmPontaa() {
		return demandaAnteriormaximaDo3oCanalVisivelEmPontaa;
	}

	public void setDemandaAnteriormaximaDo3oCanalVisivelEmPontaa(String demandaAnteriormaximaDo3oCanalVisivelEmPontaa) {
		this.demandaAnteriormaximaDo3oCanalVisivelEmPontaa = demandaAnteriormaximaDo3oCanalVisivelEmPontaa;
	}

	public String getDemandaAnteriorReversamaximaDo3oCanalVisivelEmPontaa() {
		return demandaAnteriorReversamaximaDo3oCanalVisivelEmPontaa;
	}

	public void setDemandaAnteriorReversamaximaDo3oCanalVisivelEmPontaa(
			String demandaAnteriorReversamaximaDo3oCanalVisivelEmPontaa) {
		this.demandaAnteriorReversamaximaDo3oCanalVisivelEmPontaa = demandaAnteriorReversamaximaDo3oCanalVisivelEmPontaa;
	}

	public String getDemandaAnteriormaximaDo3oCanalVisivelEmForaPonta() {
		return demandaAnteriormaximaDo3oCanalVisivelEmForaPonta;
	}

	public void setDemandaAnteriormaximaDo3oCanalVisivelEmForaPonta(
			String demandaAnteriormaximaDo3oCanalVisivelEmForaPonta) {
		this.demandaAnteriormaximaDo3oCanalVisivelEmForaPonta = demandaAnteriormaximaDo3oCanalVisivelEmForaPonta;
	}

	public String getDemandaAnteriorReversamaximaDo3oCanalVisivelEmForaPonta() {
		return demandaAnteriorReversamaximaDo3oCanalVisivelEmForaPonta;
	}

	public void setDemandaAnteriorReversamaximaDo3oCanalVisivelEmForaPonta(
			String demandaAnteriorReversamaximaDo3oCanalVisivelEmForaPonta) {
		this.demandaAnteriorReversamaximaDo3oCanalVisivelEmForaPonta = demandaAnteriorReversamaximaDo3oCanalVisivelEmForaPonta;
	}

	public String getDemandaAnteriormaximaDo3oCanalVisivelEmReservado() {
		return demandaAnteriormaximaDo3oCanalVisivelEmReservado;
	}

	public void setDemandaAnteriormaximaDo3oCanalVisivelEmReservado(
			String demandaAnteriormaximaDo3oCanalVisivelEmReservado) {
		this.demandaAnteriormaximaDo3oCanalVisivelEmReservado = demandaAnteriormaximaDo3oCanalVisivelEmReservado;
	}

	public String getDemandaAnteriorReversamaximaDo3oCanalVisivelEmReservado() {
		return demandaAnteriorReversamaximaDo3oCanalVisivelEmReservado;
	}

	public void setDemandaAnteriorReversamaximaDo3oCanalVisivelEmReservado(
			String demandaAnteriorReversamaximaDo3oCanalVisivelEmReservado) {
		this.demandaAnteriorReversamaximaDo3oCanalVisivelEmReservado = demandaAnteriorReversamaximaDo3oCanalVisivelEmReservado;
	}

	public String getDemandaAnteriorAcumuladaDo3oCanalVisivelEmPontaa() {
		return demandaAnteriorAcumuladaDo3oCanalVisivelEmPontaa;
	}

	public void setDemandaAnteriorAcumuladaDo3oCanalVisivelEmPontaa(
			String demandaAnteriorAcumuladaDo3oCanalVisivelEmPontaa) {
		this.demandaAnteriorAcumuladaDo3oCanalVisivelEmPontaa = demandaAnteriorAcumuladaDo3oCanalVisivelEmPontaa;
	}

	public String getDemandaAnteriorReversaAcumuladaDo3oCanalVisivelEmPontaa() {
		return demandaAnteriorReversaAcumuladaDo3oCanalVisivelEmPontaa;
	}

	public void setDemandaAnteriorReversaAcumuladaDo3oCanalVisivelEmPontaa(
			String demandaAnteriorReversaAcumuladaDo3oCanalVisivelEmPontaa) {
		this.demandaAnteriorReversaAcumuladaDo3oCanalVisivelEmPontaa = demandaAnteriorReversaAcumuladaDo3oCanalVisivelEmPontaa;
	}

	public String getDemandaAnteriorAcumuladaDo3oCanalVisivelEmForaPonta() {
		return demandaAnteriorAcumuladaDo3oCanalVisivelEmForaPonta;
	}

	public void setDemandaAnteriorAcumuladaDo3oCanalVisivelEmForaPonta(
			String demandaAnteriorAcumuladaDo3oCanalVisivelEmForaPonta) {
		this.demandaAnteriorAcumuladaDo3oCanalVisivelEmForaPonta = demandaAnteriorAcumuladaDo3oCanalVisivelEmForaPonta;
	}

	public String getDemandaAnteriorReversaAcumuladaDo3oCanalVisivelEmForaPonta() {
		return demandaAnteriorReversaAcumuladaDo3oCanalVisivelEmForaPonta;
	}

	public void setDemandaAnteriorReversaAcumuladaDo3oCanalVisivelEmForaPonta(
			String demandaAnteriorReversaAcumuladaDo3oCanalVisivelEmForaPonta) {
		this.demandaAnteriorReversaAcumuladaDo3oCanalVisivelEmForaPonta = demandaAnteriorReversaAcumuladaDo3oCanalVisivelEmForaPonta;
	}

	public String getDemandaAnteriorAcumuladaDo3oCanalVisivelEmReservado() {
		return demandaAnteriorAcumuladaDo3oCanalVisivelEmReservado;
	}

	public void setDemandaAnteriorAcumuladaDo3oCanalVisivelEmReservado(
			String demandaAnteriorAcumuladaDo3oCanalVisivelEmReservado) {
		this.demandaAnteriorAcumuladaDo3oCanalVisivelEmReservado = demandaAnteriorAcumuladaDo3oCanalVisivelEmReservado;
	}

	public String getDemandaAnteriorReversaAcumuladaDo3oCanalVisivelEmReservado() {
		return demandaAnteriorReversaAcumuladaDo3oCanalVisivelEmReservado;
	}

	public void setDemandaAnteriorReversaAcumuladaDo3oCanalVisivelEmReservado(
			String demandaAnteriorReversaAcumuladaDo3oCanalVisivelEmReservado) {
		this.demandaAnteriorReversaAcumuladaDo3oCanalVisivelEmReservado = demandaAnteriorReversaAcumuladaDo3oCanalVisivelEmReservado;
	}

	public String getDATA_AlteracaoDaData() {
		return DATA_AlteracaoDaData;
	}

	public void setDATA_AlteracaoDaData(String dATA_AlteracaoDaData) {
		DATA_AlteracaoDaData = dATA_AlteracaoDaData;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getDiaDaSemana() {
		return diaDaSemana;
	}

	public void setDiaDaSemana(String diaDaSemana) {
		this.diaDaSemana = diaDaSemana;
	}

	public String getHORA_AlteracaoDoHorario() {
		return HORA_AlteracaoDoHorario;
	}

	public void setHORA_AlteracaoDoHorario(String hORA_AlteracaoDoHorario) {
		HORA_AlteracaoDoHorario = hORA_AlteracaoDoHorario;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getMinuto() {
		return minuto;
	}

	public void setMinuto(String minuto) {
		this.minuto = minuto;
	}

	public String getSegundo() {
		return segundo;
	}

	public void setSegundo(String segundo) {
		this.segundo = segundo;
	}

	public String getINTE_AlteracaoDoIntervaloDeDemanda() {
		return INTE_AlteracaoDoIntervaloDeDemanda;
	}

	public void setINTE_AlteracaoDoIntervaloDeDemanda(String iNTE_AlteracaoDoIntervaloDeDemanda) {
		INTE_AlteracaoDoIntervaloDeDemanda = iNTE_AlteracaoDoIntervaloDeDemanda;
	}

	public String getMinutos() {
		return minutos;
	}

	public void setMinutos(String minutos) {
		this.minutos = minutos;
	}

	public String getFERN_AlteracaoDosFeriadosNacionais() {
		return FERN_AlteracaoDosFeriadosNacionais;
	}

	public void setFERN_AlteracaoDosFeriadosNacionais(String fERN_AlteracaoDosFeriadosNacionais) {
		FERN_AlteracaoDosFeriadosNacionais = fERN_AlteracaoDosFeriadosNacionais;
	}

	public String getDiaMesAno1() {
		return diaMesAno1;
	}

	public void setDiaMesAno1(String diaMesAno1) {
		this.diaMesAno1 = diaMesAno1;
	}

	public String getDiaMesAno2() {
		return diaMesAno2;
	}

	public void setDiaMesAno2(String diaMesAno2) {
		this.diaMesAno2 = diaMesAno2;
	}

	public String getDiaMesAno3() {
		return diaMesAno3;
	}

	public void setDiaMesAno3(String diaMesAno3) {
		this.diaMesAno3 = diaMesAno3;
	}

	public String getDiaMesAno4() {
		return diaMesAno4;
	}

	public void setDiaMesAno4(String diaMesAno4) {
		this.diaMesAno4 = diaMesAno4;
	}

	public String getDiaMesAno5() {
		return diaMesAno5;
	}

	public void setDiaMesAno5(String diaMesAno5) {
		this.diaMesAno5 = diaMesAno5;
	}

	public String getDiaMesAno6() {
		return diaMesAno6;
	}

	public void setDiaMesAno6(String diaMesAno6) {
		this.diaMesAno6 = diaMesAno6;
	}

	public String getDiaMesAno7() {
		return diaMesAno7;
	}

	public void setDiaMesAno7(String diaMesAno7) {
		this.diaMesAno7 = diaMesAno7;
	}

	public String getDiaMesAno8() {
		return diaMesAno8;
	}

	public void setDiaMesAno8(String diaMesAno8) {
		this.diaMesAno8 = diaMesAno8;
	}

	public String getDiaMesAno9() {
		return diaMesAno9;
	}

	public void setDiaMesAno9(String diaMesAno9) {
		this.diaMesAno9 = diaMesAno9;
	}

	public String getDiaMesAno10() {
		return diaMesAno10;
	}

	public void setDiaMesAno10(String diaMesAno10) {
		this.diaMesAno10 = diaMesAno10;
	}

	public String getDiaMesAno11() {
		return diaMesAno11;
	}

	public void setDiaMesAno11(String diaMesAno11) {
		this.diaMesAno11 = diaMesAno11;
	}

	public String getDiaMesAno12() {
		return diaMesAno12;
	}

	public void setDiaMesAno12(String diaMesAno12) {
		this.diaMesAno12 = diaMesAno12;
	}

	public String getDiaMesAno13() {
		return diaMesAno13;
	}

	public void setDiaMesAno13(String diaMesAno13) {
		this.diaMesAno13 = diaMesAno13;
	}

	public String getDiaMesAno14() {
		return diaMesAno14;
	}

	public void setDiaMesAno14(String diaMesAno14) {
		this.diaMesAno14 = diaMesAno14;
	}

	public String getDiaMesAno15() {
		return diaMesAno15;
	}

	public void setDiaMesAno15(String diaMesAno15) {
		this.diaMesAno15 = diaMesAno15;
	}

	public String getCONS_AlteracaoDasConstantesDeMultiplicacao() {
		return CONS_AlteracaoDasConstantesDeMultiplicacao;
	}

	public void setCONS_AlteracaoDasConstantesDeMultiplicacao(String cONS_AlteracaoDasConstantesDeMultiplicacao) {
		CONS_AlteracaoDasConstantesDeMultiplicacao = cONS_AlteracaoDasConstantesDeMultiplicacao;
	}

	public String getNumeradorDo1oCanalVisivel() {
		return numeradorDo1oCanalVisivel;
	}

	public void setNumeradorDo1oCanalVisivel(String numeradorDo1oCanalVisivel) {
		this.numeradorDo1oCanalVisivel = numeradorDo1oCanalVisivel;
	}

	public String getDenominadorDo1oCanalVisivel() {
		return denominadorDo1oCanalVisivel;
	}

	public void setDenominadorDo1oCanalVisivel(String denominadorDo1oCanalVisivel) {
		this.denominadorDo1oCanalVisivel = denominadorDo1oCanalVisivel;
	}

	public String getNumeradorDo2oCanalVisivel() {
		return numeradorDo2oCanalVisivel;
	}

	public void setNumeradorDo2oCanalVisivel(String numeradorDo2oCanalVisivel) {
		this.numeradorDo2oCanalVisivel = numeradorDo2oCanalVisivel;
	}

	public String getDenominadorDo2oCanalVisivel() {
		return denominadorDo2oCanalVisivel;
	}

	public void setDenominadorDo2oCanalVisivel(String denominadorDo2oCanalVisivel) {
		this.denominadorDo2oCanalVisivel = denominadorDo2oCanalVisivel;
	}

	public String getNumeradorDo3oCanalVisivel() {
		return numeradorDo3oCanalVisivel;
	}

	public void setNumeradorDo3oCanalVisivel(String numeradorDo3oCanalVisivel) {
		this.numeradorDo3oCanalVisivel = numeradorDo3oCanalVisivel;
	}

	public String getDenominadorDo3oCanalVisivel() {
		return denominadorDo3oCanalVisivel;
	}

	public void setDenominadorDo3oCanalVisivel(String denominadorDo3oCanalVisivel) {
		this.denominadorDo3oCanalVisivel = denominadorDo3oCanalVisivel;
	}

	public String getPSAZ_AlteracaoDosPeriodosSazonais() {
		return PSAZ_AlteracaoDosPeriodosSazonais;
	}

	public void setPSAZ_AlteracaoDosPeriodosSazonais(String pSAZ_AlteracaoDosPeriodosSazonais) {
		PSAZ_AlteracaoDosPeriodosSazonais = pSAZ_AlteracaoDosPeriodosSazonais;
	}

	public String getDiaDoInicioDoPeriodoUmido1() {
		return diaDoInicioDoPeriodoUmido1;
	}

	public void setDiaDoInicioDoPeriodoUmido1(String diaDoInicioDoPeriodoUmido1) {
		this.diaDoInicioDoPeriodoUmido1 = diaDoInicioDoPeriodoUmido1;
	}

	public String getMesDoInicioDoPeriodoUmido1() {
		return mesDoInicioDoPeriodoUmido1;
	}

	public void setMesDoInicioDoPeriodoUmido1(String mesDoInicioDoPeriodoUmido1) {
		this.mesDoInicioDoPeriodoUmido1 = mesDoInicioDoPeriodoUmido1;
	}

	public String getDiaDoInicioDoPeriodoSeco1() {
		return diaDoInicioDoPeriodoSeco1;
	}

	public void setDiaDoInicioDoPeriodoSeco1(String diaDoInicioDoPeriodoSeco1) {
		this.diaDoInicioDoPeriodoSeco1 = diaDoInicioDoPeriodoSeco1;
	}

	public String getMesDoInicioDoPeriodoSeco1() {
		return mesDoInicioDoPeriodoSeco1;
	}

	public void setMesDoInicioDoPeriodoSeco1(String mesDoInicioDoPeriodoSeco1) {
		this.mesDoInicioDoPeriodoSeco1 = mesDoInicioDoPeriodoSeco1;
	}

	public String getDiaDoInicioDoPeriodoUmido2() {
		return diaDoInicioDoPeriodoUmido2;
	}

	public void setDiaDoInicioDoPeriodoUmido2(String diaDoInicioDoPeriodoUmido2) {
		this.diaDoInicioDoPeriodoUmido2 = diaDoInicioDoPeriodoUmido2;
	}

	public String getMesDoInicioDoPeriodoUmido2() {
		return mesDoInicioDoPeriodoUmido2;
	}

	public void setMesDoInicioDoPeriodoUmido2(String mesDoInicioDoPeriodoUmido2) {
		this.mesDoInicioDoPeriodoUmido2 = mesDoInicioDoPeriodoUmido2;
	}

	public String getDiaDoInicioDoPeriodoSeco2() {
		return diaDoInicioDoPeriodoSeco2;
	}

	public void setDiaDoInicioDoPeriodoSeco2(String diaDoInicioDoPeriodoSeco2) {
		this.diaDoInicioDoPeriodoSeco2 = diaDoInicioDoPeriodoSeco2;
	}

	public String getMesDoInicioDoPeriodoSeco2() {
		return mesDoInicioDoPeriodoSeco2;
	}

	public void setMesDoInicioDoPeriodoSeco2(String mesDoInicioDoPeriodoSeco2) {
		this.mesDoInicioDoPeriodoSeco2 = mesDoInicioDoPeriodoSeco2;
	}

	public String getDiaDoInicioDoPeriodoUmido3() {
		return diaDoInicioDoPeriodoUmido3;
	}

	public void setDiaDoInicioDoPeriodoUmido3(String diaDoInicioDoPeriodoUmido3) {
		this.diaDoInicioDoPeriodoUmido3 = diaDoInicioDoPeriodoUmido3;
	}

	public String getMesDoInicioDoPeriodoUmido3() {
		return mesDoInicioDoPeriodoUmido3;
	}

	public void setMesDoInicioDoPeriodoUmido3(String mesDoInicioDoPeriodoUmido3) {
		this.mesDoInicioDoPeriodoUmido3 = mesDoInicioDoPeriodoUmido3;
	}

	public String getDia_DoInicioDoPeriodoSSeco1() {
		return dia_DoInicioDoPeriodoSSeco1;
	}

	public void setDia_DoInicioDoPeriodoSSeco1(String dia_DoInicioDoPeriodoSSeco1) {
		this.dia_DoInicioDoPeriodoSSeco1 = dia_DoInicioDoPeriodoSSeco1;
	}

	public String getMes_DoInicioDoPeriodoSSeco1() {
		return mes_DoInicioDoPeriodoSSeco1;
	}

	public void setMes_DoInicioDoPeriodoSSeco1(String mes_DoInicioDoPeriodoSSeco1) {
		this.mes_DoInicioDoPeriodoSSeco1 = mes_DoInicioDoPeriodoSSeco1;
	}

	public String getDia_DoInicioDoPeriodoUUmido1() {
		return dia_DoInicioDoPeriodoUUmido1;
	}

	public void setDia_DoInicioDoPeriodoUUmido1(String dia_DoInicioDoPeriodoUUmido1) {
		this.dia_DoInicioDoPeriodoUUmido1 = dia_DoInicioDoPeriodoUUmido1;
	}

	public String getMes_DoInicioDoPeriodoUUmido1() {
		return mes_DoInicioDoPeriodoUUmido1;
	}

	public void setMes_DoInicioDoPeriodoUUmido1(String mes_DoInicioDoPeriodoUUmido1) {
		this.mes_DoInicioDoPeriodoUUmido1 = mes_DoInicioDoPeriodoUUmido1;
	}

	public String getDia_DoInicioDoPeriodoSSeco2() {
		return dia_DoInicioDoPeriodoSSeco2;
	}

	public void setDia_DoInicioDoPeriodoSSeco2(String dia_DoInicioDoPeriodoSSeco2) {
		this.dia_DoInicioDoPeriodoSSeco2 = dia_DoInicioDoPeriodoSSeco2;
	}

	public String getMes_DoInicioDoPeriodoSSeco2() {
		return mes_DoInicioDoPeriodoSSeco2;
	}

	public void setMes_DoInicioDoPeriodoSSeco2(String mes_DoInicioDoPeriodoSSeco2) {
		this.mes_DoInicioDoPeriodoSSeco2 = mes_DoInicioDoPeriodoSSeco2;
	}

	public String getDia_DoInicioDoPeriodoUUmido2() {
		return dia_DoInicioDoPeriodoUUmido2;
	}

	public void setDia_DoInicioDoPeriodoUUmido2(String dia_DoInicioDoPeriodoUUmido2) {
		this.dia_DoInicioDoPeriodoUUmido2 = dia_DoInicioDoPeriodoUUmido2;
	}

	public String getMes_DoInicioDoPeriodoUUmido2() {
		return mes_DoInicioDoPeriodoUUmido2;
	}

	public void setMes_DoInicioDoPeriodoUUmido2(String mes_DoInicioDoPeriodoUUmido2) {
		this.mes_DoInicioDoPeriodoUUmido2 = mes_DoInicioDoPeriodoUUmido2;
	}

	public String getDia_DoInicioDoPeriodoSSeco3() {
		return dia_DoInicioDoPeriodoSSeco3;
	}

	public void setDia_DoInicioDoPeriodoSSeco3(String dia_DoInicioDoPeriodoSSeco3) {
		this.dia_DoInicioDoPeriodoSSeco3 = dia_DoInicioDoPeriodoSSeco3;
	}

	public String getMes_DoInicioDoPeriodoSSeco3() {
		return mes_DoInicioDoPeriodoSSeco3;
	}

	public void setMes_DoInicioDoPeriodoSSeco3(String mes_DoInicioDoPeriodoSSeco3) {
		this.mes_DoInicioDoPeriodoSSeco3 = mes_DoInicioDoPeriodoSSeco3;
	}

	public String getPDIA_AlteracaoDosSegmentosHorarios() {
		return PDIA_AlteracaoDosSegmentosHorarios;
	}

	public void setPDIA_AlteracaoDosSegmentosHorarios(String pDIA_AlteracaoDosSegmentosHorarios) {
		PDIA_AlteracaoDosSegmentosHorarios = pDIA_AlteracaoDosSegmentosHorarios;
	}

	public String getHoraDoInicioDoHorarioDePonta1() {
		return horaDoInicioDoHorarioDePonta1;
	}

	public void setHoraDoInicioDoHorarioDePonta1(String horaDoInicioDoHorarioDePonta1) {
		this.horaDoInicioDoHorarioDePonta1 = horaDoInicioDoHorarioDePonta1;
	}

	public String getMinutoDoInicioDoHorarioDePonta1() {
		return minutoDoInicioDoHorarioDePonta1;
	}

	public void setMinutoDoInicioDoHorarioDePonta1(String minutoDoInicioDoHorarioDePonta1) {
		this.minutoDoInicioDoHorarioDePonta1 = minutoDoInicioDoHorarioDePonta1;
	}

	public String getHoraDoInicioDoHorarioDePonta2() {
		return horaDoInicioDoHorarioDePonta2;
	}

	public void setHoraDoInicioDoHorarioDePonta2(String horaDoInicioDoHorarioDePonta2) {
		this.horaDoInicioDoHorarioDePonta2 = horaDoInicioDoHorarioDePonta2;
	}

	public String getMinutoDoInicioDoHorarioDePonta2() {
		return minutoDoInicioDoHorarioDePonta2;
	}

	public void setMinutoDoInicioDoHorarioDePonta2(String minutoDoInicioDoHorarioDePonta2) {
		this.minutoDoInicioDoHorarioDePonta2 = minutoDoInicioDoHorarioDePonta2;
	}

	public String getHoraDoInicioDoHorarioDePonta3() {
		return horaDoInicioDoHorarioDePonta3;
	}

	public void setHoraDoInicioDoHorarioDePonta3(String horaDoInicioDoHorarioDePonta3) {
		this.horaDoInicioDoHorarioDePonta3 = horaDoInicioDoHorarioDePonta3;
	}

	public String getMinutoDoInicioDoHorarioDePonta3() {
		return minutoDoInicioDoHorarioDePonta3;
	}

	public void setMinutoDoInicioDoHorarioDePonta3(String minutoDoInicioDoHorarioDePonta3) {
		this.minutoDoInicioDoHorarioDePonta3 = minutoDoInicioDoHorarioDePonta3;
	}

	public String getHoraDoInicioDoHorarioDePonta4() {
		return horaDoInicioDoHorarioDePonta4;
	}

	public void setHoraDoInicioDoHorarioDePonta4(String horaDoInicioDoHorarioDePonta4) {
		this.horaDoInicioDoHorarioDePonta4 = horaDoInicioDoHorarioDePonta4;
	}

	public String getMinutoDoInicioDoHorarioDePonta4() {
		return minutoDoInicioDoHorarioDePonta4;
	}

	public void setMinutoDoInicioDoHorarioDePonta4(String minutoDoInicioDoHorarioDePonta4) {
		this.minutoDoInicioDoHorarioDePonta4 = minutoDoInicioDoHorarioDePonta4;
	}

	public String getHoraDoInicioDoHorarioDeForaPonta1() {
		return horaDoInicioDoHorarioDeForaPonta1;
	}

	public void setHoraDoInicioDoHorarioDeForaPonta1(String horaDoInicioDoHorarioDeForaPonta1) {
		this.horaDoInicioDoHorarioDeForaPonta1 = horaDoInicioDoHorarioDeForaPonta1;
	}

	public String getMinutoDoInicioDoHorarioDeForaPonta1() {
		return minutoDoInicioDoHorarioDeForaPonta1;
	}

	public void setMinutoDoInicioDoHorarioDeForaPonta1(String minutoDoInicioDoHorarioDeForaPonta1) {
		this.minutoDoInicioDoHorarioDeForaPonta1 = minutoDoInicioDoHorarioDeForaPonta1;
	}

	public String getHoraDoInicioDoHorarioDeForaPonta2() {
		return horaDoInicioDoHorarioDeForaPonta2;
	}

	public void setHoraDoInicioDoHorarioDeForaPonta2(String horaDoInicioDoHorarioDeForaPonta2) {
		this.horaDoInicioDoHorarioDeForaPonta2 = horaDoInicioDoHorarioDeForaPonta2;
	}

	public String getMinutoDoInicioDoHorarioDeForaPonta2() {
		return minutoDoInicioDoHorarioDeForaPonta2;
	}

	public void setMinutoDoInicioDoHorarioDeForaPonta2(String minutoDoInicioDoHorarioDeForaPonta2) {
		this.minutoDoInicioDoHorarioDeForaPonta2 = minutoDoInicioDoHorarioDeForaPonta2;
	}

	public String getHoraDoInicioDoHorarioDeForaPonta3() {
		return horaDoInicioDoHorarioDeForaPonta3;
	}

	public void setHoraDoInicioDoHorarioDeForaPonta3(String horaDoInicioDoHorarioDeForaPonta3) {
		this.horaDoInicioDoHorarioDeForaPonta3 = horaDoInicioDoHorarioDeForaPonta3;
	}

	public String getMinutoDoInicioDoHorarioDeForaPonta3() {
		return minutoDoInicioDoHorarioDeForaPonta3;
	}

	public void setMinutoDoInicioDoHorarioDeForaPonta3(String minutoDoInicioDoHorarioDeForaPonta3) {
		this.minutoDoInicioDoHorarioDeForaPonta3 = minutoDoInicioDoHorarioDeForaPonta3;
	}

	public String getHoraDoInicioDoHorarioDeForaPonta4() {
		return horaDoInicioDoHorarioDeForaPonta4;
	}

	public void setHoraDoInicioDoHorarioDeForaPonta4(String horaDoInicioDoHorarioDeForaPonta4) {
		this.horaDoInicioDoHorarioDeForaPonta4 = horaDoInicioDoHorarioDeForaPonta4;
	}

	public String getMinutoDoInicioDoHorarioDeForaPonta4() {
		return minutoDoInicioDoHorarioDeForaPonta4;
	}

	public void setMinutoDoInicioDoHorarioDeForaPonta4(String minutoDoInicioDoHorarioDeForaPonta4) {
		this.minutoDoInicioDoHorarioDeForaPonta4 = minutoDoInicioDoHorarioDeForaPonta4;
	}

	public String getHoraDoInicioDoHorarioReservado1() {
		return horaDoInicioDoHorarioReservado1;
	}

	public void setHoraDoInicioDoHorarioReservado1(String horaDoInicioDoHorarioReservado1) {
		this.horaDoInicioDoHorarioReservado1 = horaDoInicioDoHorarioReservado1;
	}

	public String getMinutoDoInicioDoHorarioReservado1() {
		return minutoDoInicioDoHorarioReservado1;
	}

	public void setMinutoDoInicioDoHorarioReservado1(String minutoDoInicioDoHorarioReservado1) {
		this.minutoDoInicioDoHorarioReservado1 = minutoDoInicioDoHorarioReservado1;
	}

	public String getHoraDoInicioDoHorarioReservado2() {
		return horaDoInicioDoHorarioReservado2;
	}

	public void setHoraDoInicioDoHorarioReservado2(String horaDoInicioDoHorarioReservado2) {
		this.horaDoInicioDoHorarioReservado2 = horaDoInicioDoHorarioReservado2;
	}

	public String getMinutoDoInicioDoHorarioReservado2() {
		return minutoDoInicioDoHorarioReservado2;
	}

	public void setMinutoDoInicioDoHorarioReservado2(String minutoDoInicioDoHorarioReservado2) {
		this.minutoDoInicioDoHorarioReservado2 = minutoDoInicioDoHorarioReservado2;
	}

	public String getHoraDoInicioDoHorarioReservado3() {
		return horaDoInicioDoHorarioReservado3;
	}

	public void setHoraDoInicioDoHorarioReservado3(String horaDoInicioDoHorarioReservado3) {
		this.horaDoInicioDoHorarioReservado3 = horaDoInicioDoHorarioReservado3;
	}

	public String getMinutoDoInicioDoHorarioReservado3() {
		return minutoDoInicioDoHorarioReservado3;
	}

	public void setMinutoDoInicioDoHorarioReservado3(String minutoDoInicioDoHorarioReservado3) {
		this.minutoDoInicioDoHorarioReservado3 = minutoDoInicioDoHorarioReservado3;
	}

	public String getHoraDoInicioDoHorarioReservado4() {
		return horaDoInicioDoHorarioReservado4;
	}

	public void setHoraDoInicioDoHorarioReservado4(String horaDoInicioDoHorarioReservado4) {
		this.horaDoInicioDoHorarioReservado4 = horaDoInicioDoHorarioReservado4;
	}

	public String getMinutoDoInicioDoHorarioReservado4() {
		return minutoDoInicioDoHorarioReservado4;
	}

	public void setMinutoDoInicioDoHorarioReservado4(String minutoDoInicioDoHorarioReservado4) {
		this.minutoDoInicioDoHorarioReservado4 = minutoDoInicioDoHorarioReservado4;
	}

	public String getERRO_InformacaoDeErroNoMedidor() {
		return ERRO_InformacaoDeErroNoMedidor;
	}

	public void setERRO_InformacaoDeErroNoMedidor(String eRRO_InformacaoDeErroNoMedidor) {
		ERRO_InformacaoDeErroNoMedidor = eRRO_InformacaoDeErroNoMedidor;
	}

	public String getCodigoDoErro1() {
		return codigoDoErro1;
	}

	public void setCodigoDoErro1(String codigoDoErro1) {
		this.codigoDoErro1 = codigoDoErro1;
	}

	public String getCodigoDoErro2() {
		return codigoDoErro2;
	}

	public void setCodigoDoErro2(String codigoDoErro2) {
		this.codigoDoErro2 = codigoDoErro2;
	}

	public String getCodigoDoErro3() {
		return codigoDoErro3;
	}

	public void setCodigoDoErro3(String codigoDoErro3) {
		this.codigoDoErro3 = codigoDoErro3;
	}

	public String getCodigoDoErro4() {
		return codigoDoErro4;
	}

	public void setCodigoDoErro4(String codigoDoErro4) {
		this.codigoDoErro4 = codigoDoErro4;
	}

	public String getCodigoDoErro5() {
		return codigoDoErro5;
	}

	public void setCodigoDoErro5(String codigoDoErro5) {
		this.codigoDoErro5 = codigoDoErro5;
	}

	public String getCodigoDoErro6() {
		return codigoDoErro6;
	}

	public void setCodigoDoErro6(String codigoDoErro6) {
		this.codigoDoErro6 = codigoDoErro6;
	}

	public String getALER_AlteracaoDaCondicaoDeErro() {
		return ALER_AlteracaoDaCondicaoDeErro;
	}

	public void setALER_AlteracaoDaCondicaoDeErro(String aLER_AlteracaoDaCondicaoDeErro) {
		ALER_AlteracaoDaCondicaoDeErro = aLER_AlteracaoDaCondicaoDeErro;
	}

	public String getCodigoDoErro7() {
		return codigoDoErro7;
	}

	public void setCodigoDoErro7(String codigoDoErro7) {
		this.codigoDoErro7 = codigoDoErro7;
	}

	public String getCodigoDoErro8() {
		return codigoDoErro8;
	}

	public void setCodigoDoErro8(String codigoDoErro8) {
		this.codigoDoErro8 = codigoDoErro8;
	}

	public String getCodigoDoErro9() {
		return codigoDoErro9;
	}

	public void setCodigoDoErro9(String codigoDoErro9) {
		this.codigoDoErro9 = codigoDoErro9;
	}

	public String getCodigoDoErro10() {
		return codigoDoErro10;
	}

	public void setCodigoDoErro10(String codigoDoErro10) {
		this.codigoDoErro10 = codigoDoErro10;
	}

	public String getCodigoDoErro11() {
		return codigoDoErro11;
	}

	public void setCodigoDoErro11(String codigoDoErro11) {
		this.codigoDoErro11 = codigoDoErro11;
	}

	public String getCodigoDoErro12() {
		return codigoDoErro12;
	}

	public void setCodigoDoErro12(String codigoDoErro12) {
		this.codigoDoErro12 = codigoDoErro12;
	}

	public String getINIC_InicializacaoDoMedidor() {
		return INIC_InicializacaoDoMedidor;
	}

	public void setINIC_InicializacaoDoMedidor(String iNIC_InicializacaoDoMedidor) {
		INIC_InicializacaoDoMedidor = iNIC_InicializacaoDoMedidor;
	}

	public String getNIMP_InformacaoDoComandoNaoImplementado() {
		return NIMP_InformacaoDoComandoNaoImplementado;
	}

	public void setNIMP_InformacaoDoComandoNaoImplementado(String nIMP_InformacaoDoComandoNaoImplementado) {
		NIMP_InformacaoDoComandoNaoImplementado = nIMP_InformacaoDoComandoNaoImplementado;
	}

	public String getCodigoDoComando1() {
		return codigoDoComando1;
	}

	public void setCodigoDoComando1(String codigoDoComando1) {
		this.codigoDoComando1 = codigoDoComando1;
	}

	public String getCodigoDoComando2() {
		return codigoDoComando2;
	}

	public void setCodigoDoComando2(String codigoDoComando2) {
		this.codigoDoComando2 = codigoDoComando2;
	}

	public String getCodigoDoComando3() {
		return codigoDoComando3;
	}

	public void setCodigoDoComando3(String codigoDoComando3) {
		this.codigoDoComando3 = codigoDoComando3;
	}

	public String getDIGI_DadosDigitadosPeloLeiturista() {
		return DIGI_DadosDigitadosPeloLeiturista;
	}

	public void setDIGI_DadosDigitadosPeloLeiturista(String dIGI_DadosDigitadosPeloLeiturista) {
		DIGI_DadosDigitadosPeloLeiturista = dIGI_DadosDigitadosPeloLeiturista;
	}

	public String getCodigoDaOcorrencia1() {
		return codigoDaOcorrencia1;
	}

	public void setCodigoDaOcorrencia1(String codigoDaOcorrencia1) {
		this.codigoDaOcorrencia1 = codigoDaOcorrencia1;
	}

	public String getCodigoDaOcorrencia2() {
		return codigoDaOcorrencia2;
	}

	public void setCodigoDaOcorrencia2(String codigoDaOcorrencia2) {
		this.codigoDaOcorrencia2 = codigoDaOcorrencia2;
	}

	public String getCodigoDaOcorrencia3() {
		return codigoDaOcorrencia3;
	}

	public void setCodigoDaOcorrencia3(String codigoDaOcorrencia3) {
		this.codigoDaOcorrencia3 = codigoDaOcorrencia3;
	}

	public String getATPR_AvacaoHorarioReservadiOu_DTPR_DesativacaoDoHorarioReservado() {
		return ATPR_AvacaoHorarioReservadiOu_DTPR_DesativacaoDoHorarioReservado;
	}

	public void setATPR_AvacaoHorarioReservadiOu_DTPR_DesativacaoDoHorarioReservado(
			String aTPR_AvacaoHorarioReservadiOu_DTPR_DesativacaoDoHorarioReservado) {
		ATPR_AvacaoHorarioReservadiOu_DTPR_DesativacaoDoHorarioReservado = aTPR_AvacaoHorarioReservadiOu_DTPR_DesativacaoDoHorarioReservado;
	}

	public String getCodigoDaAlteracaoDoMedidor() {
		return codigoDaAlteracaoDoMedidor;
	}

	public void setCodigoDaAlteracaoDoMedidor(String codigoDaAlteracaoDoMedidor) {
		this.codigoDaAlteracaoDoMedidor = codigoDaAlteracaoDoMedidor;
	}

	public String getNumeroDeSerieDaLeitoraQueAlterouOMedidor() {
		return numeroDeSerieDaLeitoraQueAlterouOMedidor;
	}

	public void setNumeroDeSerieDaLeitoraQueAlterouOMedidor(String numeroDeSerieDaLeitoraQueAlterouOMedidor) {
		this.numeroDeSerieDaLeitoraQueAlterouOMedidor = numeroDeSerieDaLeitoraQueAlterouOMedidor;
	}

	public String getHoraDaAlteracao() {
		return horaDaAlteracao;
	}

	public void setHoraDaAlteracao(String horaDaAlteracao) {
		this.horaDaAlteracao = horaDaAlteracao;
	}

	public String getMinutoDaAlteracao() {
		return minutoDaAlteracao;
	}

	public void setMinutoDaAlteracao(String minutoDaAlteracao) {
		this.minutoDaAlteracao = minutoDaAlteracao;
	}

	public String getSegundoDaAlteracao() {
		return segundoDaAlteracao;
	}

	public void setSegundoDaAlteracao(String segundoDaAlteracao) {
		this.segundoDaAlteracao = segundoDaAlteracao;
	}

	public String getDiaDaAlteracao() {
		return diaDaAlteracao;
	}

	public void setDiaDaAlteracao(String diaDaAlteracao) {
		this.diaDaAlteracao = diaDaAlteracao;
	}

	public String getMesDaAlteracao() {
		return mesDaAlteracao;
	}

	public void setMesDaAlteracao(String mesDaAlteracao) {
		this.mesDaAlteracao = mesDaAlteracao;
	}

	public String getAnoDaAlteracao() {
		return anoDaAlteracao;
	}

	public void setAnoDaAlteracao(String anoDaAlteracao) {
		this.anoDaAlteracao = anoDaAlteracao;
	}

	public String getCodigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao1() {
		return codigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao1;
	}

	public void setCodigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao1(
			String codigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao1) {
		this.codigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao1 = codigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao1;
	}

	public String getCodigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao2() {
		return codigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao2;
	}

	public void setCodigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao2(
			String codigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao2) {
		this.codigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao2 = codigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao2;
	}

	public String getCodigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao3() {
		return codigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao3;
	}

	public void setCodigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao3(
			String codigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao3) {
		this.codigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao3 = codigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao3;
	}

	public String getCodigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao4() {
		return codigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao4;
	}

	public void setCodigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao4(
			String codigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao4) {
		this.codigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao4 = codigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao4;
	}

	public String getCodigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao5() {
		return codigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao5;
	}

	public void setCodigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao5(
			String codigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao5) {
		this.codigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao5 = codigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao5;
	}

	public String getCodigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao6() {
		return codigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao6;
	}

	public void setCodigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao6(
			String codigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao6) {
		this.codigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao6 = codigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao6;
	}

	public String getCodigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao7() {
		return codigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao7;
	}

	public void setCodigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao7(
			String codigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao7) {
		this.codigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao7 = codigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao7;
	}

	public String getCodigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao8() {
		return codigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao8;
	}

	public void setCodigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao8(
			String codigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao8) {
		this.codigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao8 = codigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao8;
	}

	public String getCodigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao9() {
		return codigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao9;
	}

	public void setCodigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao9(
			String codigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao9) {
		this.codigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao9 = codigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao9;
	}

	public String getCodigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao10() {
		return codigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao10;
	}

	public void setCodigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao10(
			String codigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao10) {
		this.codigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao10 = codigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao10;
	}

	public String getCodigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao11() {
		return codigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao11;
	}

	public void setCodigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao11(
			String codigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao11) {
		this.codigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao11 = codigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao11;
	}

	public String getCodigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao12() {
		return codigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao12;
	}

	public void setCodigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao12(
			String codigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao12) {
		this.codigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao12 = codigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao12;
	}

	public String getCodigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao13() {
		return codigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao13;
	}

	public void setCodigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao13(
			String codigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao13) {
		this.codigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao13 = codigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao13;
	}

	public String getCodigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao14() {
		return codigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao14;
	}

	public void setCodigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao14(
			String codigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao14) {
		this.codigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao14 = codigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao14;
	}

	public String getCodigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao15() {
		return codigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao15;
	}

	public void setCodigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao15(
			String codigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao15) {
		this.codigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao15 = codigoNumeroDeSerieDoLeitorHoraEDataDaAlteracao15;
	}

	public String getTipoDeTarifa() {
		return tipoDeTarifa;
	}

	public void setTipoDeTarifa(String tipoDeTarifa) {
		this.tipoDeTarifa = tipoDeTarifa;
	}

	public String getDiaDoFimDoHorarioDeInverno() {
		return diaDoFimDoHorarioDeInverno;
	}

	public void setDiaDoFimDoHorarioDeInverno(String diaDoFimDoHorarioDeInverno) {
		this.diaDoFimDoHorarioDeInverno = diaDoFimDoHorarioDeInverno;
	}

	public String getMesDoFimDoHorarioDeInverno() {
		return mesDoFimDoHorarioDeInverno;
	}

	public void setMesDoFimDoHorarioDeInverno(String mesDoFimDoHorarioDeInverno) {
		this.mesDoFimDoHorarioDeInverno = mesDoFimDoHorarioDeInverno;
	}

	public String getDiaDoFimDoHorarioDeVerao() {
		return diaDoFimDoHorarioDeVerao;
	}

	public void setDiaDoFimDoHorarioDeVerao(String diaDoFimDoHorarioDeVerao) {
		this.diaDoFimDoHorarioDeVerao = diaDoFimDoHorarioDeVerao;
	}

	public String getMesDoFimDoHorarioDeVerao() {
		return mesDoFimDoHorarioDeVerao;
	}

	public void setMesDoFimDoHorarioDeVerao(String mesDoFimDoHorarioDeVerao) {
		this.mesDoFimDoHorarioDeVerao = mesDoFimDoHorarioDeVerao;
	}

	public String getDiaDaReposicaoDeDemandaAutomatica() {
		return diaDaReposicaoDeDemandaAutomatica;
	}

	public void setDiaDaReposicaoDeDemandaAutomatica(String diaDaReposicaoDeDemandaAutomatica) {
		this.diaDaReposicaoDeDemandaAutomatica = diaDaReposicaoDeDemandaAutomatica;
	}

	public String getDiaDoInicioDoConjunto1DeSegmentosHorarios1() {
		return diaDoInicioDoConjunto1DeSegmentosHorarios1;
	}

	public void setDiaDoInicioDoConjunto1DeSegmentosHorarios1(String diaDoInicioDoConjunto1DeSegmentosHorarios1) {
		this.diaDoInicioDoConjunto1DeSegmentosHorarios1 = diaDoInicioDoConjunto1DeSegmentosHorarios1;
	}

	public String getMesDoInicioDoConjunto1DeSegmentosHorarios1() {
		return mesDoInicioDoConjunto1DeSegmentosHorarios1;
	}

	public void setMesDoInicioDoConjunto1DeSegmentosHorarios1(String mesDoInicioDoConjunto1DeSegmentosHorarios1) {
		this.mesDoInicioDoConjunto1DeSegmentosHorarios1 = mesDoInicioDoConjunto1DeSegmentosHorarios1;
	}

	public String getDiaDoInicioDoConjunto2DeSegmentosHorarios1() {
		return diaDoInicioDoConjunto2DeSegmentosHorarios1;
	}

	public void setDiaDoInicioDoConjunto2DeSegmentosHorarios1(String diaDoInicioDoConjunto2DeSegmentosHorarios1) {
		this.diaDoInicioDoConjunto2DeSegmentosHorarios1 = diaDoInicioDoConjunto2DeSegmentosHorarios1;
	}

	public String getMesDoInicioDoConjunto2DeSegmentosHorarios1() {
		return mesDoInicioDoConjunto2DeSegmentosHorarios1;
	}

	public void setMesDoInicioDoConjunto2DeSegmentosHorarios1(String mesDoInicioDoConjunto2DeSegmentosHorarios1) {
		this.mesDoInicioDoConjunto2DeSegmentosHorarios1 = mesDoInicioDoConjunto2DeSegmentosHorarios1;
	}

	public String getDiaDoInicioDoConjunto1DeSegmentosHorarios2() {
		return diaDoInicioDoConjunto1DeSegmentosHorarios2;
	}

	public void setDiaDoInicioDoConjunto1DeSegmentosHorarios2(String diaDoInicioDoConjunto1DeSegmentosHorarios2) {
		this.diaDoInicioDoConjunto1DeSegmentosHorarios2 = diaDoInicioDoConjunto1DeSegmentosHorarios2;
	}

	public String getMesDoInicioDoConjunto1DeSegmentosHorarios2() {
		return mesDoInicioDoConjunto1DeSegmentosHorarios2;
	}

	public void setMesDoInicioDoConjunto1DeSegmentosHorarios2(String mesDoInicioDoConjunto1DeSegmentosHorarios2) {
		this.mesDoInicioDoConjunto1DeSegmentosHorarios2 = mesDoInicioDoConjunto1DeSegmentosHorarios2;
	}

	public String getDiaDoInicioDoConjunto2DeSegmentosHorarios2() {
		return diaDoInicioDoConjunto2DeSegmentosHorarios2;
	}

	public void setDiaDoInicioDoConjunto2DeSegmentosHorarios2(String diaDoInicioDoConjunto2DeSegmentosHorarios2) {
		this.diaDoInicioDoConjunto2DeSegmentosHorarios2 = diaDoInicioDoConjunto2DeSegmentosHorarios2;
	}

	public String getMesDoInicioDoConjunto2DeSegmentosHorarios2() {
		return mesDoInicioDoConjunto2DeSegmentosHorarios2;
	}

	public void setMesDoInicioDoConjunto2DeSegmentosHorarios2(String mesDoInicioDoConjunto2DeSegmentosHorarios2) {
		this.mesDoInicioDoConjunto2DeSegmentosHorarios2 = mesDoInicioDoConjunto2DeSegmentosHorarios2;
	}

	public String getHoraDoInicioDoHorarioDePontaDoConjunto2_1() {
		return horaDoInicioDoHorarioDePontaDoConjunto2_1;
	}

	public void setHoraDoInicioDoHorarioDePontaDoConjunto2_1(String horaDoInicioDoHorarioDePontaDoConjunto2_1) {
		this.horaDoInicioDoHorarioDePontaDoConjunto2_1 = horaDoInicioDoHorarioDePontaDoConjunto2_1;
	}

	public String getMinutoDoInicioDoHorarioDePontaDoConjunto2_1() {
		return minutoDoInicioDoHorarioDePontaDoConjunto2_1;
	}

	public void setMinutoDoInicioDoHorarioDePontaDoConjunto2_1(String minutoDoInicioDoHorarioDePontaDoConjunto2_1) {
		this.minutoDoInicioDoHorarioDePontaDoConjunto2_1 = minutoDoInicioDoHorarioDePontaDoConjunto2_1;
	}

	public String getHoraDoInicioDoHorarioDePontaDoConjunto2_2() {
		return horaDoInicioDoHorarioDePontaDoConjunto2_2;
	}

	public void setHoraDoInicioDoHorarioDePontaDoConjunto2_2(String horaDoInicioDoHorarioDePontaDoConjunto2_2) {
		this.horaDoInicioDoHorarioDePontaDoConjunto2_2 = horaDoInicioDoHorarioDePontaDoConjunto2_2;
	}

	public String getMinutoDoInicioDoHorarioDePontaDoConjunto2_2() {
		return minutoDoInicioDoHorarioDePontaDoConjunto2_2;
	}

	public void setMinutoDoInicioDoHorarioDePontaDoConjunto2_2(String minutoDoInicioDoHorarioDePontaDoConjunto2_2) {
		this.minutoDoInicioDoHorarioDePontaDoConjunto2_2 = minutoDoInicioDoHorarioDePontaDoConjunto2_2;
	}

	public String getHoraDoInicioDoHorarioDePontaDoConjunto2_3() {
		return horaDoInicioDoHorarioDePontaDoConjunto2_3;
	}

	public void setHoraDoInicioDoHorarioDePontaDoConjunto2_3(String horaDoInicioDoHorarioDePontaDoConjunto2_3) {
		this.horaDoInicioDoHorarioDePontaDoConjunto2_3 = horaDoInicioDoHorarioDePontaDoConjunto2_3;
	}

	public String getMinutoDoInicioDoHorarioDePontaDoConjunto2_3() {
		return minutoDoInicioDoHorarioDePontaDoConjunto2_3;
	}

	public void setMinutoDoInicioDoHorarioDePontaDoConjunto2_3(String minutoDoInicioDoHorarioDePontaDoConjunto2_3) {
		this.minutoDoInicioDoHorarioDePontaDoConjunto2_3 = minutoDoInicioDoHorarioDePontaDoConjunto2_3;
	}

	public String getHoraDoInicioDoHorarioDePontaDoConjunto2_4() {
		return horaDoInicioDoHorarioDePontaDoConjunto2_4;
	}

	public void setHoraDoInicioDoHorarioDePontaDoConjunto2_4(String horaDoInicioDoHorarioDePontaDoConjunto2_4) {
		this.horaDoInicioDoHorarioDePontaDoConjunto2_4 = horaDoInicioDoHorarioDePontaDoConjunto2_4;
	}

	public String getMinutoDoInicioDoHorarioDePontaDoConjunto() {
		return minutoDoInicioDoHorarioDePontaDoConjunto;
	}

	public void setMinutoDoInicioDoHorarioDePontaDoConjunto(String minutoDoInicioDoHorarioDePontaDoConjunto) {
		this.minutoDoInicioDoHorarioDePontaDoConjunto = minutoDoInicioDoHorarioDePontaDoConjunto;
	}

	public String getHoraDoInicioDoHorarioDeForaPontaDoConjunto2_1() {
		return horaDoInicioDoHorarioDeForaPontaDoConjunto2_1;
	}

	public void setHoraDoInicioDoHorarioDeForaPontaDoConjunto2_1(String horaDoInicioDoHorarioDeForaPontaDoConjunto2_1) {
		this.horaDoInicioDoHorarioDeForaPontaDoConjunto2_1 = horaDoInicioDoHorarioDeForaPontaDoConjunto2_1;
	}

	public String getMinutoDoInicioDoHorarioDeForaPontaDoConjunto2_1() {
		return minutoDoInicioDoHorarioDeForaPontaDoConjunto2_1;
	}

	public void setMinutoDoInicioDoHorarioDeForaPontaDoConjunto2_1(String minutoDoInicioDoHorarioDeForaPontaDoConjunto2_1) {
		this.minutoDoInicioDoHorarioDeForaPontaDoConjunto2_1 = minutoDoInicioDoHorarioDeForaPontaDoConjunto2_1;
	}

	public String getHoraDoInicioDoHorarioDeForaPontaDoConjunto2_2() {
		return horaDoInicioDoHorarioDeForaPontaDoConjunto2_2;
	}

	public void setHoraDoInicioDoHorarioDeForaPontaDoConjunto2_2(String horaDoInicioDoHorarioDeForaPontaDoConjunto2_2) {
		this.horaDoInicioDoHorarioDeForaPontaDoConjunto2_2 = horaDoInicioDoHorarioDeForaPontaDoConjunto2_2;
	}

	public String getMinutoDoInicioDoHorarioDeForaPontaDoConjunto2_2() {
		return minutoDoInicioDoHorarioDeForaPontaDoConjunto2_2;
	}

	public void setMinutoDoInicioDoHorarioDeForaPontaDoConjunto2_2(String minutoDoInicioDoHorarioDeForaPontaDoConjunto2_2) {
		this.minutoDoInicioDoHorarioDeForaPontaDoConjunto2_2 = minutoDoInicioDoHorarioDeForaPontaDoConjunto2_2;
	}

	public String getHoraDoInicioDoHorarioDeForaPontaDoConjunto2_3() {
		return horaDoInicioDoHorarioDeForaPontaDoConjunto2_3;
	}

	public void setHoraDoInicioDoHorarioDeForaPontaDoConjunto2_3(String horaDoInicioDoHorarioDeForaPontaDoConjunto2_3) {
		this.horaDoInicioDoHorarioDeForaPontaDoConjunto2_3 = horaDoInicioDoHorarioDeForaPontaDoConjunto2_3;
	}

	public String getMinutoDoInicioDoHorarioDeForaPontaDoConjunto2_3() {
		return minutoDoInicioDoHorarioDeForaPontaDoConjunto2_3;
	}

	public void setMinutoDoInicioDoHorarioDeForaPontaDoConjunto2_3(String minutoDoInicioDoHorarioDeForaPontaDoConjunto2_3) {
		this.minutoDoInicioDoHorarioDeForaPontaDoConjunto2_3 = minutoDoInicioDoHorarioDeForaPontaDoConjunto2_3;
	}

	public String getHoraDoInicioDoHorarioDeForaPontaDoConjunto2_4() {
		return horaDoInicioDoHorarioDeForaPontaDoConjunto2_4;
	}

	public void setHoraDoInicioDoHorarioDeForaPontaDoConjunto2_4(String horaDoInicioDoHorarioDeForaPontaDoConjunto2_4) {
		this.horaDoInicioDoHorarioDeForaPontaDoConjunto2_4 = horaDoInicioDoHorarioDeForaPontaDoConjunto2_4;
	}

	public String getMinutoDoInicioDoHorarioDeForaPontaDoConjunto2_4() {
		return minutoDoInicioDoHorarioDeForaPontaDoConjunto2_4;
	}

	public void setMinutoDoInicioDoHorarioDeForaPontaDoConjunto2_4(String minutoDoInicioDoHorarioDeForaPontaDoConjunto2_4) {
		this.minutoDoInicioDoHorarioDeForaPontaDoConjunto2_4 = minutoDoInicioDoHorarioDeForaPontaDoConjunto2_4;
	}

	public String getHoraDoInicioDoHorarioReservadoDoConjunto2_1() {
		return horaDoInicioDoHorarioReservadoDoConjunto2_1;
	}

	public void setHoraDoInicioDoHorarioReservadoDoConjunto2_1(String horaDoInicioDoHorarioReservadoDoConjunto2_1) {
		this.horaDoInicioDoHorarioReservadoDoConjunto2_1 = horaDoInicioDoHorarioReservadoDoConjunto2_1;
	}

	public String getMinutoDoInicioDoHorarioReservadoDoConjunto2_1() {
		return minutoDoInicioDoHorarioReservadoDoConjunto2_1;
	}

	public void setMinutoDoInicioDoHorarioReservadoDoConjunto2_1(String minutoDoInicioDoHorarioReservadoDoConjunto2_1) {
		this.minutoDoInicioDoHorarioReservadoDoConjunto2_1 = minutoDoInicioDoHorarioReservadoDoConjunto2_1;
	}

	public String getHoraDoInicioDoHorarioReservadoDoConjunto2_2() {
		return horaDoInicioDoHorarioReservadoDoConjunto2_2;
	}

	public void setHoraDoInicioDoHorarioReservadoDoConjunto2_2(String horaDoInicioDoHorarioReservadoDoConjunto2_2) {
		this.horaDoInicioDoHorarioReservadoDoConjunto2_2 = horaDoInicioDoHorarioReservadoDoConjunto2_2;
	}

	public String getMinutoDoInicioDoHorarioReservadoDoConjunto2_2() {
		return minutoDoInicioDoHorarioReservadoDoConjunto2_2;
	}

	public void setMinutoDoInicioDoHorarioReservadoDoConjunto2_2(String minutoDoInicioDoHorarioReservadoDoConjunto2_2) {
		this.minutoDoInicioDoHorarioReservadoDoConjunto2_2 = minutoDoInicioDoHorarioReservadoDoConjunto2_2;
	}

	public String getHoraDoInicioDoHorarioReservadoDoConjunto2_3() {
		return horaDoInicioDoHorarioReservadoDoConjunto2_3;
	}

	public void setHoraDoInicioDoHorarioReservadoDoConjunto2_3(String horaDoInicioDoHorarioReservadoDoConjunto2_3) {
		this.horaDoInicioDoHorarioReservadoDoConjunto2_3 = horaDoInicioDoHorarioReservadoDoConjunto2_3;
	}

	public String getMinutoDoInicioDoHorarioReservadoDoConjunto2_3() {
		return minutoDoInicioDoHorarioReservadoDoConjunto2_3;
	}

	public void setMinutoDoInicioDoHorarioReservadoDoConjunto2_3(String minutoDoInicioDoHorarioReservadoDoConjunto2_3) {
		this.minutoDoInicioDoHorarioReservadoDoConjunto2_3 = minutoDoInicioDoHorarioReservadoDoConjunto2_3;
	}

	public String getHoraDoInicioDoHorarioReservadoDoConjunto2_4() {
		return horaDoInicioDoHorarioReservadoDoConjunto2_4;
	}

	public void setHoraDoInicioDoHorarioReservadoDoConjunto2_4(String horaDoInicioDoHorarioReservadoDoConjunto2_4) {
		this.horaDoInicioDoHorarioReservadoDoConjunto2_4 = horaDoInicioDoHorarioReservadoDoConjunto2_4;
	}

	public String getMinutoDoInicioDoHorarioReservadoDoConjunto2_4() {
		return minutoDoInicioDoHorarioReservadoDoConjunto2_4;
	}

	public void setMinutoDoInicioDoHorarioReservadoDoConjunto2_4(String minutoDoInicioDoHorarioReservadoDoConjunto2_4) {
		this.minutoDoInicioDoHorarioReservadoDoConjunto2_4 = minutoDoInicioDoHorarioReservadoDoConjunto2_4;
	}

	public String getFormaDeCalculoDaDemanda() {
		return formaDeCalculoDaDemanda;
	}

	public void setFormaDeCalculoDaDemanda(String formaDeCalculoDaDemanda) {
		this.formaDeCalculoDaDemanda = formaDeCalculoDaDemanda;
	}

	public String getModeloDoMedidor() {
		return modeloDoMedidor;
	}

	public void setModeloDoMedidor(String modeloDoMedidor) {
		this.modeloDoMedidor = modeloDoMedidor;
	}

	public String getGrandezaDo1oCanalVisivel() {
		return grandezaDo1oCanalVisivel;
	}

	public void setGrandezaDo1oCanalVisivel(String grandezaDo1oCanalVisivel) {
		this.grandezaDo1oCanalVisivel = grandezaDo1oCanalVisivel;
	}

	public String getGrandezaDo2oCanalVisivel() {
		return grandezaDo2oCanalVisivel;
	}

	public void setGrandezaDo2oCanalVisivel(String grandezaDo2oCanalVisivel) {
		this.grandezaDo2oCanalVisivel = grandezaDo2oCanalVisivel;
	}

	public String getGrandezaDo3oCanalVisivel() {
		return grandezaDo3oCanalVisivel;
	}

	public void setGrandezaDo3oCanalVisivel(String grandezaDo3oCanalVisivel) {
		this.grandezaDo3oCanalVisivel = grandezaDo3oCanalVisivel;
	}

	public String getComposicaoDosCanaisParaCalculoDoFatorDePotencia() {
		return composicaoDosCanaisParaCalculoDoFatorDePotencia;
	}

	public void setComposicaoDosCanaisParaCalculoDoFatorDePotencia(String composicaoDosCanaisParaCalculoDoFatorDePotencia) {
		this.composicaoDosCanaisParaCalculoDoFatorDePotencia = composicaoDosCanaisParaCalculoDoFatorDePotencia;
	}

	public String getMinutosSegundosECentesimosDoIntervaloDaMemoriaDeMassa() {
		return minutosSegundosECentesimosDoIntervaloDaMemoriaDeMassa;
	}

	public void setMinutosSegundosECentesimosDoIntervaloDaMemoriaDeMassa(
			String minutosSegundosECentesimosDoIntervaloDaMemoriaDeMassa) {
		this.minutosSegundosECentesimosDoIntervaloDaMemoriaDeMassa = minutosSegundosECentesimosDoIntervaloDaMemoriaDeMassa;
	}

	public String getSegmentosHorariosDosSabados() {
		return segmentosHorariosDosSabados;
	}

	public void setSegmentosHorariosDosSabados(String segmentosHorariosDosSabados) {
		this.segmentosHorariosDosSabados = segmentosHorariosDosSabados;
	}

	public String getSegmentosHorariosDosDomingos() {
		return segmentosHorariosDosDomingos;
	}

	public void setSegmentosHorariosDosDomingos(String segmentosHorariosDosDomingos) {
		this.segmentosHorariosDosDomingos = segmentosHorariosDosDomingos;
	}

	public String getSegmentosHorariosDosFeriados() {
		return segmentosHorariosDosFeriados;
	}

	public void setSegmentosHorariosDosFeriados(String segmentosHorariosDosFeriados) {
		this.segmentosHorariosDosFeriados = segmentosHorariosDosFeriados;
	}

	public String getIntervaloDeConsumoReativo() {
		return intervaloDeConsumoReativo;
	}

	public void setIntervaloDeConsumoReativo(String intervaloDeConsumoReativo) {
		this.intervaloDeConsumoReativo = intervaloDeConsumoReativo;
	}

	public String getIntervaloDeDemandaReativo() {
		return intervaloDeDemandaReativo;
	}

	public void setIntervaloDeDemandaReativo(String intervaloDeDemandaReativo) {
		this.intervaloDeDemandaReativo = intervaloDeDemandaReativo;
	}

	public String getFatorDePotenciaDeReferenciaIndutivo() {
		return fatorDePotenciaDeReferenciaIndutivo;
	}

	public void setFatorDePotenciaDeReferenciaIndutivo(String fatorDePotenciaDeReferenciaIndutivo) {
		this.fatorDePotenciaDeReferenciaIndutivo = fatorDePotenciaDeReferenciaIndutivo;
	}

	public String getFatorDePotenciaDeReferenciaCapacitivo() {
		return fatorDePotenciaDeReferenciaCapacitivo;
	}

	public void setFatorDePotenciaDeReferenciaCapacitivo(String fatorDePotenciaDeReferenciaCapacitivo) {
		this.fatorDePotenciaDeReferenciaCapacitivo = fatorDePotenciaDeReferenciaCapacitivo;
	}

	public String getHoraDeInicioDoHorarioReativoIndutivo1() {
		return horaDeInicioDoHorarioReativoIndutivo1;
	}

	public void setHoraDeInicioDoHorarioReativoIndutivo1(String horaDeInicioDoHorarioReativoIndutivo1) {
		this.horaDeInicioDoHorarioReativoIndutivo1 = horaDeInicioDoHorarioReativoIndutivo1;
	}

	public String getMinutoDeInicioDoHorarioReativoIndutivo1() {
		return minutoDeInicioDoHorarioReativoIndutivo1;
	}

	public void setMinutoDeInicioDoHorarioReativoIndutivo1(String minutoDeInicioDoHorarioReativoIndutivo1) {
		this.minutoDeInicioDoHorarioReativoIndutivo1 = minutoDeInicioDoHorarioReativoIndutivo1;
	}

	public String getHoraDeInicioDoHorarioReativoIndutivo2() {
		return horaDeInicioDoHorarioReativoIndutivo2;
	}

	public void setHoraDeInicioDoHorarioReativoIndutivo2(String horaDeInicioDoHorarioReativoIndutivo2) {
		this.horaDeInicioDoHorarioReativoIndutivo2 = horaDeInicioDoHorarioReativoIndutivo2;
	}

	public String getMinutoDeInicioDoHorarioReativoIndutivo2() {
		return minutoDeInicioDoHorarioReativoIndutivo2;
	}

	public void setMinutoDeInicioDoHorarioReativoIndutivo2(String minutoDeInicioDoHorarioReativoIndutivo2) {
		this.minutoDeInicioDoHorarioReativoIndutivo2 = minutoDeInicioDoHorarioReativoIndutivo2;
	}

	public String getHoraDeInicioDoHorarioReativoCapacitivo3() {
		return horaDeInicioDoHorarioReativoCapacitivo3;
	}

	public void setHoraDeInicioDoHorarioReativoCapacitivo3(String horaDeInicioDoHorarioReativoCapacitivo3) {
		this.horaDeInicioDoHorarioReativoCapacitivo3 = horaDeInicioDoHorarioReativoCapacitivo3;
	}

	public String getMinutoDeInicioDoHorarioReativoCapacitivo3() {
		return minutoDeInicioDoHorarioReativoCapacitivo3;
	}

	public void setMinutoDeInicioDoHorarioReativoCapacitivo3(String minutoDeInicioDoHorarioReativoCapacitivo3) {
		this.minutoDeInicioDoHorarioReativoCapacitivo3 = minutoDeInicioDoHorarioReativoCapacitivo3;
	}

	public String getHoraDeInicioDoHorarioReativoCapacitivo4() {
		return horaDeInicioDoHorarioReativoCapacitivo4;
	}

	public void setHoraDeInicioDoHorarioReativoCapacitivo4(String horaDeInicioDoHorarioReativoCapacitivo4) {
		this.horaDeInicioDoHorarioReativoCapacitivo4 = horaDeInicioDoHorarioReativoCapacitivo4;
	}

	public String getMinutoDeInicioDoHorarioReativoCapacitivo4() {
		return minutoDeInicioDoHorarioReativoCapacitivo4;
	}

	public void setMinutoDeInicioDoHorarioReativoCapacitivo4(String minutoDeInicioDoHorarioReativoCapacitivo4) {
		this.minutoDeInicioDoHorarioReativoCapacitivo4 = minutoDeInicioDoHorarioReativoCapacitivo4;
	}

	public String getHoraDeInicioDoHorarioReativoIndutivoDoConjunto2_1() {
		return horaDeInicioDoHorarioReativoIndutivoDoConjunto2_1;
	}

	public void setHoraDeInicioDoHorarioReativoIndutivoDoConjunto2_1(
			String horaDeInicioDoHorarioReativoIndutivoDoConjunto2_1) {
		this.horaDeInicioDoHorarioReativoIndutivoDoConjunto2_1 = horaDeInicioDoHorarioReativoIndutivoDoConjunto2_1;
	}

	public String getMinutoDeInicioDoHorarioReativoIndutivoDoConjunto2_1() {
		return minutoDeInicioDoHorarioReativoIndutivoDoConjunto2_1;
	}

	public void setMinutoDeInicioDoHorarioReativoIndutivoDoConjunto2_1(
			String minutoDeInicioDoHorarioReativoIndutivoDoConjunto2_1) {
		this.minutoDeInicioDoHorarioReativoIndutivoDoConjunto2_1 = minutoDeInicioDoHorarioReativoIndutivoDoConjunto2_1;
	}

	public String getHoraDeInicioDoHorarioReativoIndutivoDoConjunto2_2() {
		return horaDeInicioDoHorarioReativoIndutivoDoConjunto2_2;
	}

	public void setHoraDeInicioDoHorarioReativoIndutivoDoConjunto2_2(
			String horaDeInicioDoHorarioReativoIndutivoDoConjunto2_2) {
		this.horaDeInicioDoHorarioReativoIndutivoDoConjunto2_2 = horaDeInicioDoHorarioReativoIndutivoDoConjunto2_2;
	}

	public String getMinutoDeInicioDoHorarioReativoIndutivoDoConjunto2_2() {
		return minutoDeInicioDoHorarioReativoIndutivoDoConjunto2_2;
	}

	public void setMinutoDeInicioDoHorarioReativoIndutivoDoConjunto2_2(
			String minutoDeInicioDoHorarioReativoIndutivoDoConjunto2_2) {
		this.minutoDeInicioDoHorarioReativoIndutivoDoConjunto2_2 = minutoDeInicioDoHorarioReativoIndutivoDoConjunto2_2;
	}

	public String getHoraDeInicioDoHorarioReativoCapacitivoDoConjunto2_1() {
		return horaDeInicioDoHorarioReativoCapacitivoDoConjunto2_1;
	}

	public void setHoraDeInicioDoHorarioReativoCapacitivoDoConjunto2_1(
			String horaDeInicioDoHorarioReativoCapacitivoDoConjunto2_1) {
		this.horaDeInicioDoHorarioReativoCapacitivoDoConjunto2_1 = horaDeInicioDoHorarioReativoCapacitivoDoConjunto2_1;
	}

	public String getMinutoDeInicioDoHorarioReativoCapacitivoDoConjunto2_1() {
		return minutoDeInicioDoHorarioReativoCapacitivoDoConjunto2_1;
	}

	public void setMinutoDeInicioDoHorarioReativoCapacitivoDoConjunto2_1(
			String minutoDeInicioDoHorarioReativoCapacitivoDoConjunto2_1) {
		this.minutoDeInicioDoHorarioReativoCapacitivoDoConjunto2_1 = minutoDeInicioDoHorarioReativoCapacitivoDoConjunto2_1;
	}

	public String getHoraDeInicioDoHorarioReativoCapacitivoDoConjunto2_2() {
		return horaDeInicioDoHorarioReativoCapacitivoDoConjunto2_2;
	}

	public void setHoraDeInicioDoHorarioReativoCapacitivoDoConjunto2_2(
			String horaDeInicioDoHorarioReativoCapacitivoDoConjunto2_2) {
		this.horaDeInicioDoHorarioReativoCapacitivoDoConjunto2_2 = horaDeInicioDoHorarioReativoCapacitivoDoConjunto2_2;
	}

	public String getMinutoDeInicioDoHorarioReativoCapacitivoDoConjunto2_2() {
		return minutoDeInicioDoHorarioReativoCapacitivoDoConjunto2_2;
	}

	public void setMinutoDeInicioDoHorarioReativoCapacitivoDoConjunto2_2(
			String minutoDeInicioDoHorarioReativoCapacitivoDoConjunto2_2) {
		this.minutoDeInicioDoHorarioReativoCapacitivoDoConjunto2_2 = minutoDeInicioDoHorarioReativoCapacitivoDoConjunto2_2;
	}

	public String getSegmentosReativosAtivosDiasUteis() {
		return segmentosReativosAtivosDiasUteis;
	}

	public void setSegmentosReativosAtivosDiasUteis(String segmentosReativosAtivosDiasUteis) {
		this.segmentosReativosAtivosDiasUteis = segmentosReativosAtivosDiasUteis;
	}

	public String getSegmentosReativosAtivosSabados() {
		return segmentosReativosAtivosSabados;
	}

	public void setSegmentosReativosAtivosSabados(String segmentosReativosAtivosSabados) {
		this.segmentosReativosAtivosSabados = segmentosReativosAtivosSabados;
	}

	public String getSegmentosReativosAtivosDomingos() {
		return segmentosReativosAtivosDomingos;
	}

	public void setSegmentosReativosAtivosDomingos(String segmentosReativosAtivosDomingos) {
		this.segmentosReativosAtivosDomingos = segmentosReativosAtivosDomingos;
	}

	public String getSegmentosReativosAtivosFeriados() {
		return segmentosReativosAtivosFeriados;
	}

	public void setSegmentosReativosAtivosFeriados(String segmentosReativosAtivosFeriados) {
		this.segmentosReativosAtivosFeriados = segmentosReativosAtivosFeriados;
	}

	public String getCondicaoDaSerialDoConsumidorEstendida() {
		return condicaoDaSerialDoConsumidorEstendida;
	}

	public void setCondicaoDaSerialDoConsumidorEstendida(String condicaoDaSerialDoConsumidorEstendida) {
		this.condicaoDaSerialDoConsumidorEstendida = condicaoDaSerialDoConsumidorEstendida;
	}

	public String getCodigoDaInstalacao() {
		return codigoDaInstalacao;
	}

	public void setCodigoDaInstalacao(String codigoDaInstalacao) {
		this.codigoDaInstalacao = codigoDaInstalacao;
	}

	public String getNaoUtilizados() {
		return naoUtilizados;
	}

	public void setNaoUtilizados(String naoUtilizados) {
		this.naoUtilizados = naoUtilizados;
	}

	public Set<Leitura> getLeituras() {
		return leituras;
	}

}
