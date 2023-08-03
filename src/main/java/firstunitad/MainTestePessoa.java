package firstunitad;
import java.util.Scanner;


public class MainTestePessoa{
    public static void main(String[] args){
        Scanner leitor = new Scanner (System.in);
        String name = leitor.nextLine();
        int age = Integer.parseInt(leitor.nextLine());
        String cpf = leitor.nextLine();
        Pessoa seiLa =  new Pessoa();
        seiLa.setName(name);seiLa.setAge(age);seiLa.setCpf(cpf);
        if(seiLa.adult()){
            System.out.println("É de maior!");
        }
        else{
            System.out.println("É de menor!");
        }
        System.out.println(seiLa);
        leitor.close();
    }
}
