//tre imput nome utente, password, IDutente; controllare 
//controllare questi tre valori con uno stamp e un blocco

import java.util.Scanner;

public class Esercizio1{
    
    String nomeUtente;
    String password;
    int IDutente;



    public Esercizio1(){

    }


    public static void main(String[] args) {
        Scanner scan=new Scanner( System.in);
        Scanner scanInt = new Scanner(System.in);
       ;

        int IDutente=1;
        //prende in input 5 persone e dice se sono maggiorenni o minorenni e se la password è breve o meno

        while(IDutente<=5){
            IDutente++;
            System.out.println("inserisci il nome utente: ");
        String userName=scan.nextLine();

        System.out.println("inserisci la password utente: ");
        String password =scan.nextLine();
        if(password.length()<3){
            System.out.println("la password e troppo breve");
        }
        System.out.println("l'utente "+userName+ "inserisca l'eta");
        int eta= scanInt.nextInt();
        
        if(eta<18){
            System.out.println("l'utente deve essere maggiorenne");
        }else{System.out.println("l'utente e maggiorenne");}



        }

       
    }
}