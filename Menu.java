import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    private Scanner scString = new Scanner(System.in);
    private Scanner sc = new Scanner(System.in);
    private ArrayList<Planta> plantas = new ArrayList<>();

    public Menu(){
        
        int opcao = 0;
        do{
            System.out.println("\n**************************************");
            System.out.println("            -- JARDIM -- ");
            System.out.println("**************************************");
            System.out.println("1. Adicionar Planta");
            System.out.println("2. Informações das Plantas");
            System.out.println("3. Informações de Plantas Especifica");
            System.out.println("4. Regar Planta");
            System.out.println("5. Adubar Planta");
            System.out.println("6. Colocar Planta no Sol");
            System.out.println("7. Remover Planta");
            System.out.println("8. Sair do Jardim");
            System.out.println("**************************************");
            opcao = sc.nextInt();
            System.out.println("**************************************");

            switch (opcao) {
                case 1:
                    adicionarPlanta();
                    break;
                case 2:
                    if(plantas.isEmpty()){
                        System.out.println("\nNão há plantas no jardim!");
                    } else{
                        exibirPlantas();
                    }
                    break;
                case 3:
                    if(plantas.isEmpty()){
                        System.out.println("\nNão há plantas no jardim!");
                    } else{
                        System.out.println("\nDigite o nome da planta que deseja ver: ");
                        String plantaPesquisar = scString.nextLine();
                        exibirPlantaE(plantaPesquisar);
                    }
                    break;
                case 4:
                    if(plantas.isEmpty()){
                        System.out.println("\nNão há plantas no jardim!");
                    } else{
                        System.out.println("\nDigite o nome da planta que deseja regar: ");
                        String plantaPesquisar2 = scString.nextLine();
                        regarPlanta(plantaPesquisar2);
                    }
                    break;
                case 5:
                    if(plantas.isEmpty()){
                        System.out.println("\nNão há plantas no jardim!");
                    } else{
                        System.out.println("\nDigite o nome da planta que deseja adubar: ");
                        String plantaPesquisar3 = scString.nextLine();
                        adubarPlanta(plantaPesquisar3);
                    }
                    break;
                case 6:
                    if(plantas.isEmpty()){
                        System.out.println("\nNão há plantas no jardim!");
                    } else{
                        System.out.println("\nDigite o nome da planta que deseja adubar: ");
                        String plantaPesquisar4 = scString.nextLine();
                        colocarPlantaNoSol(plantaPesquisar4);
                    }
                    break;
                case 7:
                    if(plantas.isEmpty()){
                        System.out.println("\nNão há plantas no jardim!");
                    } else{
                        System.out.println("\nDigite o nome da planta que deseja remover: ");
                        String plantaPesquisar5 = scString.nextLine();
                        removerPlanta(plantaPesquisar5);
                    }
                    break;                          
                case 8:
                    System.out.println("\nSaindo do jardim...");
                    System.out.println("Tcahu, plantinahs!");
                    break;
                default:
                    System.out.println("\nOPÇÃO INVÁLIDA");
                    break;
            } 
        }while(opcao != 8);
    }


    private void adicionarPlanta() {
        Planta plantaAux = new Planta();
        plantas.add(plantaAux);
    }


    private void exibirPlantas() {
        for (int i = 0; i < plantas.size(); i++) {
            System.out.println("\nPANTAS NO JARDIM: ");
            plantas.get(i).exibir();
        }
    }


    private void exibirPlantaE(String nomePlanta) {
        for (int i = 0; i < plantas.size(); i++) {
            if (plantas.get(i).getNome().equalsIgnoreCase(nomePlanta)) {
                plantas.get(i).exibir();
            }
        }
    }


    private void regarPlanta(String nomePlanta) {
        for (int i = 0; i < plantas.size(); i++) {
            if(plantas.get(i).getNome().equalsIgnoreCase(nomePlanta)){
                if(plantas.get(i).getRegada() == false){
                    plantas.get(i).setRegada();
                    System.out.println("\nA planta foi regada");
                } else{
                    System.out.println("\nA planta já foi regada");
                }  
                plantas.get(i).crescer();
            }
        }
    }


    private void adubarPlanta(String nomePlanta) {
        for (int i = 0; i < plantas.size(); i++) {
            if(plantas.get(i).getNome().equalsIgnoreCase(nomePlanta)){
                if(plantas.get(i).getAdubada() == false){
                    plantas.get(i).setAdubada();
                    System.out.println("\nA planta foi adubada");
                } else{
                    System.out.println("\nA planta já foi adubada");
                }
                plantas.get(i).crescer();
            }
        }
    }


    private void colocarPlantaNoSol(String nomePlanta) {
        for (int i = 0; i < plantas.size(); i++) {
            if(plantas.get(i).getNome().equalsIgnoreCase(nomePlanta)){
                if(plantas.get(i).getNoSol() == false){
                    plantas.get(i).setNoSol();
                    System.out.println("\nA planta foi colocada no sol");
                } else{
                    System.out.println("\nA planta já foi colocada no sol");
                }
                plantas.get(i).crescer();
            }
        }
    }


    private void removerPlanta(String nomePlanta) {
        for (int i = 0; i < plantas.size(); i++) {
            if(plantas.get(i).getNome().equalsIgnoreCase(nomePlanta)){
                plantas.remove(i);
                System.out.println("\nA planta foi removida do jardim!");
            }
        }
    }

}