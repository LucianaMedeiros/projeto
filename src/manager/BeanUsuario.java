package manager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import entity.Usuario;

//classe Administradora
public class BeanUsuario {
    //tudo na Classe statico
	// já possuem 3 dados fixos ...
	//maioria dos recursos é no Java 8
  public static List<Usuario> usuarios= new ArrayList<Usuario>();
  static {
   usuarios.add(new Usuario(10,"bolao","bolao@gmail.com","123"));
   usuarios.add(new Usuario(11,"azeitona","azeitona@gmail.com","123"));
   usuarios.add(new Usuario(12,"recoreco","recoreco@gmail.com","123"));
  }
  //usuarios (Saída)
  
  
  //entrada
   public static void  adicionar(Usuario u) {
	   usuarios.add(u);
   }
   
   
   
   public static void ordenarPeloId() {
   Comparator<Usuario> comp = new Comparator<Usuario>() {
	   //o1 para o2 ascendente
	   //o2  para o1 descendente
	@Override
	public int compare(Usuario o1, Usuario o2) {
		return o1.getIdUsuario().compareTo(o2.getIdUsuario());
	  }
  };  
    //ordenando Agora
     //lista + comp (ordenar) ->comp é a regra decomparacao ...
      Collections.sort(usuarios, comp);
   }
  
  
  //saída ...
   public static Usuario findByUsuario(Usuario u) {
	   //findAny() (Buscar)
	   Usuario resposta = usuarios.stream().filter(
    x->x.getEmail().equals(u.getEmail()) & 
       x.getSenha().equals(u.getSenha())).findAny().
     orElseThrow(
  ()->new IllegalArgumentException("usuario nao Encontrado"));
	 return resposta;
	   
	 //orElseThrow (Significa estourar)
   }
  
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
