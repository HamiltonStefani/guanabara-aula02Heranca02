/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula02heranca;

/**
 *
 * @author hamil
 */
public class Aula02Heranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      // Pessoa p1 = new Pessoa();
      Visitante v1 = new Visitante();
      v1.setNome("Juvenal");
      v1.setIdade(22);
      v1.setSexo("M");
      
       // System.out.println(v1.toString());
        
      Aluno a1 = new Aluno();
      a1.setNome("Claudio");
      a1.setMatricula(1111);
      a1.setCurso("Informática");
      a1.setIdade(16);
      a1.setSexo("M");
      a1.pagarMensalidade();
      
      Bolsista b1= new Bolsista();
      b1.setMatricula(1112);
      b1.setNome("Jubileu");
      b1.setBolsa(12.5f);
      b1.setSexo("M");
      b1.pagarMensalidade();
       
    }
    
}
