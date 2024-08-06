import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;


public class string {

    public static void main(String[] args){

        // String texto
        // "olá,{nome}. hoje é {dia-da-semana}, clima

        String nome;
        nome = "Ana Isabelly";

        //ISO 8601

        LocalDate hoje = LocalDate.now();
        Locale brasil = new Locale("pt", "BR");
        System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL,brasil) );
        String diaDaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL,brasil);
        String saudacao;
        LocalDateTime agora = LocalDateTime.now();

        if (agora.getHour() >= 0 && agora.getHour() < 12) {
            saudacao = "Bom dia";
        } else if (agora.getHour() >=12 && agora.getHour() < 18){
            saudacao = "Boa tarde";
        }else if (agora.getHour() >=18 && agora.getHour() < 24) {
            saudacao = "Boa noite";
        }else {
            saudacao = "ola";
        }

        //"olá,{nome}. hoje é {dia-da-semana}, clima

        System.out.printf("ola, %s. Hoje é %s, %s.%n", nome, diaDaSemana, saudacao.toUpperCase());





    }
}
