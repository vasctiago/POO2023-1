package firstunitad;

public class Pessoa{
    private String name;
    private int age;
    private String cpf;

    public Pessoa(String name, int age, String cpf){
        this.name = name;
        this.age = age;
        this.cpf = cpf;
    }
    public Pessoa(){
        this("",0,"");
    }
    public boolean adult(){
        if(this.age>=18){
            return true;
        }
            return false;
    }
 
    public boolean cpfTrue(String cpf){
        if(this.cpf.equals(cpf)){
            return true;
        }
        return false;
    }

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getCpf(){
        return this.cpf;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }   
    public void setCpf(String cpf){
        this.cpf = cpf;
    }    
    public String toString(){
        return ("Nome: "+this.name+" idade: "+this.age+" CPF: "+this.cpf);
    }}