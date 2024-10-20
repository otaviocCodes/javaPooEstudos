package data_hora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DataHora {
	public static void main(String[] args) {
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		//data
		LocalDate data1 = LocalDate.now();
		LocalDateTime data2 = LocalDateTime.now();
		Instant data3 = Instant.now();
		
		//data em string;
		LocalDate data4 = LocalDate.parse("2022-07-20");
		LocalDateTime data5 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant data6 = Instant.parse("2022-07-20T01:30:26Z");
		Instant data7 = Instant.parse("2022-07-20T01:30:26-03:00");
		
		//data com formatação;
		LocalDate data8 = LocalDate.parse("20/07/2022", fmt1);
		LocalDateTime data9 = LocalDateTime.parse("20/07/2022 01:20", fmt2);
		
		//data com o ".of";
		LocalDate data10 = LocalDate.of(2012, 04, 22);
		LocalDateTime data11 = LocalDateTime.of(2022, 12, 22, 22, 55);
		
		//transformando data global para local;
		LocalDateTime r1 = LocalDateTime.ofInstant(data6, ZoneId.systemDefault());
		LocalDateTime r2 = LocalDateTime.ofInstant(data6, ZoneId.of("Portugal"));
		
		System.out.println("data 1: "  + data1);
		System.out.println("data 2: "  + data2);
		System.out.println("data 3: "  + data3);
		System.out.println("data 4: "  + data4);
		System.out.println("data 5: "  + data5);
		System.out.println("data 6: "  + data6);
		System.out.println("data 7: "  + data7);
		System.out.println("data 8: "  + data8);
		System.out.println("data 9: "  + data9);
		System.out.println("data 10: " + data10);
		System.out.println("data 11: " + data11);
		System.out.println("r1: " + r1);
		System.out.println("r2: " + r2);
		
		//pegando valores das datas;
		System.out.println("data4 dia: " + data4.getDayOfMonth());
		System.out.println("data4 dia: " + data4.getMonthValue());
		System.out.println("data4 dia: " + data4.getYear());
		
		System.out.println("data5 hora: " + data5.getHour());
		
		//alterando valores das datas, sem alterar o objeto;
		LocalDateTime pastWeekLocalDateTime = data5.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = data5.plusDays(7);
		
		System.out.println("pastWeekLocalDateTime: " + pastWeekLocalDateTime);
		System.out.println("nextWeekLocalDateTime: " + nextWeekLocalDateTime);
		
		Instant pastWeekInstant = data6.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = data6.plus(7, ChronoUnit.DAYS);
		
		System.out.println("pastWeekInstant: " + pastWeekInstant);
		System.out.println("nextWeekInstant: " + nextWeekInstant);
		
		LocalDate pastWeekLocalDate= data4.minusDays(7);

		//between para duração entre as datas
		Duration t1 = Duration.between(pastWeekLocalDateTime, data5);
		Duration t2 = Duration.between(pastWeekLocalDate.atStartOfDay(), data4.atStartOfDay());
		Duration t3 = Duration.between(pastWeekInstant, data6);
		Duration t4 = Duration.between(data6, pastWeekInstant);
		
		System.out.println("t1 dias: " + t1.toDays());
		System.out.println("t2 dias: " + t2.toDays());
		System.out.println("t3 dias: " + t3.toDays());
		System.out.println("t4 dias: " + t4.toDays());
		
	}
}