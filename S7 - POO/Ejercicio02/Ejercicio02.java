import javax.swing.*;

public class Ejercicio02 {
    public static void main (String [] args){
        //Continuar, 0 = SI y 1 = NO
        int continuar = 0;
        do{
            String paisA = JOptionPane.showInputDialog("Ejéricto 1:");
            String paisB = JOptionPane.showInputDialog("Ejéricto 2:");
            //Rondas enre 5 y 20
            int nroRondas = (int)(Math.random() * 16 + 5);
            //[0] para puntaje A y [1] para puntaje B
            int [] puntajes = new int [2]; 
            
            JOptionPane.showMessageDialog(null, "Países:\n" 
                                            + paisA + " vs " + paisB + 
                                            "\nRondas: " + nroRondas);
            for(int i = 1; i <= nroRondas; i++){
                batallaSoldados(paisA, paisB, puntajes, i);
            }
            verifyWinner(paisA, paisB, puntajes);
            //Continuar, 0 = SI y 1 = NO
            continuar = JOptionPane.showConfirmDialog(null, "¿NUEVA PARTIDA?",
                                                     "FIN DEL JUEGO", 0);
        } while(continuar == 0);
    }

    public static Soldado generarSoldado(){
        int tipoSoldado = (int)(Math.random() * 3);
        //0 = Arquero
        if(tipoSoldado == 0){
            return new Arquero();
        }
        //1 = Espadachin
        if(tipoSoldado == 1){
            return new Espadachin();
        }
        //2 = Caballero
        return new Caballero();
    }
    public static void batallaSoldados(String paisA, String paisB, 
                                        int [] puntajes, int nroRonda){
        Soldado soldadoPaisA = generarSoldado();
        Soldado soldadoPaisB = generarSoldado();
        String winnerPais = "";
        if(soldadoPaisA.getVida() == soldadoPaisB.getVida()){
            int winnerInt = (int)(Math.random());
            //Si sale 0 gana A, si sale 1 gana B (50%)
            if(winnerInt == 0){
                puntajes[0]++;
                winnerPais = paisA;
            }
            else{
                puntajes[1]++;
                winnerPais = paisB;
            }
        }
        else{
            int winnerInt = (int)(Math.random() * 3);
            //Si soldado A tiene más vida que B
            if(soldadoPaisA.getVida() > soldadoPaisB.getVida()){
                //Si sale 0 o 1 gana A, si sale 2 gana B(66% - 33%)
                if(winnerInt == 0 || winnerInt == 1){
                    puntajes[0]++;
                    winnerPais = paisA;
                }
                else{
                    puntajes[1]++;
                    winnerPais = paisB;
                }
            }
            //Si soldado B tiene más vida que A
            if(soldadoPaisA.getVida() < soldadoPaisB.getVida()){
                //Si sale 0 o 1 gana B, si sale 2 gana A(66% - 33%)
                if(winnerInt == 0 || winnerInt == 1){
                    puntajes[1]++;
                    winnerPais = paisB;
                }
                else{
                    puntajes[0]++;
                    winnerPais = paisA;
                }
            }
        }
        String versusMessage = paisA + " vs " + paisB + "\n"
                               + soldadoPaisA + " vs " + soldadoPaisB 
                               + "\nGanador: " + winnerPais;
                               
        JOptionPane.showMessageDialog(null, versusMessage
                                      , "Ronda " + nroRonda, 1);
        System.out.println(puntajes[0] + "   " + puntajes[1]);
    }
    public static void verifyWinner(String paisA, String paisB, int [] puntajes){
        String winner = "";
        if(puntajes[0] == puntajes[1]){
            winner = "Empate";
        }
        else{
            if(puntajes[0] < puntajes[1]){
                winner = "Gana " + paisB;
            }
            else{
                winner = "Gana " + paisA;
            }
        }
        JOptionPane.showMessageDialog(null, "Resultado Final: " + winner);
    }
}
