package packMain;
import java.time.LocalTime;

public class Relogio {
	private byte hora;
	private byte minuto;
	private byte segundo;
	
	public byte getHora() {
		return hora;
	}
	public void setHora(byte hora) {
		this.hora = hora;
	}
	
	public byte getMinuto() {
		return minuto;
	}
	public void setMinuto(byte minuto) {
		this.minuto = minuto;
	}
	
	public byte getSegundo() {
		return segundo;
	}
	public void setSegundo(byte segundo) {
		this.segundo = segundo;
	}
	
	
	public void reiniciaMeiaNoite() {
		this.hora= 00;
		this.minuto= 00;
		this.segundo=00;
	}
	
	public void programaHoraMinSeg(byte horas, byte minutos, byte segundos) {
        this.hora = horas;
        this.minuto = minutos;
        this.segundo = segundos;
    }
	
	public int cronometro(byte horaInicio, byte minutoInicio, byte segundoInicio, byte horaFim, byte minutoFim, byte segundoFim) {
		int segundosTotais;
		//assumindo que pode se passar muito tempo mas nao mais que 1 dia e que o tempo final passado sempre ocorre depois do inicial
		if(horaFim<horaInicio) {
			horaFim += 24-horaInicio;
		}
		
		segundosTotais= (horaFim*3600+minutoFim*60+segundoFim)-(horaInicio*3600+minutoInicio*60+segundoInicio);
		return segundosTotais;
	}
	
	public String imprimeHoraAM() {
		byte horaEmAM = this.hora;
		if(this.hora>12)
			horaEmAM = (byte) (this.hora%12);
		return String.format("%02d:%02d:%02d", horaEmAM, this.minuto, this.segundo);
	}
	
	public String imprimeHora24h() {
		return String.format("%02d:%02d:%02d", this.hora, this.minuto, this.segundo);
	}
	
	public void atualizaHora() {
		LocalTime horaAtual = LocalTime.now();
		this.programaHoraMinSeg((byte)horaAtual.getHour() , (byte)horaAtual.getMinute(), (byte)horaAtual.getSecond());
	}
}
