package Projeto;

public class ValidaCpf {
    
    public static boolean VerficaCpf( String cpf){

        cpf = cpf.replace(".", "").replace("-", "");
        
        if (cpf.length() != 11) {
            return false;
        }

        if ( cpf.equals("00000000000") || cpf.equalsIgnoreCase("1111111111")|| cpf.equals("222222222")|| 
        cpf.equals("333333333")|| cpf.equals("44444444") || cpf.equals("555555555") || cpf.equals("666666666") || cpf.equals("777777777")
        || cpf.equals("888888888") || cpf.equals("999999999")){
            return false;
        }

        return true;
    }

    public static boolean ValidaNumber(String cpf){
        int [] digitos = new int[11];

        for( int i=0; i<11; i++){
            digitos[i]= Character.getNumericValue(i);
        }

        int soma= 0;
        for( int i =0; i<9; i++){
            soma= digitos[i] * (10-i);
        }

        int primeiroDigito = 11 - (soma%11);

        if( primeiroDigito == 10 || primeiroDigito ==11){
            primeiroDigito = 0;
        }
        if( primeiroDigito != digitos[9]){
            return false;
        }

        for( int i=0; i<10; i++){
            soma = digitos[i] * ( 11-i);
        }

        int segundoDigito = 11- (soma %11);

        if( primeiroDigito == 10 || primeiroDigito ==11){
            primeiroDigito = 0;
        }

        return segundoDigito == digitos[10];
    }
}

/*
public class ValidaCpf {

    public static boolean VerificaCpf(String cpf) {
        cpf = cpf.replace(".", "").replace("-", "");

        if (cpf.length() != 11) {
            return false;
        }

        if (cpf.matches("^(\\d)\\1*$")) {
            return false;
        }

        int[] digitos = new int[11];

        for (int i = 0; i < 11; i++) {
            digitos[i] = Character.getNumericValue(cpf.charAt(i));
        }

        int primeiroDigito = calcularDigitoVerificador(digitos, 9);
        int segundoDigito = calcularDigitoVerificador(digitos, 10);

        return primeiroDigito == digitos[9] && segundoDigito == digitos[10];
    }

    private static int calcularDigitoVerificador(int[] digitos, int posicao) {
        int soma = 0;
        int peso = posicao + 1;

        for (int i = 0; i < posicao; i++) {
            soma += digitos[i] * peso;
            peso--;
        }

        int resto = soma % 11;
        if (resto < 2) {
            return 0;
        } else {
            return 11 - resto;
        }
    }
}
 */
