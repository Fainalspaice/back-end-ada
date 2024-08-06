public class operadors {
        public static void main(String[] args) {



            // operadores booleanos

            Boolean resultado = false;

            boolean fimDeSemana = true;
            boolean fazendoSol = true;
            boolean vamosAPraia =  fimDeSemana ||  fazendoSol;
            System.out.println(vamosAPraia);

            // teste

            String mensagem = fimDeSemana ? "é fim de semana" : "não e fim de semana";

            System.out.println(mensagem);






        }
}
