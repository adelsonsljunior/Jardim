import java.util.Scanner;

public class Planta {

    private String nome, especie;
    private float altura;
    private boolean regada, adubada, noSol;

    private Scanner sc = new Scanner(System.in);
    
    public Planta(){
        System.out.println("\n -- Adicionar Planta --\n");
        System.out.println("Nome: ");
        nome = sc.nextLine();
        System.out.println("Espécie: ");
        especie = sc.nextLine();
        System.out.println("Altura, em metros: ");
        altura = sc.nextFloat();
        regada = false;
        adubada = false;
        noSol = false;
    }


    public void exibir() {
        System.out.println("\n -- Informações da Planta --\n");
        System.out.println("Nome: " + nome);
        System.out.println("Espécie: " + especie);
        System.out.println("Altura, em metros: " + altura);
        System.out.println("A planta está regada: " + regada);
        System.out.println("A planta está adubada: " + adubada);
        System.out.println("A planta está no sol: " + noSol);
    }


    public String getNome() {
        return nome;
    }


    public boolean getRegada() {
        return regada;
    }


    public boolean getAdubada() {
        return adubada;
    }


    public boolean getNoSol() {
        return noSol;
    }


    public void setRegada() {
        this.regada = true;
    }


    public void setAdubada() {
        this.adubada = true;
    }


    public void setNoSol() {
        this.noSol = true;
    }


    public void crescer() {
        if ((this.regada == true) && (this.adubada == true) && (this.noSol == true)) {
            this.altura += 0.20;
            this.regada = false; 
            this.adubada = false; 
            this.noSol = false;
            System.out.println("\n" + this.nome + " cresceu 20 cm e agora está com " + this.altura + " cm.");
        }
        
    }

}
