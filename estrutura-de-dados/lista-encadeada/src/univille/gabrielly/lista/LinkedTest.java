package univille.gabrielly.lista;

import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.Test;

class LinkedTest {

	@Test
	public void testarListaVazia() {

		SLinkedList<Integer> list = new SLinkedList<>();
	
		assertEquals(0, list.size,"Lista vazia deve ter tamanho zero");
		assertEquals(true, list.isEmpty(),"Lista vazia isEmpty tem que retornar 0");

	}

	@Test
	public void adicionarUmElementoNaLista() {

		SLinkedList<Integer> list = new SLinkedList<>();
	
		list.addFirst(10);
	
		assertEquals(1, list.size,"Lista vazia deve ter tamanho zero");
		assertEquals(false, list.isEmpty(),"Lista vazia isEmpty tem que retornar 0");

	}

	@Test
	public void removerOUltimo() {

		 SLinkedList<Integer> list = new SLinkedList<>();

		 list.addFirst(1);
		 list.addFirst(2);
		 list.addFirst(3);
		 list.addFirst(4);

		 assertEquals(1, list.getLast(),"O last da lista deve ser o elemento 1");

		 Integer elementoRemovido = list.removeLast();

		 assertEquals(1, elementoRemovido,"Foi removido o elemento 1");
		 assertEquals(2, list.getLast(),"O last da lista deve ser o elemento 2");
		 assertEquals(3, list.size(),"O last da lista deve ser o elemento 2");

		  

		 SLinkedList<Integer> listaVazia = new SLinkedList<>();

		 try {
			 listaVazia.removeLast();
			 fail("Tentou remover o ultimo elemento da lista vazia e nao lançou a excecao.");
		 }catch(NoSuchElementException ignored) {

		  

		 }catch (Exception e) {
			 fail("Tentou remover o ultimo elemento da lista vazia e lançou a exceçao errada.");
		 }
	}
	
	@Test
	public void adicionarUltimo() {
		 SLinkedList<Integer> list = new SLinkedList<>();

		 list.addFirst(1);
		 list.addFirst(2);
		 list.addFirst(3);
		 
		 list.addLast(4);

		 assertEquals(4, list.getLast(),"O last da lista deve ser o elemento 4");
	}
	
	@Test
	public void pegarElemento() {
		 SLinkedList<Integer> list = new SLinkedList<>();

		 list.addFirst(1);
		 list.addFirst(2);
		 list.addFirst(3);
		 
		 assertEquals(3, list.get(0),"O elemento no index 0 deve ser 3");
		 assertEquals(2, list.get(1),"O elemento no index 1 deve ser 2");
		 assertEquals(1, list.get(2),"O elemento no index 2 deve ser 2");
		 
		 list.removeFirst();
		 assertEquals(2, list.get(0),"O elemento no index 0 deve ser 2");
		 
		 list.removeLast();
		 assertEquals(2, list.get(0),"O elemento no index 0 deve ser 2");
		 
	
		 try {
			 list.get(4);
			 fail("Tentou pegar um elemento que não havia sido preenchido.");
		 }catch(NoSuchElementException ignored) {

		  

		 }catch (Exception e) {
			 fail("Tentou pegar um elemento e lançou a exeção errada");
		 }
		 
	}
	
	@Test
	public void removerElemento() {
		 SLinkedList<Integer> list = new SLinkedList<>();

		 list.addFirst(1);
		 list.addFirst(2);
		 list.addFirst(3);
		 
		 list.remove(0);
		 assertEquals(2, list.get(0),"O elemento no index 0 deve ser 2");
	}
	
	@Test
	public void adicionarElemento() {
		 SLinkedList<Integer> list = new SLinkedList<>();

		 list.add(0, 2);
		 list.add(2, 3);
		 list.add(4, 4);
		 
		 assertEquals(2, list.get(0),"O elemento no index 0 deve ser 2");
		 assertEquals(4, list.get(4),"O elemento no index 4 deve ser 4");
		 assertEquals(3, list.get(2),"O elemento no index 2 deve ser 3");
		 
		 try {
			 list.get(1);
			 fail("Tentou pegar um elemento que não havia sido preenchido.");
		 }catch(NoSuchElementException ignored) {

		  

		 }catch (Exception e) {
			 fail("Tentou pegar um elemento e lançou a exeção errada");
		 }
		 
	}
}
