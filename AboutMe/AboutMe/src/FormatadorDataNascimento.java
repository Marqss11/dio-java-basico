public class FormatadorDataNascimento {
    public static void main(String[] args) {
        String dataNascimentoFormated;
        try {
            dataNascimentoFormated = formatarDataNascimento("28042004");
            System.out.println(dataNascimentoFormated);
        } catch (DataNascimentoException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    static String formatarDataNascimento(String dataNascimento) throws DataNascimentoException{
        if(dataNascimento.length() != 8)
          throw new DataNascimentoException();
        
          //simulando um cep formatado
          return "28/04/2004";
    }
}
