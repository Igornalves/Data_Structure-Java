package CollectionsEmJava.List;

public class ArrayBidirecional {
    public static void main(String[] args) {
        
        String[][] nomes = {{"joao","matheus", "Felipe", "thiago"},{"junior", "henrique", "arthur","jose"}};

        imprimindoArrayBidimencional(nomes);

        System.out.println("\n");

        String[][] sobreNomes = new String[5][5];

        sobreNomes[0][0] = "Andre";
        sobreNomes[0][1] = "Luana";
        sobreNomes[0][2] = "Ingrid";
        sobreNomes[0][3] = "Kevin";
        sobreNomes[0][4] = "Diana";
        
        sobreNomes[1][0] = "kawã";
        sobreNomes[1][1] = "Pricila";
        sobreNomes[1][2] = "Jamile";
        sobreNomes[1][3] = "Cássia";
        sobreNomes[1][4] = "Lívia";
        
        sobreNomes[2][0] = "Daniele";
        sobreNomes[2][1] = "Eduarda";
        sobreNomes[2][2] = "Manuela";
        sobreNomes[2][3] = "Adrielly";
        sobreNomes[2][4] = "Thais";

        sobreNomes[3][0] = "Gabriela";
        sobreNomes[3][1] = "Beatriz";
        sobreNomes[3][2] = "Lorrany";
        sobreNomes[3][3] = "Renata";
        sobreNomes[3][4] = "Suzana";

        sobreNomes[4][0] = "ronaldo";
        sobreNomes[4][1] = "Leticia";
        sobreNomes[4][2] = "Daniel";
        sobreNomes[4][3] = "Maysa";
        sobreNomes[4][4] = "Grazielly";
        
        imprimindoArrayBidimencional(sobreNomes);
        
        System.out.println("\n");
    }

    private static void imprimindoArrayBidimencional(String[][] arrayBi){
        for(int j = 0; j < arrayBi.length ; j++){
            System.out.println("\n");
            for(int d = 0; d < arrayBi[j].length; d++){
                System.out.println(j + " " + arrayBi[j][d] + "\n");
            }
        }
    }
}
